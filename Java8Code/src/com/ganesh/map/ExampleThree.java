package com.ganesh.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExampleThree {
	
	public static void main(String[] args) {
		
		System.out.println("===========Transform a Custom Object List===============");
		
		List<Customer> custList = Arrays.asList(
	              new Customer("Ganesh", "Kumar"),
	              new Customer("Manish", "Rahul"),
	              new Customer("Shashi", "Bhushan"),
	              new Customer("Aditya", "Kumar")
	            );
	 
	List<String> fullnameList = new ArrayList<String>();
	
	for(Customer cust: custList) {
	  String fullName = cust.getFirstname()+ " "+ cust.getLastname();
	  fullnameList.add(fullName);
	}
	System.out.println(fullnameList);
		
		
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
