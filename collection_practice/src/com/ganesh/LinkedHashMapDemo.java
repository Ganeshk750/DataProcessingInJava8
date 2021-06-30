package com.ganesh;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		LinkedHashMap m = new LinkedHashMap();
		m.put("Adi", 700);
		m.put("Mukul", 1000);
		m.put("vks", 600);
		m.put("Jay", 800);
		m.put("Ganesh", 700);
		System.out.println(m);
		System.out.println(m.put("Adi", 700));
		Set s = m.keySet();
		System.out.println(s);
		Collection c = m.values();
		System.out.println(c);
	    Set s1 = m.entrySet();
	    System.out.println("=============");
	    System.out.println(s1);
	    System.out.println("--------------");
	    Iterator itr = s1.iterator();
	    while(itr.hasNext()) {
	    	Map.Entry m1 = (Map.Entry) itr.next();
	    	System.out.println(m1.getKey()+"----"+m1.getValue());
	    	if(m1.getKey().equals("Ganesh")) {
	    		m1.setValue(500);
	    	}
	    }
	    System.out.println(m);
	}
}
