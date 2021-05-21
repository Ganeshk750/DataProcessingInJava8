package com.ganesh;

import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeMap;

public class ProblemOne {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inputLength = sc.nextInt();
		int inputArray [] = new int[inputLength];
		for(int i = 0; i < inputLength; i++) {
			inputArray[i] = sc.nextInt();
		}
		System.out.println("Given Array: "+ Arrays.toString(inputArray));
		
		 TreeMap<Integer, Integer> ranks = new TreeMap<Integer, Integer>();
         for(int i = 0; i<inputLength; i++){
             ranks.put(inputArray[i], i);
         }
         String[] result = new String[inputLength];
         System.out.println("Initial Result Arry: "+ Arrays.toString(result));
         int rankCounter = 1;
         for(int rank : ranks.descendingKeySet()){
             if(rankCounter == 1){
                  result[ranks.get(rank)] = "Gold Medal";
                  System.out.println("OutPut: 1 "+ Arrays.toString(result));
             }else if(rankCounter == 2){
                 result[ranks.get(rank)] = "Silver Medal";
                 System.out.println("OutPut: 2 "+ Arrays.toString(result));
             }else if(rankCounter == 3){
                 result[ranks.get(rank)] = "Bronze Medal";
                 System.out.println("OutPut: 3 "+ Arrays.toString(result));
             }else{
             result[ranks.get(rank)] = ""+rankCounter;
             System.out.println("OutPut: - "+ Arrays.toString(result));
             }
             rankCounter++;
         }
     System.out.println("OutPut: "+ Arrays.toString(result));
     
	}

}
