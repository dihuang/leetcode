package com.dihuang.algorithm;

import java.util.ArrayList;
import java.util.List;

public class UniqueBST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int numTrees(int n) {
		if(n <0){
			return 0;
		}
		
		List<Integer> result = new ArrayList<Integer>();
		result.add(1);
		result.add(1);
		
		for(int k=2;k<=n;k++){
			int sum = 0;
			for(int i=1;i<=k;i++){
				sum+=(result.get(i-1)*result.get(k-i));
			}
			result.add(sum);
		}
		return result.get(n);
	}
}
