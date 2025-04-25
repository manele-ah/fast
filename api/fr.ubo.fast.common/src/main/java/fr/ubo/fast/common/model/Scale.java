package fr.ubo.fast.common.model;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Abstract class that represents a list of zoom levels (durations).
 */
public abstract class Scale
{
	/** List of zoom levels (durations). */
	protected List<Duration> values = new ArrayList<Duration>();
	
	/**
	 * Convert the Duration type of the zoom levels to seconds (long values).
	 * 
	 * @return A list of zoom levels in seconds (long values).
	 */
	public List<Long> getLongValues()
	{
		return values.stream().map(element -> (long) (element.toMillis() / 1000.0)).collect(Collectors.toCollection(ArrayList::new));
	}
	
	/**
	 * Convert the Duration type of the zoom levels to seconds (double values).
	 * 
	 * @return A list of zoom levels in seconds (double values).
	 */
	public List<Double> getDoubleValues()
	{
		return values.stream().map(element -> element.toMillis() / 1000.0).collect(Collectors.toCollection(ArrayList::new));
	}
	
	/**
	 * Get scale values.
	 * 
	 * @return A list of zoom levels (durations).
	 */
	public List<Duration> getValues()
	{
		return values;
	}

	/**
	 * Set scale values.
	 * @param values List of zoom levels.
	 */
	public void setValues(List<Duration> values)
	{
		this.values = values;
	}
}