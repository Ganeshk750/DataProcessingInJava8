package com.practice;

import java.util.Arrays;
import java.util.Scanner;

public class Problem3 {
  
	public static void main(String[] args) {
		
//		int arr [][] = {{1,2,3},{4,5,6},{7,8,9}};
//		System.out.println("Given Matrix Input are:-");
//		String input = Arrays.deepToString(arr);
//		System.out.println(input);
//		int rows = arr.length;
//		int cols = arr[0].length;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter Row:-");
		int row = sc.nextInt();
		System.out.println("Please Enter clo:-");
		int col = sc.nextInt();
		
		int userInputArray [][] = new int[row][col];
		for(int i = 0; i <= row; i++) {
			for(int j = 0; j <= col; j++) {
				userInputArray[i][j] = sc.nextInt();
			}
		}
		//print matrix
		for(int i = 0; i <= row; i++) {
			for(int j = 0; j <= col; j++) {
				System.out.print(userInputArray[i][j]);
			}
		}
		int rows = userInputArray.length;
		int cols = userInputArray[0].length;
		
		int transp [][] = new int[cols][rows];
		
		for(int i = 0; i <= rows; i++) {
			for(int j = 0; j <= cols; j++) {
				transp[i][j] = userInputArray[j][i];
			}
		}
			
	        String str = Arrays.deepToString(transp);
	        System.out.println(str);
		
		
		
//		int transposeArr [][] = new int [cols][rows];
//		for(int i = 0; i < rows; i++) {
//			for(int j = 0; j < cols; j++) {
//				transposeArr[i][j] = arr[j][i];
//			}
//		}
//		System.out.println("Given Matrix Output are:-");
//		String output = Arrays.deepToString(transposeArr);
//		System.out.println(output);
	}
}
