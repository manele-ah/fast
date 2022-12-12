package fr.ubo.fast.common.utility;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.TimeZone;
import java.util.TreeMap;

import fr.ubo.fast.common.model.TimeSeries;

public class DataProviderDatabaseHelper
{
	public static TreeMap<OffsetDateTime, Double[]> getTimeSeriesObservations(Connection connection, int database_fetch_size, String query, String time_column_name, String... values_column_names)
	{
		TreeMap<OffsetDateTime, Double[]> observations = new TreeMap<OffsetDateTime, Double[]>();
		Double[] values = new Double[values_column_names.length];
		PreparedStatement statement = null;
		ResultSet query_result = null;
		
		// System.out.println(query);
		
		if (values_column_names.length > 0)
		{
			if (connection != null)
			{
				try
				{
					connection.setAutoCommit(false);
					statement = connection.prepareStatement(query);
					// Turn the cursor on
					statement.setFetchSize(database_fetch_size);
					query_result = statement.executeQuery();
					
					while (query_result.next())
					{
						for (int i = 0; i < values_column_names.length; i++)
						{
							values[i] = query_result.getDouble(values_column_names[i]);
						}
						// observations.put(query_result.getObject(time_column_name, OffsetDateTime.class), query_result.getDouble(value_column_name));
						Timestamp timestamp =  query_result.getTimestamp(time_column_name, Calendar.getInstance(TimeZone.getTimeZone("UTC")));
						observations.put(OffsetDateTime.ofInstant(timestamp.toInstant(), ZoneId.of("Europe/Brussels")), values.clone());
					}

					query_result.close();
					// Turn the cursor off
					statement.setFetchSize(0);
					// query_result = statement.executeQuery();
					// while (query_result.next())
					// {
					// }
					// query_result.close();
					statement.close();
				}
				catch (SQLException exception)
				{
					exception.printStackTrace();
				}
			}
		}
		
		return observations;
	}
	
	public static TimeSeries getTimeSeriesMetaData(Connection connection, int database_fetch_size, String query)
	{
		TimeSeries time_series_data = null;
		PreparedStatement statement = null;
		ResultSet query_result = null;
		
		if (connection != null)
		{
			try
			{
				connection.setAutoCommit(false);
				statement = connection.prepareStatement(query);
				// Turn the cursor on
				statement.setFetchSize(database_fetch_size);
				query_result = statement.executeQuery();
				
				while (query_result.next())
				{
					// time_series_data = new TimeSeriesData(query_result.getInt("time_series_id"), query_result.getDouble("period"), query_result.getObject("start_date", OffsetDateTime.class), query_result.getObject("end_date", OffsetDateTime.class));
					Timestamp start_date =  query_result.getTimestamp("start_date", Calendar.getInstance(TimeZone.getTimeZone("UTC")));
					Timestamp end_date =  query_result.getTimestamp("end_date", Calendar.getInstance(TimeZone.getTimeZone("UTC")));
					time_series_data = new TimeSeries(query_result.getInt("time_series_id"), query_result.getDouble("period"), OffsetDateTime.ofInstant(start_date.toInstant(), ZoneId.of("Europe/Brussels")), OffsetDateTime.ofInstant(end_date.toInstant(), ZoneId.of("Europe/Brussels")));
				}

				query_result.close();
				// Turn the cursor off
				statement.setFetchSize(0);
				// query_result = statement.executeQuery();
				// while (query_result.next())
				// {
				// }
				// query_result.close();
				statement.close();
			}
			catch (SQLException exception)
			{
				exception.printStackTrace();
			}
		}

		return time_series_data;
	}
}
