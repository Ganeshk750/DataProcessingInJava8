package com.ganesh;

import java.util.HashMap;
import java.util.WeakHashMap;

public class WeakHashMapDemo {

	public static void main(String[] args) throws InterruptedException {
		
		HashMap m = new HashMap();
		Temp t = new Temp();
		m.put(t, "Ganesh");
		System.out.println(m);
		t = null;
		System.gc();
		Thread.sleep(2000);
		System.out.println(m);
		
		
		
		WeakHashMap m1 = new WeakHashMap();
		Temp t1 = new Temp();
		m1.put(t1, "Ganesh");
		System.out.println(m1);
		t1 = null;
		System.gc();
		Thread.sleep(7000);
		System.out.println(m1);
	}
}


class Temp{
	public String toString() {
		return "temp";
	}
	
	public void finalized() {
		System.out.println("finalize() called");
	}
}
