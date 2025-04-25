package fr.ubo.fast.client.api;

import org.glassfish.jersey.client.JerseyClientBuilder;
import org.glassfish.jersey.client.JerseyWebTarget;
import javax.ws.rs.client.Client;
import javax.ws.rs.core.Response;
import java.time.OffsetDateTime;

import fr.ubo.fast.common.constant.DataManagerProperties;
import fr.ubo.fast.common.converter.OffsetDateTimeParameterConverter;
import fr.ubo.fast.common.utility.WebHelper;

public class TimeSeriesManagementClient
{
	private final Client client;
	private final JerseyWebTarget base_target;

	public TimeSeriesManagementClient(String path)
	{
		this.client = JerseyClientBuilder.createClient().register(OffsetDateTimeParameterConverter.class);
		this.base_target = (JerseyWebTarget) client.target(path + DataManagerProperties.PATH_BASE_URL.toString() + DataManagerProperties.PATH_TIME_SERIES.toString());
	}

	public String addMeasuredVariable(String name, String unit, double period, int min_quality, int max_quality)
	{
		JerseyWebTarget target = base_target.path(DataManagerProperties.PATH_ADD_MEASURED_VARIABLE.toString())
				.queryParam(DataManagerProperties.PARAMETER_NAME.toString(), name)
				.queryParam(DataManagerProperties.PARAMETER_UNIT.toString(), unit)
				.queryParam(DataManagerProperties.PARAMETER_PERIOD.toString(), period)
				.queryParam(DataManagerProperties.PARAMETER_MIN_QUALITY.toString(), min_quality)
				.queryParam(DataManagerProperties.PARAMETER_MAX_QUALITY.toString(), max_quality);

		Response response = target.request().post(null);

		return WebHelper.handleResponse(response);
	}

	public String addObservations(String name, String csv_file)
	{
		JerseyWebTarget target = base_target.path(DataManagerProperties.PATH_ADD_OBSERVATIONS.toString())
				.queryParam(DataManagerProperties.PARAMETER_NAME.toString(), name)
				.queryParam(DataManagerProperties.PARAMETER_FILE_NAME.toString(), csv_file);

		Response response = target.request().post(null);

		return WebHelper.handleResponse(response);
	}

	public String deleteObservations(String name, OffsetDateTime start_time, OffsetDateTime end_time)
	{
		JerseyWebTarget target = base_target.path(DataManagerProperties.PATH_DELETE_OBSERVATIONS.toString())
				.queryParam(DataManagerProperties.PARAMETER_NAME.toString(), name)
				.queryParam(DataManagerProperties.PARAMETER_START_TIME.toString(), start_time)
				.queryParam(DataManagerProperties.PARAMETER_END_TIME.toString(), end_time);

		Response response = target.request().delete();
		
		return WebHelper.handleResponse(response);
	}

	public String deleteTimeSeries(String name)
	{
		JerseyWebTarget target = base_target.path(DataManagerProperties.PATH_DELETE_TIME_SERIES.toString())
				.queryParam(DataManagerProperties.PARAMETER_NAME.toString(), name);

		Response response = target.request().delete();
		
		return WebHelper.handleResponse(response);
	}

	public String getMeasuredVariable(String name)
	{
		JerseyWebTarget target = base_target.path(DataManagerProperties.PATH_GET_SINGLE_MEASURED_VARIABLE.toString()).path(name);

		Response response = target.request().get();
		
		return WebHelper.handleResponse(response);
	}
	
	public String getAllMeasuredVariables()
	{
		JerseyWebTarget target = base_target.path(DataManagerProperties.PATH_GET_ALL_MEASURED_VARIABLES.toString());

		Response response = target.request().get();
		
		return WebHelper.handleResponse(response);
	}
	
	public String getTimeSeries(String name)
	{
		JerseyWebTarget target = base_target.path(DataManagerProperties.PATH_GET_SINGLE_TIME_SERIES.toString()).path(name);

		Response response = target.request().get();
		
		return WebHelper.handleResponse(response);
	}
	
	public String getAllTimeSeries()
	{
		JerseyWebTarget target = base_target.path(DataManagerProperties.PATH_GET_ALL_TIME_SERIES.toString());

		Response response = target.request().get();
		
		return WebHelper.handleResponse(response);
	}

	public void close()
	{
		client.close();
	}
}
