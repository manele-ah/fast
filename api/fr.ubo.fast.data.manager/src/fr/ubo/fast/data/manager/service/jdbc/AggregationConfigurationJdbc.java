package fr.ubo.fast.data.manager.service.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.Duration;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Singleton;

import fr.ubo.fast.common.constant.DatabaseSchemaProperties;
import fr.ubo.fast.common.model.AggregationClause;
import fr.ubo.fast.common.model.AggregationType;
import fr.ubo.fast.common.model.Configuration;
import fr.ubo.fast.common.model.Scale;
import fr.ubo.fast.common.utility.AggregationHelper;
import fr.ubo.fast.common.utility.DatabaseHelper;
import fr.ubo.fast.data.manager.dao.jdbc.ConfigurationDataAccessJdbc;
import fr.ubo.fast.data.manager.dao.jdbc.MeasuredVariableDataAccessJdbc;
import fr.ubo.fast.data.manager.dao.jdbc.TimeSeriesDataAccessJdbc;
import fr.ubo.fast.data.manager.service.AggregationConfiguration;

@Singleton
public class AggregationConfigurationJdbc implements AggregationConfiguration
{
	private Connection connection;
	private MeasuredVariableDataAccessJdbc measured_variable_data_access;
	private TimeSeriesDataAccessJdbc time_series_data_access;
	private ConfigurationDataAccessJdbc configuration_data_access;

	@Inject
	public AggregationConfigurationJdbc(Connection connection)
	{
		this.connection = connection;
		this.measured_variable_data_access = new MeasuredVariableDataAccessJdbc(this.connection);
		this.time_series_data_access = new TimeSeriesDataAccessJdbc(this.connection);
		this.configuration_data_access = new ConfigurationDataAccessJdbc(this.connection);
	}

	/**
	 * Configure a time series with a list of aggregations and a scale (list of zoom levels). 
	 * For each aggregation type and each interval (zoom level / values_number), a pre-computed table is created and a row is inserted into the configurations table.
	 *
	 * @param Name of the measured variable linked to the time series.
	 * @param start_time Start time of the time window.
	 * @param end_time End time of the time window.
	 * @param aggregations List of aggregations.
	 * @param values_number Number of values (buckets) to return.
	 * @param scale List of zoom levels.
	 * @return True if the pre-computed tables were created successfully, false otherwise.
	 */
	@Override
	public boolean configureAggregations(String name, OffsetDateTime start_time, OffsetDateTime end_time, List<AggregationType> aggregations, int values_number, Scale scale)	
	{
		if (aggregations == null || aggregations.isEmpty())
		{
			throw new IllegalArgumentException("At least one aggregation must be provided");
		}
		
		int measured_variable_id = measured_variable_data_access.getMeasuredVariableId(name);
		if (measured_variable_id <= 0)
		{
			return false;
		}

		int time_series_id = time_series_data_access.getTimeSeriesId(name);
		if (time_series_id <= 0)
		{
			return false;
		}

		// Delete all previous configurations related to this time series
		configuration_data_access.deleteConfiguration(time_series_id);
		
		boolean configuration_succeeded = true;

		for (AggregationType aggregation_type : aggregations)
		{
			for (Duration zoom : scale.getValues())
			{
				double interval_seconds = zoom.dividedBy(values_number).toMillis() / 1000.0;
				System.out.println(interval_seconds);
				if (interval_seconds <= 0.0)
				{
					continue;
				}

				String pre_computed_table_name = String.format(DatabaseSchemaProperties.AGGREGATED_TIME_SERIES_DATA_TABLE_PATTERN.toString(), time_series_id, String.valueOf(interval_seconds).replace('.', '_'));

				boolean table_create = createAggregationTable(pre_computed_table_name);
				if (!table_create)
				{
					configuration_succeeded = false;
					continue;
				}

				boolean configuration_inserted = configuration_data_access.addConfiguration(new Configuration(time_series_id, aggregation_type, interval_seconds, pre_computed_table_name));
				if (!configuration_inserted)
				{
					configuration_succeeded = false;
				}

				boolean data_inserted = fillAggregationTable(pre_computed_table_name, time_series_id, start_time, end_time, interval_seconds, aggregations);
				if (!data_inserted)
				{
					configuration_succeeded = false;
				}
			}
		}

		return configuration_succeeded;
	}

