package com.ganesh.faltmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapWithStringList {
   
	public static void main(String[] args) {
		
		System.out.println("========FlatMap With String List===============");
		
		//List<List<String>> -> Stream -> flatMap() -> filter() -> Stream -> Collectors.toList() -> List<String>

		
		List<List<String>> listOfList = Arrays.asList(
			      Arrays.asList("Java", "Django", "Vue", "Spring Cloud"),
			      Arrays.asList("Python", "Spring Boot", "React"),
			      Arrays.asList("Angular", "JQuery", "Spring JPA")
			    );  
			 
			System.out.println(listOfList);
			// [[Java, Django, Vue, Spring Cloud], [Python, Spring Boot, React], [Angular, JQuery, Spring JPA]]
			 
			List<String> results = listOfList.stream()
			      .flatMap(strList -> strList.stream())
			     // .filter(str -> str.contains("Spring"))
			      .collect(Collectors.toList());
			 
			System.out.println(results);
			// [Java, Django, Vue, Spring Cloud, Python, Spring Boot, React, Angular, JQuery, Spring JPA]
			
			
			System.out.println("===========FlatMap Filter With String List ======================");
			
			List<String> list = listOfList.stream()
					              .flatMap(result -> result.stream())
					              .filter(str -> str.contains("Spring"))
					              .collect(Collectors.toList());
			System.out.println(list);//[Spring Cloud, Spring Boot, Spring JPA]
	}
}
