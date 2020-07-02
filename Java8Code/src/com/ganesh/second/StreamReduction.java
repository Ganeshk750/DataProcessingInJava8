package com.ganesh.second;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;

/*average, sum, min, max, and count.
 * Apply Stream Reduction on Java List, Array*/
public class StreamReduce {
	
	public static void main(String[] args) {
		
		
		System.out.println("========== TO Find Sum Of All ============");
		List<Integer> intList = Arrays.asList(1, 3, 5, 2, 9, 8, 15, 12);
		int total = intList.stream().mapToInt(ele -> ele).sum();
		System.out.println(total);
		
		System.out.println("===========To get average value of an Integer List==============");
		OptionalDouble avg = intList.stream().mapToInt(ele -> ele).average();
		avg.ifPresent(System.out::println);
		
		System.out.println("=============To Get Min Value =====================");
		OptionalInt minValue = intList.stream().mapToInt(ele -> ele).min();
		minValue.ifPresent(System.out::println);
		
		System.out.println("=============To Get Max Value =====================");
		OptionalInt maxValue = intList.stream().mapToInt(ele -> ele).max();
		maxValue.ifPresent(System.out::println);
		
		System.out.println("=============To Get Count of Value in List =====================");
		int cValue = (int) intList.stream().mapToInt(ele -> ele).count();
		System.out.println(cValue);
		


	}

}
