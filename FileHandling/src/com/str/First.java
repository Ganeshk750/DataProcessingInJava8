package com.str;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class First {
	
 public static void main(String[] args) {
     String str = "mam";
     System.out.println(check(str));
     
  }

private static boolean check(String str1) {
	 
    StringBuffer sb = new StringBuffer(str1);
    sb.reverse();
     if(sb.equals(str1)) {
   	  return true;
     }
     return false;
   }
}
