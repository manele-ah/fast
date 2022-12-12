package fr.ubo.fast.common.model;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import fr.ubo.fast.common.utility.DataStructureHelper;
import fr.ubo.fast.common.constants.DatabaseProperties;

public class Database
{
	private String management_system;
	private String name;
	private String hostname;
	private int port;
	private String username;
	private String password;
	private int fetch_size;
	
	public Database(String management_system, String name, String hostname, int port, String username, String password, int fetch_size)
	{
		this.management_system = management_system;
		this.name = name;
		this.hostname = hostname;
		this.port = port;
		this.username = username;
		this.password = password;
		this.fetch_size = fetch_size;
	}
	
	public Database(File... properties_files)
	{
		Properties properties = DataStructureHelper.getProperties(properties_files);
		
		try
		{
			management_system = properties.getProperty(DatabaseProperties.MANAGEMENT_SYSTEM.toString());
			name = properties.getProperty(DatabaseProperties.NAME.toString());
			hostname = properties.getProperty(DatabaseProperties.HOSTNAME.toString());
			port = Integer.parseInt(properties.getProperty(DatabaseProperties.PORT.toString()));
			username = properties.getProperty(DatabaseProperties.USERNAME.toString());
			password = properties.getProperty(DatabaseProperties.PASSWORD.toString());
			fetch_size = Integer.parseInt(properties.getProperty(DatabaseProperties.FETCH_SIZE.toString()));
		}
		catch (NumberFormatException exception)
		{
			exception.printStackTrace();
		}
		catch (NullPointerException exception)
		{
			exception.printStackTrace();
		}
	}
	
	public Database(InputStream input)
	{
		Properties properties = new Properties();
		
		try
		{
			properties.load(input);
			
			management_system = properties.getProperty(DatabaseProperties.MANAGEMENT_SYSTEM.toString());
			name = properties.getProperty(DatabaseProperties.NAME.toString());
			hostname = properties.getProperty(DatabaseProperties.HOSTNAME.toString());
			port = Integer.parseInt(properties.getProperty(DatabaseProperties.PORT.toString()));
			username = properties.getProperty(DatabaseProperties.USERNAME.toString());
			password = properties.getProperty(DatabaseProperties.PASSWORD.toString());
			fetch_size = Integer.parseInt(properties.getProperty(DatabaseProperties.FETCH_SIZE.toString()));
		}
		catch (IOException exception)
		{
			exception.printStackTrace();
		}
		catch (NumberFormatException exception)
		{
			exception.printStackTrace();
		}
		catch (NullPointerException exception)
		{
			exception.printStackTrace();
		}
	}
	
	public String getManagementSystem()
	{
		return management_system;
	}

	public void setManagementSystem(String management_system)
	{
		this.management_system = management_system;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getHostname()
	{
		return hostname;
	}

	public void setHostname(String hostname)
	{
		this.hostname = hostname;
	}

	public int getPort()
	{
		return port;
	}

	public void setPort(int port)
	{
		this.port = port;
	}

	public String getUsername()
	{
		return username;
	}

	public void setUsername(String username)
	{
		this.username = username;
	}

	public String getPassword()
	{
		return password;
	}

	public void setPassword(String password)
	{
		this.password = password;
	}

	public int getFetchSize()
	{
		return fetch_size;
	}

	public void setFetch_Size(int fetch_size)
	{
		this.fetch_size = fetch_size;
	}
}