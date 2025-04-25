package fr.ubo.fast.common.client;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.SQLTimeoutException;

/**
 * The {@link DatabaseClient} class establishes a connection to a database.
 */
public class DatabaseClient
{	
	/** The URL of the database. */
	private String database_url;
	/** The type of DBMS. */
	private String dbms;
	/** The database name. */
	private String database_name;
	/** The hostname of the server that hosts the database. */
	private String hostname;
	/** The port of the server that hosts the database. */
	private int port;
	/** The username of the database. */
	private String username;
	/** The password associated to the username of the database. */
	private String password;
	/** The SQL connection object to the database. */
	private Connection connection;
	
	/** The template of the connection URL. */
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

	/**
	 * This method establishes a connection to a database.
	 * @return A boolean that describes the state of the connection.
	 */
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

	/**
	 * This method closes the connection to the database.
	 * @return A boolean that describes the state of the disconnection.
	 */
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