package com.practice.thread;

public class ThreadOne {
	
	public static void main(String[] args) {
		ThreadDemos t1 = new ThreadDemos();
		t1.start();
		//t1.run();
	   for(int i = 1; i<=5; i++) {
		   System.out.println("Main Thread");
	   }
	}

}

class ThreadDemos extends Thread {
	
	public void run() {
		for(int i = 1; i <= 5; i++) {
			System.out.println("Parent Thread");
		}
	}
	
}