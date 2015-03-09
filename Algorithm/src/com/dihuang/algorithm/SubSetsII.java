package com.dihuang.algorithm;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class SubSetsII {

	public static void main(String[] args) {
		int[] num = {1,2,2};
		subsetsWithDup(num);

	}

public static List<List<Integer>> subsetsWithDup(int[] num) {
	//Sort the input
    Arrays.sort(num);
    int numberSets = 1 << num.length;
    List<List<Integer>> solution = new LinkedList<>();
    for(int i = 0; i<numberSets; i++){
        List<Integer> subset = new LinkedList<Integer>();
        for(int j = 0; j< num.length; j++){
            if((i & (1 << j)) > 0){
                subset.add(num[j]);
            }
        }
        if(!solution.contains(subset))
            solution.add(subset);
    }

    return solution;
    }
}
