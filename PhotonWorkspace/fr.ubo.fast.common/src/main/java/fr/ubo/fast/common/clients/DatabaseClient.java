package fr.ubo.fast.common.clients;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.SQLTimeoutException;

public class DatabaseClient
{	
	private String database_url;
	private String dbms;
	private String database_name;
	private String hostname;
	private int port;
	private String username;
	private String password;
	private Connection connection;
	
	private static final String DATABASE_URL_TEMPLATE = "jdbc:%s://%s:%s/%s?user=%s&password=%s";

	public DatabaseClient(String dbms, String database_name, String hostname, int port, String username, String password)
	{
		this.database_url = "";
		this.dbms = dbms;
		this.database_name = database_name;
		this.hostname = hostname;
		this.port = port;
		this.username = username;
		this.password = password;
		this.connection = null;
	}

	public boolean connect()
	{
		boolean state = false;
		
		database_url = String.format(DATABASE_URL_TEMPLATE, dbms, hostname, String.valueOf(port), database_name, username, password);

		try
		{
			Class.forName("org.postgresql.Driver");
			connection = DriverManager.getConnection(database_url, username, password);

			if (connection != null)
			{
				state = true;
			}
		}
		catch (ClassNotFoundException exception)
		{
			exception.printStackTrace();
		}
		catch (SQLTimeoutException exception)
		{
			exception.printStackTrace();
		}
		catch (SQLException exception)
		{
			exception.printStackTrace();
		}

		return state;
	}

	public boolean disconnect()
	{
		boolean state = false;

		try
		{
			connection.close();
			state = true;
		}
		catch (SQLException exception)
		{
			exception.printStackTrace();
		}

		return state;
	}

	public Connection getConnection()
	{
		return this.connection;
	}
}