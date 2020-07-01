package com.ganesh;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

//Collectors.summarizingInt()

public class CollectorsSummrazingInt {
	
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
		
		IntSummaryStatistics statistics = developers.stream().collect(Collectors.summarizingInt(Developer::getSalary));
		 
		String statisticsStr = String.format("count = %d, min = %d, max = %d, sum = %d, average = %.2f", 
		                     statistics.getCount(), statistics.getMin(), 
		                     statistics.getMax(), statistics.getSum(), statistics.getAverage());
		 
		System.out.println(statisticsStr); 
		// count = 4, min = 5400, max = 7500, sum = 25600, average = 6400,00
	}

}



//Collectors.toCollection()
//With Collectors.toCollection(), we can custom the implementation of collection.
//List<Integer> linkedList = intLst.stream().collect(Collectors.toCollection(LinkedList::new));
