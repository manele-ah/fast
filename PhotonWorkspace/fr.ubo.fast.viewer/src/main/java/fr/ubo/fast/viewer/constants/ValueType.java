package fr.ubo.fast.viewer.constants;

public enum ValueType
{
	DOUBLE("DOUBLE"),
	DATE("DATE");

	private String text;

	ValueType(final String text)
	{
		this.text = text;
	}

	@Override
	public String toString()
	{
		return this.text;
	}
}