package com.ganesh;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
 * Collector With toMap()*/

public class CollectorToMap {
	
	public static void main(String[] args) {
		
		
		List<Developer> listMaps = Arrays.asList(new Developer("Shashi", "Trainee", 15000),
				                 new Developer("Vivek", "Frontend", 10000),
				                 new Developer("Ganesh", "Trainee", 13000),
				                 new Developer("Alock", "SeniorDeveloper", 25000));
		  
		  System.out.println("=============Printing All Developer Details==================");
		  listMaps.stream().forEach(dev -> System.out.println(dev));
		
		
		  
		  System.out.println("============Getting Salary List Sorted Order ========================="); 
		  List<Integer> salaryList = listMaps.stream().map(d -> d.getSalary()).sorted().collect(Collectors.toList());
		  System.out.println(salaryList);
		  
		  
		  
		  System.out.println("==============Printing Developer Details using toMap() ==================");
		  Map<String , Integer> result = listMaps.stream().collect(Collectors.toMap(Developer::getName, Developer::getSalary));
		  System.out.println(result);
		  
		  
		
	}
	

}


