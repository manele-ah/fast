package fr.ubo.fast.common.api;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.TreeMap;
import java.util.stream.Collectors;

import javax.ws.rs.core.MediaType;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import fr.ubo.fast.common.clients.RestClient;
import fr.ubo.fast.common.model.TimeSeries;
import fr.ubo.fast.common.constants.DataProviderProperties;

public class DataProviderRest extends DataProviderClient
{
	private RestClient client;
	
	private static final int READ_TIMEOUT = 1000000000;
	private static final int CONNECTION_TIMEOUT = 1000000000;
	private static final String BASE_URL = "fr.ubo.fast.data.provider-0.0.1-SNAPSHOT" + "/" + DataProviderProperties.PATH_ROOT;
	
	public DataProviderRest(String hostname, int port, String base_url, int connection_timeout, int read_timeout)
	{
		client = new RestClient(hostname, port, base_url, connection_timeout, read_timeout);
	}
	
	public DataProviderRest(String hostname, int port)
	{
		this(hostname, port, BASE_URL, CONNECTION_TIMEOUT, READ_TIMEOUT);
	}

	@Override
	public TreeMap<OffsetDateTime, Double[]> ping(int data_points_number)
	{
		TreeMap<OffsetDateTime, Double[]> observations = new TreeMap<OffsetDateTime, Double[]>();
		String points_number_parameter = "", result = "";
		ObjectMapper mapper = new ObjectMapper();

		try
		{
			points_number_parameter = URLEncoder.encode(String.valueOf(data_points_number), StandardCharsets.UTF_8.toString());
			
			result = client.getTarget().path(DataProviderProperties.PATH_PING.toString()).queryParam(DataProviderProperties.PARAMETER_DATA_POINTS_NUMBER.toString(), points_number_parameter).request(MediaType.APPLICATION_JSON).get(String.class);

			mapper.registerModule(new JavaTimeModule());
			mapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
			mapper.disable(DeserializationFeature.ADJUST_DATES_TO_CONTEXT_TIME_ZONE);
			mapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
			
			ArrayList<TreeMap<OffsetDateTime, Double[]>> temporary = mapper.readValue(result, new TypeReference<ArrayList<TreeMap<OffsetDateTime, Double[]>>>(){});
			temporary.stream().forEach(map ->
			{
				observations.putAll(map.entrySet().stream().collect(Collectors.toMap(entry -> entry.getKey(), entry -> entry.getValue())));
			});
		}
		catch (UnsupportedEncodingException exception)
		{
			exception.printStackTrace();
		}
		catch (JsonMappingException exception)
		{
			exception.printStackTrace();
		}
		catch (JsonProcessingException exception)
		{
			exception.printStackTrace();
		}
		
		return observations;
	}

	@Override
	public TreeMap<OffsetDateTime, Double[]> getTimeSeriesObservations(int time_series_id, String start_time, String end_time, double interval, String table, boolean raw)
	{
		TreeMap<OffsetDateTime, Double[]> observations = new TreeMap<OffsetDateTime, Double[]>();
		String id_parameter = "", start_time_parameter = "", end_time_parameter = "", interval_parameter = "", table_parameter = "", raw_parameter = "", result = "";
		ObjectMapper mapper = new ObjectMapper();

		try
		{
			id_parameter = URLEncoder.encode(String.valueOf(time_series_id), StandardCharsets.UTF_8.toString());
			start_time_parameter = URLEncoder.encode(start_time, StandardCharsets.UTF_8.toString());
			end_time_parameter = URLEncoder.encode(end_time, StandardCharsets.UTF_8.toString());
			interval_parameter = URLEncoder.encode(String.valueOf(interval), StandardCharsets.UTF_8.toString());
			table_parameter = URLEncoder.encode(table, StandardCharsets.UTF_8.toString());
			raw_parameter = URLEncoder.encode(String.valueOf(raw), StandardCharsets.UTF_8.toString());

			result = client.getTarget().path(DataProviderProperties.PATH_TIME_SERIES_DATA.toString()).path(id_parameter).queryParam(DataProviderProperties.PARAMETER_START_TIME.toString(), start_time_parameter).queryParam(DataProviderProperties.PARAMETER_END_TIME.toString(), end_time_parameter).queryParam(DataProviderProperties.PARAMETER_INTERVAL.toString(), interval_parameter).queryParam(DataProviderProperties.PARAMETER_TABLE.toString(), table_parameter).queryParam(DataProviderProperties.PARAMETER_RAW.toString(), raw_parameter).request(MediaType.APPLICATION_JSON).get(String.class);

			mapper.registerModule(new JavaTimeModule());
			mapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
			mapper.disable(DeserializationFeature.ADJUST_DATES_TO_CONTEXT_TIME_ZONE);
			mapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
			
			ArrayList<TreeMap<OffsetDateTime, Double[]>> temporary = mapper.readValue(result, new TypeReference<ArrayList<TreeMap<OffsetDateTime, Double[]>>>(){});
			temporary.stream().forEach(map ->
			{
				observations.putAll(map.entrySet().stream().collect(Collectors.toMap(entry -> entry.getKey(), entry -> entry.getValue())));
			});
		}
		catch (UnsupportedEncodingException exception)
		{
			exception.printStackTrace();
		}
		catch (JsonMappingException exception)
		{
			exception.printStackTrace();
		}
		catch (JsonProcessingException exception)
		{
			exception.printStackTrace();
		}
		
		return observations;
	}

	@Override
	public TimeSeries getTimeSeriesMetaData(int time_series_id)
	{
		TimeSeries time_series_data = null;
		String id_parameter = "", result = "";
		ObjectMapper mapper = new ObjectMapper();

		try
		{
			id_parameter = URLEncoder.encode(String.valueOf(time_series_id), StandardCharsets.UTF_8.toString());
			
			result = client.getTarget().path("meta-data").path(id_parameter).request(MediaType.APPLICATION_JSON).get(String.class);
			
			mapper.registerModule(new JavaTimeModule());
			mapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
			mapper.disable(DeserializationFeature.ADJUST_DATES_TO_CONTEXT_TIME_ZONE);
			
			time_series_data = mapper.readValue(result, TimeSeries.class);
		}
		catch (UnsupportedEncodingException exception)
		{
			exception.printStackTrace();
		}
		catch (JsonMappingException exception)
		{
			exception.printStackTrace();
		}
		catch (JsonProcessingException exception)
		{
			exception.printStackTrace();
		}
		
		return time_series_data;
	}
	
	public static void main(String[] args)
	{
		// DataProviderRest client = new DataProviderRest("localhost", 8080);
		DataProviderRest client = new DataProviderRest("192.168.165.229", 8081);
		System.out.println(client.getTimeSeriesObservations(1, "2010-01-01T00:00+01:00", "2010-01-01T00:10+01:00", 1.0, "observations", false));
		System.out.println(client.getTimeSeriesMetaData(1).getEndDate());
	}
}