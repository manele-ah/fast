package fr.ubo.fast.data.manager.configuration;

import javax.inject.Inject;
import javax.inject.Singleton;
import javax.ws.rs.core.Feature;
import javax.ws.rs.core.FeatureContext;

@Singleton
public class StartUpFeature implements Feature
{
	@SuppressWarnings("unused")
	private final SchemaInitializer initializer;

	@Inject
    public StartUpFeature(SchemaInitializer initializer)
	{
        this.initializer = initializer;
    }

	@Override
	public boolean configure(FeatureContext context)
	{
		return true;
	}
}
