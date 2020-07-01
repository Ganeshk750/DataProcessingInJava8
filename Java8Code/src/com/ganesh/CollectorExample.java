package com.ganesh;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
 *Stream.collect(Collector collector)
 *collect(Supplier, BiConsumer, BiConsumer).
 *Collectors.toList(), toSet(), toMap()
 **/

public class CollectorExample {
	
	public static void main(String[] args) {
		
		List<Integer> intList = Arrays.asList(2, 14, 4, 17, 5, 6, 1, 8, 2, 7, 8, 4, 14, 5, 2, 80);
		Integer total = intList.stream().collect(Collectors.summingInt(i->i));
		System.out.println("============SummingInteger===========");
		System.out.println("Result: "+total);
		System.out.println("============FilterEvenNumber==============");
		List<Integer> newList = intList.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
		System.out.println(newList);
		
		System.out.println("============FilterEvenNumber In Sorted ==============");
		List<Integer> newsList = intList.stream().filter(i -> i % 2 == 0).sorted().collect(Collectors.toList());
		System.out.println(newsList);
		
		
		System.out.println("============FilterEvenNumber With No Dublicate==============");
		Set<Integer> newLists = intList.stream().filter(i -> i % 2 == 0).collect(Collectors.toSet());
		System.out.println(newLists);
		
		
		//Sorting these array elements
		List<String> list = Arrays.asList("Ganesh", "Ramesh", "Dinesh", "Dinesh", "Chandan", "Shashi","Ganesh", "Bunty", "Vishal");
		
		List<String> sortArr = list.stream().filter(ele -> ele.contentEquals("Ganesh")).collect(Collectors.toList());
		System.out.println(sortArr);
		
		//Remove Dublicate
		System.out.println("<===========Removing Dublicate String=========> ");
		System.out.println(list);
		Set<String> sList = list.stream().collect(Collectors.toSet());
		System.out.println("===After Removing Dublicate Stirng ==");
		System.out.println(sList);
		
		//Removing + Shorting
		System.out.println("<=====>>======Removing Dublicate With Sorted String=========> ");
		System.out.println(sList);
		Set<String> sLists = list.stream().collect(Collectors.toSet());
		System.out.println("==>>>=After Removing Dublicate and Sorted List ==");
		System.out.println(sLists);
		
		//Shorting
		System.out.println("=====***====Sorting Happens When we use removedDublicate List============");
		List<String> ss = sLists.stream().sorted().collect(Collectors.toList());
		System.out.println(ss);
		
		System.out.println("====****=====Shorting Happens with the Help of another Collections ===============");
		TreeSet<String> st = new TreeSet<String>(sLists);
		System.out.println(st);
		
		
		
				         
		
	}

}
