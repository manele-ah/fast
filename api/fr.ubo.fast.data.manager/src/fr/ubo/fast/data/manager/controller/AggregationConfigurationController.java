package fr.ubo.fast.data.manager.controller;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.TreeMap;
import java.util.concurrent.ThreadLocalRandom;

import javax.inject.Inject;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import fr.ubo.fast.common.constant.DataManagerProperties;
import fr.ubo.fast.common.model.AggregatedObservationRecord;
import fr.ubo.fast.common.model.AggregationType;
import fr.ubo.fast.common.model.Scale;
import fr.ubo.fast.common.utility.DataStructureHelper;
import fr.ubo.fast.data.manager.service.AggregationConfiguration;

@Path(DataManagerProperties.Constants.PATH_CONFIGURATION)
@Produces(MediaType.TEXT_PLAIN)
public class AggregationConfigurationController
{
	@Inject
	private AggregationConfiguration aggregation_configuration_service;
	
	@POST
	@Path(DataManagerProperties.Constants.PATH_PING)
	public Response ping(@QueryParam(DataManagerProperties.Constants.PARAMETER_VALUES_NUMBER) int values_number)
	{
		if (values_number <= 0)
		{
			return Response.status(Response.Status.BAD_REQUEST).entity("Values number must be > 0.").build();
		}

		TreeMap<OffsetDateTime, AggregatedObservationRecord> data = new TreeMap<>();
		OffsetDateTime now = OffsetDateTime.now();

		for (int i = 0; i < values_number; i++)
		{
			OffsetDateTime timestamp = now.plusMinutes(i);

			double min_value = ThreadLocalRandom.current().nextDouble(-10, 10);
			double max_value = ThreadLocalRandom.current().nextDouble(10, 35);
			double average_value = (min_value + max_value) / 2.0;
			double median_value = average_value;
			double first_quartile = min_value + (max_value - min_value) * 0.25;
			double last_quartile = min_value + (max_value - min_value) * 0.75;
			double raw_value = ThreadLocalRandom.current().nextDouble(-10, 35);
			int quality = (int) ThreadLocalRandom.current().nextDouble(0, 10);
			int min_quality = (int) ThreadLocalRandom.current().nextDouble(0, 5);
			int max_quality = (int) ThreadLocalRandom.current().nextDouble(5, 10);

			AggregatedObservationRecord record = new AggregatedObservationRecord();
			record.setRaw(raw_value);
			record.setMin(min_value);
			record.setMax(max_value);
			record.setAverage(average_value);
			record.setMedian(median_value);
			record.setFirstQuartile(first_quartile);
			record.setLastQuartile(last_quartile);
			record.setValuesNumber(i + 1);
			record.setQuality(quality);
			record.setMinQuality(min_quality);
			record.setMaxQuality(max_quality);

			data.put(timestamp, record);
		}

		String result = DataStructureHelper.convertMapToJsonString(data);
		return Response.ok(result).build();
	}
	
	@POST
	@Path(DataManagerProperties.Constants.PATH_CONFIGURE)
	public Response configureAggregations(@QueryParam(DataManagerProperties.Constants.PARAMETER_NAME) String name, 
			@QueryParam(DataManagerProperties.Constants.PARAMETER_START_TIME) OffsetDateTime start_time,
			@QueryParam(DataManagerProperties.Constants.PARAMETER_END_TIME) OffsetDateTime end_time, 
			@QueryParam(DataManagerProperties.Constants.PARAMETER_AGGREGATION_TYPES) List<AggregationType> aggregation_types, 
			@QueryParam(DataManagerProperties.Constants.PARAMETER_VALUES_NUMBER) int values_number, 
			@QueryParam(DataManagerProperties.Constants.PARAMETER_SCALE) Scale scale)	
	{
		if (name == null || name.isEmpty())
		{
			return Response.status(Response.Status.BAD_REQUEST).entity("Missing name.").build();
		}
		if (start_time == null)
		{
			return Response.status(Response.Status.BAD_REQUEST).entity("Missing start time.").build(); 
		}
		if (end_time == null)
		{
			return Response.status(Response.Status.BAD_REQUEST).entity("Missing end time.").build(); 
		}
		if (values_number == 0)
		{
			return Response.status(Response.Status.BAD_REQUEST).entity("Values number must be > 0.").build(); 
		}
		if (aggregation_types == null || aggregation_types.isEmpty())
		{
			return Response.status(Response.Status.BAD_REQUEST).entity("Missing aggregations.").build(); 
		}
		if (scale == null || scale.getValues().isEmpty())
		{
			return Response.status(Response.Status.BAD_REQUEST).entity("Missing scale (zoom levels).").build(); 
		}

		boolean configured = aggregation_configuration_service.configureAggregations(name, start_time, end_time, aggregation_types, values_number, scale);
		
		if (!configured)
		{
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity("Failed to configure aggregations.").build();
		}
		
		return Response.status(Response.Status.CREATED).entity("Aggregations configured successfully.").build();
	}
}
