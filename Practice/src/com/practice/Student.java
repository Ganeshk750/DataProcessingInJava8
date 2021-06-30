package com.practice;

import java.io.Serializable;

public class Student implements Serializable{
	
	private String name;
	private double age;
	private int rollNumber;
	
	public Student(String name, double age, int rollNumber) {
		this.name = name;
		this.age = age;
		this.rollNumber = rollNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAge() {
		return age;
	}

	public void setAge(double age) {
		this.age = age;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	
	
	
	
	
	

}
