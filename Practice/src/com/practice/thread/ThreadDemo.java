package com.practice.thread;

public class ThreadDemo {
	
	public static void main(String[] args) {
		
		ThreadRunnable t1 = new ThreadRunnable();
		Thread th = new Thread(t1);
		th.start();
		for(int i = 0; i <= 5; i++) {
			System.out.println("Main Thread");
		}
	}

}

class ThreadRunnable implements Runnable {
	public void run() {
		for(int i = 0; i <= 5; i++) {
			System.out.println("New Thread");
		}
	}
}
