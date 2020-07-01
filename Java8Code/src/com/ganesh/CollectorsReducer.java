package com.ganesh;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*Collectors.reducing()
 * public static <T> Collector<T, ?, T>
    reducing(T identity, BinaryOperator<T> op)
   
 Returns a Collector which performs a reduction of its input elements under a specified BinaryOperator 
 using the provided identity.
 * */
public class CollectorsReducer {
	
	public static void main(String[] args) {
		
		List<String> strLt = Arrays.asList("learn", "java8", ".com");
		 
		String reducingStr = strLt.stream().collect(Collectors.reducing("https://", (subStr, e) -> subStr + e));
		System.out.println(reducingStr);
		// https://learnjava8.com
		
	}

}
