package com.ganesh.utility;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsSearchDemo {
	
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		al.add("Z");
		al.add("A");
		al.add("M");
		al.add("k");
		al.add("a");
		System.out.println("Initial: "+al);
		Collections.sort(al);
		System.out.println("After Sorting: "+ al);
		System.out.println(Collections.binarySearch(al, "Z"));
		System.out.println(Collections.binarySearch(al, "J"));
	}

}
