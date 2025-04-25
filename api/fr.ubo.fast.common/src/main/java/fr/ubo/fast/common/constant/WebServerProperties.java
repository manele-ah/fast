package fr.ubo.fast.common.constant;

public enum WebServerProperties
{
	TYPE(Constants.TYPE),
	HOSTNAME(Constants.HOSTNAME),
	PORT(Constants.PORT);
	
	private final String text;
	
	WebServerProperties(final String text)
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
		public static final String TYPE = "WEB_SERVER_TYPE";
		public static final String HOSTNAME = "WEB_SERVER_HOSTNAME";
		public static final String PORT = "WEB_SERVER_PORT";
	}
}