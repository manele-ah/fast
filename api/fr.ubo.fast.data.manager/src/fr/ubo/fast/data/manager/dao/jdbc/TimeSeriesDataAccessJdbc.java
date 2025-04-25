package fr.ubo.fast.data.manager.dao.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.sql.Types;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.TimeZone;

import fr.ubo.fast.common.constant.DatabaseProperties;
import fr.ubo.fast.common.constant.DatabaseSchemaProperties;
import fr.ubo.fast.common.model.RawObservationRecord;
import fr.ubo.fast.common.model.TimeSeries;
import fr.ubo.fast.data.manager.dao.TimeSeriesDataAccess;

public class TimeSeriesDataAccessJdbc implements TimeSeriesDataAccess
{
	private Connection connection;
	private ConfigurationDataAccessJdbc configuration_data_access;
	
	public TimeSeriesDataAccessJdbc(Connection connection)
	{
		this.connection = connection;
		this.configuration_data_access = new ConfigurationDataAccessJdbc(this.connection);
	}
	
	/**
	 * Add a time series defined by its start date, end date, period, min quality and max quality.
	 * 
	 * @param time_series Time series to be added.
	 * @return ID of the newly created time series, or -1 on failure.
	 */
	@Override
	public int addTimeSeries(TimeSeries time_series)
	{
		if (time_series == null || connection == null)
		{
			return -1;
		}
		
		String id_column = DatabaseSchemaProperties.TIME_SERIES_META_DATA_ID_COLUMN.toString();
		// INSERT INTO time_series(start_date, end_date, period, min_quality, max_quality, measured_variable_id) VALUES (?, ?, ?, ?, ?, ?) RETURNING time_series_id;
		String query = "INSERT INTO %s(%s, %s, %s, %s, %s, %s) VALUES (?, ?, ?, ?, ?, ?) RETURNING %s;";
		query = String.format(query, DatabaseSchemaProperties.TIME_SERIES_META_DATA_TABLE.toString(),
				DatabaseSchemaProperties.TIME_SERIES_META_DATA_START_DATE_COLUMN.toString(),
				DatabaseSchemaProperties.TIME_SERIES_META_DATA_END_DATE_COLUMN.toString(),
				DatabaseSchemaProperties.TIME_SERIES_META_DATA_PERIOD_COLUMN.toString(),
				DatabaseSchemaProperties.TIME_SERIES_META_DATA_MIN_QUALITY_COLUMN.toString(),
				DatabaseSchemaProperties.TIME_SERIES_META_DATA_MAX_QUALITY_COLUMN.toString(),
				DatabaseSchemaProperties.TIME_SERIES_META_DATA_MEASURED_VARIABLE_ID.toString(), id_column);
		
		try (PreparedStatement statement = connection.prepareStatement(query))
		{
			if (time_series.getStartDate() == null)
			{
				statement.setNull(1, Types.TIMESTAMP);
			}
			else
			{
				statement.setTimestamp(1, Timestamp.from(time_series.getStartDate().toInstant()));
			}
			if (time_series.getEndDate() == null)
			{
				statement.setNull(2, Types.TIMESTAMP);
			}
			else
			{
				statement.setTimestamp(2, Timestamp.from(time_series.getEndDate().toInstant()));
			}
			statement.setDouble(3, time_series.getPeriod());
			statement.setInt(4, time_series.getMinQuality());
			statement.setInt(5, time_series.getMaxQuality());
			statement.setInt(6, time_series.getMeasuredVariableId());

			try (ResultSet query_result = statement.executeQuery())
			{
				if (query_result.next())
				{
					return query_result.getInt(id_column);
				}
			}
		}
		catch (SQLException exception)
		{
			exception.printStackTrace();
		}
		
		return -1;
	}
	
