package fr.ubo.fast.viewer.app;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.net.URISyntaxException;
import java.net.URL;
import java.time.Duration;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

import com.formdev.flatlaf.intellijthemes.FlatNordIJTheme;

import fr.ubo.fast.common.api.DataProviderClient;
import fr.ubo.fast.common.api.DataProviderGeoServer;
import fr.ubo.fast.common.api.DataProviderRest;
import fr.ubo.fast.common.constants.DeploymentProperties;
import fr.ubo.fast.common.model.CalendarScale;
import fr.ubo.fast.common.model.FactorScale;
import fr.ubo.fast.common.model.TimeSeries;
import fr.ubo.fast.common.model.VisualizationClient;
import fr.ubo.fast.common.model.WebServer;
import fr.ubo.fast.common.utility.DataStructureHelper;
import fr.ubo.fast.viewer.constants.NavigationAction;
import fr.ubo.fast.viewer.constants.ValueType;

public class TimeSeriesChart
{
	private JFrame frame;
	private Chart chart;
	private ChartPanel chart_panel;
	private JPanel chart_wrapper_panel;
	private JPanel user_panel;
	private JPanel title_panel;
	private JPanel info_panel;
	private JPanel zoom_panel;
	private JPanel time_range_panel;
	private JButton up_button;
	private JButton down_button;
	private JButton next_button;
	private JButton previous_button;
	private JLabel zoom_label;
	private JLabel time_range_label;
	private JLabel title_label;
	
	private NavigationAction current_action;
	private String[] scale_entries;
	private Duration time_series_zoom;
	private Duration current_zoom;
	private int scale_entries_offset;
	private int current_zoom_index;
	
	private TimeSeries time_series_data;
	private OffsetDateTime query_start;
	private OffsetDateTime query_end;
	private TreeMap<OffsetDateTime, Double[]> current_observations;
		
	private ConcurrentHashMap<String, TreeMap<OffsetDateTime, Double[]>> pre_fetch_storage = new ConcurrentHashMap<String, TreeMap<OffsetDateTime, Double[]>>();
	private ReadWriteLock query_start_end_lock;
	private ReadWriteLock current_observations_lock;
	private int threads_number;
		
	private VisualizationClient visualization_client;
	private DataProviderClient data_provider;
		
	private static final int THREADS_NUMBER = 1;
	
	public TimeSeriesChart(VisualizationClient visualization_client, DataProviderClient data_provider)
	{		
		this.visualization_client = visualization_client;
		this.data_provider = data_provider;
		
		this.query_start_end_lock = new ReentrantReadWriteLock();
		this.current_observations_lock = new ReentrantReadWriteLock();
		this.threads_number = THREADS_NUMBER;
	}
	
	private Chart createMinMaxChart(String title, String time_axis_label, String value_axis_label, TreeMap<OffsetDateTime, Double[]> dataset, int width, int height, int time_axis_displayed_step, int value_axis_displayed_step)
	{
		OffsetDateTime time_axis_lower_bound = null, time_axis_upper_bound = null;
		
		query_start_end_lock.readLock().lock();
		try
		{
			// time_axis_lower_bound = dataset.firstKey();
			// time_axis_upper_bound = dataset.lastKey();
			time_axis_lower_bound = query_start;
			time_axis_upper_bound = query_end;
		}
		finally
		{
			query_start_end_lock.readLock().unlock();
		}
		
		DoubleSummaryStatistics statistics = dataset.values().stream().flatMap(Arrays::stream).mapToDouble(x -> x).summaryStatistics();
		double value_axis_lower_bound = Math.floor(statistics.getMin());
		double value_axis_upper_bound = Math.floor(statistics.getMax());
		value_axis_lower_bound -= (value_axis_upper_bound - value_axis_lower_bound) * 0.05;
		value_axis_upper_bound += (value_axis_upper_bound - value_axis_lower_bound) * 0.05;
		
		Axis time_axis = new Axis(time_axis_label, time_axis_lower_bound, time_axis_upper_bound, ValueType.DATE, width, time_axis_displayed_step);
		Axis value_axis = new Axis(value_axis_label, value_axis_lower_bound, value_axis_upper_bound, ValueType.DOUBLE, height, value_axis_displayed_step);
		MinMaxPlot plot = new MinMaxPlot(time_axis, value_axis, dataset);
		Chart chart = new Chart(title, plot);
		
		return chart;
	}
	
	private ImageIcon createImageIcon(String path)
	{		
		URL image_url = TimeSeriesChart.class.getClassLoader().getResource(path);
		if (image_url != null)
		{
			return new ImageIcon(image_url);
		}
		else
		{
			return null;
		}
	}

