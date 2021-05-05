package com.practice;

import java.util.Scanner;

public class Test2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter first String:-");
		String str1 = sc.nextLine();
		System.out.println("Please Enter second String:-");
		String str2 = sc.nextLine();
		
		str1 = str1 + str2;
		System.out.println(str1);
		str1 = str1.substring(0, str1.length() - 2);
		System.out.println(str1);
		str1 = str1.substring(5);
		System.out.println(str1);
		//str2 = str1.substring();
		
		//System.out.println(str2);
		
		
	}

}
