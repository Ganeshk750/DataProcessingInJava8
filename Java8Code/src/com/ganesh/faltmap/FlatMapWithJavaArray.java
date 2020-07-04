package com.ganesh.faltmap;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class FlatMapWithJavaArray {
  
	public static void main(String[] args) {
		
		System.out.println("===========FlatMap With Java Array============");
		
		
		Developer[] developers = new Developer [] { 
			    new Developer("Ganesh", new String[] {"Java", "Node.js", "Angular"}),
			    new Developer("Aditya", new String[] {"C++", "ActiveMQ", "HTML", "CSS", "Java"}),
			    new Developer("Shashi", new String[] {"Python", "Node.js", "C++", "Vue.js"}),
			    new Developer("Arnav", new String[] {"Node.js", "Angular", "React", "CSS"})
			  };  
			 
			System.out.println(Arrays.asList(developers));//problem
			// [{name = Jack, skills = [Java, Node.js, Angular]}, {name = Joe, skills = [Java, C++, CSS, HTML, ActiveMQ]}, {name = Peter, skills = [Vue.js, C++, Node.js, Python]}, {name = Mary, skills = [CSS, Node.js, React, Angular]}]
			 
			Set<String> skills = Arrays.stream(developers)
			      .flatMap(developer -> Arrays.stream(developer.getSkills()))
			      .distinct()
			      .collect(Collectors.toSet());
			 
		 	System.out.println(skills);
			// [Java, Vue.js, C++, CSS, Node.js, HTML, ActiveMQ, React, Angular, Python]
			
			
	}
	
	
	static class Developer {
		 
		  private String name;
		  private String[] skills;
		  
		  public Developer(String name, String[] skills){
		    this.name = name;
		    this.skills = skills;
		  }
		  
		  public String getName() {
		    return this.name;
		  }
		  
		  public String[] getSkills(){
		    return this.skills;
		  }
		  
		  public String toString() {
		    return "{name = " + this.name + ", skills = " + this.skills + "}";
		  }
		}
}
