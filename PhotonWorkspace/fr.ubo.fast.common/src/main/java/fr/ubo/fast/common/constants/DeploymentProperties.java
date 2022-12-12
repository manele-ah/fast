package fr.ubo.fast.common.constants;

public enum DeploymentProperties
{
	CONF_FOLDER(Constants.CONF_FOLDER),
	DOCKER_FOLDER(Constants.DOCKER_FOLDER),
	WEB_SERVER_FOLDER(Constants.WEB_SERVER_FOLDER),
	TIME_SCALE_DB_FOLDER(Constants.TIME_SCALE_DB_FOLDER),
	VISUALIZATION_TOOL_FOLDER(Constants.VISUALIZATION_TOOL_FOLDER),
	TEST_RESULTS_FILE(Constants.TEST_RESULTS_FILE),
	TIME_SERIES_DATA_FILE(Constants.TIME_SERIES_DATA_FILE),
	GENERATED_INTERVALS_FILE(Constants.GENERATED_INTERVALS_FILE),
	WEB_SERVER_FILE_PATTERN(Constants.WEB_SERVER_FILE_PATTERN),
	VISUALIZATION_TOOL_FILE_PATTERN(Constants.VISUALIZATION_TOOL_FILE_PATTERN),
	SERVER_FILE_PATTERN(Constants.SERVER_FILE_PATTERN),
	CLIENT_FILE_PATTERN(Constants.CLIENT_FILE_PATTERN),
	DATABASE_RAW_TIME_SERIES_DATA_TABLE(Constants.DATABASE_RAW_TIME_SERIES_DATA_TABLE),
	DATABASE_TIME_SERIES_META_DATA_TABLE(Constants.DATABASE_TIME_SERIES_META_DATA_TABLE),
	DATABASE_TIME_SERIES_DATA_TIME_COLUMN(Constants.DATABASE_TIME_SERIES_DATA_TIME_COLUMN),
	DATABASE_TIME_SERIES_DATA_VALUE_COLUMN(Constants.DATABASE_TIME_SERIES_DATA_VALUE_COLUMN),
	DATABASE_TIME_SERIES_DATA_MIN_COLUMN(Constants.DATABASE_TIME_SERIES_DATA_MIN_COLUMN),
	DATABASE_TIME_SERIES_DATA_MAX_COLUMN(Constants.DATABASE_TIME_SERIES_DATA_MAX_COLUMN),
	DATABASE_TIME_SERIES_META_DATA_ID_COLUMN(Constants.DATABASE_TIME_SERIES_META_DATA_ID_COLUMN),
	DATABASE_TIME_SERIES_META_DATA_START_DATE_COLUMN(Constants.DATABASE_TIME_SERIES_META_DATA_START_DATE_COLUMN),
	DATABASE_TIME_SERIES_META_DATA_END_DATE_COLUMN(Constants.DATABASE_TIME_SERIES_META_DATA_END_DATE_COLUMN),
	DATABASE_TIME_SERIES_META_DATA_PERIOD_COLUMN(Constants.DATABASE_TIME_SERIES_META_DATA_PERIOD_COLUMN),
	DATABASE_MIN_MAX_TABLE_PATTERN(Constants.DATABASE_MIN_MAX_TABLE_PATTERN);

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
		public static final String VISUALIZATION_TOOL_FOLDER = "visualization_tool";
		public static final String TEST_RESULTS_FILE = "test_results.properties";
		public static final String TIME_SERIES_DATA_FILE = "time_series.data";
		public static final String GENERATED_INTERVALS_FILE = "intervals.properties";
		public static final String WEB_SERVER_FILE_PATTERN = "_web_server.properties";
		public static final String VISUALIZATION_TOOL_FILE_PATTERN = "_tool.properties";
		public static final String SERVER_FILE_PATTERN = "_server.properties";
		public static final String CLIENT_FILE_PATTERN = "_client.properties";
		public static final String DATABASE_RAW_TIME_SERIES_DATA_TABLE = "observations";
		public static final String DATABASE_TIME_SERIES_META_DATA_TABLE = "time_series";
		public static final String DATABASE_TIME_SERIES_DATA_TIME_COLUMN = "time";
		public static final String DATABASE_TIME_SERIES_DATA_VALUE_COLUMN = "value";
		public static final String DATABASE_TIME_SERIES_DATA_MIN_COLUMN = "min";
		public static final String DATABASE_TIME_SERIES_DATA_MAX_COLUMN = "max";
		public static final String DATABASE_TIME_SERIES_META_DATA_ID_COLUMN = "time_series_id";
		public static final String DATABASE_TIME_SERIES_META_DATA_START_DATE_COLUMN = "start_date";
		public static final String DATABASE_TIME_SERIES_META_DATA_END_DATE_COLUMN = "end_date";
		public static final String DATABASE_TIME_SERIES_META_DATA_PERIOD_COLUMN = "period";
		public static final String DATABASE_MIN_MAX_TABLE_PATTERN = "observations_min_max_id_%s_interval_%s";
	}
}