package com.ganesh;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*Collectors.summingInt()/summingLong()/summingDouble()
 * */
public class CollectorSummingAll {
	
	public static void main(String[] args) {
		
		List<Integer> intLst = Arrays.asList(2, 14, 4, 17, 5, 6, 1, 8, 2, 7, 8);
		 
		Integer total = intLst.stream().collect(Collectors.summingInt(i->i));
		System.out.println(total); // 74
		
		
		System.out.println("==============Sumilarlay We Can Do Long or Double================");
	}

}
