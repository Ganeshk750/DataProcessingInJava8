package com.ganesh.map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExampleMapwithFilter {
	
	public static void main(String[] args) {
		
		System.out.println("==============Map with Filter=================");
		
		List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
		
		
		System.out.println("============First Filter Odd Number Then Remaing Element We Double=================");
		
		List<Integer> list = intList.stream().parallel()
				                .filter(ele -> ele % 2 == 1)
				                .map(e ->{
				                	System.out.println(e);
				                	return e * 2;
				                }).collect(Collectors.toList());
		System.out.println(list);
	}

}
