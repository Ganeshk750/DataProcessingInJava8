package com.ganesh;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/*Collectors.collectingAndThen()
 *  It adapts a Collector to perform an additional finishing transformation.
 *  finisher is a function to be applied to the final result of the downstream collector.
 * */
public class CollectorAndThen {
	
   public static void main(String[] args) {
	   
	   List<Developer> list = Arrays.asList(new Developer("Shashi", "Trainee", 15000),
               new Developer("Vivek", "Frontend", 10000),
               new Developer("Ganesh", "Trainee", 13000),
               new Developer("Alock", "SeniorDeveloper", 25000));
	   
	   System.out.println("========Finding Max Salary w.r.t Name=========");
	   
	   String name = list.stream().collect(Collectors.collectingAndThen(
               Collectors.maxBy(Comparator.comparing(Developer::getSalary)),
               (Optional<Developer> dev) -> dev.isPresent() ? dev.get().getName() : "none"
             ));
       System.out.println(name);//Alock
	
    }
}
