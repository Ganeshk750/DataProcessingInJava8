package com.ganesh.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExampleOne {
	
	public static void main(String[] args) {
		
		System.out.println("===========Here we Double each element =================");
		 List<Integer> intList = Arrays.asList(1, 2, 3, 4);
		 
		 System.out.println(intList);
		 
		  List<Integer> newList = new ArrayList<Integer>();
		  for(Integer i : intList) {
			  newList.add(i * 2);
		  }
		  System.out.println(newList);
	}

}
