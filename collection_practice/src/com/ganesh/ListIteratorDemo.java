package com.ganesh;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorDemo {
	
	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		list.add("Baala");
		list.add("Neta");
		list.add("Chacha");
		list.add("Naga");
		list.add("Chiru");
		System.out.println(list);
		ListIterator itr = list.listIterator();
		while(itr.hasNext()) {
			String s = (String) itr.next();
			if(s.equals("Chiru")) {
				itr.remove();
			}
			if(s.equals("Chacha")) {
				itr.remove();
			}
			if(s.equals("Naga")) {
				itr.add("Gyan");
			}
		}
		
		System.out.println(list);
	}

}
