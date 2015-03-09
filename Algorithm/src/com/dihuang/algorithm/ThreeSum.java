package com.dihuang.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

	public static void main(String[] args) {
		int[] input = {-1,0,1,2,-1,-4};
		 Arrays.sort(input);
		 int size = input.length;
		 List<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		 
		 for(int i = 0;i < size;i++){
			 int start = i+1;
			 int end = size -1;
			 while(start < end){
				 int sum = input[i] + input[start] + input[end];
				 
				 if(sum == 0){
					 ArrayList<Integer> entry =  new ArrayList<Integer>();
					 entry.add(input[i]);
					 entry.add(input[start]);
					 entry.add(input[end]);
					 result.add(entry);
					 
					 start++;
					 end--;
					 while(start < end && input[start] == input[start-1]) {
						 start++;
					 }
					 
					 while(start < end && input[end] == input[end+1]){
						 end--;
					 }
				 }else if(sum >0){
					 end--;
				 }else{
					 start++;
				 }
			 }
			 
			 if(i<size -1){
				 while (input[i] == input[i+1]){
					 i++;
				 }
			 }
		 }
	}
}