	private TreeMap<OffsetDateTime, Double[]> getTimeSeriesObservations(OffsetDateTime time_1, OffsetDateTime time_2, Duration zoom)
	{
		TreeMap<OffsetDateTime, Double[]> observations = null;
		double interval = 0.0;
		String table = "";
		
		interval = zoom.dividedBy(visualization_client.getChartWidth()).toMillis() / 1000.0;
		
		// Find the right table to retrieve from
		table = findTable(time_1, time_2);
		
		if ((int) (zoom.toMillis() / (time_series_data.getPeriod() * 1000)) <= visualization_client.getChartWidth()) 
		{			
			// Get raw values
			observations = data_provider.getTimeSeriesObservations(visualization_client.getTimeSeriesId(), time_1.toString(), time_2.toString(), interval, table, true);
			for (Map.Entry<OffsetDateTime, Double[]> entry : observations.entrySet())
			{
				Double[] temporary = new Double[2];
				temporary[0] = entry.getValue()[0];
				temporary[1] = entry.getValue()[0];
				observations.put(entry.getKey(), temporary);
			}
		}
		else
		{			
			// Get the min max values on the calculated interval
			observations = data_provider.getTimeSeriesObservations(visualization_client.getTimeSeriesId(), time_1.toString(), time_2.toString(), interval, table, false);
		}
		
		// System.out.println("Observations size " + observations.size());
		// observations.entrySet().stream().forEach(e -> System.out.println(e.getKey().toString() + " " + Arrays.toString(e.getValue())));
		return observations;
	}
	
	private int findZoom(TimeSeries time_series_data, CalendarScale scale)
	{
		Duration time_series_duration = Duration.between(time_series_data.getStartDate(), time_series_data.getEndDate());
		ArrayList<Duration> values = scale.getValues();
		int i = 0;
		
		for (i = values.size() - 1; i >= 0; i--)
		{
			if (i == values.size() - 1)
			{
				if (time_series_duration.compareTo(values.get(i)) <= 0)
				{
					return i;
				}
			}
			else
			{
				if ((time_series_duration.compareTo(values.get(i + 1)) > 0) && (time_series_duration.compareTo(values.get(i)) <= 0))
				{
					return i;
				}
			}
		}
		
		return i + 1;
	}
	
	private String findTable(OffsetDateTime time_1, OffsetDateTime time_2)
	{
//		int i = 0;
//		Duration time_series_duration = Duration.between(time_1, time_2);
//		TreeMap<Long, Long> intervals = visualization_client.getIntervals();
//		ArrayList<Long> scale_values = new ArrayList<>(intervals.keySet());
//		
//		while (i < intervals.size())
//		{
//			if ((i == 0) && (time_series_duration.compareTo(Duration.ofSeconds(scale_values.get(i))) <= 0))
//			{
//				if (intervals.get(scale_values.get(0)) == -1)
//				{
//					return DeploymentProperties.DATABASE_RAW_TIME_SERIES_DATA_TABLE.toString();
//				}
//				else
//				{
//					return String.format(DeploymentProperties.DATABASE_MIN_MAX_TABLE_PATTERN.toString(), String.valueOf(visualization_client.getTimeSeriesId()), String.valueOf(intervals.get(scale_values.get(0))));
//				}
//				
//			}
//			else if ((i != 0) && (time_series_duration.compareTo(Duration.ofSeconds(scale_values.get(i - 1))) > 0) && (time_series_duration.compareTo(Duration.ofSeconds(scale_values.get(i))) <= 0))
//			{
//				if (intervals.get(scale_values.get(i)) == -1)
//				{
//					return DeploymentProperties.DATABASE_RAW_TIME_SERIES_DATA_TABLE.toString();
//				}
//				else
//				{
//					return String.format(DeploymentProperties.DATABASE_MIN_MAX_TABLE_PATTERN.toString(), String.valueOf(visualization_client.getTimeSeriesId()), String.valueOf(intervals.get(scale_values.get(i))));
//				}
//			}
//			else if ((i == intervals.size() - 1) && (time_series_duration.compareTo(Duration.ofSeconds(scale_values.get(i))) > 0))
//			{
//				if (intervals.get(scale_values.get(i)) == -1)
//				{
//					return DeploymentProperties.DATABASE_RAW_TIME_SERIES_DATA_TABLE.toString();
//				}
//				else
//				{
//					return String.format(DeploymentProperties.DATABASE_MIN_MAX_TABLE_PATTERN.toString(), String.valueOf(visualization_client.getTimeSeriesId()), String.valueOf(intervals.get(scale_values.get(intervals.size() - 1))));
//				}
//			}
//			i += 1;
//		}
//		
		return DeploymentProperties.DATABASE_RAW_TIME_SERIES_DATA_TABLE.toString();
	}
	
