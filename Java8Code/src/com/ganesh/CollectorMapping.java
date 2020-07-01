package com.ganesh;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*Collectors.mapping()*/


public class CollectorMapping {
	
	public static void main(String[] args) {
		
		List<Developer> developerList = Arrays.asList(new Developer("Shashi", "Trainee", 15000),
                new Developer("Vivek", "Frontend", 10000),
                new Developer("Ganesh", "Trainee", 13000),
                new Developer("Alock", "SeniorDeveloper", 25000));
		
		List<String> names = developerList.stream().collect(Collectors.mapping(Developer::getName, Collectors.toList()));
		System.out.println(names);//[Shashi, Vivek, Ganesh, Alock]
	}

}
