package com.practice.thread;

public class TestMain {
	
	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread().getPriority());
		System.out.println(Thread.currentThread().getName());
		Thread t1 = new Thread();
		//t1.start();
		
		System.out.println(t1.getName());
		Thread.currentThread().setName("Thread One");
		Thread.currentThread().setPriority(6);
		System.out.println(Thread.currentThread().getName());
		
		System.out.println(Thread.currentThread().getPriority());
		
	}

}

class TestThread extends Thread{
	
}