	private void updateDataset()
	{
		// Update plot dataset
		// To do : Find a better way to do it
		TreeMap<OffsetDateTime, Double[]> local_current_observations = new TreeMap<OffsetDateTime, Double[]>();
		
		current_observations_lock.readLock().lock();
		try
		{
			local_current_observations.putAll(current_observations);
		}
		finally
		{
			current_observations_lock.readLock().unlock();
		}
		
		DoubleSummaryStatistics statistics = local_current_observations.values().stream().flatMap(Arrays::stream).mapToDouble(x -> x).summaryStatistics();
		MinMaxPlot plot = (MinMaxPlot) chart.getPlot();
		
		query_start_end_lock.readLock().lock();
		try
		{
			// plot.getTimeAxis().setLowerBound((OffsetDateTime) local_current_observations.firstKey());
			// plot.getTimeAxis().setUpperBound((OffsetDateTime) local_current_observations.lastKey());
			plot.getTimeAxis().setLowerBound((OffsetDateTime) query_start);
			plot.getTimeAxis().setUpperBound((OffsetDateTime) query_end);
		}
		finally
		{
			query_start_end_lock.readLock().unlock();
		}
		
		double value_axis_lower_bound = Math.floor(statistics.getMin());
		double value_axis_upper_bound = Math.floor(statistics.getMax());
		value_axis_lower_bound -= (value_axis_upper_bound - value_axis_lower_bound) * 0.05;
		value_axis_upper_bound += (value_axis_upper_bound - value_axis_lower_bound) * 0.05;
		plot.getValueAxis().setLowerBound((double) value_axis_lower_bound);
		plot.getValueAxis().setUpperBound((double) value_axis_upper_bound);
		plot.setDataset(local_current_observations);
		// System.out.println("Update size " + local_current_observations.size());
		// local_current_observations.entrySet().stream().forEach(e -> System.out.println(e.getKey().toString() + " " + Arrays.toString(e.getValue())));
	}
	
	private void updateUpDownButtons()
	{
		if (current_zoom_index == scale_entries_offset)
		{
			up_button.setEnabled(false);
		}
		else
		{
			up_button.setEnabled(true);
		}
		if (current_zoom_index == (scale_entries.length - 1))
		{
			down_button.setEnabled(false);
		}
		else
		{
			down_button.setEnabled(true);
		}
	}
	
	private void updatePreviousNextButtons()
	{
		query_start_end_lock.readLock().lock();
		try
		{
			if (query_start.isEqual(time_series_data.getStartDate()))
			{
				previous_button.setEnabled(false);
			}
			else
			{
				previous_button.setEnabled(true);
			}
			if (query_end.isEqual(time_series_data.getEndDate()))
			{
				next_button.setEnabled(false);
			}
			else
			{
				next_button.setEnabled(true);
			}
		}
		finally
		{
			query_start_end_lock.readLock().unlock();
		}
	}
	
	private void updateLabels()
	{		
		zoom_label.setText(String.format("Zoom : %s", current_zoom.toString()));
		query_start_end_lock.readLock().lock();
		try
		{
			time_range_label.setText(String.format("Current window : %s to %s", query_start.toString(), query_end.toString()));
		}
		finally
		{
			query_start_end_lock.readLock().unlock();
		}
	}
	
