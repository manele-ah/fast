package fr.ubo.fast.common.model;

import java.io.File;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Properties;
import java.util.TreeMap;

import fr.ubo.fast.common.constant.PerformanceProfileProperties;
import fr.ubo.fast.common.utility.DataStructureHelper;

public class PerformanceProfile
{
	private String time_series_name;
	private int values_number;
	private Scale scale;
	private double user_time;
	private double ping_time;
	private double raw_data_threshold;
	private double pre_computed_data_threshold;
	private TreeMap<Long, Long> intervals = new TreeMap<Long, Long>();
	
	public PerformanceProfile(String time_series_name, int values_number, Scale scale, double user_time, double ping_time, double raw_data_threshold, double pre_computed_data_threshold)
	{
		this.time_series_name = time_series_name;
		this.values_number = values_number;
		this.scale = scale;
		this.user_time = user_time;
		this.ping_time = ping_time;
		this.raw_data_threshold = raw_data_threshold;
		this.pre_computed_data_threshold = pre_computed_data_threshold;
	}
	
	public PerformanceProfile(File... properties_files)
	{
		Properties properties = DataStructureHelper.getProperties(properties_files);
		String scale_type = "";
		
		try
		{
			time_series_name = properties.getProperty(PerformanceProfileProperties.TIME_SERIES_NAME.toString());
			values_number = Integer.parseInt(properties.getProperty(PerformanceProfileProperties.VALUES_NUMBER.toString()));
			scale_type = properties.getProperty(PerformanceProfileProperties.SCALE_TYPE.toString());
			
			if (scale_type.equals("FactorScale"))
			{
				int scale_factor = Integer.parseInt(properties.getProperty(PerformanceProfileProperties.SCALE_FACTOR.toString()));
				int scale_zooms_number = Integer.parseInt(properties.getProperty(PerformanceProfileProperties.SCALE_ZOOMS_NUMBER.toString()));
				scale = new FactorScale(scale_factor, scale_zooms_number);
			}
			else if (scale_type.equals("CalendarScale"))
			{
				String[] scale_factors = properties.getProperty(PerformanceProfileProperties.SCALE_FACTORS.toString()).split(",");
				String[] scale_periods = properties.getProperty(PerformanceProfileProperties.SCALE_PERIODS.toString()).split(",");
				long[] factors = Arrays.stream(scale_factors).mapToLong(Long::parseLong).toArray();
				ChronoUnit[] periods = new ChronoUnit[scale_periods.length];
				for (int i = 0; i < scale_periods.length; i++)
				{
					if (DataStructureHelper.convertStringToChronoUnit(scale_periods[i]) != null)
					{
						periods[i] = DataStructureHelper.convertStringToChronoUnit(scale_periods[i]);
					}
					
				}
				scale = new CalendarScale(periods, factors);
			}
			
			user_time = Double.parseDouble(properties.getProperty(PerformanceProfileProperties.USER_TIME.toString()));
			ping_time = Double.parseDouble(properties.getProperty(PerformanceProfileProperties.PING_TIME.toString()));
			raw_data_threshold = Double.parseDouble(properties.getProperty(PerformanceProfileProperties.RAW_DATA_THRESHOLD.toString()));
			pre_computed_data_threshold = Double.parseDouble(properties.getProperty(PerformanceProfileProperties.PRE_COMPUTED_DATA_THRESHOLD.toString()));
		}
		catch (NumberFormatException exception)
		{
			exception.printStackTrace();
		}
	}

	public String getTimeSeriesName()
	{
		return time_series_name;
	}

	public void setTimeSeriesName(String time_series_name)
	{
		this.time_series_name = time_series_name;
	}

	public int getValuesNumber()
	{
		return values_number;
	}

	public void setValuesNumber(int values_number)
	{
		this.values_number = values_number;
	}

	public Scale getScale()
	{
		return scale;
	}

	public void setScale(Scale scale)
	{
		this.scale = scale;
	}

	public double getUserTime()
	{
		return user_time;
	}

	public void setUserTime(double user_time)
	{
		this.user_time = user_time;
	}

	public double getPingTime()
	{
		return ping_time;
	}

	public void setPingTime(double ping_time)
	{
		this.ping_time = ping_time;
	}

	public double getRawDataThreshold()
	{
		return raw_data_threshold;
	}

	public void setRawDataThreshold(double raw_data_threshold)
	{
		this.raw_data_threshold = raw_data_threshold;
	}

	public double getPreComputedDataThreshold()
	{
		return pre_computed_data_threshold;
	}

	public void setPreComputedDataThreshold(double pre_computed_data_threshold)
	{
		this.pre_computed_data_threshold = pre_computed_data_threshold;
	}

	public TreeMap<Long, Long> getIntervals()
	{
		return intervals;
	}

	public void setIntervals(TreeMap<Long, Long> intervals)
	{
		this.intervals = intervals;
	}
	
	public void setIntervalsFromFile(File properties_file)
	{
		Properties properties = DataStructureHelper.getProperties(properties_file);
		HashMap<String, String> string_intervals = DataStructureHelper.convertPropertiesToMap(properties);
		TreeMap<Long, Long> intervals = new TreeMap<Long, Long>();
		try
		{
			string_intervals.forEach((key, value) -> intervals.put(Long.parseLong(key), Long.parseLong(value)));
			this.intervals = intervals;
		}
		catch (NumberFormatException exception)
		{
			exception.printStackTrace();
		}
	}
}