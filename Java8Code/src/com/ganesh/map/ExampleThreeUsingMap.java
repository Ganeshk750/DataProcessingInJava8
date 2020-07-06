package com.ganesh.map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class ExampleThreeUsingMap {
	
	public static void main(String[] args) {
		
System.out.println("===========Transform a Custom Object List Using Map===============");
		
		List<Customer> custList = Arrays.asList(
	              new Customer("Ganesh", "Kumar"),
	              new Customer("Manish", "Rahul"),
	              new Customer("Shashi", "Bhushan"),
	              new Customer("Aditya", "Kumar")
	            );
		
		List<String> list = custList.stream().map(str -> str.getFirstname()+ " "+ str.getLastname())
				                                  .collect(Collectors.toList());
		
		System.out.println(list);
	 	
	}
	
	public static class Customer{
		  
		  private String firstname;
		  private String lastname;
		  
		  public String getFirstname() {
		    return firstname;
		  }
		  
		  public String getLastname() {
		    return lastname;
		  }
		  
		  Customer(String firstname, String lastname){
		    this.firstname = firstname;
		    this.lastname = lastname;
		  }
		}

	

}
