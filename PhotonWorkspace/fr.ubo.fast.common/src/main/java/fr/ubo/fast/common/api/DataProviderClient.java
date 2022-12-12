package fr.ubo.fast.common.api;

import java.time.OffsetDateTime;
import java.util.TreeMap;

import fr.ubo.fast.common.model.TimeSeries;

public abstract class DataProviderClient implements DataProvider
{
	@Override
	public abstract TreeMap<OffsetDateTime, Double[]> ping(int data_points_number);

	@Override
	public abstract TreeMap<OffsetDateTime, Double[]> getTimeSeriesObservations(int time_series_id, String start_time, String end_time, double interval, String table, boolean raw);

	@Override
	public abstract TimeSeries getTimeSeriesMetaData(int time_series_id);
}
