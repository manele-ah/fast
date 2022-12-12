package fr.ubo.fast.common.utility;

import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.time.Duration;
import java.time.OffsetDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import fr.ubo.fast.common.model.TimeSeries;

public class DataStructureHelper
{
	public static void setProperties(File properties_file, Map<String, String> properties_map)
	{
		try
		{
			OutputStream output = new FileOutputStream(properties_file);
			Properties properties = new Properties();
			
			for (Map.Entry<String, String> entry : properties_map.entrySet())
			{
				properties.setProperty(entry.getKey(), entry.getValue());
			}

			properties.store(output, null);
			output.close();
		}
		catch (FileNotFoundException exception)
		{
			exception.printStackTrace();
		}
		catch (IOException exception)
		{
			exception.printStackTrace();
		}
	}
	
	public static Properties getProperties(File... properties_files)
	{
		Properties properties = new Properties();
		
		if (properties_files.length > 0)
		{
			for (File file : properties_files)
			{
				try
				{
					InputStream input = new FileInputStream(file);
					Properties temporary_properties = new Properties();
					
					temporary_properties.load(input);
					if (temporary_properties != null)
					{
						properties.putAll(temporary_properties);
					}
					
					input.close();
				}
				catch (FileNotFoundException exception)
				{
					exception.printStackTrace();
				}
				catch (IOException exception)
				{
					exception.printStackTrace();
				}
			}
		}
		
		return properties;
	}
	
	public static void serializeTimeSeries(File file, TimeSeries object)
	{
		try
        {   
            OutputStream file_output = new FileOutputStream(file);
            ObjectOutputStream object_output = new ObjectOutputStream(file_output);
              
            object_output.writeObject(object);
              
            object_output.close();
            file_output.close();  
        }
		catch (FileNotFoundException exception)
		{
			exception.printStackTrace();
		}
        catch(IOException exception)
        {
        	exception.printStackTrace();
        }
	}
	
	public static TimeSeries deserializeTimeSeries(File file)
	{
		TimeSeries time_series_data = null;
		
		try
		{
			FileInputStream file_input = new FileInputStream(file);
			ObjectInputStream object_input = new ObjectInputStream(file_input);

			time_series_data = (TimeSeries) object_input.readObject();

			object_input.close();
			file_input.close();
		}
		catch (IOException exception)
		{
			exception.printStackTrace();
		}
		catch (ClassNotFoundException exception)
		{
			exception.printStackTrace();
		}
		
		return time_series_data;
	}
	
	public static String convertDurationToString(Duration duration)
	{
		String result = "";
		
		return result;
	}
	
	public static String convertTimeSeriesDataToJsonString(TimeSeries time_series_data)
	{
		String result = "";
		ObjectMapper mapper = new ObjectMapper();
		ByteArrayOutputStream output_stream = new ByteArrayOutputStream();
		
		mapper.registerModule(new JavaTimeModule());
		mapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
		mapper.disable(DeserializationFeature.ADJUST_DATES_TO_CONTEXT_TIME_ZONE);
		
		try (JsonGenerator json_generator = mapper.getFactory().createGenerator(output_stream))
		{
			mapper.writeValue(json_generator, time_series_data);
		}
		catch (IOException exception)
		{
			exception.printStackTrace();
		}
		
		result = output_stream.toString();
				
		return result;
	}
	
	public static String convertMapToJsonString(TreeMap<OffsetDateTime, Double[]> map)
	{
		String result = "";
		ObjectMapper mapper = new ObjectMapper();
		ByteArrayOutputStream output_stream = new ByteArrayOutputStream();
		
		mapper.registerModule(new JavaTimeModule());
		mapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
		mapper.disable(DeserializationFeature.ADJUST_DATES_TO_CONTEXT_TIME_ZONE);

		try (JsonGenerator json_generator = mapper.getFactory().createGenerator(output_stream))
		{
			json_generator.writeStartArray();
			for (Map.Entry<OffsetDateTime, Double[]> entry : map.entrySet())
			{
				mapper.writeValue(json_generator, entry);
			}
			json_generator.writeEndArray();
		}
		catch (IOException exception)
		{
			exception.printStackTrace();
		}
		
		result = output_stream.toString();

		return result;
	}
	
	public static ByteArrayOutputStream convertMapToJsonBytes(TreeMap<OffsetDateTime, Double> map)
	{
		ByteArrayOutputStream output_byte_stream = new ByteArrayOutputStream();
		ObjectMapper mapper = new ObjectMapper();
		
		mapper.registerModule(new JavaTimeModule());
		
		try (JsonGenerator json_generator = mapper.getFactory().createGenerator(output_byte_stream))
		{
			json_generator.writeStartArray();
			for (Map.Entry<OffsetDateTime, Double> entry : map.entrySet())
			{
				mapper.writeValue(json_generator, entry);
			}
			json_generator.writeEndArray();
		}
		catch (IOException exception)
		{
			exception.printStackTrace();
		}
		
		return output_byte_stream;
	}
	
	public static void convertMapToCsv(Path csv_file, HashMap<Integer, String[]> data)
	{
		try (BufferedWriter buffer = Files.newBufferedWriter(csv_file, Charset.defaultCharset(),StandardOpenOption.APPEND))
		{
			buffer.newLine();
			for (Map.Entry<Integer, String[]> entry : data.entrySet())
			{
				String line = String.valueOf(entry.getKey()) + "," + String.join(",", entry.getValue());
				buffer.append(line);
				buffer.newLine();
			}
		}
		catch (IOException exception)
		{
			exception.printStackTrace();
		}
	}
	
	public static HashMap<String, String> convertPropertiesToMap(Properties properties)
	{
		HashMap<String, String> result = new HashMap<>();
		
		for (Map.Entry<Object, Object> entry : properties.entrySet())
		{
			result.put(String.valueOf(entry.getKey()), String.valueOf(entry.getValue()));
		}
		
		return result;
	}
	
	public static ArrayList<String> findFiles(Path folder, String file_name_pattern)
	{
		ArrayList<String> result = new ArrayList<String>();
		
		if (Files.isDirectory(folder))
		{
			try (Stream<Path> walk = Files.walk(folder))
			{
				result = (ArrayList<String>) walk
						.filter(path -> !Files.isDirectory(path))
						.map(path -> path.toString()).
						filter(file -> file.endsWith(file_name_pattern))
						.collect(Collectors.toList());
			}
			catch (IOException exception)
			{
				exception.printStackTrace();
			}
		}

		return result;
	}
	
	public static ChronoUnit convertStringToChronoUnit(String unit)
	{	
		if (unit.compareTo("Millisecond") == 0)
		{
			return ChronoUnit.MILLIS;
		}
		else if (unit.compareTo("Second") == 0)
		{
			return ChronoUnit.SECONDS;
		}
		else if (unit.compareTo("Minute") == 0)
		{
			return ChronoUnit.MINUTES;
		}
		else if (unit.compareTo("Hour") == 0)
		{
			return ChronoUnit.HOURS;
		}
		else if (unit.compareTo("Day") == 0)
		{
			return ChronoUnit.DAYS;
		}
		else if (unit.compareTo("Month") == 0)
		{
			return ChronoUnit.MONTHS;
		}
		else if (unit.compareTo("Year") == 0)
		{
			return ChronoUnit.YEARS;
		}
		else
		{
			return null;
		}
	}
}