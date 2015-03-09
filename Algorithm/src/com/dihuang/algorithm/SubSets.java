package com.dihuang.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class SubSets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public List<List<Integer>> subsets(int[] S) {
		Arrays.sort(S);
	    int totalNumber = 1 << S.length;
	    List<List<Integer>> collection = new ArrayList<List<Integer>>(totalNumber);
	    for (int i=0; i<totalNumber; i++) {
	        List<Integer> set = new LinkedList<Integer>();
	        for (int j=0; j<S.length; j++) {
	            if ((i & (1<<j)) != 0) {
	                set.add(S[j]);
	            }
	        }
	        collection.add(set);
	    }
	    return collection;
	}
	
	public List<List<Integer>> subsets1(int[] S) {
		if (S == null)
			return null;
	 
		Arrays.sort(S);
	 
		List<List<Integer>> result = new ArrayList<List<Integer>>();
	 
		for (int i = 0; i < S.length; i++) {
			List<List<Integer>> temp = new ArrayList<List<Integer>>();
	 
			//get sets that are already in result
			for (List<Integer> a : result) {
				temp.add(new ArrayList<Integer>(a));
			}
	 
			//add S[i] to existing sets
			for (List<Integer> a : temp) {
				a.add(S[i]);
			}
	 
			//add S[i] only as a set
			List<Integer> single = new ArrayList<Integer>();
			single.add(S[i]);
			temp.add(single);
	 
			result.addAll(temp);
		}
	 
		//add empty set
		result.add(new ArrayList<Integer>());
	 
		return result;
	}
}
