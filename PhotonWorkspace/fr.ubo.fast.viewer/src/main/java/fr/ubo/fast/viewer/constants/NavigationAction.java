package fr.ubo.fast.viewer.constants;

public enum NavigationAction
{
    DOWN("DOWN"),
    UP("UP"),
    PREVIOUS("PREVIOUS"),
    NEXT("NEXT");
    
    private String text;

	NavigationAction(final String text)
	{
		this.text = text;
	}

	@Override
	public String toString()
	{
		return this.text;
	}
}