package com.ganesh.second;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamReduceForCustomObject {
	
	public static void main(String[] args) {
		
		List<Developer> list = Arrays.asList(new Developer("Ganesh", 18000),
				          new Developer("Shashi", 15000),
				          new Developer("Alock", 25000));
		
		Double totalSalary = list.stream()
                .reduce(0.0, (partialTotalSalaries, e) 
                        -> partialTotalSalaries + e.getSalary(), Double::sum);
		
		System.out.println(totalSalary);//58000.0

	}
	
	public static class Developer{
		private String name;
		private double salary;
		
		public Developer(String name, double salary) {
			super();
			this.name = name;
			this.salary = salary;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public double getSalary() {
			return salary;
		}

		public void setSalary(double salary) {
			this.salary = salary;
		}
		
		
	}

}
