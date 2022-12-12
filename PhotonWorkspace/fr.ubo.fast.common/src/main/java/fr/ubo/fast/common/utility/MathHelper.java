package fr.ubo.fast.common.utility;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.Stream;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.stream.Collectors;

import org.apache.commons.math3.util.CombinatoricsUtils;

import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;

public class MathHelper
{	
	public static ArrayList<ArrayList<ArrayList<Long>>> splitIntoTwoGroups(ArrayList<Long> values, int size_first_group)
	{
		ArrayList<ArrayList<ArrayList<Long>>> result = new ArrayList<ArrayList<ArrayList<Long>>>();
		
		if (values.size() >= size_first_group)
		{
			if (values.size() == 2 * size_first_group)
			{
				Long first_element = values.get(0);
				// Long first_element = values.remove(0);
				for (ArrayList<ArrayList<Long>> item_list : splitIntoTwoGroups(new ArrayList<Long>(values.subList(1, values.size())), size_first_group - 1))
				// for (ArrayList<ArrayList<Long>> item_list : splitIntoTwoGroups(values, size_first_group - 1))
				{
					ArrayList<ArrayList<Long>> item = new ArrayList<ArrayList<Long>>();
					ArrayList<Long> first_group = item_list.get(0);
					ArrayList<Long> second_group = item_list.get(1);
					first_group.add(0, first_element);
					item.add(first_group);
					item.add(second_group);
					result.add(item);
				}
			}
			else
			{
				Iterator<int[]> iterator = CombinatoricsUtils.combinationsIterator(values.size(), size_first_group);
				while (iterator.hasNext())
				{
					ArrayList<ArrayList<Long>> item = new ArrayList<ArrayList<Long>>();
					ArrayList<Long> first_group = new ArrayList<Long>();
					ArrayList<Long> second_group = new ArrayList<Long>();
					int[] combination = iterator.next();
					HashSet<Integer> combination_set = new HashSet<Integer>(Arrays.stream(combination).boxed().collect(Collectors.toList()));
					ListIterator<Long> list_iterator = values.listIterator();
					while (list_iterator.hasNext())
					{
						int index = list_iterator.nextIndex();
						Long value = list_iterator.next();
						
						if (combination_set.contains(index))
						{
							first_group.add(value);
						}
						else
						{
							second_group.add(value);
						}
					}
					item.add(first_group);
					item.add(second_group);
					result.add(item);
				}
			}
		}
		
		return result;
	}
	
	public static ArrayList<ArrayList<ArrayList<Long>>> generatePartitionsSameSize(ArrayList<Long> values, int number_partitions, int size_partition)
	{
		ArrayList<ArrayList<ArrayList<Long>>> result = new ArrayList<ArrayList<ArrayList<Long>>>();

		if (values.size() == number_partitions * size_partition)
		{
			if ((number_partitions == 0) && (values.size() == 0))
			{
				ArrayList<ArrayList<Long>> item = new ArrayList<ArrayList<Long>>();
				result.add(item);
			}
			else if (size_partition == 1)
			{
				ArrayList<ArrayList<Long>> item = new ArrayList<ArrayList<Long>>();
				for (Long value : values)
				{
					ArrayList<Long> element = new ArrayList<Long>();
					element.add(value);
					item.add(element);
				}
				result.add(item);
			}
			else
			{
				Long first_element = values.get(0);
				// Long first_element = values.remove(0);
				for (ArrayList<ArrayList<Long>> split_list : splitIntoTwoGroups(new ArrayList<Long>(values.subList(1, values.size())), size_partition - 1))
				// for (ArrayList<ArrayList<Long>> split_list : splitIntoTwoGroups(values, size_partition - 1))
				{
					ArrayList<Long> split_first_group = split_list.get(0);
					ArrayList<Long> split_second_group = split_list.get(1);
					split_first_group.add(0, first_element);
					for (ArrayList<ArrayList<Long>> item_remaining_groups : generatePartitionsSameSize(split_second_group, number_partitions - 1, size_partition))
					{
						ArrayList<ArrayList<Long>> item = new ArrayList<ArrayList<Long>>();
						item.add(split_first_group);
						for (ArrayList<Long> group : item_remaining_groups)
						{
							item.add(group);
						}
						result.add(item);
					}
				}
			}
		}
		
		return result;
	}
	
	public static ArrayList<ArrayList<ArrayList<Long>>> generatePartitionsFromPattern(ArrayList<Long> values, HashMultiset<Integer> partition_pattern)
	{
		ArrayList<ArrayList<ArrayList<Long>>> result = new ArrayList<ArrayList<ArrayList<Long>>>();
		HashMultiset<Integer> sub_partition_pattern = HashMultiset.create();
		int sum = 0, i = 0, first_group_size = 0, first_group_number = 0;
		
		if ((values.size() == 0) && (partition_pattern.size() == 0))
		{
			ArrayList<ArrayList<Long>> item = new ArrayList<ArrayList<Long>>();
			result.add(item);
		}
		else
		{
			for (Multiset.Entry<Integer> entry : partition_pattern.entrySet())
			{
				sum += entry.getElement() * entry.getCount();
				
				if (i == 0)
				{
					first_group_size = entry.getElement();
					first_group_number = entry.getCount();
				}
				else
				{
					sub_partition_pattern.add(entry.getElement(), entry.getCount());
				}
				
				i += 1;
			}
			
			if (sum == values.size())
			{
				for (ArrayList<ArrayList<Long>> split_list : splitIntoTwoGroups(values, first_group_size * first_group_number))
				{
					ArrayList<Long> split_first_group = split_list.get(0);
					ArrayList<Long> split_second_group = split_list.get(1);
					for (ArrayList<ArrayList<Long>> first_partitions : generatePartitionsSameSize(split_first_group, first_group_number, first_group_size))
					{
						for (ArrayList<ArrayList<Long>> second_partitions : generatePartitionsFromPattern(split_second_group, sub_partition_pattern))
						{
							ArrayList<ArrayList<Long>> item = new ArrayList<ArrayList<Long>>();
							for (ArrayList<Long> group : first_partitions)
							{
								item.add(group);
							}
							for (ArrayList<Long> group : second_partitions)
							{
								item.add(group);
							}
							result.add(item);
						}
					}
				}
			}
			
		}
		
		return result;
	}
	
