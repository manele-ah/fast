package fr.ubo.fast.common.clients;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

import org.glassfish.jersey.client.ClientConfig;
import org.glassfish.jersey.client.ClientProperties;

public class RestClient
{	
	private String hostname;
	private int port;
	private String base_url;
	private int connection_timeout;
	private int read_timeout;
	private Client client;
	private ClientConfig client_configuration;
	private WebTarget target;
	
	private static final String BASE_URL_TEMPLATE = "http://%s:%s/%s";
	
	public RestClient(String hostname, int port, String base_url, int connection_timeout, int read_timeout)
	{
		this.hostname = hostname;
		this.port = port;
		this.base_url = base_url;
		this.connection_timeout = connection_timeout;
		this.read_timeout = read_timeout;
		
		client_configuration = new ClientConfig();
		client_configuration.property(ClientProperties.CONNECT_TIMEOUT, connection_timeout);
		client_configuration.property(ClientProperties.READ_TIMEOUT, read_timeout);
		client = ClientBuilder.newClient(client_configuration);
		target = client.target(String.format(BASE_URL_TEMPLATE, this.hostname, String.valueOf(this.port), this.base_url));
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

	public String getBaseUrl()
	{
		return base_url;
	}

	public void setBaseUrl(String base_url)
	{
		this.base_url = base_url;
	}

	public int getConnectionTimeout()
	{
		return connection_timeout;
	}

	public void setConnectionTimeout(int connection_timeout)
	{
		this.connection_timeout = connection_timeout;
	}

	public int getReadTimeout()
	{
		return read_timeout;
	}

	public void setReadTimeout(int read_timeout)
	{
		this.read_timeout = read_timeout;
	}

	public Client getClient()
	{
		return client;
	}

	public void setClient(Client client)
	{
		this.client = client;
	}

	public ClientConfig getClientConfiguration()
	{
		return client_configuration;
	}

	public void setClientConfiguration(ClientConfig client_configuration)
	{
		this.client_configuration = client_configuration;
	}

	public WebTarget getTarget()
	{
		return target;
	}

	public void setTarget(WebTarget target)
	{
		this.target = target;
	}
}
