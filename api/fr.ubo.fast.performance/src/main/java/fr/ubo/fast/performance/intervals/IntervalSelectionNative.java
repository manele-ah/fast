package fr.ubo.fast.performance.intervals;

import java.time.OffsetDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;
import org.apache.commons.lang3.ArrayUtils;

import fr.ubo.fast.common.model.CalendarScale;
import fr.ubo.fast.common.model.FactorScale;
import fr.ubo.fast.common.model.PerformanceProfile;
import fr.ubo.fast.common.model.TimeSeries;
import fr.ubo.fast.common.utility.MathHelper;

/**
 * Class that implements a greedy strategy for selecting time intervals used in Min-Max table pre-computation.
 * This is not based on the constraint programming optimization strategy defined in the FaST article.
 */
public class IntervalSelectionNative implements IntervalSelection
{
	/** Performance profile needed to compute intervals. */
	private PerformanceProfile performance_profile;
	/** Time series meta-data. */
	private TimeSeries time_series_data;
	
	/**
	 * Initialize the class with a performance profile and time series meta-data.
	 * 
	 * @param performance_profile Performance profile needed to compute intervals.
	 * @param time_series_data Time series meta-data.
	 */
	public IntervalSelectionNative(PerformanceProfile performance_profile, TimeSeries time_series_data)
	{
		this.performance_profile = performance_profile;
		this.time_series_data = time_series_data;
		
		if (this.performance_profile.getScale() instanceof FactorScale)
		{
			((FactorScale) (this.performance_profile.getScale())).computeValues(this.time_series_data);
		}
		else if (this.performance_profile.getScale() instanceof CalendarScale)
		{
			((CalendarScale) (this.performance_profile.getScale())).computeValues();
		}
	}
	
	/**
	 * Compute and select a set of optimal intervals (zoom level durations divided by number of values) needed for Min-Max table pre-computation in the FaST framework.
	 */
	@Override
	public void computeIntervals()
	{
		int i = 0;
		TreeMap<Long, Long> result = new TreeMap<Long, Long>();
		List<Long> scale_values = this.performance_profile.getScale().getLongValues();
		
		for (Long value : scale_values)
		{
			result.put(value, (long) -1);
			scale_values.set(i, (long) (value / (this.performance_profile.getValuesNumber())));
			i += 1;
		}
		
		scale_values.removeIf(element -> element < this.performance_profile.getRawDataThreshold());

		// Partitions => Partitions GCD list
		List<List<List<Long>>> partitions = MathHelper.generateAllPossiblePartitions(scale_values);
		List<List<Long>> partitions_gcd_list = new ArrayList<>();
		double[] weights = new double[partitions.size()];
		i = 0;
		for (List<List<Long>> partition : partitions)
		{
			List<Long> gcd_list = new ArrayList<Long>();
			double weight = 0.0;
			for (List<Long> group : partition)
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
		
		List<List<Long>> selected_partition = partitions.get(minimum_index);
		List<Long> selected_gcd_list = partitions_gcd_list.get(minimum_index);

		// Pre-computed data threshold
		
		i = 0;
		for (List<Long> cluster : selected_partition)
		{
			for (Long element : cluster)
			{
				result.put(element * performance_profile.getValuesNumber(), selected_gcd_list.get(i));
			}
			i += 1;
		}
		
		System.out.println(result);
		performance_profile.setIntervals(result);
	}
	
	public static void main(String[] args)
	{
		// ChronoUnit[] units = {ChronoUnit.SECONDS, ChronoUnit.SECONDS, ChronoUnit.SECONDS, ChronoUnit.SECONDS, ChronoUnit.SECONDS, ChronoUnit.SECONDS, ChronoUnit.SECONDS, ChronoUnit.SECONDS, ChronoUnit.SECONDS, ChronoUnit.SECONDS, ChronoUnit.SECONDS};
		// long[] factors = {600, 1800, 3600, 36000, 86400, 604800, 2678400, 8640000, 17280000, 25920000, 34200000};
		// ChronoUnit[] units = {ChronoUnit.SECONDS, ChronoUnit.SECONDS, ChronoUnit.SECONDS, ChronoUnit.SECONDS, ChronoUnit.SECONDS, ChronoUnit.SECONDS};
		// long[] factors = {1296000, 2678400, 7776000, 15552000, 31536000, 63072000};
		// ChronoUnit[] units = {ChronoUnit.SECONDS, ChronoUnit.MINUTES, ChronoUnit.MINUTES, ChronoUnit.MINUTES, ChronoUnit.HOURS, ChronoUnit.HOURS, ChronoUnit.HOURS, ChronoUnit.DAYS, ChronoUnit.DAYS, ChronoUnit.MONTHS, ChronoUnit.MONTHS, ChronoUnit.MONTHS, ChronoUnit.MONTHS, ChronoUnit.MONTHS, ChronoUnit.MONTHS};
		// long[] factors = {30, 25, 30, 44, 1, 3, 6, 1, 7, 1, 2, 3, 5, 6, 7};
		ChronoUnit[] units = {ChronoUnit.MINUTES, ChronoUnit.HOURS, ChronoUnit.HOURS, ChronoUnit.DAYS, ChronoUnit.DAYS, ChronoUnit.DAYS, ChronoUnit.DAYS, ChronoUnit.DAYS};
		long[] factors = {30, 6, 12, 1, 15, 30, 60, 365};

		TimeSeries time_series_data = new TimeSeries(1, 1.0, OffsetDateTime.parse("2010-01-01T00:00:00+01:00"), OffsetDateTime.parse("2016-01-01T00:00:00+01:00"));
		CalendarScale scale = new CalendarScale(units, factors);
		// FactorScale scale = new FactorScale(2, 8);
		PerformanceProfile client = new PerformanceProfile("temperature", 1000, scale, 250, 100, 300, 1000);
		new IntervalSelectionNative(client, time_series_data).computeIntervals();
	}
}