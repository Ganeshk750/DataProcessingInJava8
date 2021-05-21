package com.ganesh;

import java.util.Arrays;
import java.util.Scanner;

public class ProblemThree {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int inputLength = sc.nextInt();
		int inputArray [] = new int[inputLength];
		
		for(int i = 0; i < inputLength; i++) {
			inputArray[i] = sc.nextInt();
		}
		System.out.println("Given Array: "+ Arrays.toString(inputArray));
	    
		int arraySum = Arrays.stream(inputArray).sum();
		int total = (inputLength * (inputLength + 1)) / 2;
		int missingNumber = total - arraySum;
		System.out.println("Missing Number: "+ missingNumber);
	
	}

}
