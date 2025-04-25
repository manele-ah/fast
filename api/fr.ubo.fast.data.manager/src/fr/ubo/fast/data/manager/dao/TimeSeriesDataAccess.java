package fr.ubo.fast.data.manager.dao;

import java.sql.SQLException;
import java.time.OffsetDateTime;
import java.util.List;

import fr.ubo.fast.common.model.RawObservationRecord;
import fr.ubo.fast.common.model.TimeSeries;

public interface TimeSeriesDataAccess
{
	/**
	 * Add a time series defined by its start date, end date, period, min quality and max quality.
	 * 
	 * @param time_series Time series to be added.
	 * @return ID of the newly created time series, or -1 on failure.
	 */
	public int addTimeSeries(TimeSeries time_series);
	
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
	public boolean updateTimeSeries(int time_series_id, OffsetDateTime start_date, OffsetDateTime end_date, int min_quality, int max_quality);
	
	/**
	 * Update the time range (start date, end date) of the given time series.
	 * 
	 * @param time_series_id Time series ID.
	 * @return True if the update succeeded, false otherwise.
	 */
	public boolean updateTimeSeriesRange(int time_series_id);
	
	/**
	 * Update the time range (start date, end date) of the given time series.
	 * 
	 * @param time_series_id Time series ID.
	 * @param start_date New start date of the time series.
	 * @param end_date New end date of the time series.
	 * @return True if the update succeeded, false otherwise.
	 */
	public boolean updateTimeSeriesRange(int time_series_id, OffsetDateTime start_date, OffsetDateTime end_date);
	
    /**
     * Delete a time series by its ID.
     * Automatically delete all associated observations.
     * Automatically delete aggregation tables and configuration rows.
     * 
     * @param time_series_id Time series ID.
     * @return True if the tables were deleted successfully, false otherwise. 
     */
	public boolean deleteTimeSeries(int time_series_id);
	
	/**
	 * Retrieve time series meta-data.
	 * 
	 * @param time_series_id ID of the time series to look up.
	 * @return Time series meta-data, or null on failure.
	 */
	public TimeSeries getTimeSeries(int time_series_id);
	
	/**
	 * Retrieve the ID of a time series based on its properties.
	 * 
	 * @param time_series Time series to look up.
	 * @return ID of time series, or -1 on failure.
	 */
	public int getTimeSeriesId(TimeSeries time_series);
	
	/**
	 * Retrieve the ID of a time series based on its associated measured variable name.
	 * 
	 * @param measured_variable_name Measured variable name linked to the given time series.
	 * @return ID of time series, or -1 on failure.
	 */
	public int getTimeSeriesId(String measured_variable_name);
	
	/**
	 * Retrieves a list of all time series in the database.
	 * 
	 * @return List of found time series.
	 */
	public List<TimeSeries> getAllTimeSeries();
	 
	/**
	 * Add a list of observations (timestamp, value, quality) for a given time series.
	 * 
	 * @param time_series_id ID of the time series linked to the observations.
	 * @param rows List of observations.
	 * @return True if the observations were added successfully, false otherwise.
	 * @throws SQLException If a database error occurs.
	 */
	public boolean addObservations(int time_series_id, List<RawObservationRecord> rows) throws SQLException;
	
	/**
     * Delete observations for a given time series ID.
     * 
     * @param time_series_id ID of the time series.
     * @return True if the observations were dropped successfully, false otherwise.
     * @throws SQLException If a database error occurs.
     */
	public boolean deleteObservations(int time_series_id) throws SQLException;
	
	/**
     * Delete observations for a given time series ID in the specified time range and automatically update time series start date and end date.
     * 
     * @param time_series_id ID of the time series.
     * @param start_time Start time of the window.
     * @param end_time End time of the window.
     * @return True if the observations were dropped successfully, false otherwise.
     */
	public boolean deleteObservations(int time_series_id, OffsetDateTime start_time, OffsetDateTime end_time);
}
