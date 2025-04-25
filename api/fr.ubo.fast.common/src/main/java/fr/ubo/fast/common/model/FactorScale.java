package fr.ubo.fast.common.model;

import java.time.Duration;

/**
 * Class that represents a list of zoom levels (durations) modeled as an exponential scale.
 */
public class FactorScale extends Scale
{
	/** Factor by which the time series duration is divided. */
	private int factor;
	/** Number of zoom levels to generate. */
	private int values_maximum_number;
	
	/**
	 * Initialize a factor scale with its properties.
	 * 
	 * @param factor Scale factor.
	 * @param values_maximum_number Number of zoom levels to generate.
	 */
	public FactorScale(int factor, int values_maximum_number)
	{
		this.factor = factor;
		this.values_maximum_number = values_maximum_number;
	}

	/**
	 * Compute the durations of the zoom levels according to the given factor.
	 * @param time_series_data : Given time series meta-data.
	 */
	public void computeValues(TimeSeries time_series_data)
	{
		Duration time_series_duration = Duration.between(time_series_data.getStartDate(), time_series_data.getEndDate());
		int i = 0;
		
		while (i < values_maximum_number)
		{
			Duration temporary_duration = time_series_duration.dividedBy((long) Math.pow(factor, i));
			double temporary_value = temporary_duration.toMillis() / 1000.0;
			if (temporary_value > time_series_data.getPeriod())
			{
				values.add(Duration.ofSeconds((long) temporary_value));
			}
			i += 1;
		}
		
		values.sort((duration_1, duration_2) -> duration_1.compareTo(duration_2));
	}

	/**
	 * Get scale factor.
	 * 
	 * @return Scale factor.
	 */
	public int getFactor()
	{
		return factor;
	}

	/**
	 * Get number of zoom levels to generate.
	 * 
	 * @return Zoom levels number.
	 */
	public int getValuesMaximumNumber()
	{
		return values_maximum_number;
	}
	
	
}