package com.ganesh.faltmap;

import java.util.Arrays;
import java.util.List;

public class CombineFlatMapWithReduce {
	
	public static void main(String[] args) {
		
		System.out.println("==========Combine FlatMap With Reduce =================");
		
		//List<List<Integer>> -> Stream -> FlatMap -> Stream -> Reduce -> Int
		
		List<List<Integer>> listOfList = Arrays.asList(
			      Arrays.asList(1, 2, 3, 4),
			      Arrays.asList(5, 6, 7, 8),
			      Arrays.asList(9, 10, 11, 12)
			    );  
			 
			System.out.println(listOfList);
			// [[1, 2, 3, 4], [5, 6, 7, 8], [9, 10, 11, 12]]
			 
			int sum = listOfList.stream()
			      .flatMap(intList -> intList.stream())
			      .reduce(0, (a, b) -> a + b);
			 
			System.out.println(sum);
			// 78
	}

}
