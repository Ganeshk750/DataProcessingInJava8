package com.ganesh.utility;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionSortDemo {
	
	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		list.add("Z");
		list.add("A");
		list.add("K");
		list.add("N");
		//list.add(new Integer(10));//java.lang.ClassCastException: class java.lang.String cannot be cast to class java.lang.Integer
		//list.add(null); //java.lang.NullPointerException
		System.out.println("Before Sorting: "+ list);
		Collections.sort(list);
		System.out.println("After Sorting: "+ list);
		
		//output:
			//Before Sorting: [Z, A, K, N]
			//After Sorting: [A, K, N, Z]
	}

}
