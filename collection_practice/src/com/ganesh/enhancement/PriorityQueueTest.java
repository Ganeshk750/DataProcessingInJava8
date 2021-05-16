package com.ganesh.enhancement;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueTest {
	
	public static void main(String[] args) {
		
		PriorityQueue q = new PriorityQueue(15, new MyComparator());
		q.offer("A");
		q.offer("Z");
		q.offer("L");
		q.offer("B");
		System.out.println(q); // [Z, B, L, A]
	}

}

class MyComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
	   String s1 = (String) o1;
	   String s2 = (String) o2;
	   return s2.compareTo(s1);
	}
	
}
