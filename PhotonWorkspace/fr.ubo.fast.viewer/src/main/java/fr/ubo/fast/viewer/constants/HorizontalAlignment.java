package fr.ubo.fast.viewer.constants;

public enum HorizontalAlignment
{
    LEFT("LEFT"),
    RIGHT("RIGHT"),
    CENTER("CENTER");
    
    private String text;

	HorizontalAlignment(final String text)
	{
		this.text = text;
	}

	@Override
	public String toString()
	{
		return this.text;
	}
}