package fr.ubo.fast.viewer.constants;

public enum NordTheme
{
	BACKGROUND_COLOR("#2E3440"),
	PLOT_BACKGROUND_COLOR("#252831"),
	TEXT_FOREGROUND_COLOR("#ECEFF4"),
	TEXT_BACKGROUND_COLOR("#3B4252"),
	FOCUS_COLOR("#88C0D0"),
	SELECTION_COLOR("#4C566A");
	
	private final String text;
	
	NordTheme(final String text)
	{
		this.text = text;
	}
	
	@Override
	public String toString()
	{
		return this.text;
	}
}