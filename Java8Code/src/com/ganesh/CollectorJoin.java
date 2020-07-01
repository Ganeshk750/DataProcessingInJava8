package com.ganesh;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*Collectors.joining()
It returns a Collector that concatenates the input elements into a String, 
in encounter order

Signature 1:
------------
public static Collector<CharSequence, ?, String> joining()

Signature 2:
------------
public static Collector<CharSequence, ?, String> joining(CharSequence delimiter)

It returns a Collector that concatenates the input elements, separated by the specified delimiter, 
in encounter order.

Signature 3:
------------
public static Collector<CharSequence, ?, String> joining(CharSequence delimiter, CharSequence prefix, CharSequence suffix)

Returns a Collector that concatenates the input elements, separated by the specified delimiter, with the specified prefix and suffix.

*/

public class CollectorJoin {
	
	public static void main(String[] args) {
		
		List<String> strLst = Arrays.asList("https://", "learn", "java8", ".com");
		 
		String result = strLst.stream().collect(Collectors.joining());
		System.out.println(result); //https://learnjava8.com

		
		System.out.println("=============Collectors.joining===============");
		
		List<String> strLsts = Arrays.asList("Jack", "Joe", "Jane", "Mary");
		 
		String results = strLsts.stream().collect(Collectors.joining(", "));
		System.out.println(results);//Jack, Joe, Jane, Mary
		
		
		List<String> strList = Arrays.asList("Jack", "Joe", "Jane", "Mary");
		 
		String res = strList.stream().collect(Collectors.joining(", ", "names=[", "]"));
		System.out.println(res);
		// names=[Jack, Joe, Jane, Mary]

	}

}
