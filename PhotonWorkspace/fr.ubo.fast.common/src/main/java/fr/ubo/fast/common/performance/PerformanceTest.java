package fr.ubo.fast.common.performance;

import java.time.Duration;
import java.time.OffsetDateTime;
import java.time.temporal.ChronoUnit;
import java.util.HashMap;
import java.util.TreeMap;

import fr.ubo.fast.common.api.DataProviderClient;
import fr.ubo.fast.common.api.DataProviderGeoServer;
import fr.ubo.fast.common.api.DataProviderRest;
import fr.ubo.fast.common.constants.DeploymentProperties;
import fr.ubo.fast.common.model.TimeSeries;
import fr.ubo.fast.common.model.VisualizationClient;
import fr.ubo.fast.common.model.WebServer;

public class PerformanceTest
{
	private WebServer web_server;
	private VisualizationClient visualization_client;
	private TimeSeries time_series_data;
	private DataProviderClient data_provider;
	
	private static final int TEST_STEP = 600;
	
	public PerformanceTest(WebServer web_server, VisualizationClient visualization_client)
	{
		this.web_server = web_server;
		this.visualization_client = visualization_client;
	}
	
	public void initialize()
	{
		if (web_server.getType().equalsIgnoreCase("Apache"))
		{
			data_provider = new DataProviderRest(this.web_server.getHostname(), this.web_server.getPort());
		}
		else if (web_server.getType().equalsIgnoreCase("GeoServer"))
		{
			data_provider = new DataProviderGeoServer(this.web_server.getHostname(), this.web_server.getPort());
		}
		
		this.time_series_data = data_provider.getTimeSeriesMetaData(this.visualization_client.getTimeSeriesId());
		// this.time_series_data = new TimeSeries(this.visualization_client.getTimeSeriesId(), 1.0, OffsetDateTime.parse("2010-01-01T00:00:00+01:00"), OffsetDateTime.parse("2010-01-02T00:00:00+01:00"));
	}
	
	@SuppressWarnings("unused")
	public void computePingTime()
	{
		TreeMap<OffsetDateTime, Double[]> data = new TreeMap<OffsetDateTime, Double[]>();
		long start_time = 0, end_time = 0;
		
		start_time = System.nanoTime();
		data = data_provider.ping(visualization_client.getChartWidth());
		end_time = System.nanoTime();
		
		visualization_client.setPingTime((double) ((end_time - start_time) / 1000000.0));
	}
	
	@SuppressWarnings("unused")
	public void computeRawDataThreshold()
	{
		HashMap<Integer, Double> results = new HashMap<Integer, Double>();
		Duration zoom = null;
		double elapsed_time = 0.0, interval = 0.0;
		long start_time = 0, end_time = 0;
		int size = 0, i = 0;
		
		while (elapsed_time <= visualization_client.getUserTime())
		{
			size = 0;
			TreeMap<OffsetDateTime, Double[]> data = new TreeMap<OffsetDateTime, Double[]>();
			zoom = (i == 0) ? Duration.ofSeconds(TEST_STEP * (i + 1)) : Duration.ofSeconds(TEST_STEP * i);
			Duration period = Duration.ofMillis((long) (time_series_data.getPeriod() * 1000));
			OffsetDateTime view_start_time = time_series_data.getStartDate();
			OffsetDateTime view_end_time = view_start_time.plus(zoom.toMillis(), ChronoUnit.MILLIS).minus(period.toMillis(), ChronoUnit.MILLIS);
			// System.out.println(view_start_time.toString());
			// System.out.println(view_end_time.toString());
			if (view_end_time.isAfter(time_series_data.getEndDate()))
			{
				view_end_time = time_series_data.getEndDate();
			}
			interval = zoom.dividedBy(visualization_client.getChartWidth()).toMillis() / 1000.0;
			// System.out.println(interval);
			
			if (interval > 0)
			{
				start_time = System.nanoTime();
				data = data_provider.getTimeSeriesObservations(visualization_client.getTimeSeriesId(), view_start_time.toString(), view_end_time.toString(), interval, DeploymentProperties.DATABASE_RAW_TIME_SERIES_DATA_TABLE.toString(), false);
				end_time = System.nanoTime();
				size = data.size();
				// System.out.println(size);
				elapsed_time = (double) ((end_time - start_time) / 1000000.0);
				/* int j = 0;
				for (Map.Entry<OffsetDateTime, Double[]> entry : data.entrySet())
				{
					if (j < 20)
					{
						System.out.print(entry.getKey().toString() + " {" + entry.getValue()[0] + ", " + entry.getValue()[1] + "} ");
					}
					j += 1;
				} */
				results.put(i, interval);
				if (i == 0)
				{
					elapsed_time = 0.0;
				}
			}
			
			if ((i % 5 == 0) && (i != 0))
			{
				System.out.println("Iteration " + i + " : " + elapsed_time);
			}
			i += 1;
		}
		
		visualization_client.setRawDataThreshold(results.get(i - 1));
	}
	
