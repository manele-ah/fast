package fr.ubo.fast.common.converter;

import javax.ws.rs.ext.ParamConverter;
import javax.ws.rs.ext.ParamConverterProvider;
import javax.ws.rs.ext.Provider;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.time.OffsetDateTime;
import java.util.Optional;

import fr.ubo.fast.common.utility.DataStructureHelper;

@Provider
public class OffsetDateTimeParameterConverter implements ParamConverterProvider
{
	@Override
	public <T> ParamConverter<T> getConverter(Class<T> raw_type, Type generic_type, Annotation[] annotations)
	{
		if (raw_type.equals(OffsetDateTime.class))
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
					
					Optional<OffsetDateTime> date = DataStructureHelper.checkDateFormat(value);
					if (!date.isPresent())
					{
						throw new IllegalArgumentException("Invalid date format");
					}
					
                    return raw_type.cast(date.get());
				}

				@Override
				public String toString(T value)
				{
					if (value == null)
					{
						return "";
					}
					
					return ((OffsetDateTime) value).toString();
				}
			};
		}
		
		return null;
	}
}
