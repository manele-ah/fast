package fr.ubo.fast.common.model;

import java.time.OffsetDateTime;

public class RawObservationRecord
{
	OffsetDateTime timestamp;
	double value;
	int quality;

	public RawObservationRecord(OffsetDateTime timestamp, double value, int quality)
	{
		this.timestamp = timestamp;
		this.value = value;
		this.quality = quality;
	}

	public OffsetDateTime getTimestamp()
	{
		return timestamp;
	}

	public double getValue()
	{
		return value;
	}

	public int getQuality()
	{
		return quality;
	}

	public void setTimestamp(OffsetDateTime timestamp)
	{
		this.timestamp = timestamp;
	}

	public void setValue(double value)
	{
		this.value = value;
	}

	public void setQuality(int quality)
	{
		this.quality = quality;
	}
}