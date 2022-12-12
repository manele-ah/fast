package fr.ubo.fast.common.performance;

import java.time.OffsetDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeMap;

import org.apache.commons.lang3.ArrayUtils;

import fr.ubo.fast.common.model.CalendarScale;
import fr.ubo.fast.common.model.FactorScale;
import fr.ubo.fast.common.model.TimeSeries;
import fr.ubo.fast.common.model.VisualizationClient;
import fr.ubo.fast.common.utility.MathHelper;

public class IntervalSelectionNative implements IntervalSelection
{
	private VisualizationClient visualization_client;
	private TimeSeries time_series_data;
	
	public IntervalSelectionNative(VisualizationClient visualization_client, TimeSeries time_series_data)
	{
		this.visualization_client = visualization_client;
		this.time_series_data = time_series_data;
		
		if (this.visualization_client.getScale() instanceof FactorScale)
		{
			((FactorScale) (this.visualization_client.getScale())).computeValues(this.time_series_data);
		}
		else if (this.visualization_client.getScale() instanceof CalendarScale)
		{
			((CalendarScale) (this.visualization_client.getScale())).computeValues();
		}
	}
	
	@Override
	public void computeIntervals()
	{
		int i = 0;
		TreeMap<Long, Long> result = new TreeMap<Long, Long>();
		ArrayList<Long> scale_values = this.visualization_client.getScale().getLongValues();
		
		for (Long value : scale_values)
		{
			result.put(value, (long) -1);
			scale_values.set(i, (long) (value / visualization_client.getChartWidth()));
			i += 1;
		}
		
		// System.out.println(result);
		// System.out.println(scale_values);
		scale_values.removeIf(element -> element < this.visualization_client.getRawDataThreshold());
		// System.out.println(scale_values);

		// Partitions => Partitions GCD list
		ArrayList<ArrayList<ArrayList<Long>>> partitions = MathHelper.generateAllPossiblePartitions(scale_values);
		ArrayList<ArrayList<Long>> partitions_gcd_list = new ArrayList<ArrayList<Long>>();
		double[] weights = new double[partitions.size()];
		i = 0;
		for (ArrayList<ArrayList<Long>> partition : partitions)
		{
			ArrayList<Long> gcd_list = new ArrayList<Long>();
			double weight = 0.0;
			for (ArrayList<Long> group : partition)
			{
				long gcd = MathHelper.greatestCommonDivisor(group.stream().mapToLong(element -> element).toArray());
				gcd_list.add(gcd);
				weight += 1.0 / gcd;
			}
			partitions_gcd_list.add(gcd_list);
			weights[i] = weight;
			i += 1;
		}
		
		double minimum_weight = Arrays.stream(weights).min().getAsDouble();
		int minimum_index = ArrayUtils.indexOf(weights, minimum_weight);
		
		ArrayList<ArrayList<Long>> selected_partition = partitions.get(minimum_index);
		ArrayList<Long> selected_gcd_list = partitions_gcd_list.get(minimum_index);
		// System.out.println(selected_partition);
		// System.out.println(selected_gcd_list);

		// Pre-computed data threshold
		
		i = 0;
		for (ArrayList<Long> cluster : selected_partition)
		{
			for (Long element : cluster)
			{
				result.put(element * visualization_client.getChartWidth(), selected_gcd_list.get(i));
			}
			i += 1;
		}
		
		System.out.println(result);
		visualization_client.setIntervals(result);
	}
	
	public static void main(String[] args)
	{
		ChronoUnit[] units = {ChronoUnit.SECONDS, ChronoUnit.SECONDS, ChronoUnit.SECONDS, ChronoUnit.SECONDS, ChronoUnit.SECONDS, ChronoUnit.SECONDS, ChronoUnit.SECONDS, ChronoUnit.SECONDS, ChronoUnit.SECONDS, ChronoUnit.SECONDS};
		// ChronoUnit[] units = {ChronoUnit.SECONDS, ChronoUnit.SECONDS, ChronoUnit.SECONDS, ChronoUnit.SECONDS, ChronoUnit.SECONDS, ChronoUnit.SECONDS};
		long[] factors = {600, 1800, 3600, 36000, 86400, 604800, 2678400, 8640000, 17280000, 25920000};
		// long[] factors = {1296000, 2678400, 7776000, 15552000, 31536000, 63072000};
		CalendarScale scale = new CalendarScale(units, factors);
		TimeSeries time_series_data = new TimeSeries(2, 0.04, OffsetDateTime.parse("2019-01-01T00:00:00+01:00"), OffsetDateTime.parse("2020-01-01T00:00:00+01:00"));
		VisualizationClient client = new VisualizationClient(2, 400, 1200, 10, scale, 250, 100, 18, 700);
		new IntervalSelectionNative(client, time_series_data).computeIntervals();
	}
}