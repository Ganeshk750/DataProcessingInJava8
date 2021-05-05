package com.lang.pkg;

public class TestMain {
	
	String name;
	int rollNo;
	
	TestMain(String name, int rollNo){
		this.name = name;
		this.rollNo = rollNo;
	}
	

	
	@Override
	public String toString() {
		return "name=" + name + ", rollNo=" + rollNo  ;
	}



	public static void main(String[] args) {
		
		Object obj = new Object();
		System.out.println("CLASS NAME: "+ obj.toString());
		
		
		TestMain t1 = new TestMain("GANESH", 121);
		TestMain t2 = new TestMain("PRINCE", 258);
		System.out.println(t1);
		System.out.println(t1.toString());
		System.out.println(t2);
	}

}
