package com.ganesh.second;

import java.util.*;

/*Signature
 * --------
 * Optional<Integer> java.util.stream.Stream.reduce(BinaryOperator<Integer> accumulator)
 * 
 * */

public class StreamReduce {
	
	public static void main(String[] args) {
		
		System.out.println("===========Simple Reduce Method=============");
		
		List<Integer> intList = Arrays.asList(1, 3, 5, 2, 9, 8, 15, 12);
		Optional<Integer> total = intList.stream().reduce((ele, e) -> ele + e);
		System.out.println(total);//Optional[55]
		total.ifPresent(System.out::println); // 55
		
		
		
		System.out.println("=====T reduce(T identity, BinaryOperator<T> accumulator)=========");
		
		Integer result = intList.stream().reduce(100, (subTotal, e) -> subTotal + e);
		 
		System.out.println(result);
		
		/*
		 * <U> U reduce(U identity, BiFunction<U, ? super T, U> accumulator,
		 * BinaryOperator<U> combiner);
		 */
		
		System.out.println("============Stream.reduce(identity, accumulator, combiner)==============");
		Integer sum = intList.parallelStream().reduce(2,(subTotal, e) -> subTotal + e, Integer::sum);
		System.out.println(sum);
		
		
		System.out.println("===============Stream Reduce String List ===============");
		
		List<String> strList = Arrays.asList("one", "three", "five", "two", "nine", "eight");
		String ss = strList.stream().reduce("",(subConcatStr, str) -> subConcatStr + " " + str);
		System.out.println(ss);// one three five two nine eight
	}

}
