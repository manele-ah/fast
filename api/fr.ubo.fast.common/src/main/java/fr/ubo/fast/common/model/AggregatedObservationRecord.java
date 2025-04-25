package fr.ubo.fast.common.model;

import java.io.Serializable;

public class AggregatedObservationRecord implements Serializable
{
	private Double raw;
	private Double min;
	private Double max;
	private Double average;
	private Double median;
	private Double first_quartile;
	private Double last_quartile;
	private Integer values_number;
	private Integer quality;
	private Integer min_quality;
	private Integer max_quality;
	
	private static final long serialVersionUID = 8700597378375515931L;
	
	public AggregatedObservationRecord()
	{
		
	}
	
	public AggregatedObservationRecord(Double raw, Double min, Double max, Double average, Double median, Double first_quartile, Double last_quartile, Integer values_number, Integer quality, Integer min_quality, Integer max_quality)
	{
		this.raw = raw;
		this.min = min;
		this.max = max;
		this.average = average;
		this.median = median;
		this.first_quartile = first_quartile;
		this.last_quartile = last_quartile;
		this.values_number = values_number;
		this.quality = quality;
		this.min_quality = min_quality;
		this.max_quality = max_quality;
	}

	public Double getRaw()
	{
		return raw;
	}

	public Double getMin()
	{
		return min;
	}

	public Double getMax()
	{
		return max;
	}

	public Double getAverage()
	{
		return average;
	}

	public Double getMedian()
	{
		return median;
	}

	public Double getFirstQuartile()
	{
		return first_quartile;
	}

	public Double getLastQuartile()
	{
		return last_quartile;
	}
	
	public Integer getValuesNumber()
	{
		return values_number;
	}

	public Integer getQuality()
	{
		return quality;
	}
	
	public Integer getMinQuality()
	{
		return min_quality;
	}
	
	public Integer getMaxQuality()
	{
		return max_quality;
	}

	public void setRaw(Double raw)
	{
		this.raw = raw;
	}

	public void setMin(Double min)
	{
		this.min = min;
	}

	public void setMax(Double max)
	{
		this.max = max;
	}

	public void setAverage(Double average)
	{
		this.average = average;
	}

	public void setMedian(Double median)
	{
		this.median = median;
	}

	public void setFirstQuartile(Double first_quartile)
	{
		this.first_quartile = first_quartile;
	}

	public void setLastQuartile(Double last_quartile)
	{
		this.last_quartile = last_quartile;
	}
	
	public void setValuesNumber(Integer values_number)
	{
		this.values_number = values_number;
	}

	public void setQuality(Integer quality)
	{
		this.quality = quality;
	}
	
	public void setMinQuality(Integer min_quality)
	{
		this.min_quality = min_quality;
	}
	
	public void setMaxQuality(Integer max_quality)
	{
		this.max_quality = max_quality;
	}
}
