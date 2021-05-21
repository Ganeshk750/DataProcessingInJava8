package com.ganesh.utility;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionsSearchCustomizeDemo {
	
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		al.add(15);
		al.add(0);
		al.add(20);
		al.add(10);
		al.add(5);
		System.out.println("Initial: "+al);
		Collections.sort(al , new MySecondComparator());
		System.out.println(Collections.binarySearch(al, 10, new MySecondComparator()));
		System.out.println(Collections.binarySearch(al, 13, new MySecondComparator()));
	    System.out.println(Collections.binarySearch(al, 17));
	}

}

class MySecondComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Integer i1 = (Integer) o1;
		Integer i2 = (Integer) o2;
		return i2.compareTo(i1);
	}
	
}