	/**
	 * Update the time range (start date, end date) and quality thresholds (min quality, max quality) of the given time series.
	 * 
	 * @param time_series_id Time series ID.
	 * @param start_date New start date of the time series.
	 * @param end_date New end date of the time series.
	 * @param min_quality New min quality of the time series.
	 * @param max_quality New max quality of the time series.
	 * @return True if the update succeeded, false otherwise.
	 */
	@Override
	public boolean updateTimeSeries(int time_series_id, OffsetDateTime start_date, OffsetDateTime end_date, int min_quality, int max_quality)
	{
		String query = "UPDATE %s SET %s = ?, %s = ?, %s = ?, %s = ? WHERE %s = ?";
		query = String.format(query, DatabaseSchemaProperties.TIME_SERIES_META_DATA_TABLE.toString(),
				DatabaseSchemaProperties.TIME_SERIES_META_DATA_START_DATE_COLUMN.toString(),
				DatabaseSchemaProperties.TIME_SERIES_META_DATA_END_DATE_COLUMN.toString(),
				DatabaseSchemaProperties.TIME_SERIES_META_DATA_MIN_QUALITY_COLUMN.toString(),
				DatabaseSchemaProperties.TIME_SERIES_META_DATA_MAX_QUALITY_COLUMN.toString(),
				DatabaseSchemaProperties.TIME_SERIES_META_DATA_ID_COLUMN.toString());

		try (PreparedStatement statement = connection.prepareStatement(query))
		{
			if (start_date == null)
			{
				statement.setNull(1, Types.TIMESTAMP);
			}
			else
			{
				statement.setTimestamp(1, Timestamp.from(start_date.toInstant()));
			}
			if (end_date == null)
			{
				statement.setNull(2, Types.TIMESTAMP);
			}
			else
			{
				statement.setTimestamp(2, Timestamp.from(end_date.toInstant()));
			}
			statement.setInt(3, min_quality);
			statement.setInt(4, max_quality);
			statement.setInt(5, time_series_id);
			int affected_rows = statement.executeUpdate();
			
			return affected_rows > 0;
		}
		catch (SQLException exception)
		{
			exception.printStackTrace();
			
			return false;
		}
	}
	
	/**
	 * Update the time range (start date, end date) of the given time series.
	 * 
	 * @param time_series_id Time series ID.
	 * @return True if the update succeeded, false otherwise.
	 */
	@Override
	public boolean updateTimeSeriesRange(int time_series_id)
	{
		String query = "SELECT MIN(%s) AS min_timestamp, MAX(%s) AS max_timestamp FROM %s WHERE %s = ?;";
		query = String.format(query, DatabaseSchemaProperties.RAW_TIME_SERIES_DATA_TIME_COLUMN.toString(),
				DatabaseSchemaProperties.RAW_TIME_SERIES_DATA_TIME_COLUMN.toString(),
				DatabaseSchemaProperties.RAW_TIME_SERIES_DATA_TABLE.toString(),
				DatabaseSchemaProperties.RAW_TIME_SERIES_DATA_TIME_SERIES_ID_COLUMN.toString());
		
		OffsetDateTime min_time = null;
		OffsetDateTime max_time = null;
		
		try (PreparedStatement statement = connection.prepareStatement(query))
		{
			statement.setInt(1, time_series_id);
			try (ResultSet query_result = statement.executeQuery())
			{
				if (query_result.next())
				{
					if (query_result.getTimestamp("min_timestamp", Calendar.getInstance(TimeZone.getTimeZone(DatabaseProperties.TIME_ZONE.toString()))) != null)
					{
						min_time = OffsetDateTime.ofInstant(query_result.getTimestamp("min_timestamp", Calendar.getInstance(TimeZone.getTimeZone(DatabaseProperties.TIME_ZONE.toString()))).toInstant(), ZoneId.of(DatabaseProperties.ZONE_ID.toString())); 
					}
					if (query_result.getTimestamp("max_timestamp", Calendar.getInstance(TimeZone.getTimeZone(DatabaseProperties.TIME_ZONE.toString()))) != null)
					{
						max_time = OffsetDateTime.ofInstant(query_result.getTimestamp("max_timestamp", Calendar.getInstance(TimeZone.getTimeZone(DatabaseProperties.TIME_ZONE.toString()))).toInstant(), ZoneId.of(DatabaseProperties.ZONE_ID.toString())); 
					}
				}
			}
		}
		catch (SQLException exception)
		{
			exception.printStackTrace();
			
			return false;
		}
				    
	    return updateTimeSeriesRange(time_series_id, min_time, max_time);
	}
	
