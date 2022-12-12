package fr.ubo.fast.common.constants;

public enum VisualizationClientProperties
{
	TIME_SERIES_ID(Constants.TIME_SERIES_ID),
	CHART_HEIGHT(Constants.CHART_HEIGHT),
	CHART_WIDTH(Constants.CHART_WIDTH),
	AXIS_FACTOR(Constants.AXIS_FACTOR),
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
	
	VisualizationClientProperties(final String text)
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
		public static final String TIME_SERIES_ID = "TIME_SERIES_ID";
		public static final String CHART_HEIGHT = "CHART_HEIGHT";
		public static final String CHART_WIDTH = "CHART_WIDTH";
		public static final String AXIS_FACTOR = "AXIS_FACTOR";
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