package com.dihuang.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSumII {

	public static void main(String[] args) {
		int[] candidates = {10,1,2,7,6,1,5};
		combinationSum(candidates,8);
	}

	public static List<List<Integer>> combinationSum(int[] candidates, int target) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		List<Integer> entry = new ArrayList<Integer>();
		Arrays.sort(candidates);
		combinationSumHelper(candidates, entry, target, res,0);
		return res;
	}

	public static void combinationSumHelper(int[] candidates,
			List<Integer> entry, int target, List<List<Integer>> res, int index) {

		int size = candidates.length;
		if(target ==0 &entry.size() != 0){
				List<Integer> temp = new ArrayList<Integer>(entry);
				res.add(temp);
			return;
		}
		
		if(index == size){
			return;
		}
		if(target < candidates[index]){
			return;
		}
		
		for(int i =index;i<size;i++){
			entry.add(candidates[i]);
			combinationSumHelper(candidates, entry, target-candidates[i], res,i+1);
			entry.remove(entry.size()-1);
			while(i<size-1 && candidates[i] == candidates[i+1]){
				i++;
			}
		}
	}
}
