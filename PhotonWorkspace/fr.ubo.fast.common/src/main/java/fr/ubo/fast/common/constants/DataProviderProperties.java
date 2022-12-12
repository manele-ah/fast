package fr.ubo.fast.common.constants;

public enum DataProviderProperties
{
	WPS_PING(Constants.WPS_PING),
	WPS_TIME_SERIES_DATA(Constants.WPS_TIME_SERIES_DATA),
	WPS_TIME_SERIES_META_DATA(Constants.WPS_TIME_SERIES_META_DATA),
	PATH_ROOT(Constants.PATH_ROOT),
	PATH_PING(Constants.PATH_PING),
	PATH_TIME_SERIES_DATA(Constants.PATH_TIME_SERIES_DATA),
	PATH_TIME_SERIES_META_DATA(Constants.PATH_TIME_SERIES_META_DATA),
	PARAMETER_DATA_POINTS_NUMBER(Constants.PARAMETER_DATA_POINTS_NUMBER),
	PARAMETER_TIME_SERIES_ID(Constants.PARAMETER_TIME_SERIES_ID),
	PARAMETER_START_TIME(Constants.PARAMETER_START_TIME),
	PARAMETER_END_TIME(Constants.PARAMETER_END_TIME),
	PARAMETER_INTERVAL(Constants.PARAMETER_INTERVAL),
	PARAMETER_TABLE(Constants.PARAMETER_TABLE),
	PARAMETER_RAW(Constants.PARAMETER_RAW);
	
	private final String text;
	
	DataProviderProperties(final String text)
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
		public static final String WPS_PING = "TSDP:ping";
		public static final String WPS_TIME_SERIES_DATA = "TSDP:retrieveTimeSeriesData";
		public static final String WPS_TIME_SERIES_META_DATA = "TSDP:retrieveTimeSeriesMetaData";
		public static final String PATH_ROOT = "time-series";
		public static final String PATH_PING = "ping";
		public static final String PATH_TIME_SERIES_DATA = "data";
		public static final String PATH_TIME_SERIES_META_DATA = "meta-data";
		public static final String PARAMETER_DATA_POINTS_NUMBER = "data_points_number";
		public static final String PARAMETER_TIME_SERIES_ID = "id";
		public static final String PARAMETER_START_TIME = "start_time";
		public static final String PARAMETER_END_TIME = "end_time";
		public static final String PARAMETER_INTERVAL = "interval";
		public static final String PARAMETER_TABLE = "table";
		public static final String PARAMETER_RAW = "raw";
	}
}