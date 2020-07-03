package com.ganesh.filter;

import java.util.Arrays;
import java.util.List;

import com.ganesh.filter.ParallelAndSequential.Customer;

public class FilterArrayObjects {
	
	public static void main(String[] args) {
		
		System.out.println("===========Filter Array Objects============");
		
		
		List<Customer> customers = Arrays.asList(new Customer(1, "Jack", 23),
                new Customer(2, "Mary", 31),
                new Customer(3, "Peter", 17),
                new Customer(4, "Harry", 16),
                new Customer(5,"Joe", 19));
		
		customers.stream()
	    .parallel()
	    .filter(c -> c.getAge() < 30 && c.getAge() %2 == 1) // Concurrently Filtering
	    .sequential() // switch to sequential processing
	    .map(c -> new Customer(c.getId(), c.getName().toUpperCase(), c.getAge())) // apply mapping to Upper-Case the Name
	    .forEach(System.out::println);
	/*
	  [id=1, name=JACK, age=23]
	  [id=3, name=PETER, age=17]
	  [id=5, name=JOE, age=19]
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
