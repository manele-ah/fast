package fr.ubo.fast.common.constant;

public enum PerformanceProfileProperties
{
	TIME_SERIES_NAME(Constants.TIME_SERIES_NAME),
	VALUES_NUMBER(Constants.VALUES_NUMBER),
	SCALE_TYPE(Constants.SCALE_TYPE),
	SCALE_FACTOR(Constants.SCALE_FACTOR),
	SCALE_ZOOMS_NUMBER(Constants.SCALE_ZOOMS_NUMBER),
	SCALE_FACTORS(Constants.SCALE_FACTORS),
	SCALE_PERIODS(Constants.SCALE_PERIODS),
	USER_TIME(Constants.USER_TIME),
	PING_TIME(Constants.PING_TIME),
	RAW_DATA_THRESHOLD(Constants.RAW_DATA_THRESHOLD),
	PRE_COMPUTED_DATA_THRESHOLD(Constants.PRE_COMPUTED_DATA_THRESHOLD);
	
	private final String text;
	
	PerformanceProfileProperties(final String text)
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
		public static final String TIME_SERIES_NAME = "TIME_SERIES_NAME";
		public static final String VALUES_NUMBER = "VALUES_NUMBER";
		public static final String SCALE_TYPE = "SCALE_TYPE";
		public static final String SCALE_FACTOR = "SCALE_FACTOR";
		public static final String SCALE_ZOOMS_NUMBER = "SCALE_ZOOMS_NUMBER";
		public static final String SCALE_FACTORS = "SCALE_FACTORS";
		public static final String SCALE_PERIODS = "SCALE_PERIODS";
		public static final String USER_TIME = "USER_TIME";
		public static final String PING_TIME = "PING_TIME";
		public static final String RAW_DATA_THRESHOLD = "RAW_DATA_THRESHOLD";
		public static final String PRE_COMPUTED_DATA_THRESHOLD = "PRE_COMPUTED_DATA_THRESHOLD";
	}
}