package com.ganesh.filter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamStringListFilter {
	
	public static void main(String[] args) {
		
		System.out.println("============StringList Filter Using stream==================");
		
		List<String> strList = Arrays.asList("Java", "Python", "Java Stream", "Java Tutorial", "Nodejs Tutorial");
		
		List<String> opStr = strList.stream().filter(str -> str.contains("Java"))
				                             .map(String::toUpperCase)
				                             .collect(Collectors.toList());
		
		System.out.println(opStr);//[JAVA, JAVA STREAM, JAVA TUTORIAL]
	}

}
