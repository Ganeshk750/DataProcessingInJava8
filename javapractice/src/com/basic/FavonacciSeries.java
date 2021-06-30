package com.basic;

import java.util.Scanner;

public class FavonacciSeries {
	
	public static void main(String[] args) {
		
		int number1, number2 , number3 , count;
		number1 = 0;
		number2 = 1;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter Count Value :");
		count = sc.nextInt();
		System.out.print(number1+ " "+ number2);
		for(int i = 2; i <= count; i++) {
			number3 = number1 + number2;
			System.out.print(" "+ number3);
			number1 = number2;
			number2 = number3;
		}
		
		
	}

}
