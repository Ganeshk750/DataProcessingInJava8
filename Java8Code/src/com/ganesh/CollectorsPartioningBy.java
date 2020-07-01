package com.ganesh;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/*Collectors.partitioningBy()*/
public class CollectorsPartioningBy {
	
	public static class Developer{
		private String name;
		private Integer salary;
		public Developer(String name, Integer salary) {
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
		public Integer getSalary() {
			return salary;
		}
		public void setSalary(Integer salary) {
			this.salary = salary;
		}
		
	}
	
	public static void main(String[] args) {
		
		List<Developer> developers= Arrays.asList(new Developer("Jack", 5400),
			    new Developer("Joe", 7500),
			    new Developer("Jane", 6500),
			    new Developer("Mary", 6200)
			  );
			 
			Map<Boolean, List<Developer>> partitioningDev = developers
					.stream().collect(Collectors.partitioningBy(dev -> dev.getSalary() > 6300));
			 
			System.out.println(partitioningDev);
	       //{false=[{name = Jack, salary = 5400}, {name = Mary, salary = 6200}], 
			//true=[{name = Joe, salary = 7500}, {name = Jane, salary = 6500}]}		
	}

}