	private void preFetchNeighbors(int current_zoom_index, NavigationAction current_action, OffsetDateTime old_query_start, OffsetDateTime old_query_end, TreeMap<OffsetDateTime, Double[]> old_observations)
	{		
		// System.out.println("Storage size " + pre_fetch_storage.size());
		pre_fetch_storage.clear();
		OffsetDateTime pre_fetch_query_start = null, pre_fetch_query_end = null, local_query_start = null, local_query_end = null;
		TreeMap<OffsetDateTime, Double[]> observations = null;
		
		query_start_end_lock.readLock().lock();
		try
		{
			local_query_start = query_start;
			local_query_end = query_end;
		}
		finally
		{
			query_start_end_lock.readLock().unlock();
		}
		
		// Fetch : Up
		if ((current_zoom_index - 1) >= scale_entries_offset)
		{
			if (current_action == NavigationAction.DOWN)
			{
				String key = old_query_start + "_" + old_query_end;
				pre_fetch_storage.put(key, old_observations);
				// System.out.println(key + " up pre fetch current");
				// System.out.println(old_observations.size());
			}
			else
			{
				pre_fetch_query_start = local_query_start;
				pre_fetch_query_end = pre_fetch_query_start.plus(visualization_client.getScale().getValues().get(current_zoom_index - 1));
				if (pre_fetch_query_end.isAfter(time_series_data.getEndDate()))
				{
					pre_fetch_query_end = time_series_data.getEndDate();
				}
				
				String key = pre_fetch_query_start + "_" + pre_fetch_query_end;
				// System.out.println(key + " up pre fetch");
				observations = getTimeSeriesObservations(pre_fetch_query_start, pre_fetch_query_end, visualization_client.getScale().getValues().get(current_zoom_index - 1));
				pre_fetch_storage.put(key, observations);
				// System.out.println(observations.size());
			}
		}
		// Fetch : Down
		if ((current_zoom_index + 1) <= (scale_entries.length - 1))
		{
			if (current_action == NavigationAction.UP)
			{
				String key = old_query_start + "_" + old_query_end;
				pre_fetch_storage.put(key, old_observations);
				// System.out.println(key + " down pre fetch current");
			}
			else
			{
				pre_fetch_query_start = local_query_start;
				pre_fetch_query_end = pre_fetch_query_start.plus(visualization_client.getScale().getValues().get(current_zoom_index + 1));
				if (pre_fetch_query_end.isAfter(time_series_data.getEndDate()))
				{
					pre_fetch_query_end = time_series_data.getEndDate();
				}
				
				String key = pre_fetch_query_start + "_" + pre_fetch_query_end;
				// System.out.println(key + " down pre fetch");
				observations = getTimeSeriesObservations(pre_fetch_query_start, pre_fetch_query_end, visualization_client.getScale().getValues().get(current_zoom_index + 1));
				pre_fetch_storage.put(key, observations);
			}
		}
		// Fetch : Previous
		if (!query_start.isEqual(time_series_data.getStartDate()))
		{
			if (current_action == NavigationAction.NEXT)
			{
				String key = old_query_start + "_" + old_query_end;
				pre_fetch_storage.put(key, old_observations);
				// System.out.println(key + " previous pre fetch current");
			}
			else
			{
				pre_fetch_query_end = local_query_start;
				pre_fetch_query_start = pre_fetch_query_end.minus(visualization_client.getScale().getValues().get(current_zoom_index));
				if (pre_fetch_query_start.isBefore(time_series_data.getStartDate()))
				{
					pre_fetch_query_start = time_series_data.getStartDate();
				}
				
				String key = pre_fetch_query_start + "_" + pre_fetch_query_end;
				// System.out.println(key + " previous pre fetch");
				observations = getTimeSeriesObservations(pre_fetch_query_start, pre_fetch_query_end, visualization_client.getScale().getValues().get(current_zoom_index));
				pre_fetch_storage.put(key, observations);
			}
		}
		// Fetch : Next
		if (!query_end.isEqual(time_series_data.getEndDate()))
		{
			if (current_action == NavigationAction.PREVIOUS)
			{
				String key = old_query_start + "_" + old_query_end;
				pre_fetch_storage.put(key, old_observations);
				// System.out.println(key + " next pre fetch current");
			}
			else
			{
				pre_fetch_query_start = local_query_end;
				pre_fetch_query_end = pre_fetch_query_start.plus(visualization_client.getScale().getValues().get(current_zoom_index));
				if (pre_fetch_query_end.isAfter(time_series_data.getEndDate()))
				{
					pre_fetch_query_end = time_series_data.getEndDate();
				}
				
				String key = pre_fetch_query_start + "_" + pre_fetch_query_end;
				// System.out.println(key + " next pre fetch");
				observations = getTimeSeriesObservations(pre_fetch_query_start, pre_fetch_query_end, visualization_client.getScale().getValues().get(current_zoom_index));
				pre_fetch_storage.put(key, observations);
			}
		}
	}
	
	private void performUpAction(ActionEvent event)
	{		
		OffsetDateTime old_query_start, old_query_end, calculated_query_end = null;
		TreeMap<OffsetDateTime, Double[]> old_observations = new TreeMap<OffsetDateTime, Double[]>();
		
		current_action = NavigationAction.UP;
		
		current_zoom_index = current_zoom_index - 1 + scale_entries_offset;
		current_zoom = visualization_client.getScale().getValues().get(current_zoom_index);		
		
		query_start_end_lock.readLock().lock();
		try
		{
			old_query_start = query_start;
			old_query_end = query_end;
			calculated_query_end = query_start.plus(current_zoom);
		}
		finally
		{
			query_start_end_lock.readLock().unlock();
		}
		
		if (calculated_query_end.isAfter(time_series_data.getEndDate()))
		{
			calculated_query_end = time_series_data.getEndDate();
		}
		
		query_start_end_lock.writeLock().lock();
		try
		{
			// query_start = query_start;
			query_end = calculated_query_end;
		}
		finally
		{
			query_start_end_lock.writeLock().unlock();
		}
		
		current_observations_lock.readLock().lock();
		try
		{
			old_observations.putAll(current_observations);
		}
		finally
		{
			current_observations_lock.readLock().unlock();
		}
		
		Runnable pre_fetch_task = () ->
		{
			preFetchNeighbors(current_zoom_index, current_action, old_query_start, old_query_end, old_observations);
		};
		ExecutorService executor = Executors.newFixedThreadPool(threads_number);
		executor.execute(pre_fetch_task);
		
		String key = "";
		OffsetDateTime local_query_start = null, local_query_end = null;
		
		query_start_end_lock.readLock().lock();
		try
		{
			key = query_start + "_" + query_end;
			local_query_start = query_start;
			local_query_end = query_end;
		}
		finally
		{
			query_start_end_lock.readLock().unlock();
		}
		
		current_observations_lock.writeLock().lock();
		try
		{
			if (pre_fetch_storage.containsKey(key))
			{
				current_observations = pre_fetch_storage.get(key);
				// System.out.println("Cache : " + key);
			}
			else
			{
				// System.out.println("No cache : " + key);
				current_observations = getTimeSeriesObservations(local_query_start, local_query_end, current_zoom);
			}
		}
		finally
		{
			current_observations_lock.writeLock().unlock();
		}
		
		updateUpDownButtons();
		updatePreviousNextButtons();
		updateLabels();
		updateDataset();
		
		executor.shutdownNow();
	}
	
