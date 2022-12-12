package fr.ubo.fast.common.constants;

public enum ComputerProperties
{
	SERVER_HOSTNAME(Constants.SERVER_HOSTNAME),
	SERVER_USERNAME(Constants.SERVER_USERNAME),
	SERVER_PASSWORD(Constants.SERVER_PASSWORD),
	CLIENT_HOSTNAME(Constants.CLIENT_HOSTNAME),
	CLIENT_USERNAME(Constants.CLIENT_USERNAME),
	CLIENT_PASSWORD(Constants.CLIENT_PASSWORD);
	
	private final String text;
	
	ComputerProperties(final String text)
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
		public static final String SERVER_HOSTNAME = "SERVER_HOSTNAME";
		public static final String SERVER_USERNAME = "SERVER_USERNAME";
		public static final String SERVER_PASSWORD = "SERVER_PASSWORD";
		public static final String CLIENT_HOSTNAME = "CLIENT_HOSTNAME";
		public static final String CLIENT_USERNAME = "CLIENT_USERNAME";
		public static final String CLIENT_PASSWORD = "CLIENT_PASSWORD";
	}
}