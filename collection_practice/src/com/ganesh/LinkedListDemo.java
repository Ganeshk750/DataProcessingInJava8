package com.ganesh;

import java.util.LinkedList;

public class LinkedListDemo {
	
  public static void main(String[] args) {
	  
	  LinkedList l = new LinkedList();
	  l.add("Ganesh");
	  l.add(30);
	  l.add(null);
	  l.add("prince");
	  l.add(0,"vnkey");
	  l.add("software");
	  l.add(null);
	  l.removeLast();
	  l.add("CCC");
	  System.out.println(l);
	  
	
  }
}
