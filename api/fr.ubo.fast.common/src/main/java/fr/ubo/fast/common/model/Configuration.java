package fr.ubo.fast.common.model;

public class Configuration
{
	private int time_series_id;
	private AggregationType aggregation_type;
	private double interval;
	private String table_name;
	
	public Configuration(int time_series_id, AggregationType aggregation_type, double interval, String table_name)
	{
		this.time_series_id = time_series_id;
		this.aggregation_type = aggregation_type;
		this.interval = interval;
		this.table_name = table_name;
	}

	public int getTimeSeriesId()
	{
		return time_series_id;
	}

	public AggregationType getAggregationType()
	{
		return aggregation_type;
	}

	public double getInterval()
	{
		return interval;
	}

	public String getTableName()
	{
		return table_name;
	}

	public void setTimeSeriesId(int time_series_id)
	{
		this.time_series_id = time_series_id;
	}

	public void setAggregationType(AggregationType aggregation_type)
	{
		this.aggregation_type = aggregation_type;
	}

	public void setInterval(double interval)
	{
		this.interval = interval;
	}

	public void setTableName(String table_name)
	{
		this.table_name = table_name;
	}
}
