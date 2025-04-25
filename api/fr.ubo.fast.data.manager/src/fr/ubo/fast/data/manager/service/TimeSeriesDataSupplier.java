package fr.ubo.fast.data.manager.service;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.TreeMap;

import fr.ubo.fast.common.model.AggregatedObservationRecord;
import fr.ubo.fast.common.model.AggregationType;

public interface TimeSeriesDataSupplier
{
	/**
	 * Retrieve data for a specific time series and a list of aggregations over a given time range.
	 * 
	 * @param name Name of the measured variable linked to the time series.
	 * @param aggregations List of requested aggregation types.
	 * @param start_time Start time of the time window.
	 * @param end_time End time of the time window.
	 * @param interval Interval over which aggregations are calculated, expressed in seconds.
	 * @param values_number Number of values (buckets) to return.
	 * @return Retrieved values with their timestamps.
	 */
	public TreeMap<OffsetDateTime, AggregatedObservationRecord> getData(String name, List<AggregationType> aggregations, OffsetDateTime start_time, OffsetDateTime end_time, double interval, int values_number);
}