	private void performDownAction(ActionEvent event)
	{		
		OffsetDateTime old_query_start, old_query_end, calculated_query_end = null;
		TreeMap<OffsetDateTime, Double[]> old_observations = new TreeMap<OffsetDateTime, Double[]>();
		
		current_action = NavigationAction.DOWN;
		
		current_zoom_index = current_zoom_index + 1;
		current_zoom = visualization_client.getScale().getValues().get(current_zoom_index);
		
		query_start_end_lock.readLock().lock();
		try
		{
			old_query_start = query_start;
			old_query_end = query_end;
			calculated_query_end = query_start.plus(current_zoom);
		}
		finally
		{
			query_start_end_lock.readLock().unlock();
		}
		
		if (calculated_query_end.isAfter(time_series_data.getEndDate()))
		{
			calculated_query_end = time_series_data.getEndDate();
		}
		
		query_start_end_lock.writeLock().lock();
		try
		{
			// query_start = query_start;
			query_end = calculated_query_end;
		}
		finally
		{
			query_start_end_lock.writeLock().unlock();
		}
		
		current_observations_lock.readLock().lock();
		try
		{
			old_observations.putAll(current_observations);
		}
		finally
		{
			current_observations_lock.readLock().unlock();
		}
		
		Runnable pre_fetch_task = () ->
		{
			preFetchNeighbors(current_zoom_index, current_action, old_query_start, old_query_end, old_observations);
		};
		ExecutorService executor = Executors.newFixedThreadPool(threads_number);
		executor.execute(pre_fetch_task);
		
		String key = "";
		OffsetDateTime local_query_start = null, local_query_end = null;
		
		query_start_end_lock.readLock().lock();
		try
		{
			key = query_start + "_" + query_end;
			local_query_start = query_start;
			local_query_end = query_end;
		}
		finally
		{
			query_start_end_lock.readLock().unlock();
		}
		
		current_observations_lock.writeLock().lock();
		try
		{
			if (pre_fetch_storage.containsKey(key))
			{
				current_observations = pre_fetch_storage.get(key);
				// System.out.println("Cache : " + key);
			}
			else
			{
				// System.out.println("No cache : " + key);
				current_observations = getTimeSeriesObservations(local_query_start, local_query_end, current_zoom);
			}
		}
		finally
		{
			current_observations_lock.writeLock().unlock();
		}
		
		updateUpDownButtons();
		updatePreviousNextButtons();
		updateLabels();
		updateDataset();
		
		executor.shutdownNow();
	}
	
	private void performPreviousAction(ActionEvent event)
	{		
		OffsetDateTime old_query_start, old_query_end, calculated_query_start = null;
		TreeMap<OffsetDateTime, Double[]> old_observations = new TreeMap<OffsetDateTime, Double[]>();
		
		current_action = NavigationAction.PREVIOUS;
		
		query_start_end_lock.readLock().lock();
		try
		{
			old_query_start = query_start;
			old_query_end = query_end;
			calculated_query_start = query_start.minus(current_zoom);
		}
		finally
		{
			query_start_end_lock.readLock().unlock();
		}
		
		if (calculated_query_start.isBefore(time_series_data.getStartDate()))
		{
			calculated_query_start = time_series_data.getStartDate();
		}
		
		query_start_end_lock.writeLock().lock();
		try
		{
			query_end = query_start;
			query_start = calculated_query_start;
		}
		finally
		{
			query_start_end_lock.writeLock().unlock();
		}
		
		current_observations_lock.readLock().lock();
		try
		{
			old_observations.putAll(current_observations);
		}
		finally
		{
			current_observations_lock.readLock().unlock();
		}
		
		Runnable pre_fetch_task = () ->
		{
			preFetchNeighbors(current_zoom_index, current_action, old_query_start, old_query_end, old_observations);
		};
		ExecutorService executor = Executors.newFixedThreadPool(threads_number);
		executor.execute(pre_fetch_task);
		
		String key = "";
		OffsetDateTime local_query_start = null, local_query_end = null;
		
		query_start_end_lock.readLock().lock();
		try
		{
			key = query_start + "_" + query_end;
			local_query_start = query_start;
			local_query_end = query_end;
		}
		finally
		{
			query_start_end_lock.readLock().unlock();
		}
		
		current_observations_lock.writeLock().lock();
		try
		{
			if (pre_fetch_storage.containsKey(key))
			{
				current_observations = pre_fetch_storage.get(key);
				// System.out.println("Cache : " + key);
			}
			else
			{
				// System.out.println("No cache : " + key);
				current_observations = getTimeSeriesObservations(local_query_start, local_query_end, current_zoom);
			}
		}
		finally
		{
			current_observations_lock.writeLock().unlock();
		}
		
		updatePreviousNextButtons();
		updateLabels();
		updateDataset();
		
		executor.shutdownNow();
	}
	
