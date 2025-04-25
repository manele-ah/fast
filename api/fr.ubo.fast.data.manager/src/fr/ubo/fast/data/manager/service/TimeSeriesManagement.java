package fr.ubo.fast.data.manager.service;

import java.io.File;
import java.time.OffsetDateTime;
import java.util.List;

import fr.ubo.fast.common.model.MeasuredVariable;
import fr.ubo.fast.common.model.TimeSeries;

public interface TimeSeriesManagement
{
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
	int addMeasuredVariable(String name, String unit, double period, int min_quality, int max_quality);

	/**
	 * Import observations from a CSV file that contains exactly one time series with the following columns: timestamp, value, quality (in that order). 
	 * 
	 * @param name Name of the measured variable linked to the time series.
	 * @param csv_file CSV file with columns: timestamp, value, quality.
	 * @return True if the observations are successfully loaded and the meta-data updated, false otherwise.
	 */
	boolean addObservations(String name, File csv_file);
	
    /**
     * Delete time series meta-data along with its associated measured variable, and all related observations, aggregation tables and configurations.
     * 
     * @param name Name of the measured variable linked to the time series.
     * @return True if all related data were deleted successfully, false otherwise. 
     */
	boolean deleteTimeSeries(String name);

	/**
     * Delete observations for a given time series in the specified time range and automatically update time series start date and end date.
     * 
     * @param name Name of the measured variable linked to the time series.
     * @param start_time Start time of the window.
     * @param end_time End time of the window.
     * @return True if the observations were dropped successfully, false otherwise.
     */
	boolean deleteObservations(String name, OffsetDateTime start_time, OffsetDateTime end_time);
	
	/**
	 * Retrieve measured variable meta-data.
	 * 
	 * @param name Measured variable name to look up.
	 * @return Measured variable meta-data, or null on failure.
	 */
	public MeasuredVariable getMeasuredVariable(String name);
	
	/**
	 * Retrieves a list of all measured variables in the database.
	 * 
	 * @return List of found measured variables.
	 */
	public List<MeasuredVariable> getAllMeasuredVariables();
	
	/**
	 * Retrieve time series meta-data.
	 * 
	 * @param name Measured variable name linked to the given time series.
	 * @return Time series meta-data, or null on failure.
	 */
	public TimeSeries getTimeSeries(String name);
	
	/**
	 * Retrieves a list of all time series in the database.
	 * 
	 * @return List of found time series.
	 */
	public List<TimeSeries> getAllTimeSeries();
}
