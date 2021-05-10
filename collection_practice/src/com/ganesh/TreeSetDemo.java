package com.ganesh;

import java.util.TreeSet;

public class TreeSetDemo {
	
	public static void main(String[] args) {
		
		TreeSet t = new TreeSet();
		t.add("A");
		t.add("C");
		t.add("K");
		t.add("B");
		t.add("Z");
		t.add("L");
		//t.add(new Integer(10)); //class cast exception --RE
		//t.add(null); //null pointer exception --RE
		System.out.println(t);
		
		t.add(new StringBuffer("a"));
		t.add(new StringBuffer("k"));
		t.add(new StringBuffer("c"));
		t.add(new StringBuffer("b"));
		
		System.out.println(t);
		//class java.lang.String cannot be cast to class java.lang.StringBuffer (java.lang.String and java.lang.StringBuffer are 
		//in module java.base of loader 'bootstrap' --RE
		
		
		
		
	}

}
