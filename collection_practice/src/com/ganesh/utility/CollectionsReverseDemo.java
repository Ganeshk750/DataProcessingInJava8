package com.ganesh.utility;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsReverseDemo {
	
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		al.add(15);
		al.add(0);
		al.add(20);
		al.add(10);
		al.add(5);
		System.out.println("Initial: "+ al);
		Collections.sort(al);
		System.out.println("After: "+al);
	}

}