	private boolean createAggregationTable(String table_name)
	{
		String query = "CREATE TABLE IF NOT EXISTS %s(%s TIMESTAMP WITH TIME ZONE NOT NULL, %s INTEGER, %s INTEGER, %s DOUBLE PRECISION, %s DOUBLE PRECISION, %s DOUBLE PRECISION, %s DOUBLE PRECISION, %s DOUBLE PRECISION, %s DOUBLE PRECISION, %s INTEGER, PRIMARY KEY(%s));";
		query = String.format(query, table_name, DatabaseSchemaProperties.AGGREGATED_TIME_SERIES_DATA_TIME_COLUMN.toString(),
				DatabaseSchemaProperties.AGGREGATED_TIME_SERIES_DATA_MIN_QUALITY_COLUMN.toString(),
				DatabaseSchemaProperties.AGGREGATED_TIME_SERIES_DATA_MAX_QUALITY_COLUMN.toString(),
				DatabaseSchemaProperties.AGGREGATED_TIME_SERIES_DATA_MIN_COLUMN.toString(),
				DatabaseSchemaProperties.AGGREGATED_TIME_SERIES_DATA_MAX_COLUMN.toString(),
				DatabaseSchemaProperties.AGGREGATED_TIME_SERIES_DATA_AVERAGE_COLUMN.toString(),
				DatabaseSchemaProperties.AGGREGATED_TIME_SERIES_DATA_MEDIAN_COLUMN.toString(),
				DatabaseSchemaProperties.AGGREGATED_TIME_SERIES_DATA_FIRST_QUARTILE_COLUMN.toString(),
				DatabaseSchemaProperties.AGGREGATED_TIME_SERIES_DATA_LAST_QUARTILE_COLUMN.toString(),
				DatabaseSchemaProperties.AGGREGATED_TIME_SERIES_DATA_VALUES_NUMBER_COLUMN.toString(),
				DatabaseSchemaProperties.AGGREGATED_TIME_SERIES_DATA_TIME_COLUMN.toString());
				
		if (DatabaseHelper.executeSqlCommand(connection, query))
		{
			String hyper_table_query = String.format("SELECT create_hypertable('%s', '%s', if_not_exists => TRUE);", table_name,
					DatabaseSchemaProperties.AGGREGATED_TIME_SERIES_DATA_TIME_COLUMN.toString());
			
			return DatabaseHelper.executeSqlCommand(connection, hyper_table_query);
		}
		
		return false;
	}

	private boolean fillAggregationTable(String aggregation_table, int time_series_id, OffsetDateTime start_time, OffsetDateTime end_time, double interval, List<AggregationType> aggregations)
	{
		if (connection == null)
		{
			return false;
		}

		List<String> sub_clauses = new ArrayList<>();
	    List<String> aggregation_columns = new ArrayList<>();
	    
		for (AggregationType aggregation : aggregations)
		{
			AggregationClause clause = AggregationHelper.getAggregationClause(aggregation, true);
			sub_clauses.add(clause.getSelectClause());
			aggregation_columns.addAll(Arrays.asList(clause.getColumns()));
		}

		sub_clauses.add(String.format("MIN(%s) AS %s", DatabaseSchemaProperties.RAW_TIME_SERIES_DATA_QUALITY_COLUMN.toString(), DatabaseSchemaProperties.AGGREGATED_TIME_SERIES_DATA_MIN_QUALITY_COLUMN.toString()));
		sub_clauses.add(String.format("MAX(%s) AS %s", DatabaseSchemaProperties.RAW_TIME_SERIES_DATA_QUALITY_COLUMN.toString(), DatabaseSchemaProperties.AGGREGATED_TIME_SERIES_DATA_MAX_QUALITY_COLUMN.toString()));
		aggregation_columns.add(DatabaseSchemaProperties.AGGREGATED_TIME_SERIES_DATA_MIN_QUALITY_COLUMN.toString());
		aggregation_columns.add(DatabaseSchemaProperties.AGGREGATED_TIME_SERIES_DATA_MAX_QUALITY_COLUMN.toString());
		String aggregation_clause = String.join(", ", sub_clauses);
		
		String time_bucket_interval = String.format("%s seconds", String.valueOf(interval));

		String raw_table = DatabaseSchemaProperties.RAW_TIME_SERIES_DATA_TABLE.toString();
		String time_column = DatabaseSchemaProperties.RAW_TIME_SERIES_DATA_TIME_COLUMN.toString();
		String time_series_id_column = DatabaseSchemaProperties.RAW_TIME_SERIES_DATA_TIME_SERIES_ID_COLUMN.toString();
		String time_interval_column = DatabaseSchemaProperties.AGGREGATED_TIME_SERIES_DATA_TIME_COLUMN.toString();

		List<String> update_clauses = new ArrayList<>();
		for (String column : aggregation_columns)
		{
			update_clauses.add(String.format("%s = EXCLUDED.%s", column, column));
		}
		String update_set = String.join(", ", update_clauses);
		
	    // INSERT INTO observations_id_%s_interval_%s(time_interval, min_aggregate, max_aggregate) 
	    // SELECT time_bucket('%s seconds', time) as time_interval, MIN(value) AS min_aggregate, MAX(value) AS max_aggregate, MIN(quality) AS min_quality, MAX(quality) AS max_quality
	    // FROM observations WHERE time_series_id = ? AND time >= ? AND time < ? GROUP BY time_interval
	    // ON CONFLICT (time_interval) DO UPDATE SET min_aggregate = EXCLUDED.min_aggregate, max_aggregate = EXCLUDED.max_aggregate, min_quality = EXCLUDED.min_quality, max_quality = EXCLUDED.max_quality;  
	    String query = "INSERT INTO %s(%s, %s) SELECT time_bucket('%s', %s) AS %s, %s FROM %s WHERE %s = ? AND %s >= ? AND %s < ? GROUP BY %s ON CONFLICT (%s) DO UPDATE SET %s;";
		query = String.format(query, aggregation_table, time_interval_column, String.join(", ", aggregation_columns),
				time_bucket_interval, time_column, time_interval_column, aggregation_clause, raw_table,
				time_series_id_column, time_column, time_column, time_interval_column, time_interval_column, update_set);

		try (PreparedStatement statement = connection.prepareStatement(query))
		{
			statement.setInt(1, time_series_id);
			statement.setTimestamp(2, Timestamp.from(start_time.toInstant()));
			statement.setTimestamp(3, Timestamp.from(end_time.toInstant()));
			int affected_rows = statement.executeUpdate();
			
			return affected_rows > 0;
		}
		catch (SQLException exception)
		{
			exception.printStackTrace();
			
			return false;
		}
	}
}

