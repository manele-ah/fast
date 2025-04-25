package fr.ubo.fast.common.constant;

public enum DataManagerProperties
{
	APP_NAME(Constants.APP_NAME),
	PATH_BASE_URL(Constants.PATH_BASE_URL),
	PATH_TEST(Constants.PATH_TEST),
	PATH_PING(Constants.PATH_PING),
	PATH_TIME_SERIES(Constants.PATH_TIME_SERIES),
	PATH_CONFIGURATION(Constants.PATH_CONFIGURATION),
	PATH_DATA(Constants.PATH_DATA),
	PATH_ADD_MEASURED_VARIABLE(Constants.PATH_ADD_MEASURED_VARIABLE),
	PATH_ADD_OBSERVATIONS(Constants.PATH_ADD_OBSERVATIONS),
	PATH_DELETE_OBSERVATIONS(Constants.PATH_DELETE_OBSERVATIONS),
	PATH_DELETE_TIME_SERIES(Constants.PATH_DELETE_TIME_SERIES),
	PATH_GET_SINGLE_MEASURED_VARIABLE(Constants.PATH_GET_SINGLE_MEASURED_VARIABLE),
	PATH_GET_ALL_MEASURED_VARIABLES(Constants.PATH_GET_ALL_MEASURED_VARIABLES),
	PATH_GET_SINGLE_TIME_SERIES(Constants.PATH_GET_SINGLE_TIME_SERIES),
	PATH_GET_ALL_TIME_SERIES(Constants.PATH_GET_ALL_TIME_SERIES),
	PATH_GET_DATA(Constants.PATH_GET_DATA),
	PATH_CONFIGURE(Constants.PATH_CONFIGURE),
	PARAMETER_TIME_SERIES_ID(Constants.PARAMETER_TIME_SERIES_ID),
	PARAMETER_START_TIME(Constants.PARAMETER_START_TIME),
	PARAMETER_END_TIME(Constants.PARAMETER_END_TIME),
	PARAMETER_PERIOD(Constants.PARAMETER_PERIOD),
	PARAMETER_MIN_QUALITY(Constants.PARAMETER_MIN_QUALITY),
	PARAMETER_MAX_QUALITY(Constants.PARAMETER_MAX_QUALITY),
	PARAMETER_MEASURED_VARIABLE_ID(Constants.PARAMETER_MEASURED_VARIABLE_ID),
	PARAMETER_NAME(Constants.PARAMETER_NAME),
	PARAMETER_UNIT(Constants.PARAMETER_UNIT),
	PARAMETER_AGGREGATION_TYPES(Constants.PARAMETER_AGGREGATION_TYPES),
	PARAMETER_AGGREGATION_TABLE(Constants.PARAMETER_AGGREGATION_TABLE),
	PARAMETER_SCALE(Constants.PARAMETER_SCALE),
	PARAMETER_INTERVAL(Constants.PARAMETER_INTERVAL),
	PARAMETER_VALUES_NUMBER(Constants.PARAMETER_VALUES_NUMBER),
	PARAMETER_FILE_NAME(Constants.PARAMETER_FILE_NAME);
	
	private final String text;
	
	DataManagerProperties(final String text)
	{
		this.text = text;
	}
	
	@Override
	public final String toString()
	{
		return text;
	}
	
	// To be able to use enumeration values in annotations
	public static class Constants
	{
		public static final String APP_NAME = "/fr.ubo.fast.data.manager";
		public static final String PATH_BASE_URL = "/data-manager";
		public static final String PATH_TEST = "/test";
		public static final String PATH_PING = "/ping";
		public static final String PATH_TIME_SERIES = "/time-series";
		public static final String PATH_CONFIGURATION = "/aggregations";
		public static final String PATH_DATA = "/data";
		public static final String PATH_ADD_MEASURED_VARIABLE = "/add-measured-variable";
		public static final String PATH_ADD_OBSERVATIONS = "/add-observations";
		public static final String PATH_DELETE_OBSERVATIONS = "/delete-observations";
		public static final String PATH_DELETE_TIME_SERIES = "/delete-time-series";
		public static final String PATH_GET_SINGLE_MEASURED_VARIABLE = "/get-measured-variable";
		public static final String PATH_GET_ALL_MEASURED_VARIABLES = "/get-measured-variables";
		public static final String PATH_GET_SINGLE_TIME_SERIES = "/get-time-series";
		public static final String PATH_GET_ALL_TIME_SERIES = "/get-time-series";
		public static final String PATH_GET_DATA = "/get";
		public static final String PATH_CONFIGURE = "/configure";
		public static final String PARAMETER_TIME_SERIES_ID = "time-series-id";
		public static final String PARAMETER_START_TIME = "start-time";
		public static final String PARAMETER_END_TIME = "end-time";
		public static final String PARAMETER_PERIOD = "period";
		public static final String PARAMETER_MIN_QUALITY = "min-quality";
		public static final String PARAMETER_MAX_QUALITY = "max-quality";
		public static final String PARAMETER_MEASURED_VARIABLE_ID = "measured-variable-id";
		public static final String PARAMETER_NAME = "name";
		public static final String PARAMETER_UNIT = "unit";
		public static final String PARAMETER_AGGREGATION_TYPES = "aggregation-types";
		public static final String PARAMETER_AGGREGATION_TABLE = "aggregation-table";
		public static final String PARAMETER_SCALE = "scale";
		public static final String PARAMETER_INTERVAL = "interval";
		public static final String PARAMETER_VALUES_NUMBER = "values-number";
		public static final String PARAMETER_FILE_NAME = "file-name";
	}
}