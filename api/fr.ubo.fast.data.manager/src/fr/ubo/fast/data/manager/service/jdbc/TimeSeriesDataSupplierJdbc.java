package fr.ubo.fast.data.manager.service.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.Duration;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;
import java.util.TimeZone;
import java.util.TreeMap;
import javax.inject.Inject;
import javax.inject.Singleton;

import fr.ubo.fast.common.model.AggregatedObservationRecord;
import fr.ubo.fast.common.model.AggregationType;
import fr.ubo.fast.common.model.Database;
import fr.ubo.fast.common.constant.DatabaseProperties;
import fr.ubo.fast.common.constant.DatabaseSchemaProperties;
import fr.ubo.fast.common.utility.AggregationHelper;
import fr.ubo.fast.data.manager.dao.jdbc.MeasuredVariableDataAccessJdbc;
import fr.ubo.fast.data.manager.dao.jdbc.TimeSeriesDataAccessJdbc;
import fr.ubo.fast.data.manager.service.TimeSeriesDataSupplier;

@Singleton
public class TimeSeriesDataSupplierJdbc implements TimeSeriesDataSupplier
{
	private Database database;
	private Connection connection;
	private MeasuredVariableDataAccessJdbc measured_variable_data_access;
	private TimeSeriesDataAccessJdbc time_series_data_access;
	
	@Inject
	public TimeSeriesDataSupplierJdbc(Database database, Connection connection)
	{
		this.database = database;
		this.connection = connection;
		this.measured_variable_data_access = new MeasuredVariableDataAccessJdbc(this.connection);
		this.time_series_data_access = new TimeSeriesDataAccessJdbc(this.connection);
	}
	
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
	@Override
	public TreeMap<OffsetDateTime, AggregatedObservationRecord> getData(String name, List<AggregationType> aggregations, OffsetDateTime start_time, OffsetDateTime end_time, double interval, int values_number)
	{
		if (aggregations == null || aggregations.isEmpty())
		{
            throw new IllegalArgumentException("At least one aggregation must be provided");
        }
		
		TreeMap<OffsetDateTime, AggregatedObservationRecord> observations = new TreeMap<>();
		List<AggregationType> data_not_pre_computed = new ArrayList<>();
		
		int measured_variable_id = measured_variable_data_access.getMeasuredVariableId(name);
		if (measured_variable_id <= 0)
		{
			return observations;
		}

		int time_series_id = time_series_data_access.getTimeSeriesId(name);
		if (time_series_id <= 0)
		{
			return observations;
		}
		
		for (AggregationType aggregation : aggregations)
		{
			if (aggregation == AggregationType.RAW)
			{
				getRawData(time_series_id, start_time, end_time, observations);
			}
			else
			{
				String aggregation_table = getAggregationTable(time_series_id, aggregation, interval);
				if (aggregation_table.isEmpty())
				{
					data_not_pre_computed.add(aggregation);
				}
				else
				{
					getPreComputedData(aggregation, aggregation_table, start_time, end_time, observations);
				}
			}
		}
		
		// For now, multiple queries, merge later
		for (AggregationType aggregation : data_not_pre_computed)
		{
			getDynamicAggregationData(time_series_id, aggregation, start_time, end_time, values_number, interval, observations);
		}
		
		return observations;
	}
	
