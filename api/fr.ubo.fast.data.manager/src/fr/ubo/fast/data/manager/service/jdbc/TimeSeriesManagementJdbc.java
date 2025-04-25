package fr.ubo.fast.data.manager.service.jdbc;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.time.OffsetDateTime;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Singleton;

import fr.ubo.fast.common.constant.DatabaseSchemaProperties;
import fr.ubo.fast.common.model.Database;
import fr.ubo.fast.common.model.MeasuredVariable;
import fr.ubo.fast.common.model.RawObservationRecord;
import fr.ubo.fast.common.model.TimeSeries;
import fr.ubo.fast.common.utility.DataStructureHelper;
import fr.ubo.fast.data.manager.dao.jdbc.MeasuredVariableDataAccessJdbc;
import fr.ubo.fast.data.manager.dao.jdbc.TimeSeriesDataAccessJdbc;
import fr.ubo.fast.data.manager.service.TimeSeriesManagement;

@Singleton
public class TimeSeriesManagementJdbc implements TimeSeriesManagement
{
	private Database database;
	private Connection connection;
	private MeasuredVariableDataAccessJdbc measured_variable_data_access;
	private TimeSeriesDataAccessJdbc time_series_data_access;
	
	@Inject
	public TimeSeriesManagementJdbc(Database database, Connection connection)
	{
		this.database = database;
		this.connection = connection;
		this.measured_variable_data_access = new MeasuredVariableDataAccessJdbc(this.connection);
		this.time_series_data_access = new TimeSeriesDataAccessJdbc(this.connection);
	}
	
	/**
	 * Add time series meta-data.
	 * This method creates a measured variable (e.g., temperature) defined by its name and unit and configures a time series period and quality thresholds.
	 * 
	 * @param name Name of the measured variable.
	 * @param unit Unit of measurement.
	 * @param period Sampling period of the time series.
	 * @param min_quality Min quality of the time series.
	 * @param max_quality Max quality of the time series.
	 * @return 0 if creation fails, 1 if it is successful, or 2 if the measured variable or time series already exists.
	 */
	@Override
	public int addMeasuredVariable(String name, String unit, double period, int min_quality, int max_quality)
	{
		int measured_variable_id = measured_variable_data_access.getMeasuredVariableId(name);
		if (measured_variable_id > 0)
		{
			return 2;
		}
		
		measured_variable_id = measured_variable_data_access.addMeasuredVariable(new MeasuredVariable(name, unit));
		if (measured_variable_id <= 0)
		{
			return 0;
		}

		int time_series_id = time_series_data_access.getTimeSeriesId(name);
		if (time_series_id > 0)
		{
			return 2;
		}

		time_series_id = time_series_data_access.addTimeSeries(new TimeSeries(measured_variable_id, period, null, null, min_quality, max_quality));
		if (time_series_id <= 0)
		{
			return 0;
		}

		return 1;
	}
	
	
	/**
	 * Import observations from a CSV file that contains exactly one time series with the following columns: timestamp, value, quality (in that order). 
	 * 
	 * @param name Name of the measured variable linked to the time series.
	 * @param csv_file CSV file with columns: timestamp, value, quality.
	 * @return True if the observations are successfully loaded and the meta-data updated, false otherwise.
	 */
	@Override
	public boolean addObservations(String name, File csv_file)
	{
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
		
		TimeSeries time_series = time_series_data_access.getTimeSeries(time_series_id);
		if (time_series == null)
		{
			return false;
		}

		List<RawObservationRecord> records;
		try
		{
			records = DataStructureHelper.parseSingleTimeSeriesCsv(csv_file);
			if (records.isEmpty())
			{
				return false;
			}
		}
		catch (Exception exception)
		{
			exception.printStackTrace();
			
			return false;
		}

		OffsetDateTime updated_start_time = null;
		OffsetDateTime updated_end_time = null;
		OffsetDateTime time = null;
		int updated_min_quality = time_series.getMinQuality();
		int updated_max_quality = time_series.getMaxQuality();
		int quality = 0;
		
		for (RawObservationRecord record : records)
		{
			time = record.getTimestamp();
			if (updated_start_time == null || time.isBefore(updated_start_time))
			{
				updated_start_time = time;
			}
			if (updated_end_time == null || time.isAfter(updated_end_time))
			{
				updated_end_time = time;
			}
			
			quality = record.getQuality();
			if (quality < updated_min_quality)
			{
				updated_min_quality = quality;
			}
			if (quality > updated_max_quality)
			{
				updated_max_quality = quality;
			}
		}

		File temporary_csv;
		try
		{
			temporary_csv = DataStructureHelper.addColumnToCsv(csv_file, time_series_id);
		}
		catch (Exception exception)
		{
			exception.printStackTrace();
			
			return false;
		}

		String copy_command = String.format("timescaledb-parallel-copy --connection \"host=%s port=%d user=%s password=%s sslmode=disable\" --db-name %s --table %s --file %s --columns \"%s, %s, %s, %s\" --skip-header --reporting-period 30s --workers 4",
				database.getHostname(), database.getPort(), database.getUsername(), database.getPassword(),
				database.getName(), DatabaseSchemaProperties.RAW_TIME_SERIES_DATA_TABLE.toString(),
				temporary_csv.getAbsolutePath(),
				DatabaseSchemaProperties.RAW_TIME_SERIES_DATA_TIME_COLUMN.toString(),
				DatabaseSchemaProperties.RAW_TIME_SERIES_DATA_VALUE_COLUMN.toString(),
				DatabaseSchemaProperties.RAW_TIME_SERIES_DATA_QUALITY_COLUMN.toString(),
				DatabaseSchemaProperties.RAW_TIME_SERIES_DATA_TIME_SERIES_ID_COLUMN.toString());
		System.out.println(copy_command);

		int exit_code;
		try
		{
			ProcessBuilder process_builder;
			if (System.getProperty("os.name").toLowerCase().contains("win"))
			{
				process_builder = new ProcessBuilder("cmd.exe", "/c", copy_command);
			}
			else
			{
				process_builder = new ProcessBuilder("bash", "-c", copy_command);
			}
			process_builder.redirectErrorStream(true);
			Process process = process_builder.start();
			
			try (BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream())))
			{
				String line;
				while ((line = reader.readLine()) != null)
				{
					System.out.println(line);
				}
			}
			
