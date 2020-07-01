package com.ganesh;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*Collectors.groupingBy()*/

public class CollectorsGroupingBy {
	
	public static class Employee{
		  private String name;
		  private String department;
		  
		  Employee(String name, String department){
		    this.name = name;
		    this.department  =department;
		  }
		  
		  public String getName() {
		    return this.name;
		  }
		  
		  public String getDepartment() {
		    return this.department;
		  }
		  
		  public String toString() {
		    return String.format("{name = %s, department = %s}", this.name, this.department);
		  }
		}
  
	public static void main(String[] args) {
		
		List<Employee> employees = Arrays.asList(new Employee("Jack", "Software"),
                new Employee("Joe", "Finance"),
                new Employee("Jane", "HR"),
                new Employee("Mary", "Finance"),
                new Employee("Peter", "Software"),
                new Employee("Davis", "Finance")
              );
		
		Map<String, List<Employee>> employeeByDepartment = employees
				.stream().collect(Collectors.groupingBy(Employee::getDepartment));
		System.out.println(employeeByDepartment);
		
	}
	
	
}