	/**
	 * Retrieve raw data for a specific time series over a given time range.
	 * 
	 * @param time_series_id Time series ID.
	 * @param start_time Start time of the time window.
	 * @param end_time End time of the time window.
	 * @param observations Structure that will store the retrieved values.
	 */
	public void getRawData(int time_series_id, OffsetDateTime start_time, OffsetDateTime end_time, TreeMap<OffsetDateTime, AggregatedObservationRecord> observations)
	{		
		if (connection == null)
		{
			return;
		}
		
		// SELECT time, value, quality FROM observations WHERE time >= ? AND time < ? AND time_series_id = ?;
		String query = "SELECT %s, %s, %s FROM %s WHERE %s >= ? AND %s < ? AND %s = ?;";
		query = String.format(query, DatabaseSchemaProperties.RAW_TIME_SERIES_DATA_TIME_COLUMN.toString(),
				DatabaseSchemaProperties.RAW_TIME_SERIES_DATA_VALUE_COLUMN.toString(),
				DatabaseSchemaProperties.RAW_TIME_SERIES_DATA_QUALITY_COLUMN.toString(),
				DatabaseSchemaProperties.RAW_TIME_SERIES_DATA_TABLE.toString(),
				DatabaseSchemaProperties.RAW_TIME_SERIES_DATA_TIME_COLUMN.toString(),
				DatabaseSchemaProperties.RAW_TIME_SERIES_DATA_TIME_COLUMN.toString(),
				DatabaseSchemaProperties.RAW_TIME_SERIES_DATA_TIME_SERIES_ID_COLUMN.toString());
		
		System.out.println(query);
					
		try (PreparedStatement statement = connection.prepareStatement(query))
		{
			// Turn the cursor on to fetch rows in manageable batches rather than loading everything at once
			statement.setFetchSize(database.getFetchSize());	
			statement.setTimestamp(1, Timestamp.from(start_time.toInstant()));
			statement.setTimestamp(2, Timestamp.from(end_time.toInstant()));
			statement.setInt(3, time_series_id);

			try (ResultSet query_result = statement.executeQuery())
			{
				while (query_result.next())
				{
					Timestamp timestamp = query_result.getTimestamp(DatabaseSchemaProperties.RAW_TIME_SERIES_DATA_TIME_COLUMN.toString(), Calendar.getInstance(TimeZone.getTimeZone(DatabaseProperties.TIME_ZONE.toString())));
					OffsetDateTime date_time = OffsetDateTime.ofInstant(timestamp.toInstant(), ZoneId.of(DatabaseProperties.ZONE_ID.toString()));
					
					AggregatedObservationRecord record = observations.getOrDefault(date_time, new AggregatedObservationRecord());
					double value = query_result.getDouble(DatabaseSchemaProperties.RAW_TIME_SERIES_DATA_VALUE_COLUMN.toString());
					record.setRaw(value);
					
					int quality = query_result.getInt(DatabaseSchemaProperties.RAW_TIME_SERIES_DATA_QUALITY_COLUMN.toString());
					record.setQuality(quality);
					
					observations.put(date_time, record);
				}
			}
			
			// Turn the cursor off
			statement.setFetchSize(0);
		}
		catch (SQLException exception)
		{
			exception.printStackTrace();
		}
	}
	
