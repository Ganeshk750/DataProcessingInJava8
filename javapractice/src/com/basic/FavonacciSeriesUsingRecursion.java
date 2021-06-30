package com.basic;

import java.util.Scanner;

public class FavonacciSeriesUsingRecursion {
	
	static int number1 = 0, number2 = 1, number3 = 0;
	
	
	public static void fabSeriese(int count) {
		if(count > 0) {
			number3 = number1 + number2;
			number1 = number2;
			number2 = number3;
			System.out.print(" "+ number3);
			fabSeriese(count - 1);
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter Number Of count value: ");
		int count = sc.nextInt();
		System.out.print(number1+" "+ number2);
		fabSeriese(count - 2);
	}

}
