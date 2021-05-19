package com.ganesh;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ProblemFour {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String inputString = sc.nextLine();
		//ArrayList list = new ArrayList();
		 char inputChar [] = inputString.toCharArray();
		if(inputChar.length > 1000) {
			return;
		}
		for(int i = 0 ; i < inputChar.length; i++) {
			System.out.print(inputChar[i]+ " ");
		}
		
		
	}

}
