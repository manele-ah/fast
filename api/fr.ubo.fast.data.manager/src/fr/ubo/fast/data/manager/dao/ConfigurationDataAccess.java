package fr.ubo.fast.data.manager.dao;

import fr.ubo.fast.common.model.AggregationType;
import fr.ubo.fast.common.model.Configuration;

public interface ConfigurationDataAccess
{
    /**
     * Add a configuration defined by its aggregation type, interval, table name and time series ID.
     * 
     * @param configuration Configuration to be added.
     * @return True if the configuration was created successfully, false otherwise.
     */
	public boolean addConfiguration(Configuration configuration);
	
	/**
     * Delete a configuration and automatically drop the associated aggregation tables if they exist.
     * 
     * @param time_series_id Time series ID of the configuration to delete.
     * @return True if the configuration was dropped successfully, false otherwise.
     */
	public boolean deleteConfiguration(int time_series_id);
	
	/**
     * Delete a configuration and automatically drop the associated aggregation tables if they exist.
     * 
     * @param time_series_id Time series ID of the configuration to delete.
     * @param aggregation_type Aggregation type of the configuration to delete.
     * @return True if the configuration was dropped successfully, false otherwise.
     */
	public boolean deleteConfiguration(int time_series_id, AggregationType aggregation_type);
}
