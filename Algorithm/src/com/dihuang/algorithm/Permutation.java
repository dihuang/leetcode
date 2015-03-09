package com.dihuang.algorithm;

import java.util.ArrayList;
import java.util.List;

public class Permutation {

	public static void main(String[] args) {
		Permutation instance = new Permutation();
		int[] num = {2,5,7,8};
		instance.permute(num);

	}
	boolean [] isUsed;
    int numLength;
    List<List<Integer>> output;
    List <Integer> al;
	 public List<List<Integer>> permute(int[] num) {
		 numLength = num.length;
	        al = new ArrayList <Integer>();
	        output = new ArrayList<List<Integer>>();
	        isUsed = new boolean[num.length];
	        doPermutation(0, num);
	        return output;
	    }
	 public void doPermutation(int index, int[] num) {
	        // base case
	        if (index == numLength) {
	            output.add(new ArrayList<Integer>(al));
	            return;
	        }
	        for (int i = 0; i < numLength; i++) {
	            if (!isUsed[i]) {
	                al.add(num[i]);
	                isUsed[i] = true;
	                doPermutation(index + 1, num);
	                isUsed[i] = false;
	                al.remove(index);
	            }
	        }
	    }
}
