package fr.ubo.fast.client.api;

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
import fr.ubo.fast.common.model.AggregationType;
import fr.ubo.fast.common.utility.WebHelper;

public class TimeSeriesDataSupplierClient
{
	private final Client client;
	private final JerseyWebTarget base_target;

	public TimeSeriesDataSupplierClient(String path)
	{
		this.client = JerseyClientBuilder.createClient().register(AggregationTypeParameterConverter.class).register(OffsetDateTimeParameterConverter.class);
		this.base_target = (JerseyWebTarget) client.target(path + DataManagerProperties.PATH_BASE_URL.toString() + DataManagerProperties.PATH_DATA.toString());
	}
	
	public String getData(String name, List<AggregationType> aggregations, OffsetDateTime start_time, OffsetDateTime end_time, double interval, int values_number)
	{
		List<?> list = (List<?>) aggregations;
		List<String> string_list = new ArrayList<>();
		for (Object object : list)
		{
			string_list.add(object.toString());
		}
		String aggregations_string = String.join(",", string_list);
		
		JerseyWebTarget target = base_target.path(DataManagerProperties.PATH_GET_DATA.toString())
				.queryParam(DataManagerProperties.PARAMETER_NAME.toString(), name)
				.queryParam(DataManagerProperties.PARAMETER_AGGREGATION_TYPES.toString(), aggregations_string)
				.queryParam(DataManagerProperties.PARAMETER_START_TIME.toString(), start_time)
				.queryParam(DataManagerProperties.PARAMETER_END_TIME.toString(), end_time)
				.queryParam(DataManagerProperties.PARAMETER_INTERVAL.toString(), interval)
				.queryParam(DataManagerProperties.PARAMETER_VALUES_NUMBER.toString(), values_number);
		
		System.out.println(target.getUri().toASCIIString());
		Response response = target.request().post(null);
		return WebHelper.handleResponse(response);
	}

	public void close()
	{
		client.close();
	}
}
