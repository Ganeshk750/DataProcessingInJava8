package com.ganesh;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListDemo {
  public static void main(String[] args) {
	   
	  ArrayList li = new ArrayList();
	  li.add("A");
	  li.add(10);
	  li.add("A");
	  li.add(null);
	  System.out.println(li);
	  li.remove(2);
	  System.out.println(li);
	  li.add(2,"M");
	  li.add("N");
	  System.out.println(li);
	  
	        // Output :-
	        //  [A, 10, A, null]
			//  [A, 10, null]
			//  [A, 10, M, null, N]
	  
   }
}
