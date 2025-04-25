package fr.ubo.fast.performance.intervals;

import java.time.Duration;
import java.time.OffsetDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.HashMap;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import fr.ubo.fast.client.api.AggregationConfigurationClient;
import fr.ubo.fast.client.api.TimeSeriesDataSupplierClient;
import fr.ubo.fast.client.api.TimeSeriesManagementClient;
import fr.ubo.fast.common.constant.DataManagerProperties;
import fr.ubo.fast.common.model.TimeSeries;
import fr.ubo.fast.common.model.AggregationType;
import fr.ubo.fast.common.model.PerformanceProfile;
import fr.ubo.fast.common.model.WebServer;

/**
 * Class that represents the tests that are run to compute the performance parameters of the FaST framework.
 */
public class PerformanceTest
{
	/** Web server properties. */
	private WebServer web_server;
	/** Performance profile of the model. */
	private PerformanceProfile performance_profile;
	/** Time series meta-data. */
	private TimeSeries time_series_data;
	/** Data supplier client. */
	private TimeSeriesDataSupplierClient data_supplier;
	/** Time series management client. */
	private TimeSeriesManagementClient time_series_management;
	/** Aggregation configuration client. */
	private AggregationConfigurationClient configuration_client;
	/** Client base path pattern. */
	private String base_path_pattern = "http://%s:%s/%s";
	/** Step for computing the pre-computed threshold. */
	private static final int TEST_STEP = 600;
	
	/**
	 * Initialize class with a performance profile and web server properties.
	 * @param web_server Web server properties.
	 * @param performance_profile Performance profile.
	 */
	public PerformanceTest(WebServer web_server, PerformanceProfile performance_profile)
	{
		this.web_server = web_server;
		this.performance_profile = performance_profile;
		this.base_path_pattern = String.format(this.base_path_pattern, this.web_server.getHostname(), String.valueOf(this.web_server.getPort()), DataManagerProperties.APP_NAME.toString());
	}
	
	/**
	 * Initialize clients.
	 */
	public void initialize()
	{
		this.data_supplier = new TimeSeriesDataSupplierClient(this.base_path_pattern);
		this.time_series_management = new TimeSeriesManagementClient(this.base_path_pattern);
		this.configuration_client = new AggregationConfigurationClient(this.base_path_pattern);
		
		String time_series_raw = time_series_management.getTimeSeries(this.performance_profile.getTimeSeriesName());
		ObjectMapper mapper = new ObjectMapper();
		mapper.registerModule(new JavaTimeModule());
		mapper.setPropertyNamingStrategy(PropertyNamingStrategies.LOWER_CAMEL_CASE);

		try
		{
			this.time_series_data = mapper.readValue(time_series_raw, new TypeReference<TimeSeries>()
			{
			});
		}
		catch (Exception exception)
		{
			exception.printStackTrace();			
		}
	}
	
	/**
	 * Compute the minimum time that a query can take to get time series data.
	 */
	public void computePingTime()
	{
		long start_time = 0, end_time = 0;
		
		start_time = System.nanoTime();
		configuration_client.ping(performance_profile.getValuesNumber());
		end_time = System.nanoTime();
		
		performance_profile.setPingTime((double) ((end_time - start_time) / 1000000.0));
	}
	
	/**
	 * Compute the threshold above which it is no longer relevant to use raw data to view a time series.
	 */
	public void computeRawDataThreshold()
	{
		HashMap<Integer, Double> results = new HashMap<Integer, Double>();
		Duration zoom = null;
		double elapsed_time = 0.0, interval = 0.0;
		long start_time = 0, end_time = 0;
		int i = 0;
		
		while (elapsed_time <= performance_profile.getUserTime())
		{
			String data = "";
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
			interval = zoom.dividedBy(performance_profile.getValuesNumber()).toMillis() / 1000.0;
			// System.out.println(interval);
			
			if (interval > 0)
			{
				start_time = System.nanoTime();
				data = data_supplier.getData(performance_profile.getTimeSeriesName(), Arrays.asList(AggregationType.MIN, AggregationType.MAX), view_start_time, view_end_time, interval, performance_profile.getValuesNumber());
				System.out.println(data);
				end_time = System.nanoTime();
				elapsed_time = (double) ((end_time - start_time) / 1000000.0);
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
		
		performance_profile.setRawDataThreshold(results.get(i - 1));
	}
	
	/**
	 * Compute the maximum ratio that meets the required user time when pre-computed data are used to view a time series.
	 */
	public void computePreComputedDataThreshold()
	{
		HashMap<Integer, Double> results = new HashMap<Integer, Double>();
		Duration zoom = null;
		double elapsed_time = 0.0, interval = 0.0;
		long start_time = 0, end_time = 0;
		int i = 0;
		
		while (elapsed_time <= performance_profile.getUserTime())
		{
			String data = "";
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
			interval = zoom.dividedBy(performance_profile.getValuesNumber()).toMillis() / 1000.0;
			// System.out.println(interval);
			
			if (interval > 0)
			{
				start_time = System.nanoTime();
				data = data_supplier.getData(performance_profile.getTimeSeriesName(), Arrays.asList(AggregationType.MIN, AggregationType.MAX), view_start_time, view_end_time, interval, performance_profile.getValuesNumber());
				end_time = System.nanoTime();
				elapsed_time = (double) ((end_time - start_time) / 1000000.0);
				System.out.println(data);
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
		
		performance_profile.setPreComputedDataThreshold(i - 1);
	}

	public WebServer getWebServer()
	{
		return web_server;
	}

	public void setWebServer(WebServer web_server)
	{
		this.web_server = web_server;
	}

	public PerformanceProfile getPerformanceProfile()
	{
		return performance_profile;
	}

	public void setPerformanceProfile(PerformanceProfile performance_profile)
	{
		this.performance_profile = performance_profile;
	}

	public TimeSeries getTimeSeriesData()
	{
		return time_series_data;
	}

	public void setTimeSeriesData(TimeSeries time_series_data)
	{
		this.time_series_data = time_series_data;
	}
}