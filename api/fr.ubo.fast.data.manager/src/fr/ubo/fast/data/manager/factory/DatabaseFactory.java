package fr.ubo.fast.data.manager.factory;

import java.io.InputStream;
import javax.inject.Singleton;
import javax.servlet.ServletContext;
import javax.ws.rs.core.Context;
import org.glassfish.hk2.api.Factory;

import fr.ubo.fast.common.model.Database;

@Singleton
public class DatabaseFactory implements Factory<Database>
{
	@Context
	private ServletContext context;
	private static final String DATABASE_PROPERTIES_FILE = "WEB-INF/conf/database.properties";

	@Override
	public Database provide()
	{
		Database database = null;
		
		try (InputStream input = context.getResourceAsStream(DATABASE_PROPERTIES_FILE))
		{
			if (input == null)
			{
				throw new RuntimeException("Database properties file not found at " + DATABASE_PROPERTIES_FILE);
			}
			
			database = new Database(input);
		}
		catch (Exception exception)
		{
			exception.printStackTrace();
            throw new RuntimeException("Failed to load database properties from " + DATABASE_PROPERTIES_FILE, exception);
		}

		return database;
	}

	@Override
	public void dispose(Database instance)
	{
		
	}
}
