package fr.ubo.fast.data.manager.dao;

public interface DatabaseSchemaDataAccess
{
	/**
	 * Create table that stores measured variables.
	 * 
	 * @return True if the table was created successfully, false otherwise.
	 */
	public boolean createMeasuredVariablesTable();
	
	/**
	 * Create table that stores time series meta-data.
	 * 
	 * @return True if the table was created successfully, false otherwise.
	 */
	public boolean createTimeSeriesTable();
	
	/**
	 * Create table that stores time series observations.
	 * 
	 * @return True if the table was created successfully, false otherwise.
	 */
	public boolean createObservationsTable();

	/**
	 * Create table that stores configurations for managing and accessing pre-computed tables.
	 * 
	 * @return True if the table was created successfully, false otherwise.
	 */
	public boolean createConfigurationsTable();
	
	/**
	 * Create table that stores user data requests.
	 * 
	 * @return True if the table was created successfully, false otherwise.
	 */
	public boolean createUserProfilesTable();
	
	/**
	 * Drop table that stores measured variables.
	 * 
	 * @return True if the table was dropped successfully, false otherwise.
	 */
	public boolean dropMeasuredVariablesTable();
	
	/**
	 * Drop table that stores time series meta-data.
	 * 
	 * @return True if the table was dropped successfully, false otherwise.
	 */
	public boolean dropTimeSeriesTable();

	/**
	 * Drop table that stores time series observations.
	 * 
	 * @return True if the table was dropped successfully, false otherwise.
	 */
	public boolean dropObservationsTable();
	
	/**
	 * Drop table that stores configurations for managing and accessing pre-computed tables.
	 * 
	 * @return True if the table was dropped successfully, false otherwise.
	 */
	public boolean dropConfigurationsTable();
	
	/**
	 * Drop table that stores user data requests.
	 * 
	 * @return True if the table was dropped successfully, false otherwise.
	 */
	public boolean dropUserProfilesTable();
}
