package com.ganesh.enhancement;

import java.util.PriorityQueue;

public class PriorityQueueDemo {
	
	public static void main(String[] args) {
		
		PriorityQueue q = new PriorityQueue();
		System.out.println(q.peek());
		//System.out.println(q.element()); //java.util.NoSuchElementException
		for(int i = 0; i <= 10; i++) {
			q.offer(i);
		}
		System.out.println(q);
		System.out.println(q.poll()); // 0
		System.out.println(q.peek());
		System.out.println(q);
	}

}
