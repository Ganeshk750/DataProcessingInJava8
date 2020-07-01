package com.ganesh;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
Collectors.filtering()
Signature
---------
public static <T, A, R>
    Collector<T, ?, R> filtering(Predicate<? super T> predicate,
                                 Collector<? super T, A, R> downstream)
It adapts a Collector to one accepting elements of the same type T by applying the predicate to 
each input element and only accumulating if the predicate returns true.

*/
public class CollectorFilter {
	
	public static void main(String[] args) {
		
		List<Integer> intLst = Arrays.asList(1, 2, 3, 4, 2, 5, 6, 4, 8, 2, 7, 8);
		 
		//List<Integer> oddLst = intLst.stream().collect(Collectors.filtering(i->i%2==1, Collectors.toList()));
		//System.out.println(oddLst);// [1, 3, 5, 7]
	}

}
