package com.ganesh;

public class ArrayExp {
	
	public static void main(String[] args) {
		Student [] std = new Student[100];
		std[0] = new Student("ganesh", "gad");
		//std[1] =  new Customer();
		System.out.println(std);
		
		
		//Now ObjectType Arrays
		Object [] std1 = new Object[100];
		std1[0] = new Student("ganesh", "gad");
		std1[1] =  new Customer();
		System.out.println(std1);
	}

}

class Student {
	 
	String name;
	String cls;
	
	public Student(String name, String cls) {
		this.name = name;
		this.cls = cls;
	}
}
