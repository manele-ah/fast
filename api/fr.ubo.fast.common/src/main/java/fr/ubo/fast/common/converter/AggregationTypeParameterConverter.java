package fr.ubo.fast.common.converter;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.ext.ParamConverter;
import javax.ws.rs.ext.ParamConverterProvider;
import javax.ws.rs.ext.Provider;

import fr.ubo.fast.common.model.AggregationType;

@Provider
public class AggregationTypeParameterConverter implements ParamConverterProvider
{
	@Override
	public <T> ParamConverter<T> getConverter(Class<T> raw_type, Type generic_type, Annotation[] annotations)
	{
		if (List.class.equals(raw_type) && generic_type instanceof ParameterizedType)
		{
			ParameterizedType parameterized_type = (ParameterizedType) generic_type;

			if (parameterized_type.getActualTypeArguments().length == 1 && parameterized_type.getActualTypeArguments()[0].equals(AggregationType.class))
			{
				return new ParamConverter<T>()
				{
					@Override
					public T fromString(String value)
					{
						List<AggregationType> list = new ArrayList<>();
						if (value == null || value.trim().isEmpty())
						{
							return raw_type.cast(list);
						}

						// Comma-separated list of aggregations
						String[] parts = value.split(",");
						for (String part : parts)
						{
							try
							{
								AggregationType type = AggregationType.valueOf(part.trim().toUpperCase());
								list.add(type);
							}
							catch (IllegalArgumentException exception)
							{
								throw new IllegalArgumentException("Invalid aggregation type");
							}
						}
						return raw_type.cast(list);
					}

					@Override
					public String toString(T value)
					{
						if (value == null)
						{
							return "";
						}
						
						List<?> list = (List<?>) value;
						List<String> string_list = new ArrayList<>();
						for (Object object : list)
						{
							string_list.add(object.toString());
						}
						
						return String.join(",", string_list);
					}
				};
			}
		}

		return null;
	}
}