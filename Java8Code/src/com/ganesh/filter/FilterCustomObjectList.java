package com.ganesh.filter;

import java.util.Arrays;
import java.util.List;

public class FilterCustomObjectList {
	
	public static void main(String[] args) {
		
		List<Customer> custList = Arrays.asList(new Customer(1, "Ganesh", 25),
				new Customer(2, "Gopal",32),
				new Customer(3, "Alock", 35),
				new Customer(4, "Peter", 17),
                new Customer(5, "Harry", 16),
                new Customer(6,"Joe", 19));
		
		for(Customer cust: custList) {
			if(cust.getAge() >=18) {
				System.out.println(cust);
			}
		}
		
		/*
		 * Customer [id=1, name=Ganesh, age=25] 
		 * Customer [id=2, name=Gopal, age=32]
		 * Customer [id=3, name=Alock, age=35] 
		 * Customer [id=6, name=Joe, age=19]
		 */
	}
	
	
	public static class Customer{
		private int id;
		private String name;
		private int age;
		
		public Customer(int id, String name, int age) {
			this.id = id;
			this.name = name;
			this.age = age;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		@Override
		public String toString() {
			return "Customer [id=" + id + ", name=" + name + ", age=" + age + "]";
		}
		
		
		
		
	}

}
