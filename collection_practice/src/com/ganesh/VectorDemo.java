package com.ganesh;

import java.util.Vector;

public class VectorDemo {
	
	public static void main(String[] args) {
		
		Vector v = new Vector();
		System.out.println("Initala = "+ v.capacity());
		for(int i = 1; i <= 10; i++) {
			v.addElement(i);
		}
		System.out.println(v.capacity());
		v.addElement("A");
		System.out.println("After adding new elements = "+ v.capacity());
		System.out.println(v);
	}

}
