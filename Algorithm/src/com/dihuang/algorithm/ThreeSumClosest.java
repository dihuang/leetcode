package com.dihuang.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSumClosest {

	public static void main(String[] args) {
		int[] input = {0,2,1,-3};
		threeSumClosest(input, 1);
		
	}

public static int threeSumClosest(int[] num, int target) {
	 Arrays.sort(num);
	 int size = num.length;
	 List<Integer> result = new ArrayList<Integer>();
     int gap = Integer.MAX_VALUE;
     int sum = 0;
     for(int i = 0;i<size ;i++){
    	 int start = i+1;
    	 int end = size - 1;
    	 while (start < end){
    		 int temp = num[i] + num[start] + num[end];
    		 if(Math.abs(temp-target) < gap){
    			 gap = Math.abs(temp-target);
    			 sum = temp;
    			 result.clear();
    			 result.add(num[i]);
    			 result.add(num[start]);
    			 result.add(num[end]);
    		 }
    		 
    		 if(temp > target){
    			 end--;
    		 }else {
    			 start++;
    		 }
    	 }
     }
     
     return sum;
    }
}
