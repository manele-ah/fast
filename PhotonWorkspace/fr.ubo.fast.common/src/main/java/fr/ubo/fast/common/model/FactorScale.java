package fr.ubo.fast.common.model;

import java.time.Duration;

public class FactorScale extends Scale
{
	private int factor;
	private int values_maximum_number;
	
	public FactorScale(int factor, int values_maximum_number)
	{
		this.factor = factor;
		this.values_maximum_number = values_maximum_number;
	}
	
	public void computeValues(TimeSeries time_series_data)
	{
		Duration time_series_duration = Duration.between(time_series_data.getStartDate(), time_series_data.getEndDate());
		int i = 0;
		
		while (i <= values_maximum_number)
		{
			Duration temporary_duration = time_series_duration.dividedBy((long) Math.pow(factor, i));
			double temporary_value = temporary_duration.toMillis() / 1000.0;
			if (temporary_value > time_series_data.getPeriod())
			{
				values.add(Duration.ofSeconds((long) temporary_value));
			}
			i += 1;
		}
	}
}