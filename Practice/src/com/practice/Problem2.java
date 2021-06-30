package com.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;


public class Problem2  {
   
	public static void main(String[] args) {
		
		
		Student s1 = new Student("Ganesh", 24.2, 123);
		Student s2 = new Student("Kumar", 20.2, 321);
		Student s3 = new Student("Alock", 18.1, 133);
		Student s4 = new Student("Manish", 29.2, 342);
		Student s5 = new Student("Shashi", 16.8, 126);
		
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		
		//UnShorted 
		for(Student std: list) {
			System.out.println(std.getName()+" "+ std.getAge()+" "+ std.getRollNumber());
		}
		
		
		 //Shorting
		//Collections.sort(list, new NameComp());
		//Collections.sort(list, new AgeComp());
		Collections.sort(list, new RollNoComp());
		
		System.out.println("<====Sorted Data===>");
		
		
		for(Student s : list) {
			
			//System.out.println(s.getName());
			 //System.out.println(s.getAge());
			System.out.println(s.getRollNumber());
		}
	}
	
	
	
	

}


	
	
	