	private void performNextAction(ActionEvent event)
	{		
		OffsetDateTime old_query_start, old_query_end, calculated_query_end = null;
		TreeMap<OffsetDateTime, Double[]> old_observations = new TreeMap<OffsetDateTime, Double[]>();
		
		current_action = NavigationAction.NEXT;
		
		query_start_end_lock.readLock().lock();
		try
		{
			old_query_start = query_start;
			old_query_end = query_end;
			calculated_query_end = query_end.plus(current_zoom);
		}
		finally
		{
			query_start_end_lock.readLock().unlock();
		}
		
		if (calculated_query_end.isAfter(time_series_data.getEndDate()))
		{
			calculated_query_end = time_series_data.getEndDate();
		}
		
		query_start_end_lock.writeLock().lock();
		try
		{
			query_start = query_end;
			query_end = calculated_query_end;
		}
		finally
		{
			query_start_end_lock.writeLock().unlock();
		}
		
		current_observations_lock.readLock().lock();
		try
		{
			old_observations.putAll(current_observations);
		}
		finally
		{
			current_observations_lock.readLock().unlock();
		}
		
		Runnable pre_fetch_task = () ->
		{
			preFetchNeighbors(current_zoom_index, current_action, old_query_start, old_query_end, old_observations);
		};
		ExecutorService executor = Executors.newFixedThreadPool(threads_number);
		executor.execute(pre_fetch_task);
		
		String key = "";
		OffsetDateTime local_query_start = null, local_query_end = null;
		
		query_start_end_lock.readLock().lock();
		try
		{
			key = query_start + "_" + query_end;
			local_query_start = query_start;
			local_query_end = query_end;
		}
		finally
		{
			query_start_end_lock.readLock().unlock();
		}
		
		current_observations_lock.writeLock().lock();
		try
		{
			if (pre_fetch_storage.containsKey(key))
			{
				current_observations = pre_fetch_storage.get(key);
				// System.out.println("Cache : " + key);
			}
			else
			{
				// System.out.println("No cache : " + key);
				current_observations = getTimeSeriesObservations(local_query_start, local_query_end, current_zoom);
			}
		}
		finally
		{
			current_observations_lock.writeLock().unlock();
		}
		
		updatePreviousNextButtons();
		updateLabels();
		updateDataset();
		
		executor.shutdownNow();
	}
	
	private void initializeData()
	{
		// Get time series meta data
		// time_series_data = data_provider.getTimeSeriesMetaData(visualization_client.getTimeSeriesId());
		time_series_data = new TimeSeries(1, 1.0, OffsetDateTime.parse("2010-01-01T00:00:00+01:00"), OffsetDateTime.parse("2010-01-02T00:00:00+01:00"));
		
		if (visualization_client.getScale() instanceof FactorScale)
		{
			((FactorScale) visualization_client.getScale()).computeValues(time_series_data);
			
			scale_entries_offset = 0;
		}
		else if (visualization_client.getScale() instanceof CalendarScale)
		{
			((CalendarScale) visualization_client.getScale()).computeValues();
			
			scale_entries_offset = findZoom(time_series_data, (CalendarScale) visualization_client.getScale());
			// System.out.println("Offset " + scale_entries_offset);
		}
		
		time_series_zoom = visualization_client.getScale().getValues().get(scale_entries_offset);
		
		scale_entries = new String[visualization_client.getScale().getValues().size()];
		for (int i = 0; i < visualization_client.getScale().getValues().size(); i++)
		{
			scale_entries[i] = visualization_client.getScale().getValues().get(i).toString();
		}
		
		current_zoom = time_series_zoom;
		current_zoom_index = scale_entries_offset;
		
		query_start = time_series_data.getStartDate();
		query_end = time_series_data.getEndDate();
		
		current_observations = getTimeSeriesObservations(query_start, query_end, current_zoom);
		time_series_data.setObservations(current_observations);
	}
	
