package com.dihuang.algorithm;

import java.util.ArrayList;
import java.util.List;

public class NQueensII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
     public static int count = 0;
	 public int totalNQueens(int n) {
		 if(n<1){
				return 0;
			}
			
			List<Integer> x = new ArrayList<Integer>();
			DFS(0,x,n);
			return count;
	    }
	
	public static void DFS(int t,List<Integer> x,int n ){
		if(t>= n){
			count++;
		}else{
			for(int i = 0;i<n;i++){
				boolean skip = false;
				for(int j=0;j<t;j++){
					if(x.get(j) == i || Math.abs(i-x.get(j)) == Math.abs(t-j)){
						skip = true;
						break;
					}
				}
				if(skip){
					continue;
				}
				x.add(t, i);
                DFS(t+1,x,n);
			}
		}
	}
}