	/**
	 * Retrieve pre-computed aggregated data for a given aggregation type from a designated aggregation table.
	 * 
	 * @param aggregation Aggregation type.
	 * @param aggregation_table Name of the aggregation table from which to retrieve the data.
	 * @param start_time Start time of the time window.
	 * @param end_time End time of the time window.
	 * @param observations Structure that will store the retrieved values.
	 */
	public void getPreComputedData(AggregationType aggregation, String aggregation_table, OffsetDateTime start_time, OffsetDateTime end_time, TreeMap<OffsetDateTime, AggregatedObservationRecord> observations)
	{
		if (connection == null)
		{
			return;
		}
		
		String[] columns = AggregationHelper.getAggregationClause(aggregation, false).getColumns();
		// SELECT time_interval, aggregation, (values_number), min_quality, max_quality FROM observations_id_%s_interval_%s WHERE time_interval >= ? AND time_interval < ?;
		String query = "SELECT %s, %s, %s, %s FROM %s WHERE %s >= ? AND %s < ?;";
		query = String.format(query,
				DatabaseSchemaProperties.AGGREGATED_TIME_SERIES_DATA_TIME_COLUMN.toString(),
				String.join(", ", columns),
				DatabaseSchemaProperties.AGGREGATED_TIME_SERIES_DATA_MIN_QUALITY_COLUMN.toString(),
				DatabaseSchemaProperties.AGGREGATED_TIME_SERIES_DATA_MAX_QUALITY_COLUMN.toString(),
				aggregation_table, DatabaseSchemaProperties.AGGREGATED_TIME_SERIES_DATA_TIME_COLUMN.toString(),
				DatabaseSchemaProperties.AGGREGATED_TIME_SERIES_DATA_TIME_COLUMN.toString());		
		
		System.out.println(query);

		try (PreparedStatement statement = connection.prepareStatement(query))
		{
			// Turn the cursor on to fetch rows in manageable batches rather than loading everything at once
			statement.setFetchSize(database.getFetchSize());
			statement.setTimestamp(1, Timestamp.from(start_time.toInstant()));
			statement.setTimestamp(2, Timestamp.from(end_time.toInstant()));

			try (ResultSet query_result = statement.executeQuery())
			{
				while (query_result.next())
				{
					Timestamp timestamp = query_result.getTimestamp(DatabaseSchemaProperties.AGGREGATED_TIME_SERIES_DATA_TIME_COLUMN.toString(), Calendar.getInstance(TimeZone.getTimeZone(DatabaseProperties.TIME_ZONE.toString())));
					OffsetDateTime date_time = OffsetDateTime.ofInstant(timestamp.toInstant(), ZoneId.of(DatabaseProperties.ZONE_ID.toString()));
					
					AggregatedObservationRecord record = observations.getOrDefault(date_time, new AggregatedObservationRecord());
					updateObservationRecord(aggregation, columns, query_result, record);

					int min_quality = query_result.getInt(DatabaseSchemaProperties.AGGREGATED_TIME_SERIES_DATA_MIN_QUALITY_COLUMN.toString());
					int max_quality = query_result.getInt(DatabaseSchemaProperties.AGGREGATED_TIME_SERIES_DATA_MAX_QUALITY_COLUMN.toString());
					record.setMinQuality(min_quality);
					record.setMaxQuality(max_quality);
					
					observations.put(date_time, record);
				}
			}
			
			// Turn the cursor off
			statement.setFetchSize(0);
		}
		catch (SQLException exception)
		{
			exception.printStackTrace();
		}
	}
	
