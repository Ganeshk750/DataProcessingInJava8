package com.ganesh.comparable;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingWithComparable {
	
	public static void main(String[] args) {
		
		System.out.println("============Java Sort List of Objects with Comparable=============");
		
		List<MyDate> myDates = Arrays.asList(
		        new MyDate(2010, 4, 3), 
		        new MyDate(2006, 5, 16), 
		        new MyDate(2007, 6, 29));
		
		Collections.sort(myDates);
		System.out.println(myDates);
		//[MyDate [year=2006, month=5, day=16], MyDate [year=2007, month=6, day=29], MyDate [year=2010, month=4, day=3]]
		System.out.println("========================");
		 myDates.forEach(System.out::println);
		
	}

}
