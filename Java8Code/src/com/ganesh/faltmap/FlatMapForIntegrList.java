package com.ganesh.faltmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapForIntegrList {
	
	public static void main(String[] args) {
		
		System.out.println("========FlatMap For Integer Lists============");
		
		//List<List<Integer>> -> Stream -> FlatMap -> Stream -> Collectors.toList() -> List<Integer>

	   List<List<Integer>> listOfList = Arrays.asList(
			      Arrays.asList(1, 2, 3, 4),
		          Arrays.asList(5, 6, 7, 8),
		          Arrays.asList(9, 10, 11, 12));
	   System.out.println(listOfList);//[[1, 2, 3, 4], [5, 6, 7, 8], [9, 10, 11, 12]]
	   
	   List<Integer> list = listOfList.stream()
			                   .flatMap(newList -> newList.stream())
			                   .collect(Collectors.toList());
	  
	   System.out.println(list);//[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12]
	   
	}

}