	public void show()
	{	
		FlatNordIJTheme.setup();
		
		// Initialize data and settings
		initializeData();
		
		// Frame
		frame = new JFrame("Time Series");
		
		// Panel 1
		user_panel = new JPanel();
		user_panel.setLayout(new BorderLayout());
		title_panel = new JPanel();
		info_panel = new JPanel();
		zoom_panel = new JPanel();
		time_range_panel = new JPanel();
		
		// Title panel
		title_label = new JLabel(String.format("Temperature Time Series (From %s to %s)", time_series_data.getStartDate().toString(), time_series_data.getEndDate().toString()));
		title_label.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		
		title_panel.add(title_label);
		
		zoom_label = new JLabel(String.format("Zoom : %s", current_zoom));
		// zoom_label.setBorder(BorderFactory.createEmptyBorder(8, 8, 8, 8));
		zoom_panel.add(zoom_label);
		
		// Time range panel
		time_range_label = new JLabel(String.format("Current window : %s to %s", query_start.toString(), query_end.toString()));
		time_range_panel.add(time_range_label);
		
		// Info panel
		info_panel.setLayout(new GridBagLayout());
		GridBagConstraints constraints = new GridBagConstraints();
		constraints.gridx = 0;
		constraints.gridy = 0;
		constraints.gridwidth = GridBagConstraints.REMAINDER;
		constraints.gridheight = 1;
		constraints.weightx = 1;
		constraints.weighty = 0.5;
		constraints.fill = GridBagConstraints.CENTER;
		info_panel.add(zoom_panel, constraints);
		constraints.gridx = 0;
		constraints.gridy = 1;
		constraints.gridwidth = GridBagConstraints.REMAINDER;
		constraints.gridheight = 1;
		constraints.weightx = 1;
		constraints.weighty = 0.5;
		constraints.fill = GridBagConstraints.CENTER;
		info_panel.add(time_range_panel, constraints);
		
		// Panel 1
		user_panel.add(title_panel, BorderLayout.NORTH);
		user_panel.add(info_panel, BorderLayout.CENTER);
		
		// Panel 2
		// chart_wrapper_panel = new JPanel(new BorderLayout());
		// chart_wrapper_panel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
		// chart_wrapper_panel.setLayout(new BorderLayout());
		chart_wrapper_panel = new JPanel(new GridBagLayout());
		
		// Buttons panel
		up_button = new JButton("");
		up_button.setIcon(createImageIcon("icons/up.png"));
		up_button.setBorder(BorderFactory.createEmptyBorder(6, 6, 6, 6));
		up_button.setEnabled(false);
		up_button.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent event)
			{
				performUpAction(event);
			}
	
		});
		// JPanel up_button_panel = new JPanel(new FlowLayout());
		// up_button_panel.add(up_button);
		
		down_button = new JButton("");
		down_button.setIcon(createImageIcon("icons/down.png"));
		down_button.setBorder(BorderFactory.createEmptyBorder(6, 6, 6, 6));
		down_button.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent event)
			{
				performDownAction(event);
			}
	
		});
		// JPanel down_button_panel = new JPanel(new FlowLayout());
		// down_button_panel.add(down_button);
		
		previous_button = new JButton("");
		previous_button.setIcon(createImageIcon("icons/previous.png"));
		previous_button.setBorder(BorderFactory.createEmptyBorder(6, 6, 6, 6));
		previous_button.setEnabled(false);
		previous_button.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent event)
			{
				performPreviousAction(event);
			}
	
		});
		
		next_button = new JButton("");
		next_button.setIcon(createImageIcon("icons/next.png"));
		next_button.setBorder(BorderFactory.createEmptyBorder(6, 6, 6, 6));
		next_button.setEnabled(false);
		next_button.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent event)
			{
				performNextAction(event);
			}
	
		});
		
		chart = createMinMaxChart("", "Time axis", "Value axis", current_observations, visualization_client.getChartWidth(), visualization_client.getChartHeight(), visualization_client.getAxisFactor(), visualization_client.getAxisFactor());
		chart.getTitle().setVisible(false);
		chart_panel = new ChartPanel(chart);
		// chart_panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		
		// chart_wrapper_panel.add(up_button, BorderLayout.NORTH);
		// chart_wrapper_panel.add(down_button, BorderLayout.SOUTH);
		// chart_wrapper_panel.add(previous_button, BorderLayout.EAST);
		// chart_wrapper_panel.add(next_button, BorderLayout.WEST);
		// chart_wrapper_panel.add(chart_panel, BorderLayout.CENTER);
		constraints = new GridBagConstraints();
		constraints.gridx = 1;
		constraints.gridy = 0;
		constraints.anchor = GridBagConstraints.CENTER;
		chart_wrapper_panel.add(up_button, constraints);
		constraints.gridx = 1;
		constraints.gridy = 2;
		constraints.anchor = GridBagConstraints.CENTER;
		chart_wrapper_panel.add(down_button, constraints);
		constraints.gridx = 0;
		constraints.gridy = 1;
		constraints.insets = new Insets(0, 10, 0, 0);
		constraints.anchor = GridBagConstraints.CENTER;
		chart_wrapper_panel.add(previous_button, constraints);
		constraints.gridx = 2;
		constraints.gridy = 1;
		constraints.insets = new Insets(0, 0, 0, 10);
		constraints.anchor = GridBagConstraints.CENTER;
		chart_wrapper_panel.add(next_button, constraints);
		constraints.gridx = 1;
		constraints.gridy = 1;
		constraints.weightx = 1;
		constraints.weighty = 1;
		constraints.insets = new Insets(0, 0, 0, 0);
		constraints.anchor = GridBagConstraints.CENTER;
		constraints.fill = GridBagConstraints.BOTH;
		chart_wrapper_panel.add(chart_panel, constraints);
		
		updateUpDownButtons();
		updatePreviousNextButtons();
		updateLabels();
		
		// Frame
		frame.setLayout(new GridBagLayout());
		constraints = new GridBagConstraints();
		constraints.gridx = 0;
		constraints.gridy = 0;
		constraints.gridwidth = GridBagConstraints.REMAINDER;
		constraints.gridheight = 1;
		constraints.weightx = 1;
		constraints.weighty = 0.05;
		constraints.fill = GridBagConstraints.BOTH;
		frame.add(user_panel, constraints);
		constraints.gridx = 0;
		constraints.gridy = 1;
		constraints.gridwidth = GridBagConstraints.REMAINDER;
		constraints.gridheight = 1;
		constraints.weightx = 1;
		constraints.weighty = 0.95;
		constraints.fill = GridBagConstraints.BOTH;
		frame.add(chart_wrapper_panel, constraints);

		frame.setSize(visualization_client.getChartWidth() + 300, visualization_client.getChartHeight() + 300);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args)
	{
		// test();
		// int time_series_id = 1, width = 1000, height = 300;
		// FactorScale scale = new FactorScale(2, 5);
		// CalendarScale scale = new CalendarScale(new ChronoUnit[] {ChronoUnit.YEARS, ChronoUnit.MONTHS, ChronoUnit.DAYS}, new long[] {1, 1, 1});
		// CalendarScale scale = new CalendarScale(new ChronoUnit[] {ChronoUnit.HOURS, ChronoUnit.MINUTES, ChronoUnit.MINUTES}, new long[] {1, 45, 1});
		
		File current_jar_file = null, current_folder = null, configuration_files_folder = null, web_server_folder = null, visualization_tool_folder = null; 

		try
		{
			current_jar_file = new File(TimeSeriesChart.class.getProtectionDomain().getCodeSource().getLocation().toURI());
			current_folder = current_jar_file.getParentFile();
			// current_folder = new File("C:\\Users\\Manele\\Workspaces\\PhotonWorkspace\\fr.ubo.fast.viewer");
			configuration_files_folder = new File(current_folder, DeploymentProperties.CONF_FOLDER.toString());
			web_server_folder = new File(configuration_files_folder, DeploymentProperties.WEB_SERVER_FOLDER.toString());
			visualization_tool_folder = new File(configuration_files_folder, DeploymentProperties.VISUALIZATION_TOOL_FOLDER.toString());
		}
		catch (URISyntaxException exception)
		{
			exception.printStackTrace();
		}
		
		ArrayList<String> web_server_file_names = DataStructureHelper.findFiles(web_server_folder.toPath(), DeploymentProperties.WEB_SERVER_FILE_PATTERN.toString());
		ArrayList<String> visualization_tool_file_names = DataStructureHelper.findFiles(visualization_tool_folder.toPath(), DeploymentProperties.VISUALIZATION_TOOL_FILE_PATTERN.toString());
		
		// For now, the implementation supports only one server and one visualization tool
		File web_server_file = new File(web_server_file_names.get(0));
		File visualization_tool_file = new File(visualization_tool_file_names.get(0));
		// File intervals_file = new File(visualization_tool_folder, DeploymentProperties.GENERATED_INTERVALS_FILE.toString());
		
		VisualizationClient visualization_client = new VisualizationClient(visualization_tool_file);
		// visualization_client.setIntervalsFromFile(intervals_file);
		WebServer web_server = new WebServer(web_server_file);
		DataProviderClient data_provider = null;
		
		visualization_client.setScale(new FactorScale(2, 5));
		
		if (web_server.getType().equalsIgnoreCase("Apache"))
		{
			data_provider = new DataProviderRest(web_server.getHostname(), web_server.getPort());
		}
		else if (web_server.getType().equalsIgnoreCase("GeoServer"))
		{
			data_provider = new DataProviderGeoServer(web_server.getHostname(), web_server.getPort());
		}
		
		TimeSeriesChart chart = new TimeSeriesChart(visualization_client, data_provider);
		chart.show();
	}
}