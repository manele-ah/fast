package fr.ubo.fast.common.converter;

import javax.ws.rs.ext.ParamConverter;
import javax.ws.rs.ext.ParamConverterProvider;
import javax.ws.rs.ext.Provider;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import fr.ubo.fast.common.model.Scale;

@Provider
public class ScaleParameterConverter implements ParamConverterProvider
{
	@Override
	public <T> ParamConverter<T> getConverter(Class<T> raw_type, Type generic_type, Annotation[] annotations)
	{
		if (raw_type.equals(Scale.class))
		{
			return new ParamConverter<T>()
			{
				@Override
				public T fromString(String value)
				{
					if (value == null || value.trim().isEmpty())
					{
						return null;
					}
					
					// Comma-separated list of ISO-8601 durations
					String[] parts = value.split(",");
					Scale scale = new Scale() {};
					List<Duration> durations = new ArrayList<Duration>();
					for (String part : parts)
					{
						try
						{
							Duration duration = Duration.parse(part.trim());
							durations.add(duration);
							// scale.getValues().add(Duration.ofSeconds(seconds));
						}
						catch (Exception  exception)
						{
							throw new IllegalArgumentException("Invalid duration format");
						}
					}
					
					scale.setValues(durations);
					
					return raw_type.cast(scale);
				}

				@Override
				public String toString(T value)
				{
					if (value == null)
					{
						return "";
					}
					
					Scale scale = (Scale) value;
					List<String> parts = new ArrayList<>();
					for (Duration duration : scale.getValues())
					{
						parts.add(duration.toString());
					}
					
					return String.join(",", parts);
				}
			};
		}
		
		return null;
	}
}
