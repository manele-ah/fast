package fr.ubo.fast.common.model;

import java.io.File;
import java.util.Properties;

import fr.ubo.fast.common.utility.DataStructureHelper;
import fr.ubo.fast.common.constants.WebServerProperties;

public class WebServer
{
	private String type;
	private String hostname;
	private int port;

	public WebServer(String type, String hostname, int port)
	{
		this.type = type;
		this.hostname = hostname;
		this.port = port;
	}
	
	public WebServer(File... properties_files)
	{
		Properties properties = DataStructureHelper.getProperties(properties_files);
		
		try
		{
			type = properties.getProperty(WebServerProperties.TYPE.toString());
			hostname = properties.getProperty(WebServerProperties.HOSTNAME.toString());
			port = Integer.parseInt(properties.getProperty(WebServerProperties.PORT.toString()));
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

	public String getType()
	{
		return type;
	}

	public void setType(String type)
	{
		this.type = type;
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
}