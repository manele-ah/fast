package fr.ubo.fast.common.model;

import java.io.File;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Properties;
import java.util.TreeMap;

import fr.ubo.fast.common.utility.DataStructureHelper;
import fr.ubo.fast.common.constants.VisualizationClientProperties;

public class VisualizationClient
{
	private int time_series_id;
	private int chart_height;
	private int chart_width;
	private int axis_factor;
	private Scale scale;
	private double user_time;
	private double ping_time;
	private double raw_data_threshold;
	private double pre_computed_data_threshold;
	private TreeMap<Long, Long> intervals = new TreeMap<Long, Long>();
	
	public VisualizationClient(int time_series_id, int chart_height, int chart_width, int axis_factor, Scale scale, double user_time, double ping_time, double raw_data_threshold, double pre_computed_data_threshold)
	{
		this.time_series_id = time_series_id;
		this.chart_height = chart_height;
		this.chart_width = chart_width;
		this.axis_factor = axis_factor;
		this.scale = scale;
		this.user_time = user_time;
		this.ping_time = ping_time;
		this.raw_data_threshold = raw_data_threshold;
		this.pre_computed_data_threshold = pre_computed_data_threshold;
	}
	
	public VisualizationClient(File... properties_files)
	{
		Properties properties = DataStructureHelper.getProperties(properties_files);
		String scale_type = "";
		
		try
		{
			time_series_id = Integer.parseInt(properties.getProperty(VisualizationClientProperties.TIME_SERIES_ID.toString()));
			chart_height = Integer.parseInt(properties.getProperty(VisualizationClientProperties.CHART_HEIGHT.toString()));
			chart_width = Integer.parseInt(properties.getProperty(VisualizationClientProperties.CHART_WIDTH.toString()));
			axis_factor = Integer.parseInt(properties.getProperty(VisualizationClientProperties.AXIS_FACTOR.toString()));
			scale_type = properties.getProperty(VisualizationClientProperties.SCALE_TYPE.toString());
			
			if (scale_type.equals("FactorScale"))
			{
				int scale_factor = Integer.parseInt(properties.getProperty(VisualizationClientProperties.SCALE_FACTOR.toString()));
				int scale_zooms_number = Integer.parseInt(properties.getProperty(VisualizationClientProperties.SCALE_ZOOMS_NUMBER.toString()));
				scale = new FactorScale(scale_factor, scale_zooms_number);
			}
			else if (scale_type.equals("CalendarScale"))
			{
				String[] scale_factors = properties.getProperty(VisualizationClientProperties.SCALE_FACTORS.toString()).split(",");
				String[] scale_periods = properties.getProperty(VisualizationClientProperties.SCALE_PERIODS.toString()).split(",");
				long[] factors = Arrays.stream(scale_factors).mapToLong(Long::parseLong).toArray();
				ChronoUnit[] periods = new ChronoUnit[scale_periods.length];
				for (int i = 0; i < scale_periods.length; i++)
				{
					if (DataStructureHelper.convertStringToChronoUnit(scale_periods[i]) != null)
					{
						periods[i] = DataStructureHelper.convertStringToChronoUnit(scale_periods[i]);
					}
					
				}
				scale = new CalendarScale(periods, factors);
			}
			
			user_time = Double.parseDouble(properties.getProperty(VisualizationClientProperties.USER_TIME.toString()));
			ping_time = Double.parseDouble(properties.getProperty(VisualizationClientProperties.PING_TIME.toString()));
			raw_data_threshold = Double.parseDouble(properties.getProperty(VisualizationClientProperties.RAW_DATA_THRESHOLD.toString()));
			pre_computed_data_threshold = Double.parseDouble(properties.getProperty(VisualizationClientProperties.PRE_COMPUTED_DATA_THRESHOLD.toString()));
		}
		catch (NumberFormatException exception)
		{
			exception.printStackTrace();
		}
		catch (NullPointerException exception)
		{
			exception.printStackTrace();
		}
	}

	public int getTimeSeriesId()
	{
		return time_series_id;
	}

	public void setTimeSeriesId(int time_series_id)
	{
		this.time_series_id = time_series_id;
	}

	public int getChartHeight()
	{
		return chart_height;
	}

	public void setChartHeight(int chart_height)
	{
		this.chart_height = chart_height;
	}

	public int getChartWidth()
	{
		return chart_width;
	}

	public void setChartWidth(int chart_width)
	{
		this.chart_width = chart_width;
	}

	public int getAxisFactor()
	{
		return axis_factor;
	}

	public void setAxisFactor(int axis_factor)
	{
		this.axis_factor = axis_factor;
	}

	public Scale getScale()
	{
		return scale;
	}

	public void setScale(Scale scale)
	{
		this.scale = scale;
	}

	public double getUserTime()
	{
		return user_time;
	}

	public void setUserTime(double user_time)
	{
		this.user_time = user_time;
	}

	public double getPingTime()
	{
		return ping_time;
	}

	public void setPingTime(double ping_time)
	{
		this.ping_time = ping_time;
	}

	public double getRawDataThreshold()
	{
		return raw_data_threshold;
	}

	public void setRawDataThreshold(double raw_data_threshold)
	{
		this.raw_data_threshold = raw_data_threshold;
	}

	public double getPreComputedDataThreshold()
	{
		return pre_computed_data_threshold;
	}

	public void setPreComputedDataThreshold(double pre_computed_data_threshold)
	{
		this.pre_computed_data_threshold = pre_computed_data_threshold;
	}

	public TreeMap<Long, Long> getIntervals()
	{
		return intervals;
	}

	public void setIntervals(TreeMap<Long, Long> intervals)
	{
		this.intervals = intervals;
	}
	
	public void setIntervalsFromFile(File properties_file)
	{
		Properties properties = DataStructureHelper.getProperties(properties_file);
		HashMap<String, String> string_intervals = DataStructureHelper.convertPropertiesToMap(properties);
		TreeMap<Long, Long> intervals = new TreeMap<Long, Long>();
		try
		{
			string_intervals.forEach((key, value) -> intervals.put(Long.parseLong(key), Long.parseLong(value)));
			this.intervals = intervals;
		}
		catch (NumberFormatException exception)
		{
			exception.printStackTrace();
		}
	}
}