	@SuppressWarnings("unused")
	public void computePreComputedDataThreshold()
	{
		HashMap<Integer, Double> results = new HashMap<Integer, Double>();
		Duration zoom = null;
		double elapsed_time = 0.0, interval = 0.0;
		long start_time = 0, end_time = 0;
		int size = 0, i = 0;
		
		while (elapsed_time <= visualization_client.getUserTime())
		{
			size = 0;
			TreeMap<OffsetDateTime, Double[]> data = new TreeMap<OffsetDateTime, Double[]>();
			zoom = (i == 0) ? Duration.ofSeconds(TEST_STEP * (i + 1)) : Duration.ofSeconds(TEST_STEP * i);
			Duration period = Duration.ofMillis((long) (time_series_data.getPeriod() * 1000));
			OffsetDateTime view_start_time = time_series_data.getStartDate();
			OffsetDateTime view_end_time = view_start_time.plus(zoom.toMillis(), ChronoUnit.MILLIS).minus(period.toMillis(), ChronoUnit.MILLIS);
			// System.out.println(view_start_time.toString());
			// System.out.println(view_end_time.toString());
			if (view_end_time.isAfter(time_series_data.getEndDate()))
			{
				view_end_time = time_series_data.getEndDate();
			}
			interval = zoom.dividedBy(visualization_client.getChartWidth()).toMillis() / 1000.0;
			// System.out.println(interval);
			
			if (interval > 0)
			{
				start_time = System.nanoTime();
				data = data_provider.getTimeSeriesObservations(visualization_client.getTimeSeriesId(), view_start_time.toString(), view_end_time.toString(), interval, DeploymentProperties.DATABASE_RAW_TIME_SERIES_DATA_TABLE.toString(), false);
				end_time = System.nanoTime();
				size = data.size();
				// System.out.println(size);
				elapsed_time = (double) ((end_time - start_time) / 1000000.0);
				/* int j = 0;
				for (Map.Entry<OffsetDateTime, Double[]> entry : data.entrySet())
				{
					if (j < 20)
					{
						System.out.print(entry.getKey().toString() + " {" + entry.getValue()[0] + ", " + entry.getValue()[1] + "} ");
					}
					j += 1;
				} */
				results.put(i, elapsed_time);
				if (i == 0)
				{
					elapsed_time = 0.0;
				}
			}
			
			if ((i % 5 == 0) && (i != 0))
			{
				System.out.println("Iteration " + i + " : " + elapsed_time);
			}
			
			i += 5;
		}
		
		visualization_client.setPreComputedDataThreshold(i - 1);
	}

	public WebServer getWebServer()
	{
		return web_server;
	}

	public void setWebServer(WebServer web_server)
	{
		this.web_server = web_server;
	}

	public VisualizationClient getVisualizationClient()
	{
		return visualization_client;
	}

	public void setVisualizationClient(VisualizationClient visualization_client)
	{
		this.visualization_client = visualization_client;
	}

	public TimeSeries getTimeSeriesData()
	{
		return time_series_data;
	}

	public void setTimeSeriesData(TimeSeries time_series_data)
	{
		this.time_series_data = time_series_data;
	}

	public DataProviderClient getDataProvider()
	{
		return data_provider;
	}

	public void setDataProvider(DataProviderClient data_provider)
	{
		this.data_provider = data_provider;
	}
}