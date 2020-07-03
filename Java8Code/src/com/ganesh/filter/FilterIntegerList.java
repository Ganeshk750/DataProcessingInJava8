package com.ganesh.filter;

import java.util.Arrays;
import java.util.List;

public class FilterIntegerList {

	public static void main(String[] args) {
		
		List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5, 7, 10, 11, 16);
		for(Integer i: intList) {
			if(i % 2 == 0) {
				System.out.println(i);
			}
		}
		
	}
}
