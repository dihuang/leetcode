package com.dihuang.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermutationII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	boolean [] isUsed;
    int numLength;
    List<List<Integer>> output;
    List <Integer> solution;
	 public List<List<Integer>> permuteUnique(int[] num) {
		 output = new ArrayList<List<Integer>>();
		    numLength = num.length;
		    if(numLength == 0){
		    	return output;
		    }
		    Arrays.sort(num);
		    solution = new ArrayList <Integer>();
	        isUsed = new boolean[num.length];
	        doPermutation(0, num);
	        return output;
	    }
	 public void doPermutation(int index, int[] num) {
	        // base case
	        if (index == numLength) {
	            output.add(new ArrayList<Integer>(solution));
	            return;
	        }
	        for (int i = 0; i < numLength; i++) {
	            if (!isUsed[i]) {
	            	if(i>0 && num[i] == num[i-1] && isUsed[i-1])
	            		continue;
	            	solution.add(num[i]);
	                isUsed[i] = true;
	                doPermutation(index + 1, num);
	                isUsed[i] = false;
	                solution.remove(index);
	            }
	        }
	    }
}
