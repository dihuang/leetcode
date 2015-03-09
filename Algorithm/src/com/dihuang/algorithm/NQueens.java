package com.dihuang.algorithm;

import java.util.ArrayList;
import java.util.List;

public class NQueens {

	public static void main(String[] args) {
		solveNQueens(2);

	}

	public static  List<String[]> result = new ArrayList<String[]>();
	public static List<String[]> solveNQueens(int n) {
		if(n<1){
			return result;
		}
		
		List<Integer> x = new ArrayList<Integer>();
		DFS(0,x,n);
		return result;
	}
	
	public static void DFS(int t,List<Integer> x,int n ){
		if(t>= n){
			String[] matrix = new String[n];
			for(int i = 0;i<n;i++){
				String[] line = buildStringWithDot(n);
				line[x.get(i)] = "Q";
				matrix[i] = convertStringArrayToString(line);
			}
			result.add(matrix);
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
	public static String convertStringArrayToString(String[] a){
		StringBuilder b = new StringBuilder();
		for(int i = 0;i<a.length;i++){
			b.append(a[i]);
		}
		
		return b.toString();
	}
	public static  String[] buildStringWithDot(int n){
		String[] a = new String[n];
		for(int i=0;i<n;i++){
			a[i] = ".";
		}
		return a;
	}
}
