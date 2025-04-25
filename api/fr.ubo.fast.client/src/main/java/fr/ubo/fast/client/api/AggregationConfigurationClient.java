package fr.ubo.fast.client.api;

import java.time.Duration;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.client.Client;
import javax.ws.rs.core.Response;
import org.glassfish.jersey.client.JerseyClientBuilder;
import org.glassfish.jersey.client.JerseyWebTarget;

import fr.ubo.fast.common.constant.DataManagerProperties;
import fr.ubo.fast.common.converter.AggregationTypeParameterConverter;
import fr.ubo.fast.common.converter.OffsetDateTimeParameterConverter;
import fr.ubo.fast.common.converter.ScaleParameterConverter;
import fr.ubo.fast.common.model.AggregationType;
import fr.ubo.fast.common.model.Scale;
import fr.ubo.fast.common.utility.WebHelper;

public class AggregationConfigurationClient
{
	private final Client client;
	private final JerseyWebTarget base_target;

	public AggregationConfigurationClient(String path)
	{
		this.client = JerseyClientBuilder.createClient().register(AggregationTypeParameterConverter.class).register(OffsetDateTimeParameterConverter.class).register(ScaleParameterConverter.class);
		this.base_target = (JerseyWebTarget) client.target(path + DataManagerProperties.PATH_BASE_URL.toString() + DataManagerProperties.PATH_CONFIGURATION.toString());
	}
	
	public String ping(int values_number)
	{
		JerseyWebTarget target = base_target.path(DataManagerProperties.PATH_PING.toString())
				.queryParam(DataManagerProperties.PARAMETER_VALUES_NUMBER.toString(), values_number);

		System.out.println(target.getUri().toASCIIString());
		Response response = target.request().post(null);
		
		return WebHelper.handleResponse(response);
	}


	public String configureAggregations(String name, OffsetDateTime start_time, OffsetDateTime end_time, List<AggregationType> aggregations, int values, Scale scale)
	{
		List<?> list = (List<?>) aggregations;
		List<String> string_list = new ArrayList<>();
		for (Object object : list)
		{
			string_list.add(object.toString());
		}
		String aggregations_string = String.join(",", string_list);
		
		List<String> parts = new ArrayList<>();
		for (Duration duration : scale.getValues())
		{
			parts.add(duration.toString());
		}
		String scale_string = String.join(",", parts);
		
		JerseyWebTarget target = base_target.path(DataManagerProperties.PATH_CONFIGURE.toString())
				.queryParam(DataManagerProperties.PARAMETER_NAME.toString(), name)
				.queryParam(DataManagerProperties.PARAMETER_START_TIME.toString(), start_time)
				.queryParam(DataManagerProperties.PARAMETER_END_TIME.toString(), end_time)
				.queryParam(DataManagerProperties.PARAMETER_AGGREGATION_TYPES.toString(), aggregations_string)
				.queryParam(DataManagerProperties.PARAMETER_VALUES_NUMBER.toString(), values)
				.queryParam(DataManagerProperties.PARAMETER_SCALE.toString(), scale_string);

		System.out.println(target.getUri().toASCIIString());
		Response response = target.request().post(null);
		
		return WebHelper.handleResponse(response);
	}
	
	public void close()
	{
		client.close();
	}

}
