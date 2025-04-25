package fr.ubo.fast.common.utility;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseHelper
{
	public static boolean executeSqlCommand(Connection connection, String query)
	{
		if (connection == null)
		{
			return false;
		}
		
		try (Statement statement = connection.createStatement())
		{
			statement.execute(query);
			
			return true;
		}
		catch (SQLException exception)
		{
			exception.printStackTrace();
			
			return false;
		}
	}
	
	public static boolean dropTable(Connection connection, String table_name)
	{
		String query = String.format("DROP TABLE IF EXISTS %s;", table_name);
		
		return executeSqlCommand(connection, query);
	}
}
