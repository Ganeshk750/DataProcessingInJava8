package com.lang.pkg;

public class EqualsTest {
	
	String name;
	int rollNo;
	
	public EqualsTest(String name, int rollNo) {
		this.name = name;
		this.rollNo = rollNo;
	}
	
	public static void main(String[] args) {
		
		EqualsTest e1 = new EqualsTest("Ganesh", 121);
		EqualsTest e2 = new EqualsTest("Prince", 212);
		EqualsTest e3 = new EqualsTest("Arya", 222);
		EqualsTest e4 = e1;
		System.out.println(e1.equals(e2));
		System.out.println(e1.equals(e3));
		System.out.println(e1.equals(e4));
		
		
		/**
		 * FALSE
		 * FALSE
		 * TRUE
		 * 
		 * **/
		
	}

}

