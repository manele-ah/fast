package fr.ubo.fast.data.manager.dao.jdbc;

import java.sql.Connection;
import javax.inject.Inject;

import fr.ubo.fast.common.constant.DatabaseSchemaProperties;
import fr.ubo.fast.common.utility.DatabaseHelper;
import fr.ubo.fast.data.manager.dao.DatabaseSchemaDataAccess;

public class DatabaseSchemaDataAccessJdbc implements DatabaseSchemaDataAccess
{
	private Connection connection;
	
	@Inject
	public DatabaseSchemaDataAccessJdbc(Connection connection)
	{
		this.connection = connection;
	}
	
	/**
	 * Create table that stores measured variables.
	 * 
	 * @return True if the table was created successfully, false otherwise.
	 */
	@Override
	public boolean createMeasuredVariablesTable()
	{	
		String query = "CREATE TABLE IF NOT EXISTS %s(%s SERIAL PRIMARY KEY, %s TEXT, %s TEXT);";
		query = String.format(query, DatabaseSchemaProperties.MEASURED_VARIABLES_META_DATA_TABLE.toString(),
				DatabaseSchemaProperties.MEASURED_VARIABLES_META_DATA_ID_COLUMN.toString(),
				DatabaseSchemaProperties.MEASURED_VARIABLES_META_DATA_NAME_COLUMN.toString(),
				DatabaseSchemaProperties.MEASURED_VARIABLES_META_DATA_UNIT_COLUMN.toString());

		return DatabaseHelper.executeSqlCommand(connection, query);
	}
	
	/**
	 * Create table that stores time series meta-data.
	 * 
	 * @return True if the table was created successfully, false otherwise.
	 */
	@Override
	public boolean createTimeSeriesTable()
	{	
		String query = "CREATE TABLE IF NOT EXISTS %s(%s SERIAL PRIMARY KEY, %s TIMESTAMP WITH TIME ZONE, %s TIMESTAMP WITH TIME ZONE, %s DOUBLE PRECISION, %s INTEGER, %s INTEGER, %s INTEGER REFERENCES %s(%s) ON DELETE CASCADE);";
		query = String.format(query, DatabaseSchemaProperties.TIME_SERIES_META_DATA_TABLE.toString(),
				DatabaseSchemaProperties.TIME_SERIES_META_DATA_ID_COLUMN.toString(),
				DatabaseSchemaProperties.TIME_SERIES_META_DATA_START_DATE_COLUMN.toString(),
				DatabaseSchemaProperties.TIME_SERIES_META_DATA_END_DATE_COLUMN.toString(),
				DatabaseSchemaProperties.TIME_SERIES_META_DATA_PERIOD_COLUMN.toString(),
				DatabaseSchemaProperties.TIME_SERIES_META_DATA_MIN_QUALITY_COLUMN.toString(),
				DatabaseSchemaProperties.TIME_SERIES_META_DATA_MAX_QUALITY_COLUMN.toString(),
				DatabaseSchemaProperties.TIME_SERIES_META_DATA_MEASURED_VARIABLE_ID.toString(),
				DatabaseSchemaProperties.MEASURED_VARIABLES_META_DATA_TABLE.toString(),
				DatabaseSchemaProperties.MEASURED_VARIABLES_META_DATA_ID_COLUMN.toString());
		
		return DatabaseHelper.executeSqlCommand(connection, query);
	}
	
