package fr.ubo.fast.common.model;

public enum AggregationType
{
	RAW(Constants.RAW),
	MIN(Constants.MIN),
	MAX(Constants.MAX),
	AVERAGE(Constants.AVERAGE),
	MEDIAN(Constants.MEDIAN),
	FIRST_QUARTILE(Constants.FIRST_QUARTILE),
	LAST_QUARTILE(Constants.LAST_QUARTILE);
	
	private final String text;
	
	AggregationType(final String text)
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
		public static final String RAW = "RAW";
		public static final String MIN = "MIN";
		public static final String MAX = "MAX";
		public static final String AVERAGE = "AVERAGE";
		public static final String MEDIAN = "MEDIAN";
		public static final String FIRST_QUARTILE = "FIRST_QUARTILE";
		public static final String LAST_QUARTILE = "LAST_QUARTILE";
	}
}
