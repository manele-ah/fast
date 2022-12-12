package fr.ubo.fast.common.model;

import java.time.temporal.ChronoUnit;
import java.util.Collections;

public class CalendarScale extends Scale
{
	private ChronoUnit[] units;
	private long[] factors;
	
	public CalendarScale(ChronoUnit[] units, long[] factors)
	{
		if (units.length == factors.length)
		{
			this.units = units;
			this.factors = factors;
		}
	}
	
	public void computeValues()
	{
		for (int i = 0; i < units.length; i++)
		{
			values.add(units[i].getDuration().multipliedBy(factors[i]));
		}
		Collections.sort(values);
	}
}
