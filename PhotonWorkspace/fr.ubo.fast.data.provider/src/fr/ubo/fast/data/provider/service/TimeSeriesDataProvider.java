package fr.ubo.fast.data.provider.service;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.TreeMap;
import java.util.concurrent.ThreadLocalRandom;

import javax.servlet.ServletContext;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;

import com.google.common.base.Optional;

import fr.ubo.fast.common.model.TimeSeries;
import fr.ubo.fast.common.model.Database;
import fr.ubo.fast.common.clients.DatabaseClient;
import fr.ubo.fast.common.utility.DataStructureHelper;
import fr.ubo.fast.common.utility.DataProviderDatabaseHelper;
import fr.ubo.fast.common.constants.DataProviderProperties;
import fr.ubo.fast.common.constants.DeploymentProperties;

@Path("/" + DataProviderProperties.Constants.PATH_ROOT)
public class TimeSeriesDataProvider
{
	private Database database;
	
	private static final String DATABASE_PROPERTIES_FILE = "WEB-INF/conf/database.properties";
	
	public TimeSeriesDataProvider(@Context ServletContext context)
	{
		try
		{
			InputStream input = context.getResourceAsStream(DATABASE_PROPERTIES_FILE);
			database = new Database(input);
			input.close();
		}
		catch (IOException exception)
		{
			exception.printStackTrace();
		}
	}
	
	@GET
	@Path("/test")
	public String test()
	{
		return "Hello";
	}
	
	@GET
	@Path("/" + DataProviderProperties.Constants.PATH_PING)
	@Produces({"application/json"})
	public String ping(@QueryParam(DataProviderProperties.Constants.PARAMETER_DATA_POINTS_NUMBER) int data_points_number)
	{
		String result = "";
		TreeMap<OffsetDateTime, Double[]> observations = new TreeMap<OffsetDateTime, Double[]>();
		OffsetDateTime start = OffsetDateTime.now();

		// long local_start_time = System.nanoTime();
		for (int i = 0; i < data_points_number; i++)
		{
			double random_1 = ThreadLocalRandom.current().nextDouble(-20.0, 40.0);
			double random_2 = ThreadLocalRandom.current().nextDouble(0.0, 40.0);
			observations.put(start.plusMinutes(i), new Double[] {random_1, random_1 + random_2});
		}
		// long local_end_time = System.nanoTime();
				
		// long local_start_time = System.nanoTime();
		result = DataStructureHelper.convertMapToJsonString(observations);
		// long local_end_time = System.nanoTime();
		// System.out.println("Conversion:" + ((local_end_time - local_start_time) / 1000000) + " ms");

		return result;
	}
	
	@GET
	@Path("/" + DataProviderProperties.Constants.PATH_TIME_SERIES_DATA + "/{" + DataProviderProperties.Constants.PARAMETER_TIME_SERIES_ID + "}")
	@Produces({"application/json"})
	public String retrieveTimeSeriesData(@PathParam(DataProviderProperties.Constants.PARAMETER_TIME_SERIES_ID) int time_series_id, 
										 @QueryParam(DataProviderProperties.Constants.PARAMETER_START_TIME) String start_time, 
										 @QueryParam(DataProviderProperties.Constants.PARAMETER_END_TIME) String end_time, 
										 @QueryParam(DataProviderProperties.Constants.PARAMETER_INTERVAL) double interval, 
										 @QueryParam(DataProviderProperties.Constants.PARAMETER_TABLE) String table, 
										 @QueryParam(DataProviderProperties.Constants.PARAMETER_RAW) boolean raw)
	{
		String result = "";
		String select_query = "";
		String time_column = "";
		String[] value_columns = {};
		boolean valid_parameters = true;
		
		// To do : Check if table exists + Validation
		Optional<OffsetDateTime> optional_start_time = checkDateFormat(start_time);
		if (optional_start_time.isPresent())
		{
			Optional<OffsetDateTime> optional_end_time = checkDateFormat(end_time);
			if (optional_end_time.isPresent())
			{
				time_column = getTableTimeColumn(table);
				value_columns = getTableValueColumns(table);
				
				if (raw)
				{
					if (table.equals(DeploymentProperties.DATABASE_RAW_TIME_SERIES_DATA_TABLE.toString()))
					{
						select_query = "SELECT %s, %s FROM %s WHERE %s >= \'%s\' AND %s <= \'%s\' AND %s = %s;";
						select_query = String.format(select_query, time_column, String.join(", ", value_columns), table, time_column, start_time, time_column, end_time, DeploymentProperties.DATABASE_TIME_SERIES_META_DATA_ID_COLUMN.toString(), String.valueOf(time_series_id));
					}
					else
					{
						select_query = "SELECT %s, %s FROM %s WHERE %s >= \'%s\' AND %s <= \'%s\';";
						select_query = String.format(select_query, time_column, String.join(", ", value_columns), table, time_column, start_time, time_column, end_time);
					}
				}
				else
				{
					if (table.equals(DeploymentProperties.DATABASE_RAW_TIME_SERIES_DATA_TABLE.toString()))
					{
						select_query = "SELECT time_bucket(\'%s Seconds\', %s) AS time_interval, MIN(%s) AS min_aggregate, MAX(%s) AS max_aggregate FROM %s WHERE %s >= \'%s\' AND %s < \'%s\' AND %s = %s GROUP BY time_interval ORDER BY time_interval ASC;";
						select_query = String.format(select_query, String.valueOf(interval), time_column, value_columns[0], value_columns[0], table, time_column, start_time, time_column, end_time, DeploymentProperties.DATABASE_TIME_SERIES_META_DATA_ID_COLUMN.toString(), String.valueOf(time_series_id));
					}
					else
					{
						select_query = "SELECT time_bucket(\'%s Seconds\', %s) AS time_interval, MIN(%s) AS min_aggregate, MAX(%s) AS max_aggregate FROM %s WHERE %s >= \'%s\' AND %s < \'%s\' GROUP BY time_interval ORDER BY time_interval ASC;";
						select_query = String.format(select_query, String.valueOf(interval), time_column, value_columns[0], value_columns[1], table, time_column, start_time, time_column, end_time);
					}
				}
				// System.out.println(select_query);
			}
			else
			{
				// End Time : Error in format !
				valid_parameters = false;
			}
		}
		else
		{
			// Start Time : Error in format !
			valid_parameters = false;
		}

		if (valid_parameters)
		{
			DatabaseClient db = new DatabaseClient(database.getManagementSystem(), database.getName(),
												   database.getHostname(), database.getPort(), 
												   database.getUsername(), database.getPassword());

			if (db.connect())
			{
				Connection connection = db.getConnection();
				TreeMap<OffsetDateTime, Double[]> observations = null;

				// long local_start_time = System.nanoTime();
				if (raw)
				{
					observations = DataProviderDatabaseHelper.getTimeSeriesObservations(connection, database.getFetchSize(), select_query, time_column, value_columns);
				}
				else
				{
					observations = DataProviderDatabaseHelper.getTimeSeriesObservations(connection, database.getFetchSize(), select_query, "time_interval", "min_aggregate", "max_aggregate");
				}
				// long local_end_time = System.nanoTime();
				// System.out.println("DB " + start_time + " " + end_time + ":" + ((local_end_time - local_start_time) / 1000000));
				
				db.disconnect();
				
				// long local_start_time = System.nanoTime();
				result = DataStructureHelper.convertMapToJsonString(observations);
				// long local_end_time = System.nanoTime();
				// System.out.println("Conversion:" + ((local_end_time - local_start_time) / 1000000) + " ms");
			}
		}

		return result;
	}
	
