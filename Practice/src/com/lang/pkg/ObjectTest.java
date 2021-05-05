package com.lang.pkg;

public class ObjectTest {
	
	int i;
	
	public ObjectTest(int i) {
		this.i = i;
	}
	
	public int hashCode() {
		return i;
	}
	
	public String toString() {
		return i+"";
	}
	
	public static void main(String[] args) {
		
		ObjectTest o1 = new ObjectTest(121);
		ObjectTest o2 = new ObjectTest(212);
		
		System.out.println(o1);
		System.out.println(o2);
		
	}

}
