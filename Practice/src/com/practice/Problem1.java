package com.practice;

import java.util.Arrays;

public class Problem1 {
 
	public static void main(String[] args) {
		
		int arr [][][][] = {{{ {34,21,32,41,25},{14,42,43,14,31},{54,45,52,42,23}, {33,15,51,31,35},{21,52,33,13,23} }}};
		System.out.println("Given Matrix Input are:-");
		String input = Arrays.deepToString(arr);
		System.out.println(input);
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 1; j < arr[0].length; j++) {
				for(int k = 2; k < arr[1].length; k++) {
					for(int l = 3; l < arr[2].length; l++) {
					
					}
				}
			}
		}
		
		
	}
}
