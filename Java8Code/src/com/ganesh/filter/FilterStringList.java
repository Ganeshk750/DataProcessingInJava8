package com.ganesh.filter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FilterStringList {
	
	public static void main(String[] args) {
		
	List<String> strList = Arrays.asList("Java", "Python", "Java Stream", "Java Tutorial", "Nodejs Tutorial");
	
	 List<String> outputList = new ArrayList<String>();
	 
	 for(String s : strList) {
		 if(s.contains("Java")) {
			 outputList.add(s);
		 }
	 }
	 System.out.println(outputList);//[Java, Java Stream, Java Tutorial]
	}

}