	/**
	 * Retrieve dynamically aggregated data for a specific time series over a given time range.
     * This method calculates the aggregation on the fly using the provided parameters.
     * 
	 * @param time_series_id Time series ID.
	 * @param aggregation Aggregation type.
	 * @param start_time Start time of the time window.
	 * @param end_time End time of the time window.
	 * @param values_number Number of values (buckets) to return.
	 * @param interval Interval over which aggregations are calculated, expressed in seconds.
	 * @param observations Structure that will store the retrieved values.
	 */
	public void getDynamicAggregationData(int time_series_id, AggregationType aggregation, OffsetDateTime start_time, OffsetDateTime end_time, int values_number, double interval, TreeMap<OffsetDateTime, AggregatedObservationRecord> observations)
	{
		String base_table = getNearestAggregationTable(time_series_id, aggregation, interval);
		String[] aggregation_columns = AggregationHelper.getAggregationClause(aggregation, true).getColumns();
		String query = "";
		String compute_aggregation_clause = "";
		boolean is_raw = base_table.equals(DatabaseSchemaProperties.RAW_TIME_SERIES_DATA_TABLE.toString());
		
		if (is_raw)
		{
			compute_aggregation_clause = AggregationHelper.getAggregationClause(aggregation, is_raw).getSelectClause();
			// Select time_bucket('%s seconds') AS time_interval, MIN(value) AS min_aggregate, MIN(quality) AS min_quality, MAX(quality) AS max_quality FROM observations WHERE time >= ? AND time < ? AND time_series_id = ? GROUP BY time_interval ORDER BY time_interval;
			query = "SELECT time_bucket(\'%s seconds\', %s) AS %s, %s, MIN(%s) AS %s, MAX(%s) AS %s FROM %s WHERE %s >= ? AND %s < ? AND %s = ? GROUP BY %s ORDER BY %s;"; 
			query = String.format(query, String.valueOf(interval),
					DatabaseSchemaProperties.RAW_TIME_SERIES_DATA_TIME_COLUMN.toString(),
					DatabaseSchemaProperties.AGGREGATED_TIME_SERIES_DATA_TIME_COLUMN.toString(),
					compute_aggregation_clause, DatabaseSchemaProperties.RAW_TIME_SERIES_DATA_QUALITY_COLUMN.toString(),
					DatabaseSchemaProperties.AGGREGATED_TIME_SERIES_DATA_MIN_QUALITY_COLUMN.toString(),
					DatabaseSchemaProperties.RAW_TIME_SERIES_DATA_QUALITY_COLUMN.toString(),
					DatabaseSchemaProperties.AGGREGATED_TIME_SERIES_DATA_MAX_QUALITY_COLUMN.toString(),
					DatabaseSchemaProperties.RAW_TIME_SERIES_DATA_TABLE.toString(),
					DatabaseSchemaProperties.RAW_TIME_SERIES_DATA_TIME_COLUMN.toString(),
					DatabaseSchemaProperties.RAW_TIME_SERIES_DATA_TIME_COLUMN.toString(),
					DatabaseSchemaProperties.RAW_TIME_SERIES_DATA_TIME_SERIES_ID_COLUMN.toString(),
					DatabaseSchemaProperties.AGGREGATED_TIME_SERIES_DATA_TIME_COLUMN.toString(),
					DatabaseSchemaProperties.AGGREGATED_TIME_SERIES_DATA_TIME_COLUMN.toString());
		}
		else
		{
			compute_aggregation_clause = AggregationHelper.getAggregationClause(aggregation, is_raw).getSelectClause();
			// Select time_bucket('%s seconds') AS time_interval, MIN(value) AS min_aggregate, MIN(min_quality) AS min_quality, MAX(max_quality) AS max_quality FROM observations_id_%s_interval_%s WHERE time_interval >= ? AND time_interval < ? GROUP BY time_interval ORDER BY time_interval;
			query = "SELECT time_bucket(\'%s seconds\', %s) AS %s, %s, MIN(%s) AS %s, MAX(%s) AS %s FROM %s WHERE %s >= ? AND %s < ? GROUP BY %s ORDER BY %s;"; 
			query = String.format(query, String.valueOf(interval),
					DatabaseSchemaProperties.AGGREGATED_TIME_SERIES_DATA_TIME_COLUMN.toString(),
					DatabaseSchemaProperties.AGGREGATED_TIME_SERIES_DATA_TIME_COLUMN.toString(),
					compute_aggregation_clause,
					DatabaseSchemaProperties.AGGREGATED_TIME_SERIES_DATA_MIN_QUALITY_COLUMN.toString(),
					DatabaseSchemaProperties.AGGREGATED_TIME_SERIES_DATA_MIN_QUALITY_COLUMN.toString(),
					DatabaseSchemaProperties.AGGREGATED_TIME_SERIES_DATA_MAX_QUALITY_COLUMN.toString(),
					DatabaseSchemaProperties.AGGREGATED_TIME_SERIES_DATA_MAX_QUALITY_COLUMN.toString(), base_table,
					DatabaseSchemaProperties.AGGREGATED_TIME_SERIES_DATA_TIME_COLUMN.toString(),
					DatabaseSchemaProperties.AGGREGATED_TIME_SERIES_DATA_TIME_COLUMN.toString(),
					DatabaseSchemaProperties.AGGREGATED_TIME_SERIES_DATA_TIME_COLUMN.toString(),
					DatabaseSchemaProperties.AGGREGATED_TIME_SERIES_DATA_TIME_COLUMN.toString());
		}
		
		System.out.println(query);

		if (interval % 1 == 0)
		{
			try (PreparedStatement statement = connection.prepareStatement(query))
			{
				// Turn the cursor on to fetch rows in manageable batches rather than loading everything at once
				statement.setFetchSize(database.getFetchSize());
				statement.setTimestamp(1, Timestamp.from(start_time.toInstant()));
				statement.setTimestamp(2, Timestamp.from(end_time.toInstant()));
				if (is_raw)
				{
					statement.setInt(3, time_series_id);
				}
				
				try (ResultSet query_result = statement.executeQuery())
				{
					while (query_result.next())
					{
						Timestamp timestamp = query_result.getTimestamp(DatabaseSchemaProperties.AGGREGATED_TIME_SERIES_DATA_TIME_COLUMN.toString(), Calendar.getInstance(TimeZone.getTimeZone(DatabaseProperties.TIME_ZONE.toString())));
						OffsetDateTime date_time = OffsetDateTime.ofInstant(timestamp.toInstant(), ZoneId.of(DatabaseProperties.ZONE_ID.toString()));
						
						AggregatedObservationRecord record = observations.getOrDefault(date_time, new AggregatedObservationRecord());
						updateObservationRecord(aggregation, aggregation_columns, query_result, record);

						int min_quality = query_result.getInt(DatabaseSchemaProperties.AGGREGATED_TIME_SERIES_DATA_MIN_QUALITY_COLUMN.toString());
						int max_quality = query_result.getInt(DatabaseSchemaProperties.AGGREGATED_TIME_SERIES_DATA_MAX_QUALITY_COLUMN.toString());
						record.setMinQuality(min_quality);
						record.setMaxQuality(max_quality);
						
						observations.put(date_time, record);
					}
				}
			}
			catch (SQLException exception)
			{
				exception.printStackTrace();
			}
		}
		else
		{
			Duration zoom_interval_duration = Duration.between(start_time, end_time);
			long zoom_interval_seconds = zoom_interval_duration.getSeconds();
			long zoom_interval_remaining_milliseconds = zoom_interval_duration.toMillis() % 1000;
			
			if (zoom_interval_seconds <= 0)
			{
				return;
			}

			long floor_interval = (long) Math.floor(interval);
			long ceil_interval = (long) Math.ceil(interval);
			
			if (floor_interval < 1)
			{
				floor_interval = 1;
			}

			long p_buckets = zoom_interval_seconds - values_number * floor_interval;
			
			if (p_buckets < 0)
			{
				p_buckets = 0;
			}
			
			long n_buckets = values_number - p_buckets;
		
			OffsetDateTime current_time = start_time;

			for (int i = 0; i < n_buckets; i++)
			{
				OffsetDateTime bucket_end_time = current_time.plusSeconds(floor_interval);

				try (PreparedStatement statement = connection.prepareStatement(query))
				{
					// Turn the cursor on to fetch rows in manageable batches rather than loading everything at once
					statement.setFetchSize(database.getFetchSize());
					statement.setTimestamp(1, Timestamp.from(current_time.toInstant()));
					statement.setTimestamp(2, Timestamp.from(bucket_end_time.toInstant()));
					if (is_raw)
					{
						statement.setInt(3, time_series_id);
					}
					
					try (ResultSet query_result = statement.executeQuery())
					{
						while (query_result.next())
						{
							Timestamp timestamp = query_result.getTimestamp(DatabaseSchemaProperties.AGGREGATED_TIME_SERIES_DATA_TIME_COLUMN.toString(), Calendar.getInstance(TimeZone.getTimeZone(DatabaseProperties.TIME_ZONE.toString())));
							OffsetDateTime date_time = OffsetDateTime.ofInstant(timestamp.toInstant(), ZoneId.of(DatabaseProperties.ZONE_ID.toString()));
							
							AggregatedObservationRecord record = observations.getOrDefault(date_time, new AggregatedObservationRecord());
							updateObservationRecord(aggregation, aggregation_columns, query_result, record);

							int min_quality = query_result.getInt(DatabaseSchemaProperties.AGGREGATED_TIME_SERIES_DATA_MIN_QUALITY_COLUMN.toString());
							int max_quality = query_result.getInt(DatabaseSchemaProperties.AGGREGATED_TIME_SERIES_DATA_MAX_QUALITY_COLUMN.toString());
							record.setMinQuality(min_quality);
							record.setMaxQuality(max_quality);
							
							observations.put(date_time, record);
						}
					}
				}
				catch (SQLException exception)
				{
					exception.printStackTrace();
				}
				
				current_time = bucket_end_time;
			}

			for (int i = 0; i < p_buckets; i++)
			{
				OffsetDateTime bucket_end_time = null;
				
				if (i == p_buckets - 1)
				{
					bucket_end_time = current_time.plusSeconds(ceil_interval).plus(zoom_interval_remaining_milliseconds, ChronoUnit.MILLIS);
				}
				else
				{
					bucket_end_time = current_time.plusSeconds(ceil_interval);
				}

				try (PreparedStatement statement = connection.prepareStatement(query))
				{
					// Turn the cursor on to fetch rows in manageable batches rather than loading everything at once
					statement.setFetchSize(database.getFetchSize());
					statement.setTimestamp(1, Timestamp.from(current_time.toInstant()));
					statement.setTimestamp(2, Timestamp.from(bucket_end_time.toInstant()));
					if (is_raw)
					{
						statement.setInt(3, time_series_id);
					}
					
					try (ResultSet query_result = statement.executeQuery())
					{
						while (query_result.next())
						{
							Timestamp timestamp = query_result.getTimestamp(DatabaseSchemaProperties.AGGREGATED_TIME_SERIES_DATA_TIME_COLUMN.toString(), Calendar.getInstance(TimeZone.getTimeZone(DatabaseProperties.TIME_ZONE.toString())));
							OffsetDateTime date_time = OffsetDateTime.ofInstant(timestamp.toInstant(), ZoneId.of(DatabaseProperties.ZONE_ID.toString()));
							
							AggregatedObservationRecord record = observations.getOrDefault(date_time, new AggregatedObservationRecord());
							updateObservationRecord(aggregation, aggregation_columns, query_result, record);

							int min_quality = query_result.getInt(DatabaseSchemaProperties.AGGREGATED_TIME_SERIES_DATA_MIN_QUALITY_COLUMN.toString());
							int max_quality = query_result.getInt(DatabaseSchemaProperties.AGGREGATED_TIME_SERIES_DATA_MAX_QUALITY_COLUMN.toString());
							record.setMinQuality(min_quality);
							record.setMaxQuality(max_quality);
							
							observations.put(date_time, record);
						}
					}
				}
				catch (SQLException exception)
				{
					exception.printStackTrace();
				}
				
				current_time = bucket_end_time;
			}
		}
	}
	
