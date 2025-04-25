package fr.ubo.fast.data.manager.factory;

import java.sql.Connection;
import javax.inject.Inject;
import javax.inject.Singleton;
import org.glassfish.hk2.api.Factory;

import fr.ubo.fast.common.client.DatabaseClient;
import fr.ubo.fast.common.model.Database;

@Singleton
public class ConnectionFactory implements Factory<Connection>
{
	private final Database database;

	@Inject
	public ConnectionFactory(Database database)
	{
		this.database = database;
	}

	@Override
	public Connection provide()
	{
		DatabaseClient database_client = new DatabaseClient(database.getManagementSystem(), database.getName(),
				database.getHostname(), database.getPort(), database.getUsername(), database.getPassword());
		boolean connected = database_client.connect();
		if (!connected)
		{
			throw new RuntimeException("Failed to connect to database");
		}

		return database_client.getConnection();
	}

	@Override
	public void dispose(Connection instance)
	{
		if (instance != null)
		{
			try
			{
				instance.close();
			}
			catch (Exception exception)
			{
				exception.printStackTrace();
			}
		}
	}
}
