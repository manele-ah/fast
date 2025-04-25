package fr.ubo.fast.data.manager.configuration;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Singleton;

import fr.ubo.fast.data.manager.dao.DatabaseSchemaDataAccess;

@Singleton
public class SchemaInitializer
{
	private final DatabaseSchemaDataAccess database_schema_data_access;

	@Inject
	public SchemaInitializer(DatabaseSchemaDataAccess database_schema_data_access)
	{
		this.database_schema_data_access = database_schema_data_access;
	}

	@PostConstruct
	public void initialize()
	{
		database_schema_data_access.createMeasuredVariablesTable();
		database_schema_data_access.createTimeSeriesTable();
		database_schema_data_access.createObservationsTable();
		database_schema_data_access.createConfigurationsTable();
	}
}