	@GET
	@Path("/" +  DataProviderProperties.Constants.PATH_TIME_SERIES_META_DATA + "/{" + DataProviderProperties.Constants.PARAMETER_TIME_SERIES_ID + "}")
	@Produces({"application/json"})
	public String retrieveTimeSeriesMetaData(@PathParam(DataProviderProperties.Constants.PARAMETER_TIME_SERIES_ID) int time_series_id)
	{
		String result = "";
		TimeSeries time_series_data = null;
		String select_query = "SELECT %s, %s, %s, %s FROM %s WHERE %s = %s;";
		select_query = String.format(select_query, DeploymentProperties.DATABASE_TIME_SERIES_META_DATA_ID_COLUMN.toString(), DeploymentProperties.DATABASE_TIME_SERIES_META_DATA_PERIOD_COLUMN.toString(), DeploymentProperties.DATABASE_TIME_SERIES_META_DATA_START_DATE_COLUMN.toString(), DeploymentProperties.DATABASE_TIME_SERIES_META_DATA_END_DATE_COLUMN.toString(), DeploymentProperties.DATABASE_TIME_SERIES_META_DATA_TABLE.toString(), DeploymentProperties.DATABASE_TIME_SERIES_META_DATA_ID_COLUMN.toString(), time_series_id);

		DatabaseClient db = new DatabaseClient(database.getManagementSystem(), database.getName(),
											   database.getHostname(), database.getPort(), 
											   database.getUsername(), database.getPassword());

		if (db.connect())
		{
			Connection connection = db.getConnection();
			
			// long local_start_time = System.nanoTime();
			time_series_data = DataProviderDatabaseHelper.getTimeSeriesMetaData(connection, database.getFetchSize(), select_query);
			// long local_end_time = System.nanoTime();
			// System.out.println("DB meta data: " + ((local_end_time - local_start_time) / 1000000));
			db.disconnect();
			
			result = DataStructureHelper.convertTimeSeriesDataToJsonString(time_series_data);
		}
				
		return result;
	}

	private Optional<OffsetDateTime> checkDateFormat(String date_input)
	{
		DateTimeFormatter date_time_formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm[:ss][xxx][xx][X][.SSSSxxx][.SSSSxx][.SSSSX]");

		try
		{
			OffsetDateTime parsed_date = OffsetDateTime.parse(date_input, date_time_formatter);
			
			return Optional.of(parsed_date);
		}
		catch (DateTimeParseException exception)
		{
			exception.printStackTrace();
			
			return Optional.absent();
		}
	}
	
	private String getTableTimeColumn(String table)
	{		
		return DeploymentProperties.DATABASE_TIME_SERIES_DATA_TIME_COLUMN.toString();
	}
	
	private String[] getTableValueColumns(String table)
	{		
		if (table.equals(DeploymentProperties.DATABASE_RAW_TIME_SERIES_DATA_TABLE.toString()))
		{
			String[] columns = {DeploymentProperties.DATABASE_TIME_SERIES_DATA_VALUE_COLUMN.toString()};
			
			return columns;
		}
		else
		{
			String[] columns = {DeploymentProperties.DATABASE_TIME_SERIES_DATA_MIN_COLUMN.toString(), DeploymentProperties.DATABASE_TIME_SERIES_DATA_MAX_COLUMN.toString()};
			
			return columns;
		}
	}
}