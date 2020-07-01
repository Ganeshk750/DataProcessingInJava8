package com.ganesh;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/*Collectors.minBy()/maxBy()
Collectors.minBy()
Collectors.maxBy()
*/
public class CollectorMaxOrMin {
	
	public static void main(String[] args) {
		
		List<Integer> intLst = Arrays.asList(2, 14, 4, 17, 5, 6, 1, 8, 2, 7, 8);
		 
		Optional<Integer> min = intLst.stream().collect(Collectors.minBy(Comparator.naturalOrder()));
		 
		min.ifPresent(System.out::println); //1
		System.out.println(min);//Optional[1]
		
		System.out.println("=========MaxBy=========");
		
		List<Integer> intLsts = Arrays.asList(2, 14, 4, 17, 5, 6, 1, 8, 2, 7, 8);
		 
		Optional<Integer> mins = intLsts.stream().collect(Collectors.maxBy(Comparator.naturalOrder()));
		 
		mins.ifPresent(System.out::println); //17
		System.out.println(mins);//Optional[17]
	}

}
