package fr.ubo.fast.data.manager.dao.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import fr.ubo.fast.common.constant.DatabaseSchemaProperties;
import fr.ubo.fast.common.model.MeasuredVariable;
import fr.ubo.fast.data.manager.dao.MeasuredVariableDataAccess;

public class MeasuredVariableDataAccessJdbc implements MeasuredVariableDataAccess
{
	private Connection connection;
	
	public MeasuredVariableDataAccessJdbc(Connection connection)
	{
		this.connection = connection;
	}
	
	/**
	 * Add a measured variable defined by its name and unit.
	 * 
	 * @param measured_variable Measured variable to be added.
	 * @return ID of the newly created measured variable, or -1 on failure.
	 */
	@Override
	public int addMeasuredVariable(MeasuredVariable measured_variable)
	{
		if (measured_variable == null || connection == null)
		{
			return -1;
		}
		
		// INSERT INTO measured_variables(name, unit) VALUES(?, ?) RETURNING measured_variable_id;
		String query = "INSERT INTO %s(%s, %s) VALUES(?,?) RETURNING %s;";
		query = String.format(query, DatabaseSchemaProperties.MEASURED_VARIABLES_META_DATA_TABLE.toString(),
				DatabaseSchemaProperties.MEASURED_VARIABLES_META_DATA_NAME_COLUMN.toString(),
				DatabaseSchemaProperties.MEASURED_VARIABLES_META_DATA_UNIT_COLUMN.toString(),
				DatabaseSchemaProperties.MEASURED_VARIABLES_META_DATA_ID_COLUMN.toString());
		
		try (PreparedStatement statement = connection.prepareStatement(query))
		{
			statement.setString(1, measured_variable.getName());
			statement.setString(2, measured_variable.getUnit());
			
			try (ResultSet query_result = statement.executeQuery())
			{
				if (query_result.next())
				{
					return query_result.getInt(DatabaseSchemaProperties.MEASURED_VARIABLES_META_DATA_ID_COLUMN.toString());
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
     * Delete a measured variable by its ID.

     * @param measured_variable_id Measured variable ID.
     * @return True if deleted successfully, false otherwise. 
     */
	@Override
	public boolean deleteMeasuredVariable(int measured_variable_id)
	{
		String query = "DELETE FROM %s WHERE %s = ?;";
		query = String.format(query, DatabaseSchemaProperties.MEASURED_VARIABLES_META_DATA_TABLE.toString(),
				DatabaseSchemaProperties.MEASURED_VARIABLES_META_DATA_ID_COLUMN.toString());
		
		int rows = 0;
		try (PreparedStatement statement = connection.prepareStatement(query))
		{
			statement.setInt(1, measured_variable_id);
			rows = statement.executeUpdate();
		}
		catch (SQLException exception)
		{
			exception.printStackTrace();
			
			return false;
		}
				
		return rows > 0;
	}
	
	/**
	 * Retrieve measured variable meta-data.
	 * 
	 * @param measured_variable_id Measured variable ID to look up.
	 * @return Measured variable meta-data, or null on failure.
	 */
	public MeasuredVariable getMeasuredVariable(int measured_variable_id)
	{
		if (measured_variable_id <= 0 || connection == null)
		{
			return null;
		}
		
		MeasuredVariable result = null;
		
		String table = DatabaseSchemaProperties.MEASURED_VARIABLES_META_DATA_TABLE.toString();
		String id_column = DatabaseSchemaProperties.MEASURED_VARIABLES_META_DATA_ID_COLUMN.toString();
		String name_column = DatabaseSchemaProperties.MEASURED_VARIABLES_META_DATA_NAME_COLUMN.toString();
		String unit_column = DatabaseSchemaProperties.MEASURED_VARIABLES_META_DATA_UNIT_COLUMN.toString();

		// SELECT measured_variable_id, name, unit FROM measured_variables WHERE measured_variable_id = ?;
		String query = "SELECT %s, %s, %s FROM %s WHERE %s = ?;";
		query = String.format(query, id_column, name_column, unit_column, table, id_column);

		try (PreparedStatement statement = connection.prepareStatement(query))
		{
			statement.setInt(1, measured_variable_id);
			
			try (ResultSet query_result = statement.executeQuery())
			{
				if (query_result.next())
				{
					int id = query_result.getInt(id_column);
					String name = query_result.getString(name_column);
					String unit = query_result.getString(unit_column);
					result = new MeasuredVariable(id, name, unit);
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
	 * Retrieve the ID of a measured variable based on its name and unit.
	 * 
	 * @param measured_variable Measured variable to look up.
	 * @return ID of the measured variable, or -1 on failure.
	 */
	@Override
	public int getMeasuredVariableId(MeasuredVariable measured_variable)
	{
		if (measured_variable == null || connection == null)
		{
			return -1;
		}
		
		// SELECT measured_variable_id FROM measured_variables WHERE name = ? AND unit = ?;
		String query = "SELECT %s FROM %s WHERE %s = ? AND %s = ?;";
		query = String.format(query, DatabaseSchemaProperties.MEASURED_VARIABLES_META_DATA_ID_COLUMN.toString(),
				DatabaseSchemaProperties.MEASURED_VARIABLES_META_DATA_TABLE.toString(),
				DatabaseSchemaProperties.MEASURED_VARIABLES_META_DATA_NAME_COLUMN.toString(),
				DatabaseSchemaProperties.MEASURED_VARIABLES_META_DATA_UNIT_COLUMN.toString());
		
		try (PreparedStatement statement = connection.prepareStatement(query))
		{
			statement.setString(1, measured_variable.getName());
			statement.setString(2, measured_variable.getUnit());
			
			try (ResultSet query_result = statement.executeQuery())
			{
				if (query_result.next())
				{
					return query_result.getInt(DatabaseSchemaProperties.MEASURED_VARIABLES_META_DATA_ID_COLUMN.toString());
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
	 * Retrieve the ID of a measured variable based on its name.
	 * 
	 * @param measured_variable_name Name of the measured variable to look up.
	 * @return ID of the measured variable, or -1 on failure.
	 */
	@Override
	public int getMeasuredVariableId(String name)
	{
		if (name == null || connection == null)
		{
			return -1;
		}
		
		// SELECT measured_variable_id FROM measured_variables WHERE name = ?;
		String query = "SELECT %s FROM %s WHERE %s = ?;";
		query = String.format(query, DatabaseSchemaProperties.MEASURED_VARIABLES_META_DATA_ID_COLUMN.toString(),
				DatabaseSchemaProperties.MEASURED_VARIABLES_META_DATA_TABLE.toString(),
				DatabaseSchemaProperties.MEASURED_VARIABLES_META_DATA_NAME_COLUMN.toString());
		
		try (PreparedStatement statement = connection.prepareStatement(query))
		{
			statement.setString(1, name);
			
			try (ResultSet query_result = statement.executeQuery())
			{
				if (query_result.next())
				{
					return query_result.getInt(DatabaseSchemaProperties.MEASURED_VARIABLES_META_DATA_ID_COLUMN.toString());
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
	 * Retrieves a list of all measured variables in the database.
	 * 
	 * @return List of found measured variables.
	 */
	@Override
	public List<MeasuredVariable> getAllMeasuredVariables()
	{
		List<MeasuredVariable> measured_variables = new ArrayList<MeasuredVariable>();
		String id_column = DatabaseSchemaProperties.MEASURED_VARIABLES_META_DATA_ID_COLUMN.toString();
		String name_column = DatabaseSchemaProperties.MEASURED_VARIABLES_META_DATA_NAME_COLUMN.toString();
		String unit_column = DatabaseSchemaProperties.MEASURED_VARIABLES_META_DATA_UNIT_COLUMN.toString();
		
		// SELECT measured_variable_id, name, unit FROM measured_variables;
		String query = "SELECT %s, %s, %s FROM %s;";
		query = String.format(query, id_column, name_column, unit_column,
				DatabaseSchemaProperties.MEASURED_VARIABLES_META_DATA_TABLE.toString());

		try (PreparedStatement statement = connection.prepareStatement(query); 
				ResultSet result_query = statement.executeQuery())
		{
			int id = 0;
			String name = "";
			String unit = "";
			
			while (result_query.next())
			{
				id = result_query.getInt(id_column);
				name = result_query.getString(name_column);
				unit = result_query.getString(unit_column);

				measured_variables.add(new MeasuredVariable(id, name, unit));
			}
		}
		catch (SQLException exception)
		{
			exception.printStackTrace();
		}
		
		return measured_variables;
	}
}
