package fr.ubo.fast.data.manager.controller;

import java.io.File;
import java.time.OffsetDateTime;
import java.util.List;
import javax.inject.Inject;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import fr.ubo.fast.common.constant.DataManagerProperties;
import fr.ubo.fast.common.model.MeasuredVariable;
import fr.ubo.fast.common.model.TimeSeries;
import fr.ubo.fast.data.manager.service.TimeSeriesManagement;

@Path(DataManagerProperties.Constants.PATH_TIME_SERIES)
@Produces(MediaType.TEXT_PLAIN)
public class TimeSeriesManagementController
{
	@Inject
	private TimeSeriesManagement time_series_management_service;
	
	@GET
	@Path(DataManagerProperties.Constants.PATH_TEST)
	public String test()
	{
		return "Hello";
	}
	
	/**
	 * Add time series meta-data.
	 * This method creates a measured variable (e.g., temperature) defined by its name and unit and configures a time series period and quality thresholds.
	 * 
	 * @param name Name of the measured variable.
	 * @param unit Unit of measurement.
	 * @param period Sampling period of the time series.
	 * @param min_quality Min quality of the time series.
	 * @param max_quality Max quality of the time series.
	 * @return 
	 */
	@POST
    @Path(DataManagerProperties.Constants.PATH_ADD_MEASURED_VARIABLE)
	public Response addMeasuredVariable(@QueryParam(DataManagerProperties.Constants.PARAMETER_NAME) String name, 
			@QueryParam(DataManagerProperties.Constants.PARAMETER_UNIT) String unit,
			@QueryParam(DataManagerProperties.Constants.PARAMETER_PERIOD) double period, 
			@QueryParam(DataManagerProperties.Constants.PARAMETER_MIN_QUALITY) int min_quality, 
			@QueryParam(DataManagerProperties.Constants.PARAMETER_MAX_QUALITY) int max_quality)
	{
		if (name == null || name.isEmpty())
		{
			return Response.status(Response.Status.BAD_REQUEST).entity("Missing name.").build();
		}
		if (unit == null || unit.isEmpty())
		{
			return Response.status(Response.Status.BAD_REQUEST).entity("Missing unit.").build();
		}
		if (period <= 0)
		{
			return Response.status(Response.Status.BAD_REQUEST).entity("Period must be > 0.").build();
		}
		if (min_quality >= max_quality)
		{
			return Response.status(Response.Status.BAD_REQUEST).entity("Min quality must be < max quality.").build();
		}
		
        int result = time_series_management_service.addMeasuredVariable(name, unit, period, min_quality, max_quality);

        if (result == 1)
        {
    		return Response.status(Response.Status.CREATED).entity("Measured variable and time series meta-data added successfully.").build();
        }
        else if (result == 2)
        {
			return Response.status(Response.Status.CONFLICT).entity("Measured variable or time series already exists.").build();
        }
        else
        {
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity("Failed to create measured variable or time series meta-data.").build();
        }
	}
	
	/**
	 * Import observations from a CSV file that contains exactly one time series with the following columns: timestamp, value, quality (in that order). 
	 * 
	 * @param name Name of the measured variable linked to the time series.
	 * @param file_path Path of a CSV file with columns: timestamp, value, quality.
	 * @return 
	 */
	@POST
	@Path(DataManagerProperties.Constants.PATH_ADD_OBSERVATIONS)
	public Response addObservations(@QueryParam(DataManagerProperties.Constants.PARAMETER_NAME) String name, 
			@QueryParam(DataManagerProperties.Constants.PARAMETER_FILE_NAME) String file_path)
	{
		if (name == null || name.isEmpty())
		{
			return Response.status(Response.Status.BAD_REQUEST).entity("Missing name.").build();
		}
		if (file_path == null || file_path.isEmpty())
		{
			return Response.status(Response.Status.BAD_REQUEST).entity("Missing file path.").build();
		}
		
		File csv_file = new File(file_path);
		if (!csv_file.exists() || !csv_file.isFile())
		{
			return Response.status(Response.Status.BAD_REQUEST).entity("Invalid file path.").build();
		}

		boolean added = time_series_management_service.addObservations(name, csv_file);
		
		if (!added)
		{
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity("Failed to import observations.").build();
		}
		
		return Response.status(Response.Status.CREATED).entity("Observations imported successfully.").build();
	}

	@DELETE
	@Path(DataManagerProperties.Constants.PATH_DELETE_OBSERVATIONS)
	public Response deleteObservations(@QueryParam(DataManagerProperties.Constants.PARAMETER_NAME) String name, 
			@QueryParam(DataManagerProperties.Constants.PARAMETER_START_TIME) OffsetDateTime start_time,
			@QueryParam(DataManagerProperties.Constants.PARAMETER_END_TIME) OffsetDateTime end_time)
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

		boolean deleted = time_series_management_service.deleteObservations(name, start_time, end_time);
		
		if (!deleted)
		{
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity("Failed to delete observations.").build();
		}
		
		return Response.ok("Observations deleted successfully.").build();
	}
	
	@DELETE
	@Path(DataManagerProperties.Constants.PATH_DELETE_TIME_SERIES)
	public Response deleteTimeSeries(@QueryParam(DataManagerProperties.Constants.PARAMETER_NAME) String name)
	{
		if (name == null || name.isEmpty())
		{
			return Response.status(Response.Status.BAD_REQUEST).entity("Missing name.").build();
		}
		
		boolean deleted = time_series_management_service.deleteTimeSeries(name);
		
		if (!deleted)
		{
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity("Failed to delete time series.").build();
		}
		
		return Response.ok("Time series and related data deleted successfully.").build();
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path(DataManagerProperties.Constants.PATH_GET_SINGLE_MEASURED_VARIABLE + "/{" + DataManagerProperties.Constants.PARAMETER_NAME + "}")
	public Response getMeasuredVariable(@PathParam(DataManagerProperties.Constants.PARAMETER_NAME) String name)
	{
		if (name == null || name.isEmpty())
		{
			return Response.status(Response.Status.BAD_REQUEST).entity("Missing name.").build();
		}
		
		MeasuredVariable result = time_series_management_service.getMeasuredVariable(name);
		
		if (result == null)
		{
			return Response.status(Response.Status.NOT_FOUND).entity("Measured variable not found").build();
		}
		
		return Response.ok(result).build();
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path(DataManagerProperties.Constants.PATH_GET_ALL_MEASURED_VARIABLES)
	public Response getAllMeasuredVariables()
	{
		List<MeasuredVariable> measured_variables = time_series_management_service.getAllMeasuredVariables();
		
		return Response.ok(measured_variables).build();
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path(DataManagerProperties.Constants.PATH_GET_SINGLE_TIME_SERIES + "/{" + DataManagerProperties.Constants.PARAMETER_NAME + "}")
	public Response getTimeSeries(@PathParam(DataManagerProperties.Constants.PARAMETER_NAME) String name)
	{
		if (name == null || name.isEmpty())
		{
			return Response.status(Response.Status.BAD_REQUEST).entity("Missing name.").build();
		}
		
		TimeSeries result = time_series_management_service.getTimeSeries(name);
		
		if (result == null)
		{
			return Response.status(Response.Status.NOT_FOUND).entity("Time series not found").build();
		}
		
		return Response.ok(result).build();
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path(DataManagerProperties.Constants.PATH_GET_ALL_TIME_SERIES)
	public Response getAllTimeSeries()
	{
		List<TimeSeries> time_series = time_series_management_service.getAllTimeSeries();
		
		return Response.ok(time_series).build();
	}
}
