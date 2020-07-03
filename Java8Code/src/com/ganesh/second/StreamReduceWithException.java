package com.ganesh.second;

import java.util.Arrays;
import java.util.List;

//Handle Stream Reduce Exception

public class StreamReduceWithException {
	
	public static void main(String[] args) {
		List<Integer> intLst = Arrays.asList(2, 4, 6, 12);
		 
		int result = intLst.stream().reduce(0, (partialresult, i) -> partialresult + divide(i, 0));
		System.out.println(result);
		
	}
	
	private static int divide(int value, int factor) {
	    int result = 0;
	    try {
	        result = value / factor;
	    } catch (ArithmeticException e) {
	      // Log Here
	        System.out.println("ArithmeticException: " + e.getMessage());
	    }
	    return result;
	}

}
