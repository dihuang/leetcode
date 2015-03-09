package com.dihuang.algorithm;

import java.util.ArrayList;
import java.util.List;

public class Combinations {

	public static void main(String[] args) {
		combine(4,2);
	}

	 public static List<List<Integer>> combine(int n, int k) {
		 List<List<Integer>> res = new ArrayList<List<Integer>>();
		 List<Integer> entry = new ArrayList<Integer>();
		 combineHelper(res, entry, n, k, 1);
		 return res;
	    }
	 
	 public static void combineHelper(List<List<Integer>> res,List<Integer> entry,int n,int k,int start){
		 if(entry.size() == k){
			 List<Integer> temp = new ArrayList<Integer>(entry);
			 res.add(temp);
			 return;
		 }
		 
		 for(int i = start ; i<= n;i++){
			 if(entry.size() < k){
				 entry.add(i);
				 combineHelper(res, entry, n, k, i+1);
				 entry.remove(entry.size()-1);
			 }else{
				 continue;
			 }
		 }
	 }
}