	/**
	 * Update the time range (start date, end date) of the given time series.
	 * 
	 * @param time_series_id Time series ID.
	 * @param start_date New start date of the time series.
	 * @param end_date New end date of the time series.
	 * @return True if the update succeeded, false otherwise.
	 */
	@Override
	public boolean updateTimeSeriesRange(int time_series_id, OffsetDateTime start_date, OffsetDateTime end_date)
	{
		String query = "UPDATE %s SET %s = ?, %s = ? WHERE %s = ?";
		query = String.format(query, DatabaseSchemaProperties.TIME_SERIES_META_DATA_TABLE.toString(),
				DatabaseSchemaProperties.TIME_SERIES_META_DATA_START_DATE_COLUMN.toString(),
				DatabaseSchemaProperties.TIME_SERIES_META_DATA_END_DATE_COLUMN.toString(),
				DatabaseSchemaProperties.TIME_SERIES_META_DATA_ID_COLUMN.toString());

		try (PreparedStatement statement = connection.prepareStatement(query))
		{
			if (start_date == null)
			{
				statement.setNull(1, Types.TIMESTAMP);
			}
			else
			{
				statement.setTimestamp(1, Timestamp.from(start_date.toInstant()));
			}
			if (end_date == null)
			{
				statement.setNull(2, Types.TIMESTAMP);
			}
			else
			{
				statement.setTimestamp(2, Timestamp.from(end_date.toInstant()));
			}
			statement.setInt(3, time_series_id);
			int affected_rows = statement.executeUpdate();
			
			return affected_rows > 0;
		}
		catch (SQLException exception)
		{
			exception.printStackTrace();
			
			return false;
		}
	}
	
