package fr.ubo.fast.common.model;

import java.io.Serializable;
import java.time.OffsetDateTime;
import java.util.TreeMap;

public class TimeSeries implements Serializable
{
	private int id;
	private double period;
	private OffsetDateTime start_date;
	private OffsetDateTime end_date;
	private transient TreeMap<OffsetDateTime, Double[]> observations = new TreeMap<OffsetDateTime, Double[]>();
	
	private static final long serialVersionUID = 8951753816955394845L;
	
	public TimeSeries()
	{
		
	}
	
	public TimeSeries(int id, double period, OffsetDateTime start_date, OffsetDateTime end_date)
	{
		this.id = id;
		this.period = period;
		this.start_date = start_date;
		this.end_date = end_date;
	}
	
	public TimeSeries(int id, double period, OffsetDateTime start_date, OffsetDateTime end_date, TreeMap<OffsetDateTime, Double[]> observations)
	{
		this(id, period, start_date, end_date);
		this.observations = observations;
	}
	
	public void setId(int id)
	{
		this.id = id;
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

	public void setObservations(TreeMap<OffsetDateTime, Double[]> observations)
	{
		this.observations = observations;
	}

	public int getId()
	{
		return id;
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
	
	public TreeMap<OffsetDateTime, Double[]> getObservations()
	{
		return observations;
	}
}