	public static ArrayList<ArrayList<ArrayList<Long>>> generateAllPossiblePartitions(ArrayList<Long> values)
	{
		ArrayList<ArrayList<ArrayList<Long>>> result = new ArrayList<ArrayList<ArrayList<Long>>>();

		for (ArrayList<Integer> partition : getIntegerPartitions(values.size(), 1))
		{
			HashMultiset<Integer> partition_set = HashMultiset.create(partition);
			ArrayList<ArrayList<ArrayList<Long>>> partition_groups = generatePartitionsFromPattern(values, partition_set);
			for (ArrayList<ArrayList<Long>> item : partition_groups)
			{
				result.add(item);
			}
		}
		
		return result;
	}
	
	public static ArrayList<ArrayList<Integer>> getIntegerPartitions(int value, int minimum)
	{
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		
		ArrayList<Integer> item = new ArrayList<Integer>();
		item.add(value);
		result.add(item);
		
		for (int i = minimum; i < ((int) (value / 2) + 1); i++)
		{
			for (ArrayList<Integer> partition : getIntegerPartitions(value - i, i))
			{
				partition.add(0, i);
				result.add(partition);
			}
		}
		
		return result;
	}
	
	public static long greatestCommonDivisor(long value_1, long value_2)
	{
		if (value_1 == 0)
		{
			return value_2;
		}
		else
		{
			return greatestCommonDivisor(value_2 % value_1, value_1);
		}
	}
	
	public static double greatestCommonDivisor(double value_1, double value_2)
	{
		// To do : Not the best way to convert a double to a BigDecimal
		// Consider replacing doubles by BigDecimals later
		int scale_value_1 = BigDecimal.valueOf(value_1).scale();
		int scale_value_2 = BigDecimal.valueOf(value_2).scale();
		scale_value_1 = scale_value_1 > 0 ? scale_value_1 : 0;
		scale_value_2 = scale_value_2 > 0 ? scale_value_2 : 0;
		int max_scale = Math.max(scale_value_1, scale_value_2);
		
		return greatestCommonDivisor((long) (value_1 * Math.pow(10, max_scale)), (long) (value_2 * Math.pow(10, max_scale))) / (double) Math.pow(10, max_scale);
	}
	
	public static long greatestCommonDivisor(long[] values)
	{
		long result = values[0];
		
		for (int i = 1; i < values.length; i++)
		{
			result = greatestCommonDivisor(values[i], result);
			
			if (result == 1)
			{
				return result;
			}
		}
		
		return result;
	}
	
	public static ArrayList<Long> commonDivisors(long value_1, long value_2)
	{
		ArrayList<Long> common_divisors = new ArrayList<Long>();
		long greatest_common_divisor = MathHelper.greatestCommonDivisor(value_1, value_2);
		
		for (long i = 1; i <= Math.sqrt(greatest_common_divisor); i++)
		{
			if (greatest_common_divisor % i == 0)
			{
				if (!common_divisors.contains(i))
				{
					common_divisors.add(i);
				}
				
				if (greatest_common_divisor / i != i)
				{
					if (!common_divisors.contains(greatest_common_divisor / i))
					{
						common_divisors.add(greatest_common_divisor / i);
					}
				}
			}
		}
		
		return common_divisors;
	}
	
	public static double mean(double[] values)
	{
		double mean = 0.0;
		
		for (int i = 0; i < values.length; i++)
		{
			mean = mean + values[i];
		}
		
		mean = mean / values.length;
		
		return mean;
	}
	
	public static double variance(double[] values)
	{
		double variance = 0.0;
		double mean = MathHelper.mean(values);

		for (int i = 0; i < values.length; i++)
		{
			variance = variance + Math.pow(values[i] - mean, 2);
		}
		
		variance = variance / (values.length - 1);
		
		return variance;
	}
	
	public static double standardDeviation(double[] values)
	{
		double standard_deviation = 0.0;
		double variance = MathHelper.variance(values);
		
		standard_deviation = Math.sqrt(variance);
		
		return standard_deviation;
	}

	public static double[] generateSequenceOfDoubles(double start_value, double end_value, double step_value)
	{
		if (step_value > 0)
		{
			int sequence_size = (int) (1 + (end_value - start_value) / step_value);
			BigDecimal start = new BigDecimal(start_value);
			BigDecimal step = new BigDecimal(step_value);
			return Stream.iterate(start, number -> number.add(step).setScale(5, RoundingMode.HALF_DOWN))
						 .limit(sequence_size).mapToDouble(BigDecimal::doubleValue).toArray();
		}
		else
		{
			return new double[0];
		}
	}

	public static double convertBytesToGibiBytes(long bytes)
	{
		if (bytes > 0)
		{
			return ((double) bytes / (1024 * 1024 * 1024));
		}
		else
		{
			return 0;
		}
	}
}