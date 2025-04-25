package fr.ubo.fast.common.model;

import java.io.Serializable;
import java.time.OffsetDateTime;

public class TimeSeries implements Serializable
{
	private int id;
	private int measured_variable_id;
	private double period;
	private OffsetDateTime start_date;
	private OffsetDateTime end_date;
	private int min_quality;
	private int max_quality;
	
	private static final long serialVersionUID = 8951753816955394845L;
	
	public TimeSeries()
	{
		
	}
	
	// DataProviderDatabaseHelper + IntervalSelectionNative
	public TimeSeries(int id, double period, OffsetDateTime start_date, OffsetDateTime end_date)
	{
		this.id = id;
		this.measured_variable_id = -1;
		this.period = period;
		this.start_date = start_date;
		this.end_date = end_date;
		this.min_quality = -1;
		this.max_quality = -1;
	}
	
	public TimeSeries(int id, int measured_variable_id, double period, OffsetDateTime start_date, OffsetDateTime end_date, int min_quality, int max_quality)
	{
		this.id = id;
		this.measured_variable_id = measured_variable_id;
		this.period = period;
		this.start_date = start_date;
		this.end_date = end_date;
		this.min_quality = min_quality;
		this.max_quality = max_quality;
	}
	
	public TimeSeries(int measured_variable_id, double period, OffsetDateTime start_date, OffsetDateTime end_date, int min_quality, int max_quality)
	{
		this.id = -1;
		this.measured_variable_id = measured_variable_id;
		this.period = period;
		this.start_date = start_date;
		this.end_date = end_date;
		this.min_quality = min_quality;
		this.max_quality = max_quality;
	}
	
	public void setId(int id)
	{
		this.id = id;
	}
	
	public void setMeasuredVariableId(int measured_variable_id)
	{
		this.measured_variable_id = measured_variable_id;
	}

	public void setPeriod(double period)
	{
		this.period = period;
	}

	public void setStartDate(OffsetDateTime start_date)
	{
		this.start_date = start_date;
	}

	public void setEndDate(OffsetDateTime end_date)
	{
		this.end_date = end_date;
	}
	
	public void setMinQuality(int min_quality)
	{
		this.min_quality = min_quality;
	}
	
	public void setMaxQuality(int max_quality)
	{
		this.max_quality = max_quality;
	}

	public int getId()
	{
		return id;
	}
	
	public int getMeasuredVariableId()
	{
		return measured_variable_id;
	}

	public double getPeriod()
	{
		return period;
	}

	public OffsetDateTime getStartDate()
	{
		return start_date;
	}

	public OffsetDateTime getEndDate()
	{
		return end_date;
	}
	
	public int getMinQuality()
	{
		return min_quality;
	}
	
	public int getMaxQuality()
	{
		return max_quality;
	}
}