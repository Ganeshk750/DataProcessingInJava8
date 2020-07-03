package com.ganesh.filter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*Signature
------------
Stream<Integer> java.util.stream.Stream.filter(Predicate<? super Integer> predicate)*/

public class StreamFilter {
	
	public static void main(String[] args) {
		
		System.out.println("===========Using stream.filter() ===============");
		
		List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5, 7, 10, 11, 16);
		List<Integer> opList = intList.stream().filter(i -> i % 2 == 0)
				.collect(Collectors.toList());
		System.out.println(opList);//[2, 4, 10, 16]
	}

}
