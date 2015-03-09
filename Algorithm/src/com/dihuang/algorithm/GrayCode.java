package com.dihuang.algorithm;

import java.util.ArrayList;
import java.util.List;

public class GrayCode {

	public static void main(String[] args) {
		grayCode(4);

	}

	public static List<Integer> grayCode(int n) {
		List<Integer> arr = new ArrayList<Integer>();
	    arr.add(0);
	    for(int i=0;i<n;i++){
	        int inc = 1<<i;
	        for(int j=arr.size()-1;j>=0;j--){
	            arr.add(arr.get(j)+inc);
	        }
	    }
	    return arr;
	}
}
