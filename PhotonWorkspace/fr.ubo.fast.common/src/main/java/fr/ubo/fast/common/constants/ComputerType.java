package fr.ubo.fast.common.constants;

public enum ComputerType
{
	SERVER(Constants.SERVER),
	CLIENT(Constants.CLIENT);
	
	private final String text;
	
	ComputerType(final String text)
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
		public static final String SERVER = "SERVER";
		public static final String CLIENT = "CLIENT";
	}
}