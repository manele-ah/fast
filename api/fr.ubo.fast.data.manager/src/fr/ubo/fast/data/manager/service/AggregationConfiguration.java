package fr.ubo.fast.data.manager.service;

import java.time.OffsetDateTime;
import java.util.List;

import fr.ubo.fast.common.model.AggregationType;
import fr.ubo.fast.common.model.Scale;

public interface AggregationConfiguration
{
	/**
	 * Configure a time series with a list of aggregations and a scale (list of zoom levels). 
	 * For each aggregation type and each interval (zoom level / values_number), a pre-computed table is created and a row is inserted into the configurations table.
	 *
	 * @param name Name of the measured variable linked to the time series.
	 * @param start_time Start time of the time window.
	 * @param end_time End time of the time window.
	 * @param aggregations List of aggregations.
	 * @param values_number Number of values (buckets) to return.
	 * @param scale List of zoom levels.
	 * @return True if the pre-computed tables were created successfully, false otherwise.
	 */
	public boolean configureAggregations(String name, OffsetDateTime start_time, OffsetDateTime end_time, List<AggregationType> aggregations, int values_number, Scale scale);	
}
