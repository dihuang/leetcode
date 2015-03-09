package com.dihuang.algorithm;

public class SearchInsertPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int searchInsert(int[] A, int target) {
		for (int i = 0; i < A.length; i++) {
            if(A[i]< target && (A.length-1)!=i){
            	continue;
            }else if(A[i] == target || A[i]> target){
            	return i;
            }else if(A[i] < target && (A.length-1)==i){
            	return i+1;
            }
		}
		return 0;
	}
}
