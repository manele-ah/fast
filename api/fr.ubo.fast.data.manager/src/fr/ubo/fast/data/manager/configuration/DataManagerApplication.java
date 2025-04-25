package fr.ubo.fast.data.manager.configuration;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.ServerProperties;
import javax.ws.rs.ApplicationPath;

import fr.ubo.fast.common.constant.DataManagerProperties;
import fr.ubo.fast.common.converter.AggregationTypeParameterConverter;
import fr.ubo.fast.common.converter.OffsetDateTimeParameterConverter;
import fr.ubo.fast.common.converter.ScaleParameterConverter;

@ApplicationPath(DataManagerProperties.Constants.PATH_BASE_URL)
public class DataManagerApplication extends ResourceConfig
{
	private static final String RESOURCE_PACKAGE = "fr.ubo.fast.data.manager.controller";
	
	public DataManagerApplication()
	{
		packages(RESOURCE_PACKAGE);

		// Include detailed validation error messages in the HTTP response
		property(ServerProperties.BV_SEND_ERROR_IN_RESPONSE, true);
		
		register(new DataManagerBinder());
		register(OffsetDateTimeParameterConverter.class);
		register(AggregationTypeParameterConverter.class);
		register(ScaleParameterConverter.class);
		register(StartUpFeature.class);
	}
}
