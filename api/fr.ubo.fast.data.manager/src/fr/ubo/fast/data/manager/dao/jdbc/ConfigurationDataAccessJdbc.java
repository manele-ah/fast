package fr.ubo.fast.data.manager.dao.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import fr.ubo.fast.common.constant.DatabaseSchemaProperties;
import fr.ubo.fast.common.model.AggregationType;
import fr.ubo.fast.common.model.Configuration;
import fr.ubo.fast.common.utility.DatabaseHelper;
import fr.ubo.fast.data.manager.dao.ConfigurationDataAccess;

public class ConfigurationDataAccessJdbc implements ConfigurationDataAccess
{
	private Connection connection;
	
	public ConfigurationDataAccessJdbc(Connection connection)
	{
		this.connection = connection;
	}
	
    /**
     * Add a configuration defined by its aggregation type, interval, table name and time series ID.
     * 
     * @param configuration Configuration to be added.
     * @return True if the configuration was created successfully, false otherwise.
     */
	@Override
	public boolean addConfiguration(Configuration configuration)
	{
		if (connection == null || configuration == null)
		{
			return false;
		}

		String query = "INSERT INTO %s(%s, %s, %s, %s) VALUES(?, ?, ?, ?);";
		query = String.format(query, DatabaseSchemaProperties.CONFIGURATIONS_TABLE.toString(),
				DatabaseSchemaProperties.CONFIGURATIONS_INTERVAL_COLUMN.toString(),
				DatabaseSchemaProperties.CONFIGURATIONS_AGGREGATION_TYPE_COLUMN.toString(),
				DatabaseSchemaProperties.CONFIGURATIONS_AGGREGATION_TABLE_COLUMN.toString(),
				DatabaseSchemaProperties.CONFIGURATIONS_TIME_SERIES_ID_COLUMN.toString());
		
		try (PreparedStatement statement = connection.prepareStatement(query))
		{
			statement.setDouble(1, configuration.getInterval());
			statement.setString(2, configuration.getAggregationType().toString());
			statement.setString(3, configuration.getTableName());
			statement.setInt(4, configuration.getTimeSeriesId());
			int affected_row = statement.executeUpdate();
			
			return affected_row > 0;
		}
		catch (Exception exception)
		{
			exception.printStackTrace();
			
			return false;
		}
	}
	
	/**
     * Delete a configuration and automatically drop the associated aggregation tables if they exist.
     * 
     * @param time_series_id Time series ID of the configuration to delete.
     * @return True if the configuration was dropped successfully, false otherwise.
     */
	@Override
	public boolean deleteConfiguration(int time_series_id)
	{
		if (connection == null)
		{
			return false;
		}
		
		String configuration_table_name = DatabaseSchemaProperties.CONFIGURATIONS_TABLE.toString();
		String aggregation_table_column = DatabaseSchemaProperties.CONFIGURATIONS_AGGREGATION_TABLE_COLUMN.toString();
		String time_series_id_column = DatabaseSchemaProperties.CONFIGURATIONS_TIME_SERIES_ID_COLUMN.toString();
		
		String query = String.format("SELECT %s FROM %s WHERE %s = ?;", aggregation_table_column, configuration_table_name, time_series_id_column);
		List<String> aggregation_tables = new ArrayList<>();
		
		try
		{
			connection.setAutoCommit(false);
			
			try (PreparedStatement statement = connection.prepareStatement(query))
			{
				statement.setInt(1, time_series_id);
				
				try (ResultSet query_result = statement.executeQuery())
				{
					while (query_result.next())
					{
						aggregation_tables.add(query_result.getString(aggregation_table_column));
					}
				}
			}
			
			boolean all_tables_dropped = true;
			
			for (String table : aggregation_tables)
			{
				boolean dropped = DatabaseHelper.dropTable(connection, table);
				if (!dropped)
				{
					all_tables_dropped = false;
					break;
				}
			}

			if (!all_tables_dropped)
			{
				connection.rollback();
				return false;
			}

			query = String.format("DELETE FROM %s WHERE %s = ?;", configuration_table_name, time_series_id_column);
			
			int rows_deleted = 0;
			try (PreparedStatement statement = connection.prepareStatement(query))
			{
				statement.setInt(1, time_series_id);
				rows_deleted = statement.executeUpdate();
			}
			
			if (rows_deleted < 1)
			{
				connection.rollback();
				
				return false;
			}

			connection.commit();
			
			return true;
		}
		catch (Exception exception)
		{
			exception.printStackTrace();
			try
			{
				connection.rollback();
			}
			catch (SQLException ignored)
			{
				
			}
			
			return false;
		}
		finally
		{
			try
			{
				connection.setAutoCommit(true);
			}
			catch (SQLException ignored)
			{
				
			}
		}
	}
	
	/**
     * Delete a configuration and automatically drop the associated aggregation tables if they exist.
     * 
     * @param time_series_id Time series ID of the configuration to delete.
     * @param aggregation_type Aggregation type of the configuration to delete.
     * @return True if the configuration was dropped successfully, false otherwise.
     */
	@Override
	public boolean deleteConfiguration(int time_series_id, AggregationType aggregation_type)
	{
		if (connection == null)
		{
			return false;
		}
		
		String configuration_table_name = DatabaseSchemaProperties.CONFIGURATIONS_TABLE.toString();
		String aggregation_type_column = DatabaseSchemaProperties.CONFIGURATIONS_AGGREGATION_TYPE_COLUMN.toString();
		String aggregation_table_column = DatabaseSchemaProperties.CONFIGURATIONS_AGGREGATION_TABLE_COLUMN.toString();
		String time_series_id_column = DatabaseSchemaProperties.CONFIGURATIONS_TIME_SERIES_ID_COLUMN.toString();
		
		String query = String.format("SELECT %s FROM %s WHERE %s = ? AND %s = ?;", aggregation_table_column, configuration_table_name, time_series_id_column, aggregation_type_column);
		List<String> aggregation_tables = new ArrayList<>();
		
		try
		{
			connection.setAutoCommit(false);
			
			try (PreparedStatement statement = connection.prepareStatement(query))
			{
				statement.setInt(1, time_series_id);
				statement.setString(2, aggregation_type.toString());
				
				try (ResultSet query_result = statement.executeQuery())
				{
					while (query_result.next())
					{
						aggregation_tables.add(query_result.getString(aggregation_table_column));
					}
				}
			}
			
			boolean all_tables_dropped = true;
			
			for (String table : aggregation_tables)
			{
				boolean dropped = DatabaseHelper.dropTable(connection, table);
				if (!dropped)
				{
					all_tables_dropped = false;
					break;
				}
			}

			if (!all_tables_dropped)
			{
				connection.rollback();
				return false;
			}

			query = String.format("DELETE FROM %s WHERE %s = ? AND %s = ?;", configuration_table_name, time_series_id_column, aggregation_type_column);
			
			int rows_deleted = 0;
			try (PreparedStatement statement = connection.prepareStatement(query))
			{
				statement.setInt(1, time_series_id);
				statement.setString(2, aggregation_type.toString());
				rows_deleted = statement.executeUpdate();
			}
			
			if (rows_deleted < 1)
			{
				connection.rollback();
				
				return false;
			}

			connection.commit();
			
			return true;
		}
		catch (Exception exception)
		{
			exception.printStackTrace();
			try
			{
				connection.rollback();
			}
			catch (SQLException ignored)
			{
				
			}
			
			return false;
		}
		finally
		{
			try
			{
				connection.setAutoCommit(true);
			}
			catch (SQLException ignored)
			{
				
			}
		}
	}
}
