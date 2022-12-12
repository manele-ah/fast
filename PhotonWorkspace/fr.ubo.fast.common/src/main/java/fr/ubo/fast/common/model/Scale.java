package fr.ubo.fast.common.model;

import java.time.Duration;
import java.util.ArrayList;
import java.util.stream.Collectors;

public abstract class Scale
{
	protected ArrayList<Duration> values = new ArrayList<Duration>();
	
	// In seconds
	public ArrayList<Long> getLongValues()
	{
		return values.stream().map(element -> (long) (element.toMillis() / 1000.0)).collect(Collectors.toCollection(ArrayList::new));
	}
	
	public ArrayList<Double> getDoubleValues()
	{
		return values.stream().map(element -> element.toMillis() / 1000.0).collect(Collectors.toCollection(ArrayList::new));
	}
	
	public ArrayList<Duration> getValues()
	{
		return values;
	}

	public void setValues(ArrayList<Duration> values)
	{
		this.values = values;
	}
}