	private String getAggregationTable(int time_series_id, AggregationType aggregation, double interval)
	{
		String aggregation_table = "";
		
		if (connection == null)
		{
			return aggregation_table;
		}
		
		// SELECT aggregation_table FROM configurations WHERE time_series_id = ? AND aggregation_type = ? AND interval = ?;
		String query = "SELECT %s FROM %s WHERE %s = ? AND %s = ? AND %s = ?;";
		query = String.format(query, DatabaseSchemaProperties.CONFIGURATIONS_AGGREGATION_TABLE_COLUMN.toString(),
				DatabaseSchemaProperties.CONFIGURATIONS_TABLE.toString(),
				DatabaseSchemaProperties.CONFIGURATIONS_TIME_SERIES_ID_COLUMN.toString(),
				DatabaseSchemaProperties.CONFIGURATIONS_AGGREGATION_TYPE_COLUMN.toString(),
				DatabaseSchemaProperties.CONFIGURATIONS_INTERVAL_COLUMN.toString());
		
		try (PreparedStatement statement = connection.prepareStatement(query))
		{
			statement.setInt(1, time_series_id);
			statement.setString(2, aggregation.toString());
			statement.setDouble(3, interval);

			try (ResultSet query_result = statement.executeQuery())
			{
				if (query_result.next())
				{
					aggregation_table = query_result.getString(DatabaseSchemaProperties.CONFIGURATIONS_AGGREGATION_TABLE_COLUMN.toString());
				}
			}
		}
		catch (SQLException exception)
		{
			exception.printStackTrace();
		}
		
		return aggregation_table;
	}
	
