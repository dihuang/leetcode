package com.dihuang.algorithm;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {

	public static void main(String[] args) {
		int[] A = {1,1,2,4,6,6,7};
		removeDuplicates(A);

	}

	public static  int removeDuplicates(int[] A) {
		int numOfDuplicates = 0;
		int temp ;
		for(int i = A.length-1;i>=0;i--){
			if((i != 0) && A[i] ==A[i-1]){
				temp = A[A.length-1-numOfDuplicates];
				A[A.length-1-numOfDuplicates] = A[i];
				A[i] = temp;
				numOfDuplicates++;
			}
		}
		Arrays.sort(A, 0, A.length - numOfDuplicates);
		return A.length - numOfDuplicates;
	}
	
}
