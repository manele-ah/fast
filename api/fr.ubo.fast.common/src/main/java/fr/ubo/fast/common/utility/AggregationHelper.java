package fr.ubo.fast.common.utility;

import fr.ubo.fast.common.constant.DatabaseSchemaProperties;
import fr.ubo.fast.common.model.AggregationClause;
import fr.ubo.fast.common.model.AggregationType;

public class AggregationHelper
{
	public static AggregationClause getAggregationClause(AggregationType aggregation, boolean raw)
	{
		switch (aggregation)
		{
		case MIN:
		{
			if (raw)
			{
				String clause = String.format("MIN(%s) AS %s", DatabaseSchemaProperties.RAW_TIME_SERIES_DATA_VALUE_COLUMN.toString(),
						DatabaseSchemaProperties.AGGREGATED_TIME_SERIES_DATA_MIN_COLUMN.toString());
				
				return new AggregationClause(clause,
						new String[] {DatabaseSchemaProperties.AGGREGATED_TIME_SERIES_DATA_MIN_COLUMN.toString()});
			}
			else
			{
				String clause = String.format("MIN(%s) AS %s", DatabaseSchemaProperties.AGGREGATED_TIME_SERIES_DATA_MIN_COLUMN.toString(),
						DatabaseSchemaProperties.AGGREGATED_TIME_SERIES_DATA_MIN_COLUMN.toString());
				
				return new AggregationClause(clause,
						new String[] {DatabaseSchemaProperties.AGGREGATED_TIME_SERIES_DATA_MIN_COLUMN.toString()});
			}
		}
		case MAX:
		{
			if (raw)
			{
				String clause = String.format("MAX(%s) AS %s", DatabaseSchemaProperties.RAW_TIME_SERIES_DATA_VALUE_COLUMN.toString(),
						DatabaseSchemaProperties.AGGREGATED_TIME_SERIES_DATA_MAX_COLUMN.toString());
				
				return new AggregationClause(clause,
						new String[] {DatabaseSchemaProperties.AGGREGATED_TIME_SERIES_DATA_MAX_COLUMN.toString()});
			}
			else
			{
				String clause = String.format("MAX(%s) AS %s", DatabaseSchemaProperties.AGGREGATED_TIME_SERIES_DATA_MAX_COLUMN.toString(),
						DatabaseSchemaProperties.AGGREGATED_TIME_SERIES_DATA_MAX_COLUMN.toString());
				
				return new AggregationClause(clause,
						new String[] {DatabaseSchemaProperties.AGGREGATED_TIME_SERIES_DATA_MAX_COLUMN.toString()});
			}
		}
		case AVERAGE:
		{
			if (raw)
			{
				String clause = String.format("AVG(%s) AS %s, COUNT(%s) AS %s", DatabaseSchemaProperties.RAW_TIME_SERIES_DATA_VALUE_COLUMN.toString(),
						DatabaseSchemaProperties.AGGREGATED_TIME_SERIES_DATA_AVERAGE_COLUMN.toString(), DatabaseSchemaProperties.RAW_TIME_SERIES_DATA_VALUE_COLUMN.toString(),
						DatabaseSchemaProperties.AGGREGATED_TIME_SERIES_DATA_VALUES_NUMBER_COLUMN.toString());
				
				return new AggregationClause(clause,
						new String[] {DatabaseSchemaProperties.AGGREGATED_TIME_SERIES_DATA_AVERAGE_COLUMN.toString(),
								DatabaseSchemaProperties.AGGREGATED_TIME_SERIES_DATA_VALUES_NUMBER_COLUMN.toString()});
			}
			else
			{
				String clause = String.format("SUM(%s * %s) / SUM(%s) AS %s, SUM(%s) AS %s",
						DatabaseSchemaProperties.AGGREGATED_TIME_SERIES_DATA_AVERAGE_COLUMN.toString(),
						DatabaseSchemaProperties.AGGREGATED_TIME_SERIES_DATA_VALUES_NUMBER_COLUMN.toString(),
						DatabaseSchemaProperties.AGGREGATED_TIME_SERIES_DATA_VALUES_NUMBER_COLUMN.toString(),
						DatabaseSchemaProperties.AGGREGATED_TIME_SERIES_DATA_AVERAGE_COLUMN.toString(),
						DatabaseSchemaProperties.AGGREGATED_TIME_SERIES_DATA_VALUES_NUMBER_COLUMN.toString(),
						DatabaseSchemaProperties.AGGREGATED_TIME_SERIES_DATA_VALUES_NUMBER_COLUMN.toString());
				
				return new AggregationClause(clause,
						new String[] {DatabaseSchemaProperties.AGGREGATED_TIME_SERIES_DATA_AVERAGE_COLUMN.toString(),
								DatabaseSchemaProperties.AGGREGATED_TIME_SERIES_DATA_VALUES_NUMBER_COLUMN.toString()});

			}
		}
		case MEDIAN:
		{
			if (raw)
			{
				String clause = String.format("percentile_cont(0.5) WITHIN GROUP (ORDER BY %s) AS %s", DatabaseSchemaProperties.RAW_TIME_SERIES_DATA_VALUE_COLUMN.toString(),
						DatabaseSchemaProperties.AGGREGATED_TIME_SERIES_DATA_MEDIAN_COLUMN.toString());
				
				return new AggregationClause(clause,
						new String[] {DatabaseSchemaProperties.AGGREGATED_TIME_SERIES_DATA_MEDIAN_COLUMN.toString()});
			}
			else
			{
				String clause = String.format("percentile_cont(0.5) WITHIN GROUP (ORDER BY %s) AS %s", DatabaseSchemaProperties.AGGREGATED_TIME_SERIES_DATA_MEDIAN_COLUMN.toString(),
						DatabaseSchemaProperties.AGGREGATED_TIME_SERIES_DATA_MEDIAN_COLUMN.toString());
				
				return new AggregationClause(clause,
						new String[] {DatabaseSchemaProperties.AGGREGATED_TIME_SERIES_DATA_MEDIAN_COLUMN.toString()});
			}
		}
		case FIRST_QUARTILE:
		{
			if (raw)
			{
				String clause = String.format("percentile_cont(0.25) WITHIN GROUP (ORDER BY %s) AS %s", DatabaseSchemaProperties.RAW_TIME_SERIES_DATA_VALUE_COLUMN.toString(),
						DatabaseSchemaProperties.AGGREGATED_TIME_SERIES_DATA_FIRST_QUARTILE_COLUMN.toString());
				
				return new AggregationClause(clause, new String [] {DatabaseSchemaProperties.AGGREGATED_TIME_SERIES_DATA_FIRST_QUARTILE_COLUMN.toString()});
			}
			else
			{
				String clause = String.format("percentile_cont(0.25) WITHIN GROUP (ORDER BY %s) AS %s", DatabaseSchemaProperties.AGGREGATED_TIME_SERIES_DATA_FIRST_QUARTILE_COLUMN.toString(),
						DatabaseSchemaProperties.AGGREGATED_TIME_SERIES_DATA_FIRST_QUARTILE_COLUMN.toString());
				
				return new AggregationClause(clause, new String [] {DatabaseSchemaProperties.AGGREGATED_TIME_SERIES_DATA_FIRST_QUARTILE_COLUMN.toString()});
			}
		}
		case LAST_QUARTILE:
		{
			if (raw)
			{
				String clause = String.format("percentile_cont(0.75) WITHIN GROUP (ORDER BY %s) AS %s", DatabaseSchemaProperties.RAW_TIME_SERIES_DATA_VALUE_COLUMN.toString(),
						DatabaseSchemaProperties.AGGREGATED_TIME_SERIES_DATA_LAST_QUARTILE_COLUMN.toString());
				
				return new AggregationClause(clause, new String [] {DatabaseSchemaProperties.AGGREGATED_TIME_SERIES_DATA_LAST_QUARTILE_COLUMN.toString()});
			}
			else
			{
				String clause = String.format("percentile_cont(0.75) WITHIN GROUP (ORDER BY %s) AS %s", DatabaseSchemaProperties.AGGREGATED_TIME_SERIES_DATA_LAST_QUARTILE_COLUMN.toString(),
						DatabaseSchemaProperties.AGGREGATED_TIME_SERIES_DATA_LAST_QUARTILE_COLUMN.toString());
				
				return new AggregationClause(clause, new String [] {DatabaseSchemaProperties.AGGREGATED_TIME_SERIES_DATA_LAST_QUARTILE_COLUMN.toString()});
			}
		}
		default:
			throw new IllegalArgumentException("Unexpected aggregation: " + aggregation);
		}
	}
}
