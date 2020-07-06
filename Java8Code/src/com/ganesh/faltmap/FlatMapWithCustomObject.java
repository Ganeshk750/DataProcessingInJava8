package com.ganesh.faltmap;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapWithCustomObject {
	
	//List<Developer> -> Stream<Developer> -> FlatMap -> Stream<String> -> Distinct -> Stream<String> -> Collectors.toSet() -> Set<String>
	public static void main(String[] args) {
		
		System.out.println("========FlatMap With Custom Object =============");
		
		List<Developer> developers = Arrays.asList(
			      new Developer("Ganesh", Stream.of("Java", "Node.js", "Angular")
			            .collect(Collectors.toSet())),
			      new Developer("Aditya", Stream.of("C++", "ActiveMQ", "HTML", "CSS", "Java")
			            .collect(Collectors.toSet())),
			      new Developer("Deepak", Stream.of("Python", "Node.js", "C++", "Vue.js")
			            .collect(Collectors.toSet())),
			      new Developer("Arnav", Stream.of("Node.js", "Angular", "React", "CSS")
			            .collect(Collectors.toSet()))
			    );  
			 
			System.out.println(developers);
		//[{name = Ganesh, skills = [Java, Node.js, Angular]}, {name = Aditya, skills = [Java, C++, CSS, HTML, ActiveMQ]}, {name = Deepak, skills = [Vue.js, C++, Node.js, Python]}, {name = Arnav, skills = [CSS, Node.js, React, Angular]}]
	
	     Set<String> skill = developers.stream()
	    		              .flatMap(developer -> developer.getSkills().stream())
	    		              .distinct()
	    		              .collect(Collectors.toSet());
	     System.out.println(skill);//[Java, Vue.js, C++, CSS, Node.js, HTML, ActiveMQ, React, Angular, Python]
	     
	    
	}
	
	
	
	
	
	static class Developer {
		 
		  private String name;
		  private Set<String> skills;
		  
		  public Developer(String name, Set<String> skills){
		    this.name = name;
		    this.skills = skills;
		  }
		  
		  public String getName() {
		    return this.name;
		  }
		  
		  public Set<String> getSkills(){
		    return this.skills;
		  }
		  
		  public String toString() {
		    return "{name = " + this.name + ", skills = " + this.skills + "}";
		  }
		}

}
