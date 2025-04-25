package fr.ubo.fast.common.model;

import java.time.temporal.ChronoUnit;
import java.util.Collections;

/**
 * Class that represents a list of "calendar" zoom levels (durations).
 */
public class CalendarScale extends Scale
{
	/** Temporal units of the zoom levels. */
	private ChronoUnit[] units;
	/** Factors of the zoom levels (with respect to the corresponding unit). */
	private long[] factors;
	
	/**
	 * Initialize a calendar scale with its properties.
	 * @param units Temporal units of the zoom levels.
	 * @param factors Factors of the zoom levels.
	 */
	public CalendarScale(ChronoUnit[] units, long[] factors)
	{
		if (units.length == factors.length)
		{
			this.units = units;
			this.factors = factors;
		}
	}
	
	/**
	 * Compute the durations of the zoom levels according to the given factors and units of the scale.
	 */
	public void computeValues()
	{
		for (int i = 0; i < units.length; i++)
		{
			values.add(units[i].getDuration().multipliedBy(factors[i]));
		}
		
		Collections.sort(values);
	}

	/**
	 * Get scale temporal units.
	 * 
	 * @return List of temporal units.
	 */
	public ChronoUnit[] getUnits()
	{
		return units;
	}

	/**
	 * Get scale factors.
	 * 
	 * @return List of factors.
	 */
	public long[] getFactors()
	{
		return factors;
	}
	
	
}