			exit_code = process.waitFor();
		}
		catch (Exception exception)
		{
			exception.printStackTrace();
			
			return false;
		}
		
		if (exit_code != 0)
		{
			return false;
		}

		boolean updated = time_series_data_access.updateTimeSeries(time_series_id, updated_start_time, updated_end_time, updated_min_quality, updated_max_quality);
		
		return updated;
	}

    /**
     * Delete time series meta-data along with its associated measured variable, and all related observations, aggregation tables and configurations.
     * 
     * @param name Name of the measured variable linked to the time series.
     * @return True if all related data were deleted successfully, false otherwise. 
     */
	@Override
	public boolean deleteTimeSeries(String name)
	{
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
		
		boolean time_series_deleted = time_series_data_access.deleteTimeSeries(time_series_id);
		boolean measured_variable_deleted = measured_variable_data_access.deleteMeasuredVariable(measured_variable_id);

		return time_series_deleted && measured_variable_deleted;
	}
	
	/**
     * Delete observations for a given time series in the specified time range and automatically update time series start date and end date.
     * 
     * @param name Name of the measured variable linked to the time series.
     * @param start_time Start time of the window.
     * @param end_time End time of the window.
     * @return True if the observations were dropped successfully, false otherwise.
     */
	@Override
	public boolean deleteObservations(String name, OffsetDateTime start_time, OffsetDateTime end_time)
	{
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
		
		boolean deleted = time_series_data_access.deleteObservations(time_series_id, start_time, end_time);
		
		return deleted;
	}
	
	/**
	 * Retrieve measured variable meta-data.
	 * 
	 * @param name Measured variable name to look up.
	 * @return Measured variable meta-data, or null on failure.
	 */
	public MeasuredVariable getMeasuredVariable(String name)
	{
		int measured_variable_id = measured_variable_data_access.getMeasuredVariableId(name);
		if (measured_variable_id <= 0)
		{
			return null;
		}
		
		return measured_variable_data_access.getMeasuredVariable(measured_variable_id);
	}
	
	/**
	 * Retrieves a list of all measured variables in the database.
	 * 
	 * @return List of found measured variables.
	 */
	public List<MeasuredVariable> getAllMeasuredVariables()
	{
		return measured_variable_data_access.getAllMeasuredVariables();
	}
	
	/**
	 * Retrieve time series meta-data.
	 * 
	 * @param name Measured variable name linked to the given time series.
	 * @return Time series meta-data, or null on failure.
	 */
	public TimeSeries getTimeSeries(String name)
	{
		int time_series_id = time_series_data_access.getTimeSeriesId(name);
		if (time_series_id <= 0)
		{
			return null;
		}
		
		return time_series_data_access.getTimeSeries(time_series_id);
	}
	
	/**
	 * Retrieves a list of all time series in the database.
	 * 
	 * @return List of found time series.
	 */
	public List<TimeSeries> getAllTimeSeries()
	{
		return time_series_data_access.getAllTimeSeries();
	}

}
