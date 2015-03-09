package com.dihuang.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {

	public static void main(String[] args) {
		int[] input = {-1,0,1,0,-2,2};
		 Arrays.sort(input);
		 int target  = 0;
		 int size = input.length;
		 List<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		 for(int i =0;i<size;i++){
			 for(int j = i+1;j<size;j++){
				 int temp =  target - input[i] - input[j];
				 int start = j+1;
				 int end = size-1;
				 while(start < end){
					 if(input[start] +input[end] == temp){
						 ArrayList<Integer> entry = new ArrayList<Integer>();
						 entry.add(input[i]);
						 entry.add(input[j]);
						 entry.add(input[start]);
						 entry.add(input[end]);
						 result.add(entry);
						 start++;
						 end--;
						 //avoid duplication
						 while(start < end && input[start] == input[start-1]){
							 start++;
						 }
						 
						 while(start < end && input[end] == input[end+1]){
							 end--;
						 }
					 }else if((input[start] + input[end]) < temp){
						 start++;
						 while(start < end && input[start] == input[start-1]){
							 start++;
						 }
					 }else {
						 end--;
						 while(start < end && input[end] == input[end+1]){
							 end--;
						 }
					 }
				 }
				 
				 while(j< size && input[j]== input[j++]){
					 j++;
				 }
			 }
			 while(i<size && input[i] ==  input[i++]){
				 i++;
			 }
		 }
	}

}