	private String getNearestAggregationTable(int time_series_id, AggregationType aggregation, double interval)
	{
		switch (aggregation)
		{
			case MIN:
			case MAX:
			case AVERAGE:
			{
				List<Double> intervals = getAggregationIntervals(time_series_id, aggregation);
				if (intervals == null || intervals.isEmpty())
				{
					return DatabaseSchemaProperties.RAW_TIME_SERIES_DATA_TABLE.toString();
				}
	
				Collections.sort(intervals);
	
				Double chosen_interval = null;
				for (Double candidate : intervals)
				{
					if (candidate <= interval)
					{
						chosen_interval = candidate;
					}
				}
	
				if (chosen_interval == null)
				{
					return DatabaseSchemaProperties.RAW_TIME_SERIES_DATA_TABLE.toString();
				}

				String aggregation_table = getAggregationTable(time_series_id, aggregation, chosen_interval);
	
				if (aggregation_table == null || aggregation_table.isEmpty())
				{
					return DatabaseSchemaProperties.RAW_TIME_SERIES_DATA_TABLE.toString();
				}
				
				return aggregation_table;
			}
			case MEDIAN:
			case FIRST_QUARTILE:
			case LAST_QUARTILE:
			{
				return DatabaseSchemaProperties.RAW_TIME_SERIES_DATA_TABLE.toString();
			}
			default:
			{
				throw new IllegalArgumentException("Unexpected aggregation: " + aggregation);
			}
		}
	}
	