    /**
     * Delete a time series by its ID.
     * Automatically delete all associated observations.
     * Automatically delete aggregation tables and configuration rows.
     * 
     * @param time_series_id Time series ID.
     * @return True if the tables were deleted successfully, false otherwise. 
     */
	@Override
	public boolean deleteTimeSeries(int time_series_id)
	{
		try
		{
			connection.setAutoCommit(false);
			configuration_data_access.deleteConfiguration(time_series_id);
			connection.setAutoCommit(false);
			deleteObservations(time_series_id);
			connection.setAutoCommit(false);

			// This is problematic when there are no configurations and no observations
			/*
			if (!deleted_configuration || !deleted_observations)
			{
				connection.rollback();
				
				return false;
			}
			*/
			
			String query = "DELETE FROM %s WHERE %s = ?;";
			query = String.format(query, DatabaseSchemaProperties.TIME_SERIES_META_DATA_TABLE.toString(),
					DatabaseSchemaProperties.TIME_SERIES_META_DATA_ID_COLUMN.toString());
			
			int rows = 0;
			try (PreparedStatement statement = connection.prepareStatement(query))
			{
				statement.setInt(1, time_series_id);
				rows = statement.executeUpdate();
			}
			
			connection.commit();
			
			return rows > 0;
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
	 * Retrieve time series meta-data.
	 * 
	 * @param time_series_id ID of the time series to look up.
	 * @return Time series meta-data, or null on failure.
	 */
	@Override
	public TimeSeries getTimeSeries(int time_series_id)
	{
		if (time_series_id <= 0 || connection == null)
		{
			return null;
		}
		
		TimeSeries result = null;
		
		String table = DatabaseSchemaProperties.TIME_SERIES_META_DATA_TABLE.toString();
		String id_column = DatabaseSchemaProperties.TIME_SERIES_META_DATA_ID_COLUMN.toString();
		String measured_variable_id_column = DatabaseSchemaProperties.TIME_SERIES_META_DATA_MEASURED_VARIABLE_ID.toString();
		String start_date_column = DatabaseSchemaProperties.TIME_SERIES_META_DATA_START_DATE_COLUMN.toString();
		String end_date_column = DatabaseSchemaProperties.TIME_SERIES_META_DATA_END_DATE_COLUMN.toString();
		String period_column = DatabaseSchemaProperties.TIME_SERIES_META_DATA_PERIOD_COLUMN.toString();
		String min_quality_column = DatabaseSchemaProperties.TIME_SERIES_META_DATA_MIN_QUALITY_COLUMN.toString();
		String max_quality_column = DatabaseSchemaProperties.TIME_SERIES_META_DATA_MAX_QUALITY_COLUMN.toString();
		
		// SELECT time_series_id, start_date, end_date, period, min_quality, max_quality FROM time_series WHERE time_series_id = ?;
		String query = "SELECT %s, %s, %s, %s, %s, %s, %s FROM %s WHERE %s = ?;";
		query = String.format(query, id_column, measured_variable_id_column, start_date_column, end_date_column, period_column, min_quality_column, max_quality_column, table, id_column);

		try (PreparedStatement statement = connection.prepareStatement(query))
		{
			statement.setInt(1, time_series_id);
			
			try (ResultSet query_result = statement.executeQuery())
			{
				if (query_result.next())
				{
					int id = query_result.getInt(id_column);
					int measured_variable_id = query_result.getInt(measured_variable_id_column);
					OffsetDateTime start_date = null;
					OffsetDateTime end_date = null;
					if (query_result.getTimestamp(start_date_column, Calendar.getInstance(TimeZone.getTimeZone(DatabaseProperties.TIME_ZONE.toString()))) != null)
					{
						start_date = OffsetDateTime.ofInstant(query_result.getTimestamp(start_date_column, Calendar.getInstance(TimeZone.getTimeZone(DatabaseProperties.TIME_ZONE.toString()))).toInstant(), ZoneId.of(DatabaseProperties.ZONE_ID.toString())); 

					}
					if (query_result.getTimestamp(end_date_column, Calendar.getInstance(TimeZone.getTimeZone(DatabaseProperties.TIME_ZONE.toString()))) != null)
					{
						end_date = OffsetDateTime.ofInstant(query_result.getTimestamp(end_date_column, Calendar.getInstance(TimeZone.getTimeZone(DatabaseProperties.TIME_ZONE.toString()))).toInstant(), ZoneId.of(DatabaseProperties.ZONE_ID.toString())); 

					}
					double period = query_result.getDouble(period_column);
					int min_quality = query_result.getInt(min_quality_column);
					int max_quality = query_result.getInt(max_quality_column);
					result = new TimeSeries(id, measured_variable_id, period, start_date, end_date, min_quality, max_quality);
				}
			}
		}
		catch (SQLException exception)
		{
			exception.printStackTrace();
		}
		
		return result;
	}
	
	/**
	 * Retrieve the ID of a time series based on its properties.
	 * 
	 * @param time_series Time series to look up.
	 * @return ID of time series, or -1 on failure.
	 */
	@Override
	public int getTimeSeriesId(TimeSeries time_series)
	{
		if (time_series == null || connection == null)
		{
			return -1;
		}
		
		// SELECT time_series_id FROM time_series WHERE measured_variable_id = ? AND start_date = ? AND end_date = ? AND period = ? AND min_quality = ? AND max_quality = ?;
		String query = "SELECT %s FROM %s WHERE %s = ? AND %s = ? AND %s = ? AND %s = ? AND %s = ? AND %s = ?;";
		query = String.format(query, DatabaseSchemaProperties.TIME_SERIES_META_DATA_ID_COLUMN.toString(),
				DatabaseSchemaProperties.TIME_SERIES_META_DATA_TABLE.toString(),
				DatabaseSchemaProperties.TIME_SERIES_META_DATA_MEASURED_VARIABLE_ID.toString(),
				DatabaseSchemaProperties.TIME_SERIES_META_DATA_START_DATE_COLUMN.toString(),
				DatabaseSchemaProperties.TIME_SERIES_META_DATA_END_DATE_COLUMN.toString(),
				DatabaseSchemaProperties.TIME_SERIES_META_DATA_PERIOD_COLUMN.toString(),
				DatabaseSchemaProperties.TIME_SERIES_META_DATA_MIN_QUALITY_COLUMN.toString(),
				DatabaseSchemaProperties.TIME_SERIES_META_DATA_MAX_QUALITY_COLUMN.toString());

		try (PreparedStatement statement = connection.prepareStatement(query))
		{
			statement.setInt(1, time_series.getId());
			if (time_series.getStartDate() == null)
			{
				statement.setNull(2, Types.TIMESTAMP);
			}
			else
			{
				statement.setTimestamp(2, Timestamp.from(time_series.getStartDate().toInstant()));
			}
			if (time_series.getEndDate() == null)
			{
				statement.setNull(3, Types.TIMESTAMP);
			}
			else
			{
				statement.setTimestamp(3, Timestamp.from(time_series.getEndDate().toInstant()));
			}
			statement.setDouble(4, time_series.getPeriod());
			statement.setInt(5, time_series.getMinQuality());
			statement.setInt(6, time_series.getMaxQuality());
			
			try (ResultSet query_result = statement.executeQuery())
			{
				if (query_result.next())
				{
					return query_result.getInt(DatabaseSchemaProperties.TIME_SERIES_META_DATA_ID_COLUMN.toString());
				}
			}
		}
		catch (SQLException exception)
		{
			exception.printStackTrace();
		}
		
		return -1;
	}
	
	/**
	 * Retrieve the ID of a time series based on its associated measured variable name.
	 * 
	 * @param measured_variable_name Measured variable name linked to the given time series.
	 * @return ID of time series, or -1 on failure.
	 */
	@Override
	public int getTimeSeriesId(String measured_variable_name)
	{
		if (measured_variable_name == null || connection == null)
		{
			return -1;
		}
		
		String time_series_table = DatabaseSchemaProperties.TIME_SERIES_META_DATA_TABLE.toString();
		String time_series_id_column = DatabaseSchemaProperties.TIME_SERIES_META_DATA_ID_COLUMN.toString();
		String time_series_measured_variable_id_column = DatabaseSchemaProperties.TIME_SERIES_META_DATA_MEASURED_VARIABLE_ID.toString();
		String measured_variables_table = DatabaseSchemaProperties.MEASURED_VARIABLES_META_DATA_TABLE.toString();
		String measured_variable_id_column = DatabaseSchemaProperties.MEASURED_VARIABLES_META_DATA_ID_COLUMN.toString();
		String measured_variable_name_column = DatabaseSchemaProperties.MEASURED_VARIABLES_META_DATA_NAME_COLUMN.toString();
		
		// SELECT time_series.time_series_id FROM time_series JOIN measured_variables ON time_series.measured_variable_id = measured_variables.measured_variable_id WHERE measured_variables.name = ?;
		String query = "SELECT %s.%s FROM %s JOIN %s ON %s.%s = %s.%s WHERE %s.%s = ?;";
		query = String.format(query, time_series_table, time_series_id_column, time_series_table,
				measured_variables_table, time_series_table, time_series_measured_variable_id_column,
				measured_variables_table, measured_variable_id_column, measured_variables_table,
				measured_variable_name_column);

		try (PreparedStatement statement = connection.prepareStatement(query))
		{
			statement.setString(1, measured_variable_name);
			
			try (ResultSet query_result = statement.executeQuery())
			{
				if (query_result.next())
				{
					return query_result.getInt(DatabaseSchemaProperties.TIME_SERIES_META_DATA_ID_COLUMN.toString());
				}
			}
		}
		catch (SQLException exception)
		{
			exception.printStackTrace();
		}
		
		return -1;
	}
	
	/**
	 * Retrieves a list of all time series in the database.
	 * @return List of found time series.
	 */
	@Override
	public List<TimeSeries> getAllTimeSeries()
	{
		List<TimeSeries> time_series = new ArrayList<TimeSeries>();
		String table = DatabaseSchemaProperties.TIME_SERIES_META_DATA_TABLE.toString();
		String id_column = DatabaseSchemaProperties.TIME_SERIES_META_DATA_ID_COLUMN.toString();
		String measured_variable_id_column = DatabaseSchemaProperties.TIME_SERIES_META_DATA_MEASURED_VARIABLE_ID.toString();
		String start_date_column = DatabaseSchemaProperties.TIME_SERIES_META_DATA_START_DATE_COLUMN.toString();
		String end_date_column = DatabaseSchemaProperties.TIME_SERIES_META_DATA_END_DATE_COLUMN.toString();
		String period_column = DatabaseSchemaProperties.TIME_SERIES_META_DATA_PERIOD_COLUMN.toString();
		String min_quality_column = DatabaseSchemaProperties.TIME_SERIES_META_DATA_MIN_QUALITY_COLUMN.toString();
		String max_quality_column = DatabaseSchemaProperties.TIME_SERIES_META_DATA_MAX_QUALITY_COLUMN.toString();
		
		// SELECT time_series_id, start_date, end_date, period, min_quality, max_quality FROM time_series;
		String query = "SELECT %s, %s, %s, %s, %s, %s, %s FROM %s;";
		query = String.format(query, id_column, measured_variable_id_column, start_date_column, end_date_column, period_column, min_quality_column, max_quality_column, table);

		try (PreparedStatement statement = connection.prepareStatement(query); 
				ResultSet result_query = statement.executeQuery())
		{
			int id = 0;
			int measured_variable_id = 0;
			OffsetDateTime start_date = null;
			OffsetDateTime end_date = null;
			double period = 0.0;
			int min_quality = 0;
			int max_quality = 0;
			
			while (result_query.next())
			{				
				id = result_query.getInt(id_column);
				measured_variable_id = result_query.getInt(measured_variable_id_column);
				start_date = null;
				end_date = null;
				if (result_query.getTimestamp(start_date_column, Calendar.getInstance(TimeZone.getTimeZone(DatabaseProperties.TIME_ZONE.toString()))) != null)
				{
					start_date = OffsetDateTime.ofInstant(result_query.getTimestamp(start_date_column, Calendar.getInstance(TimeZone.getTimeZone(DatabaseProperties.TIME_ZONE.toString()))).toInstant(), ZoneId.of(DatabaseProperties.ZONE_ID.toString())); 
				}
				if (result_query.getTimestamp(end_date_column, Calendar.getInstance(TimeZone.getTimeZone(DatabaseProperties.TIME_ZONE.toString()))) != null)
				{
					end_date = OffsetDateTime.ofInstant(result_query.getTimestamp(end_date_column, Calendar.getInstance(TimeZone.getTimeZone(DatabaseProperties.TIME_ZONE.toString()))).toInstant(), ZoneId.of(DatabaseProperties.ZONE_ID.toString())); 
				}
				period = result_query.getDouble(period_column);
				min_quality = result_query.getInt(min_quality_column);
				max_quality = result_query.getInt(max_quality_column);
				time_series.add(new TimeSeries(id, measured_variable_id, period, start_date, end_date, min_quality, max_quality));
			}
		}
		catch (SQLException exception)
		{
			exception.printStackTrace();
		}
		
		return time_series;
	}
    
	/**
	 * Add a list of observations (timestamp, value, quality) for a given time series.
	 * 
	 * @param time_series_id ID of the time series linked to the observations.
	 * @param rows List of observations.
	 * @return True if the observations were added successfully, false otherwise.
	 * @throws SQLException If a database error occurs.
	 */
	@Override
	public boolean addObservations(int time_series_id, List<RawObservationRecord> rows) throws SQLException
	{
		// INSERT INTO observations(time, value, quality, time_series_id) VALUES (?, ?, ?, ?) ON CONFLICT DO NOTHING;
		String query = "INSERT INTO %s(%s, %s, %s, %s) VALUES (?, ?, ?, ?) ON CONFLICT DO NOTHING;";
		query = String.format(query, DatabaseSchemaProperties.RAW_TIME_SERIES_DATA_TABLE.toString(),
				DatabaseSchemaProperties.RAW_TIME_SERIES_DATA_TIME_COLUMN.toString(),
				DatabaseSchemaProperties.RAW_TIME_SERIES_DATA_VALUE_COLUMN.toString(),
				DatabaseSchemaProperties.RAW_TIME_SERIES_DATA_QUALITY_COLUMN.toString(),
				DatabaseSchemaProperties.RAW_TIME_SERIES_DATA_TIME_SERIES_ID_COLUMN.toString());

		try (PreparedStatement statement = connection.prepareStatement(query))
		{
			for (RawObservationRecord row : rows)
			{
				if (row.getTimestamp() == null)
				{
					statement.setNull(1, Types.TIMESTAMP);
				}
				else
				{
					statement.setTimestamp(1, Timestamp.from(row.getTimestamp().toInstant()));
				}
				statement.setDouble(2, row.getValue());
				statement.setInt(3, row.getQuality());
				statement.setInt(4, time_series_id);
				statement.addBatch();
			}
			statement.executeBatch();
			
			return true;
		}
		catch (SQLException exception)
		{
			exception.printStackTrace();
			
			return false;
		}
	}
	
	/**
     * Delete observations for a given time series ID.
     * 
     * @param time_series_id ID of the time series.
     * @return True if the observations were dropped successfully, false otherwise.
     * @throws SQLException If a database error occurs.
     */
	@Override
	public boolean deleteObservations(int time_series_id) throws SQLException
	{
		String query = "DELETE FROM %s WHERE %s = ?;";
		query = String.format(query, DatabaseSchemaProperties.RAW_TIME_SERIES_DATA_TABLE.toString(), 
				DatabaseSchemaProperties.RAW_TIME_SERIES_DATA_TIME_SERIES_ID_COLUMN.toString());
		
		int rows = 0;
		try (PreparedStatement statement = connection.prepareStatement(query))
		{
			statement.setInt(1, time_series_id);
			rows = statement.executeUpdate();
		}
		
		if (rows < 1)
		{
			return false;
		}
		
		return true;
	}
	
	/**
     * Delete observations for a given time series ID in the specified time range and automatically update time series start date and end date.
     * 
     * @param time_series_id ID of the time series.
     * @param start_time Start time of the window.
     * @param end_time End time of the window.
     * @return True if the observations were dropped successfully, false otherwise.
     */
	@Override
	public boolean deleteObservations(int time_series_id, OffsetDateTime start_time, OffsetDateTime end_time)
	{	
		String query = "DELETE FROM %s WHERE %s = ? AND %s >= ? AND %s < ?;";
		query = String.format(query, DatabaseSchemaProperties.RAW_TIME_SERIES_DATA_TABLE.toString(), 
				DatabaseSchemaProperties.RAW_TIME_SERIES_DATA_TIME_SERIES_ID_COLUMN.toString(),
				DatabaseSchemaProperties.RAW_TIME_SERIES_DATA_TIME_COLUMN.toString(),
				DatabaseSchemaProperties.RAW_TIME_SERIES_DATA_TIME_COLUMN.toString());

		try
		{
			connection.setAutoCommit(false);
			
			try (PreparedStatement statement = connection.prepareStatement(query))
			{
				statement.setInt(1, time_series_id);
				if (start_time == null)
				{
					statement.setNull(2, Types.TIMESTAMP);
				}
				else
				{
					statement.setTimestamp(2, Timestamp.from(start_time.toInstant()));
				}
				if (end_time == null)
				{
					statement.setNull(2, Types.TIMESTAMP);
				}
				else
				{
					statement.setTimestamp(3, Timestamp.from(end_time.toInstant()));
				}
				statement.executeUpdate();
			}

			updateTimeSeriesRange(time_series_id);

			connection.commit();
			
			return true;
		}
		catch (SQLException exception)
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
