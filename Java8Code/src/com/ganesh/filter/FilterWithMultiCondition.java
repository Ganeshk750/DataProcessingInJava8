package com.ganesh.filter;

import java.util.Arrays;
import java.util.List;

public class FilterWithMultiCondition {
	
	public static void main(String[] args) {
		
		System.out.println("===============Filter With MultiConditions=================");
		
	System.out.println("===Approach 1: apply multiple checking for multi-conditions in only one filter()===");
	List<Customer> customers = Arrays.asList(new Customer(1, "Jack", 23),
            new Customer(2, "Mary", 31),
            new Customer(3, "Peter", 17),
            new Customer(4, "Harry", 16),
            new Customer(5,"Joe", 19));
	
	   customers.stream().filter(cust -> cust.getAge() < 30 && cust.getAge() % 2 == 1)
	                     .forEach(System.out::println);
	   
//	           Customer [id=1, name=Jack, age=23]
//			   Customer [id=3, name=Peter, age=17]
//			   Customer [id=5, name=Joe, age=19]
	   
	   System.out.println("===========Approach 2: Use multiple filter() method together================");
	   customers.stream().filter(cust -> cust.getAge() < 30)
	                     .filter(cust -> cust.getAge() % 2 == 1)
	                     .forEach(System.out::println);
	   
//       Customer [id=1, name=Jack, age=23]
//	   Customer [id=3, name=Peter, age=17]
//	   Customer [id=5, name=Joe, age=19]
	   
	   System.out.println("=================Try ===================");
	   customers.stream().filter(custs -> custs.getAge() < 30)
       .filter(custs -> custs.getId() % 2 == 0)
       .forEach(System.out::println); //Customer [id=4, name=Harry, age=16]
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
