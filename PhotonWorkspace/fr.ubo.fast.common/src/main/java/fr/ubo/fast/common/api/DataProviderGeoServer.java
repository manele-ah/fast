package fr.ubo.fast.common.api;

import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.TreeMap;
import java.util.stream.Collectors;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.geotools.data.wps.WPSUtils;
import org.geotools.data.wps.request.DescribeProcessRequest;
import org.geotools.data.wps.request.ExecuteProcessRequest;
import org.geotools.data.wps.response.DescribeProcessResponse;
import org.geotools.data.wps.response.ExecuteProcessResponse;
import org.geotools.ows.ServiceException;

import net.opengis.wps10.DataType;
import net.opengis.wps10.ExecuteResponseType;
import net.opengis.wps10.InputDescriptionType;
import net.opengis.wps10.OutputDataType;
import net.opengis.wps10.ProcessDescriptionType;
import net.opengis.wps10.ProcessDescriptionsType;

import fr.ubo.fast.common.clients.GeoServerWebProcessingServiceClient;
import fr.ubo.fast.common.model.TimeSeries;
import fr.ubo.fast.common.constants.DataProviderProperties;

public class DataProviderGeoServer extends DataProviderClient
{
	private GeoServerWebProcessingServiceClient client;
	
	private static final int READ_TIMEOUT = 600;
	
	public DataProviderGeoServer(String hostname, int port, int read_timeout)
	{
		client = new GeoServerWebProcessingServiceClient(hostname, port, read_timeout);
	}
	
	public DataProviderGeoServer(String hostname, int port)
	{
		this(hostname, port, READ_TIMEOUT);
	}
	
	private InputDescriptionType[] checkInputs(String process_name, ArrayList<Object> inputs)
	{
		ProcessDescriptionType process_description = describeProcess(process_name);

		InputDescriptionType[] inputs_description_types = new InputDescriptionType[inputs.size()];
		for (int i = 0; i < inputs_description_types.length; i++)
		{
			inputs_description_types[i] = (InputDescriptionType) process_description.getDataInputs().getInput().get(i);
		}

		return inputs_description_types;
	}
	
	private ProcessDescriptionType describeProcess(String process_name)
	{
		ProcessDescriptionType process_description = null;

		try
		{
			DescribeProcessRequest describe_process_request = client.getWps().createDescribeProcessRequest();
			describe_process_request.setIdentifier(process_name);
			DescribeProcessResponse describe_process_response = client.getWps().issueRequest(describe_process_request);

			ProcessDescriptionsType process_descriptions = describe_process_response.getProcessDesc();
			process_description = (ProcessDescriptionType) process_descriptions.getProcessDescription().get(0);
		}
		catch (ServiceException exception)
		{
			exception.printStackTrace();
		}
		catch (IOException exception)
		{
			exception.printStackTrace();
		}

		return process_description;
	}

	@SuppressWarnings("unchecked")
	private String executeProcess(String process_name, ArrayList<Object> inputs)
	{
		String result = "";

		try
		{
			ExecuteProcessRequest execute_process_request = client.getWps().createExecuteProcessRequest();
			execute_process_request.setIdentifier(process_name);

			if (inputs.size() > 0)
			{
				InputDescriptionType[] inputs_description_types = checkInputs(process_name, inputs);
				DataType[] request_inputs = new DataType[inputs.size()];

				ArrayList<ArrayList<EObject>> inputs_container = new ArrayList<ArrayList<EObject>>();
				for (int i = 0; i < inputs_description_types.length; i++)
				{
					request_inputs[i] = WPSUtils.createInputDataType(inputs.get(i), inputs_description_types[i]);
					inputs_container.add(new ArrayList<EObject>());
					inputs_container.get(i).add(request_inputs[i]);
					execute_process_request.addInput(inputs_description_types[i].getIdentifier().getValue(), inputs_container.get(i));
				}
				
				ExecuteProcessResponse execute_process_response = client.getWps().issueRequest(execute_process_request);
				ExecuteResponseType execution_response = execute_process_response.getExecuteResponse();
				EList<OutputDataType> outputs = execution_response.getProcessOutputs().getOutput();
				OutputDataType output = outputs.get(0);
				result = output.getData().getLiteralData().getValue().toString();
			}
		}
		catch (ServiceException exception)
		{
			exception.printStackTrace();
		}
		catch (IOException exception)
		{
			exception.printStackTrace();
		}

		return result;
	}

	@Override
	public TreeMap<OffsetDateTime, Double[]> ping(int data_points_number)
	{
		TreeMap<OffsetDateTime, Double[]> observations = new TreeMap<OffsetDateTime, Double[]>();
		ArrayList<Object> inputs = new ArrayList<Object>();
		String result = "";
		ObjectMapper mapper = new ObjectMapper();

		inputs.add(data_points_number);
		
		result = executeProcess(DataProviderProperties.WPS_PING.toString(), inputs);
		
		mapper.registerModule(new JavaTimeModule());
		mapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
		mapper.disable(DeserializationFeature.ADJUST_DATES_TO_CONTEXT_TIME_ZONE);
		mapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);

		try
		{
			ArrayList<TreeMap<OffsetDateTime, Double[]>> temporary = mapper.readValue(result, new TypeReference<ArrayList<TreeMap<OffsetDateTime, Double[]>>>(){});
			temporary.stream().forEach(map ->
			{
				observations.putAll(map.entrySet().stream().collect(Collectors.toMap(entry -> entry.getKey(), entry -> entry.getValue())));
			});
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
		ArrayList<Object> inputs = new ArrayList<Object>();
		String result = "";
		ObjectMapper mapper = new ObjectMapper();

		inputs.add(time_series_id);
		inputs.add(start_time);
		inputs.add(end_time);
		inputs.add(interval);
		inputs.add(table);
		inputs.add(raw);
		
		result = executeProcess(DataProviderProperties.WPS_TIME_SERIES_DATA.toString(), inputs);
		
		mapper.registerModule(new JavaTimeModule());
		mapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
		mapper.disable(DeserializationFeature.ADJUST_DATES_TO_CONTEXT_TIME_ZONE);
		mapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);

		try
		{
			ArrayList<TreeMap<OffsetDateTime, Double[]>> temporary = mapper.readValue(result, new TypeReference<ArrayList<TreeMap<OffsetDateTime, Double[]>>>(){});
			temporary.stream().forEach(map ->
			{
				observations.putAll(map.entrySet().stream().collect(Collectors.toMap(entry -> entry.getKey(), entry -> entry.getValue())));
			});
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
		ArrayList<Object> inputs = new ArrayList<Object>();
		String result = "";
		ObjectMapper mapper = new ObjectMapper();

		inputs.add(time_series_id);
		
		result = executeProcess(DataProviderProperties.WPS_TIME_SERIES_META_DATA.toString(), inputs);
		
		mapper.registerModule(new JavaTimeModule());
		mapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
		mapper.disable(DeserializationFeature.ADJUST_DATES_TO_CONTEXT_TIME_ZONE);

		try
		{
			time_series_data = mapper.readValue(result, TimeSeries.class);
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
		// DataProviderGeoServer client = new DataProviderGeoServer("localhost", 8080);
		// System.out.println(client.getTimeSeriesObservations(1, "2010-01-01T00:00+01:00", "2010-01-01T00:00:01+01:00", 1.0, "observations", false));
	}
}