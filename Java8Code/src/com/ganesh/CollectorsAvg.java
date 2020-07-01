package com.ganesh;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*Collectors.averagingInt()/averagingLong()/averagingDouble()
 * 
 * */
public class CollectorsAvg {
	
	public static void main(String[] args) {
		
		List<Integer> intLst = Arrays.asList(2, 14, 4, 17, 5, 6, 1, 8, 2, 7, 8);
		 
		Double average = intLst.stream().collect(Collectors.averagingInt(i->i));
		System.out.println(average); // 6.7272727272727275
		
		System.out.println("==============Symilar we can do for long or double=================");
	}

}
