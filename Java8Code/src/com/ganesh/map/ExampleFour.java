package com.ganesh.map;

import java.util.Arrays;
import java.util.List;

public class ExampleFour {
	
	public static void main(String[] args) {
		
		System.out.println("===========Parallel & Sequential Stream Map====================");
		
		List<Customer> custList = Arrays.asList(
			    new Customer("Jack", "Smith"),
			    new Customer("Joe", "Johnson"),
			    new Customer("Richard", "Brown"),
			    new Customer("Thomas", "Wilson")
			  );
			 
			custList.stream()
			      .parallel()
			      .map(c -> c.getFirstname() + " " + c.getLastname()) //concurrently mapping
			        .forEach(System.out::println); //concurrently System.out:println
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
