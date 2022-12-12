package fr.ubo.fast.common.clients;

import java.net.MalformedURLException;
import java.net.URL;
import java.io.IOException;

import org.geotools.ows.ServiceException;
import org.geotools.data.wps.WebProcessingService;

public class GeoServerWebProcessingServiceClient
{	
	private String hostname;
	private int port;
	private URL wps_url;
	private int read_timeout;
	private WebProcessingService wps;
	
	private static final String WPS_URL_TEMPLATE = "http://%s:%s/geoserver/ows?service=WPS&request=GetCapabilities";
	
	public GeoServerWebProcessingServiceClient(String hostname, int port, int read_timeout)
	{
		this.hostname = hostname;
		this.port = port;
		this.read_timeout = read_timeout;

		try
		{
			wps_url = new URL(String.format(WPS_URL_TEMPLATE, this.hostname, String.valueOf(this.port)));

			try
			{
				wps = new WebProcessingService(wps_url);
				wps.getHTTPClient().setReadTimeout(this.read_timeout);
			}
			catch (ServiceException exception)
			{
				exception.printStackTrace();
			}
			catch (IOException exception)
			{
				exception.printStackTrace();
			}
		}
		catch (MalformedURLException exception)
		{
			exception.printStackTrace();
		}
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

	public URL getWpsUrl()
	{
		return wps_url;
	}

	public void setWpsUrl(URL wps_url)
	{
		this.wps_url = wps_url;
	}

	public int getReadTimeout()
	{
		return read_timeout;
	}

	public void setReadTimeout(int read_timeout)
	{
		this.read_timeout = read_timeout;
	}

	public WebProcessingService getWps()
	{
		return wps;
	}

	public void setWps(WebProcessingService wps)
	{
		this.wps = wps;
	}
}