package fr.ubo.fast.viewer.constants;

public enum Position
{
	TOP("TOP"),
	BOTTOM("BOTTOM"),
	LEFT("LEFT"),
	RIGHT("RIGHT");

	private String text;

	Position(final String text)
	{
		this.text = text;
	}

	@Override
	public String toString()
	{
		return this.text;
	}
}