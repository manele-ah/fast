package fr.ubo.fast.data.manager.dao;

import java.util.List;

import fr.ubo.fast.common.model.MeasuredVariable;

public interface MeasuredVariableDataAccess
{
	/**
	 * Add a measured variable defined by its name and unit.
	 * 
	 * @param measured_variable Measured variable to be added.
	 * @return ID of the newly created measured variable, or -1 on failure.
	 */
	public int addMeasuredVariable(MeasuredVariable measured_variable);
	
    /**
     * Delete a measured variable by its ID.

     * @param measured_variable_id Measured variable ID.
     * @return True if deleted successfully, false otherwise. 
     */
	public boolean deleteMeasuredVariable(int measured_variable_id);
	
	/**
	 * Retrieve measured variable meta-data.
	 * 
	 * @param measured_variable_id Measured variable ID to look up.
	 * @return Measured variable meta-data, or null on failure.
	 */
	public MeasuredVariable getMeasuredVariable(int measured_variable_id);
	
	/**
	 * Retrieve the ID of a measured variable based on its name and unit.
	 * 
	 * @param measured_variable Measured variable to look up.
	 * @return ID of the measured variable, or -1 on failure.
	 */
	public int getMeasuredVariableId(MeasuredVariable measured_variable);
	
	/**
	 * Retrieve the ID of a measured variable based on its name.
	 * 
	 * @param measured_variable_name Name of the measured variable to look up.
	 * @return ID of the measured variable, or -1 on failure.
	 */
	public int getMeasuredVariableId(String measured_variable_name);
	
	/**
	 * Retrieves a list of all measured variables in the database.
	 * 
	 * @return List of found measured variables.
	 */
	public List<MeasuredVariable> getAllMeasuredVariables();
}
