package com.ganesh.utility;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionsCustomizedSortDemo {
	
	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		list.add("Z");
		list.add("A");
		list.add("K");
		list.add("N");
		System.out.println("Before Sorting: "+ list);
		Collections.sort(list, new MyComparator());
		System.out.println("After Sorting: "+ list);
		
		//Before Sorting: [Z, A, K, N]
		//After Sorting: [Z, N, K, A]
	}

}

class MyComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		String s1 = (String) o1;
		String s2 = (String) o2;
		//String s2 = o2.toString();
		return s2.compareTo(s1);
	}
	
}