	/**
	 * Create table that stores time series observations.
	 * 
	 * @return True if the table was created successfully, false otherwise.
	 */
	@Override
	public boolean createObservationsTable()
	{
		String query = "CREATE TABLE IF NOT EXISTS %s(%s TIMESTAMP WITH TIME ZONE NOT NULL, %s DOUBLE PRECISION, %s INTEGER, %s INTEGER REFERENCES %s(%s) ON DELETE CASCADE, PRIMARY KEY(%s, %s));";
		query = String.format(query,
				DatabaseSchemaProperties.RAW_TIME_SERIES_DATA_TABLE.toString(),
				DatabaseSchemaProperties.RAW_TIME_SERIES_DATA_TIME_COLUMN.toString(),
				DatabaseSchemaProperties.RAW_TIME_SERIES_DATA_VALUE_COLUMN.toString(),
				DatabaseSchemaProperties.RAW_TIME_SERIES_DATA_QUALITY_COLUMN.toString(),
				DatabaseSchemaProperties.RAW_TIME_SERIES_DATA_TIME_SERIES_ID_COLUMN.toString(),
				DatabaseSchemaProperties.TIME_SERIES_META_DATA_TABLE.toString(),
				DatabaseSchemaProperties.TIME_SERIES_META_DATA_ID_COLUMN.toString(), 
				DatabaseSchemaProperties.RAW_TIME_SERIES_DATA_TIME_COLUMN.toString(),
				DatabaseSchemaProperties.RAW_TIME_SERIES_DATA_TIME_SERIES_ID_COLUMN.toString());
		
		if (DatabaseHelper.executeSqlCommand(connection, query))
		{
			String hyper_table_query = String.format("SELECT create_hypertable('%s', '%s', if_not_exists => TRUE);",
					DatabaseSchemaProperties.RAW_TIME_SERIES_DATA_TABLE.toString(),
					DatabaseSchemaProperties.RAW_TIME_SERIES_DATA_TIME_COLUMN.toString());
			
			return DatabaseHelper.executeSqlCommand(connection, hyper_table_query);
		}
		
		return false;
	}

	/**
	 * Create table that stores configurations for managing and accessing pre-computed tables.
	 * 
	 * @return True if the table was created successfully, false otherwise.
	 */
	@Override
	public boolean createConfigurationsTable()
	{
		String query = "CREATE TABLE IF NOT EXISTS %s(%s DOUBLE PRECISION, %s TEXT, %s TEXT, %s INTEGER REFERENCES %s(%s) ON DELETE CASCADE, PRIMARY KEY(%s, %s, %s));";
		query = String.format(query,
				DatabaseSchemaProperties.CONFIGURATIONS_TABLE.toString(),
				DatabaseSchemaProperties.CONFIGURATIONS_INTERVAL_COLUMN.toString(),
				DatabaseSchemaProperties.CONFIGURATIONS_AGGREGATION_TYPE_COLUMN.toString(),
				DatabaseSchemaProperties.CONFIGURATIONS_AGGREGATION_TABLE_COLUMN.toString(),
				DatabaseSchemaProperties.CONFIGURATIONS_TIME_SERIES_ID_COLUMN.toString(),
				DatabaseSchemaProperties.TIME_SERIES_META_DATA_TABLE.toString(),
				DatabaseSchemaProperties.TIME_SERIES_META_DATA_ID_COLUMN.toString(),
				DatabaseSchemaProperties.CONFIGURATIONS_TIME_SERIES_ID_COLUMN.toString(),
				DatabaseSchemaProperties.CONFIGURATIONS_INTERVAL_COLUMN.toString(),
				DatabaseSchemaProperties.CONFIGURATIONS_AGGREGATION_TYPE_COLUMN.toString());
		
		return DatabaseHelper.executeSqlCommand(connection, query);
	}
	
