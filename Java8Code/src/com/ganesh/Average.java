package com.ganesh;

import java.util.Arrays;
import java.util.List;
import java.util.function.IntConsumer;

public class Average implements IntConsumer {
	
	private int total = 0;
	private int count = 0;
	

	public double average() {
		return count > 0 ? ((double) total) / count : 0;
	}
	
	@Override
	public void accept(int i) {
		total += i; count++;
		
	}
	
    public void combine(Average other) {
        total += other.total;
        count += other.count;
    }
    
    public String toString() {
        return String.format("Total Salaries = %d, Number Developers = %d, Average Salary = %.2f", this.total, this.count, average());
      }
    
    static List<Developer> developers= Arrays.asList(new Developer("Jack", 5400),
    	    new Developer("Joe", 7500),
    	    new Developer("Jane", 6500),
    	    new Developer("Mary", 6200)
    	  );
    
    
    static Average avgCollect = developers.stream()
    		.map(Developer::getSalary)
    		.collect(Average::new, Average::accept, Average::combine);
    
    
    
    public static void main(String[] args) {
  		System.out.println(avgCollect);
  	}
      
    
    public static class Developer {
    	
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
    
  
 

}
