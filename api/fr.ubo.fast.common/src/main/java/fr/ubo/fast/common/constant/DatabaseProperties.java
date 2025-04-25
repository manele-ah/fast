package fr.ubo.fast.common.constant;

public enum DatabaseProperties
{
	MANAGEMENT_SYSTEM(Constants.MANAGEMENT_SYSTEM),
	NAME(Constants.NAME),
	HOSTNAME(Constants.HOSTNAME),
	PORT(Constants.PORT),
	USERNAME(Constants.USERNAME),
	PASSWORD(Constants.PASSWORD),
	FETCH_SIZE(Constants.FETCH_SIZE),
	TIME_ZONE(Constants.TIME_ZONE),
	ZONE_ID(Constants.ZONE_ID);
	
	private final String text;
	
	DatabaseProperties(final String text)
	{
		this.text = text;
	}
	
	@Override
	public String toString()
	{
		return text;
	}
	
	// To be able to use enumeration values in annotations
	public static class Constants
	{
		public static final String MANAGEMENT_SYSTEM = "DBMS";
		public static final String NAME = "DATABASE_NAME";
		public static final String HOSTNAME = "DATABASE_HOSTNAME";
		public static final String PORT = "DATABASE_PORT";
		public static final String USERNAME = "DATABASE_USERNAME";
		public static final String PASSWORD = "DATABASE_PASSWORD";
		public static final String FETCH_SIZE = "DATABASE_FETCH_SIZE";
		public static final String TIME_ZONE = "UTC";
		public static final String ZONE_ID = "Europe/Paris";
	}
}