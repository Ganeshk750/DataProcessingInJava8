package com.ganesh.filter;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class CustomObjectList {
	
	public static void main(String[] args) {
		
		
		List<Customer> customers = Arrays.asList(new Customer(1, "Jack", 23),
                new Customer(2, "Mary", 31),
                new Customer(3, "Peter", 17),
                new Customer(4, "Harry", 16),
                new Customer(5,"Joe", 19));
		
		
		customers.stream().filter(str -> str.getAge() >= 18)
				          .forEach(System.out::println);
		
		
//		        Customer [id=1, name=Jack, age=23]
//				Customer [id=2, name=Mary, age=31]
//				Customer [id=5, name=Joe, age=19]
		
		System.out.println("============Using filter stream with sorted()===================");
		customers.stream().filter(cust -> cust.getAge() >=18)
		                                .sorted(Comparator.comparing(Customer::getAge))
		                                .forEach(System.out::println);
		
//		        Customer [id=5, name=Joe, age=19]
//				Customer [id=1, name=Jack, age=23]
//				Customer [id=2, name=Mary, age=31]

	}                                             
	
	public static class Customer{
		private int id;
		private String name;
		private int age;
		public Customer(int id, String name, int age) {
			super();
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
