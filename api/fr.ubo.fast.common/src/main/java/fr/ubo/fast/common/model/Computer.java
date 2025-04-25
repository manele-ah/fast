package fr.ubo.fast.common.model;

import java.io.File;
import java.util.Properties;

import fr.ubo.fast.common.constant.ComputerProperties;
import fr.ubo.fast.common.utility.DataStructureHelper;

public class Computer
{
	private ComputerType type;
	private String hostname;
	private String username;
	private String password;
	
	public Computer(ComputerType type, String hostname, String username, String password)
	{
		this.type = type;
		this.hostname = hostname;
		this.username = username;
		this.password = password;
	}
	
	public Computer(ComputerType type, File... properties_files)
	{
		Properties properties = DataStructureHelper.getProperties(properties_files);
		
		if (type == ComputerType.SERVER)
		{
			hostname = properties.getProperty(ComputerProperties.SERVER_HOSTNAME.toString());
			username = properties.getProperty(ComputerProperties.SERVER_USERNAME.toString());
			password = properties.getProperty(ComputerProperties.SERVER_PASSWORD.toString());
		}
		else if (type == ComputerType.CLIENT)
		{
			hostname = properties.getProperty(ComputerProperties.CLIENT_HOSTNAME.toString());
			username = properties.getProperty(ComputerProperties.CLIENT_USERNAME.toString());
			password = properties.getProperty(ComputerProperties.CLIENT_PASSWORD.toString());
		}
	}

	public ComputerType getType()
	{
		return type;
	}
	
	public void setType(ComputerType type)
	{
		this.type = type;
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

	public String getHostname()
	{
		return hostname;
	}

	public void setHostname(String hostname)
	{
		this.hostname = hostname;
	}
}