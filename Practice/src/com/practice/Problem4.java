package com.practice;

import java.util.Scanner;

public class Problem4 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please Enter Number:");
		int number = sc.nextInt();
		System.out.println("This is your Output:-");
		
		for(int i = 0; i <= number; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}

}
