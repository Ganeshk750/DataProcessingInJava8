package com.ganesh.faltmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapWithFilter {
	
	public static void main(String[] args) {
		
		System.out.println("=========FlatMap With Filter=============");
		
		//List<List<Integer>> -> Stream -> FlatMap ->  Filter -> Stream -> List<Integer>

		
		List<List<Integer>> listOfList = Arrays.asList(
			      Arrays.asList(1, 2, 3, 4),
			      Arrays.asList(5, 6, 7, 8),
			      Arrays.asList(9, 10, 11, 12)
			    );  
			 
			System.out.println(listOfList);
			// [[1, 2, 3, 4], [5, 6, 7, 8], [9, 10, 11, 12]]
			 
			List<Integer> results = listOfList.stream()
			      .flatMap(intList -> intList.stream())
			      .filter( i-> i%2==0).collect(Collectors.toList());
			 
			System.out.println(results);
			// [2, 4, 6, 8, 10, 12]
	}

}
