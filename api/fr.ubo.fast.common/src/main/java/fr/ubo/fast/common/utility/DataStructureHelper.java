package fr.ubo.fast.common.utility;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Properties;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import fr.ubo.fast.common.model.AggregatedObservationRecord;
import fr.ubo.fast.common.model.RawObservationRecord;
import fr.ubo.fast.common.model.TimeSeries;

public class DataStructureHelper
{
	private static final String date_time_format = "yyyy-MM-dd'T'HH:mm[:ss][xxx][xx][X][.SSSSxxx][.SSSSxx][.SSSSX]";

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
				result = (ArrayList<String>) walk.filter(path -> !Files.isDirectory(path)).map(path -> path.toString())
						.filter(file -> file.endsWith(file_name_pattern)).collect(Collectors.toList());
			}
			catch (IOException exception)
			{
				exception.printStackTrace();
			}
		}

		return result;
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
		catch (IOException exception)
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

	public static String convertMapToJsonString(TreeMap<OffsetDateTime, AggregatedObservationRecord> map)
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
			for (Map.Entry<OffsetDateTime, AggregatedObservationRecord> entry : map.entrySet())
			{
				json_generator.writeStartObject();
				json_generator.writeStringField("timestamp", entry.getKey().toString());
				json_generator.writeFieldName("data");
				mapper.writeValue(json_generator, entry.getValue());
				json_generator.writeEndObject();
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

	public static void convertMapToCsv(Path csv_file, HashMap<Integer, String[]> data)
	{
		try (BufferedWriter buffer = Files.newBufferedWriter(csv_file, Charset.defaultCharset(),
				StandardOpenOption.APPEND))
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
	
	public static List<RawObservationRecord> parseSingleTimeSeriesCsv(File csv_file) throws FileNotFoundException
	{
		List<RawObservationRecord> rows = new ArrayList<>();
		OffsetDateTime date_time = null;
		double value = 0.0;
		int quality = 0;

		try (Scanner scanner = new Scanner(csv_file))
		{
			boolean header_skipped = false;
			while (scanner.hasNextLine())
			{
				String line = scanner.nextLine().trim();
				if (line.isEmpty())
				{
					continue;
				}

				String[] parts = line.split(",");

				if (!header_skipped)
				{
					header_skipped = true;
					continue;
				}
				if (parts.length < 3)
				{
					continue;
				}

				try
				{
					date_time = OffsetDateTime.parse(parts[0]);
				}
				catch (DateTimeParseException exception)
				{
					exception.printStackTrace();
					continue;
				}

				try
				{
					value = Double.parseDouble(parts[1]);
				}
				catch (NumberFormatException exception)
				{
					exception.printStackTrace();
					continue;
				}

				try
				{
					quality = Integer.parseInt(parts[2]);
				}
				catch (NumberFormatException exception)
				{
					exception.printStackTrace();
					continue;
				}

				rows.add(new RawObservationRecord(date_time, value, quality));
			}
		}

		return rows;
	}

	public static File addColumnToCsv(File original_csv, int time_series_id) throws IOException
	{
		File temporary_csv = File.createTempFile("observations_with_time_series_id_" + time_series_id, ".csv");
		temporary_csv.deleteOnExit();

		try (BufferedReader buffered_reader = new BufferedReader(
				new InputStreamReader(new FileInputStream(original_csv)));
				PrintWriter print_writer = new PrintWriter(new OutputStreamWriter(new FileOutputStream(temporary_csv))))
		{

			String line = "";
			boolean is_header = true;

			while ((line = buffered_reader.readLine()) != null)
			{
				if (line.trim().isEmpty())
				{
					continue;
				}
				if (is_header)
				{
					print_writer.println(line + ",time_series_id");
					is_header = false;
				}
				else
				{
					print_writer.println(line + "," + time_series_id);
				}
			}
		}

		return temporary_csv;
	}

	/**
	 * Check if the given date complies with the supported date format.
	 * 
	 * @param date_input Input date.
	 * @return An optional OffsetDateTime of the given date.
	 */
	public static Optional<OffsetDateTime> checkDateFormat(String date_input)
	{
		DateTimeFormatter date_time_formatter = DateTimeFormatter.ofPattern(date_time_format);

		try
		{
			OffsetDateTime parsed_date = OffsetDateTime.parse(date_input, date_time_formatter);

			return Optional.of(parsed_date);
		}
		catch (DateTimeParseException exception)
		{
			exception.printStackTrace();

			return Optional.empty();
		}
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
	
	public static String convertChronoUnitToString(ChronoUnit unit)
	{
		switch (unit)
		{
			case MILLIS:
			{
				return "Millisecond";
			}
			case SECONDS:
			{
				return "Second";
			}
			case MINUTES:
			{
				return "Minute";
			}
			case HOURS:
			{
				return "Hour";
			}
			case DAYS:
			{
				return "Day";
			}
			case MONTHS:
			{
				return "Month";
			}
			case YEARS:
			{
				return "Year";
			}
			default:
			{
				return "";
			}
		}
	}
}