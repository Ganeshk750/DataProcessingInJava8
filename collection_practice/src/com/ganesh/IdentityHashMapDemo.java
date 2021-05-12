package com.ganesh;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class IdentityHashMapDemo {
	
	public static void main(String[] args) {
		
		HashMap m = new HashMap();
		Integer i1 = new Integer(10);
		Integer i2 = new Integer(10);
		m.put(i1, "Pawan");
		m.put(i2, "Kalyan");
		System.out.println(m);//{10=Kalyan}
		
		System.out.println("===============");
		
		IdentityHashMap m1 = new IdentityHashMap();
		Integer i3 = new Integer(10);
		Integer i4 = new Integer(10);
		m1.put(i3, "Pawan");
		m1.put(i4, "Kalyan");
		System.out.println(m1);//{10=Pawan, 10=Kalyan}
	}

}
