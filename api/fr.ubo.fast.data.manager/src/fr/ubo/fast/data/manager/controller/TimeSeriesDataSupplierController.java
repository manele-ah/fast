package fr.ubo.fast.data.manager.controller;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.TreeMap;

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
import fr.ubo.fast.common.utility.DataStructureHelper;
import fr.ubo.fast.data.manager.service.TimeSeriesDataSupplier;

@Path(DataManagerProperties.Constants.PATH_DATA)
@Produces(MediaType.APPLICATION_JSON)
public class TimeSeriesDataSupplierController
{
	@Inject
	private TimeSeriesDataSupplier time_series_data_supplier_service;
	
	@POST
	@Path(DataManagerProperties.Constants.PATH_GET_DATA)
	public Response getData(@QueryParam(DataManagerProperties.Constants.PARAMETER_NAME) String name, 
			@QueryParam(DataManagerProperties.Constants.PARAMETER_AGGREGATION_TYPES) List<AggregationType> aggregations,
			@QueryParam(DataManagerProperties.Constants.PARAMETER_START_TIME) OffsetDateTime start_time,
			@QueryParam(DataManagerProperties.Constants.PARAMETER_END_TIME) OffsetDateTime end_time, 
			@QueryParam(DataManagerProperties.Constants.PARAMETER_INTERVAL) double interval, 
			@QueryParam(DataManagerProperties.Constants.PARAMETER_VALUES_NUMBER) int values_number)	
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
		if (interval == 0)
		{
			return Response.status(Response.Status.BAD_REQUEST).entity("Interval must be > 0.").build(); 
		}
		if (values_number == 0)
		{
			return Response.status(Response.Status.BAD_REQUEST).entity("Values number must be > 0.").build(); 
		}

		TreeMap<OffsetDateTime, AggregatedObservationRecord> data = time_series_data_supplier_service.getData(name, aggregations, start_time, end_time, interval, values_number);
		
		if (data == null || data.isEmpty())
		{
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity("Failed to get data.").build();
		}
		
		return Response.ok(DataStructureHelper.convertMapToJsonString(data)).build();
	}
}