	private List<Double> getAggregationIntervals(int time_series_id, AggregationType aggregation)
	{
		List<Double> results = new ArrayList<>();

		// SELECT DISTINCT interval FROM configurations WHERE time_series_id = ? AND aggregation_type = ? ORDER BY interval ASC;
		String query = "SELECT DISTINCT %s FROM %s WHERE %s = ? AND %s = ? ORDER BY %s ASC;";
		query = String.format(query, DatabaseSchemaProperties.CONFIGURATIONS_INTERVAL_COLUMN.toString(),
				DatabaseSchemaProperties.CONFIGURATIONS_TABLE.toString(),
				DatabaseSchemaProperties.CONFIGURATIONS_TIME_SERIES_ID_COLUMN.toString(),
				DatabaseSchemaProperties.CONFIGURATIONS_AGGREGATION_TYPE_COLUMN.toString(),
				DatabaseSchemaProperties.CONFIGURATIONS_INTERVAL_COLUMN.toString());

		try (PreparedStatement statement = connection.prepareStatement(query))
		{
			statement.setInt(1, time_series_id);
			statement.setString(2, aggregation.toString());

			try (ResultSet query_result = statement.executeQuery())
			{
				while (query_result.next())
				{
					double interval_value = query_result.getDouble(DatabaseSchemaProperties.CONFIGURATIONS_INTERVAL_COLUMN.toString());
					results.add(interval_value);
				}
			}
		}
		catch (SQLException exception)
		{
			exception.printStackTrace();
		}

		return results;
	}

	private void updateObservationRecord(AggregationType aggregation, String[] columns, ResultSet query_result, AggregatedObservationRecord record) throws SQLException
	{
		switch (aggregation)
		{
			case MIN:
			{
				record.setMin(query_result.getDouble(columns[0]));
				break;
			}
			case MAX:
			{
				record.setMax(query_result.getDouble(columns[0]));
				break;
			}
			case AVERAGE:
			{
				record.setAverage(query_result.getDouble(columns[0]));
				record.setValuesNumber(query_result.getInt(columns[1]));
				break;
			}
			case MEDIAN:
			{
				record.setMedian(query_result.getDouble(columns[0]));
				break;
			}
			case FIRST_QUARTILE:
			{
				record.setFirstQuartile(query_result.getDouble(columns[0]));
				break;
			}
			case LAST_QUARTILE:
			{
				record.setLastQuartile(query_result.getDouble(columns[0]));
				break;
			}
			default:
			{
				break;
			}
		}
	}
}
