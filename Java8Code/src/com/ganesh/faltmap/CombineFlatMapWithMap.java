package com.ganesh.faltmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CombineFlatMapWithMap {
	
	public static void main(String[] args) {
		
		System.out.println("==========Combine FlatMap With Map ================");
		
		//List<List<Integer>> -> Stream -> FlatMap (using Map) -> Stream -> Collectors.toList() -> List<Integer>
		
		List<List<Integer>> arraylist = Arrays.asList(
			      Arrays.asList(1, 2, 3, 4),
			      Arrays.asList(5, 6, 7, 8),
			      Arrays.asList(9, 10, 11, 12)
			    );  
			 
			System.out.println(arraylist);
			// [[1, 2, 3, 4], [5, 6, 7, 8], [9, 10, 11, 12]]
			 
			List<Integer> results = arraylist.stream()
			      .flatMap(intList -> intList.stream().map(res -> res * 4))
			      .collect(Collectors.toList());
			 
			System.out.println(results);
			// [4, 8, 12, 16, 20, 24, 28, 32, 36, 40, 44, 48]

	}

}
