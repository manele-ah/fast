package fr.ubo.fast.common.constant;

public enum DeploymentProperties
{
	CONF_FOLDER(Constants.CONF_FOLDER),
	DOCKER_FOLDER(Constants.DOCKER_FOLDER),
	WEB_SERVER_FOLDER(Constants.WEB_SERVER_FOLDER),
	TIME_SCALE_DB_FOLDER(Constants.TIME_SCALE_DB_FOLDER),
	CLIENT_FOLDER(Constants.CLIENT_FOLDER),
	TEST_RESULTS_FILE(Constants.TEST_RESULTS_FILE),
	TIME_SERIES_DATA_FILE(Constants.TIME_SERIES_DATA_FILE),
	GENERATED_INTERVALS_FILE(Constants.GENERATED_INTERVALS_FILE),
	WEB_SERVER_FILE_PATTERN(Constants.WEB_SERVER_FILE_PATTERN),
	PERFORMANCE_PROFILE_FILE_PATTERN(Constants.PERFORMANCE_PROFILE_FILE_PATTERN),
	SERVER_FILE_PATTERN(Constants.SERVER_FILE_PATTERN),
	CLIENT_FILE_PATTERN(Constants.CLIENT_FILE_PATTERN),
	DATABASE_FILE_PATTERN(Constants.DATABASE_FILE_PATTERN);
	
	private final String text;
	
	DeploymentProperties(final String text)
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
		public static final String CONF_FOLDER = "conf";
		public static final String DOCKER_FOLDER = "docker";
		public static final String WEB_SERVER_FOLDER = "web_server";
		public static final String TIME_SCALE_DB_FOLDER = "time_scale_db";
		public static final String CLIENT_FOLDER = "client";
		public static final String TEST_RESULTS_FILE = "test_results.properties";
		public static final String TIME_SERIES_DATA_FILE = "time_series.data";
		public static final String GENERATED_INTERVALS_FILE = "intervals.properties";
		public static final String WEB_SERVER_FILE_PATTERN = "_web_server.properties";
		public static final String PERFORMANCE_PROFILE_FILE_PATTERN = "profile.properties";
		public static final String SERVER_FILE_PATTERN = "_server.properties";
		public static final String CLIENT_FILE_PATTERN = "_client.properties";
		public static final String DATABASE_FILE_PATTERN = "_data_manager_database.properties";
	}
}
