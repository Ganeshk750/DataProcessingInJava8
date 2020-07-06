package com.ganesh.map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EampleTwoUsingMap {
	
	public static void main(String[] args) {
		
      System.out.println("========Here We Are Transform a String List Using Map==========");
		
		List<String> strList = Arrays.asList("one", "two", "three", "four", "ganesh");
		
		List<String> list = strList.stream().map(str -> str.toUpperCase())
				                            .collect(Collectors.toList());
		
		System.out.println(list);
		
		
		
	}

}
