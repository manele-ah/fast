package fr.ubo.fast.data.manager.configuration;

import org.glassfish.hk2.utilities.binding.AbstractBinder;
import java.sql.Connection;
import javax.inject.Singleton;
import javax.ws.rs.ext.Provider;

import fr.ubo.fast.data.manager.dao.DatabaseSchemaDataAccess;
import fr.ubo.fast.data.manager.dao.MeasuredVariableDataAccess;
import fr.ubo.fast.data.manager.dao.TimeSeriesDataAccess;
import fr.ubo.fast.common.model.Database;
import fr.ubo.fast.data.manager.dao.ConfigurationDataAccess;
import fr.ubo.fast.data.manager.dao.jdbc.DatabaseSchemaDataAccessJdbc;
import fr.ubo.fast.data.manager.dao.jdbc.MeasuredVariableDataAccessJdbc;
import fr.ubo.fast.data.manager.dao.jdbc.TimeSeriesDataAccessJdbc;
import fr.ubo.fast.data.manager.factory.ConnectionFactory;
import fr.ubo.fast.data.manager.factory.DatabaseFactory;
import fr.ubo.fast.data.manager.service.AggregationConfiguration;
import fr.ubo.fast.data.manager.service.TimeSeriesDataSupplier;
import fr.ubo.fast.data.manager.service.TimeSeriesManagement;
import fr.ubo.fast.data.manager.service.jdbc.AggregationConfigurationJdbc;
import fr.ubo.fast.data.manager.service.jdbc.TimeSeriesDataSupplierJdbc;
import fr.ubo.fast.data.manager.service.jdbc.TimeSeriesManagementJdbc;
import fr.ubo.fast.data.manager.dao.jdbc.ConfigurationDataAccessJdbc;

@Provider
public class DataManagerBinder extends AbstractBinder
{
	@Override
	protected void configure()
	{
		bindFactory(DatabaseFactory.class).to(Database.class).in(Singleton.class);
		bindFactory(ConnectionFactory.class).to(Connection.class).in(Singleton.class);
		
		bind(DatabaseSchemaDataAccessJdbc.class).to(DatabaseSchemaDataAccess.class).in(Singleton.class);
		bind(MeasuredVariableDataAccessJdbc.class).to(MeasuredVariableDataAccess.class).in(Singleton.class);
		bind(TimeSeriesDataAccessJdbc.class).to(TimeSeriesDataAccess.class).in(Singleton.class);
		bind(ConfigurationDataAccessJdbc.class).to(ConfigurationDataAccess.class).in(Singleton.class);
		bind(TimeSeriesManagementJdbc.class).to(TimeSeriesManagement.class).in(Singleton.class);
		bind(TimeSeriesDataSupplierJdbc.class).to(TimeSeriesDataSupplier.class).in(Singleton.class);
		bind(AggregationConfigurationJdbc.class).to(AggregationConfiguration.class).in(Singleton.class);

        bind(SchemaInitializer.class).to(SchemaInitializer.class).in(Singleton.class);
	}
}
