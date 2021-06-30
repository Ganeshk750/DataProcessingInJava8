package com.ganesh;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeSet;

public class ProblemTwo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String inputString = sc.nextLine();
		System.out.println("Given: "+ inputString);
		
		ArrayList<String> str = new ArrayList<String>();
		String wordsList = sc.nextLine();
		str.add(wordsList);
		System.out.println(str);
		//String[] arr = new String[str.size()];
		//String[] matchingStr = str.toArray(arr);
		
		
		//String inputString = "abcde";
		//String [] matchingStr = {"a", "bb", "acd", "ace"};
		//int outPut = numMatchingSubseq(inputString, matchingStr);
		
		//System.out.println(outPut);
		
	}
	
	 public static int numMatchingSubseq(String S, String[] words) {
		 Map<Character, TreeSet<Integer>> map = new HashMap<>();
	        for(int i = 0; i < S.length(); i++) {
	            if(!map.containsKey(S.charAt(i))) map.put(S.charAt(i), new TreeSet<>());
	            map.get(S.charAt(i)).add(i);
	        }
	        int result = 0;
	        for(String word : words) {
	            int i = 0;
	            int pos = -1;
	            for(; i < word.length(); i++) {
	                if(!map.containsKey(word.charAt(i))) break;
	                Integer match = map.get(word.charAt(i)).ceiling(pos);
	                if(match == null) break;
	                pos = match + 1;
	            }
	            if(i == word.length()) result++;
	        }
	        return result;
		 }

}
