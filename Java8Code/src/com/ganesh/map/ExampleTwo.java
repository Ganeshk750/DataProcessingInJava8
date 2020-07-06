package com.ganesh.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExampleTwo {
	
	public static void main(String[] args) {
		
		System.out.println("========Here We Are Transform a String List==========");
		
		List<String> strList = Arrays.asList("one", "two", "three", "four");
		
		 List<String> newList = new ArrayList<String>();
		    
		    for(String str : strList) {
		      newList.add(str.toUpperCase());
		    }
		    
		    System.out.println(newList);//[ONE, TWO, THREE, FOUR]
	}

}
