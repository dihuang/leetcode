package com.dihuang.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.naming.spi.DirStateFactory.Result;

public class CombinationSum {

	public static void main(String[] args) {
		int[] candidates = {2,3,6,7};
		combinationSum(candidates,7);

	}

	public static List<List<Integer>> combinationSum(int[] candidates, int target) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		List<Integer> entry = new ArrayList<Integer>();
		Arrays.sort(candidates);
		combinationSumHelper(candidates, entry, target, res);
		return res;
	}

	public static void combinationSumHelper(int[] candidates,
			List<Integer> entry, int target, List<List<Integer>> res) {

		int size = candidates.length;
		if(target ==0){
			if(entry.size() != 0){
				List<Integer> temp = new ArrayList<Integer>(entry);
				res.add(temp);
			}
			return;
		}
		
		if(target < candidates[0]){
			return;
		}
		
		for(int i =0;i<size;i++){
			if(target<candidates[i] || entry.size() !=0 && (entry.get(entry.size()-1) > candidates[i])){
				continue;
			}
			
			entry.add(candidates[i]);
			combinationSumHelper(candidates, entry, target-candidates[i], res);
			entry.remove(entry.size()-1);
		}
	}
}