	/**
	 * Create table that stores user data requests.
	 * 
	 * @return True if the table was created successfully, false otherwise.
	 */
	@Override
	public boolean createUserProfilesTable()
	{
		String user_profiles_table = DatabaseSchemaProperties.USER_PROFILES_TABLE.toString();
		String user_profiles_id_column = DatabaseSchemaProperties.USER_PROFILES_ID_COLUMN.toString();
		
		String query = "CREATE TABLE IF NOT EXISTS %s(%s TEXT PRIMARY KEY);";
		query = String.format(query, user_profiles_table, user_profiles_id_column);
		
		if (DatabaseHelper.executeSqlCommand(connection, query))
		{
			String query_create_entries = "CREATE TABLE IF NOT EXISTS %s(%s SERIAL PRIMARY KEY, %s TEXT REFERENCES %s(%s) ON DELETE CASCADE, %s INTEGER REFERENCES %s(%s) ON DELETE CASCADE, %s TIMESTAMP WITH TIME ZONE, %s TIMESTAMP WITH TIME ZONE, %s TEXT, %s DOUBLE PRECISION, %s INTEGER);";
			query_create_entries = String.format(query_create_entries,
					DatabaseSchemaProperties.USER_PROFILE_ENTRIES_TABLE.toString(),
					DatabaseSchemaProperties.USER_PROFILE_ENTRIES_ID_COLUMN.toString(),
					DatabaseSchemaProperties.USER_PROFILE_ENTRIES_USER_ID_COLUMN.toString(), user_profiles_table,
					user_profiles_id_column,
					DatabaseSchemaProperties.USER_PROFILE_ENTRIES_TIME_SERIES_ID_COLUMN.toString(),
					DatabaseSchemaProperties.TIME_SERIES_META_DATA_TABLE.toString(),
					DatabaseSchemaProperties.TIME_SERIES_META_DATA_ID_COLUMN.toString(),
					DatabaseSchemaProperties.USER_PROFILE_ENTRIES_START_DATE_COLUMN.toString(),
					DatabaseSchemaProperties.USER_PROFILE_ENTRIES_END_DATE_COLUMN.toString(),
					DatabaseSchemaProperties.USER_PROFILE_ENTRIES_AGGREGATION_TYPE_COLUMN.toString(),
					DatabaseSchemaProperties.USER_PROFILE_ENTRIES_ZOOM_INTERVAL_COLUMN.toString(),
					DatabaseSchemaProperties.USER_PROFILE_ENTRIES_VALUES_NUMBER_COLUMN.toString());
			
			return DatabaseHelper.executeSqlCommand(connection, query_create_entries);
		}
		
		return false;
	}
	
	/**
	 * Drop table that stores measured variables.
	 * 
	 * @return True if the table was dropped successfully, false otherwise.
	 */
	@Override
	public boolean dropMeasuredVariablesTable()
	{
		return DatabaseHelper.dropTable(connection, DatabaseSchemaProperties.MEASURED_VARIABLES_META_DATA_TABLE.toString());
	}
	
	/**
	 * Drop table that stores time series meta-data.
	 * 
	 * @return True if the table was dropped successfully, false otherwise.
	 */
	@Override
	public boolean dropTimeSeriesTable()
	{
		return DatabaseHelper.dropTable(connection, DatabaseSchemaProperties.TIME_SERIES_META_DATA_TABLE.toString()); 
	}

	/**
	 * Drop table that stores time series observations.
	 * 
	 * @return True if the table was dropped successfully, false otherwise.
	 */
	@Override
	public boolean dropObservationsTable()
	{
		return DatabaseHelper.dropTable(connection, DatabaseSchemaProperties.RAW_TIME_SERIES_DATA_TABLE.toString()); 
	}
	
	/**
	 * Drop table that stores configurations for managing and accessing pre-computed tables.
	 * 
	 * @return True if the table was dropped successfully, false otherwise.
	 */
	@Override
	public boolean dropConfigurationsTable()
	{
		return DatabaseHelper.dropTable(connection, DatabaseSchemaProperties.CONFIGURATIONS_TABLE.toString());
	}
	
	/**
	 * Drop table that stores user data requests.
	 * 
	 * @return True if the table was dropped successfully, false otherwise.
	 */
	@Override
	public boolean dropUserProfilesTable()
	{
		return DatabaseHelper.dropTable(connection, DatabaseSchemaProperties.USER_PROFILE_ENTRIES_TABLE.toString())
				&& DatabaseHelper.dropTable(connection, DatabaseSchemaProperties.USER_PROFILES_TABLE.toString());
	}
}
