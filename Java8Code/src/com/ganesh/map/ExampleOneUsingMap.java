package com.ganesh.map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExampleOneUsingMap {
	
	public static void main(String[] args) {
		
		System.out.println("============Here We are Diuble each Element of Array Using map ============");
		
          List<Integer> intList = Arrays.asList(1, 2, 3, 4);
		 
		 System.out.println(intList);
		 
		 List<Integer> list = intList.stream().map(ele -> ele * 2).collect(Collectors.toList());
		 System.out.println(list);
		 
		 
	}

}
