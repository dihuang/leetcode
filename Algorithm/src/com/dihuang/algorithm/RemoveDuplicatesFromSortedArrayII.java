package com.dihuang.algorithm;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArrayII {

	public static void main(String[] args) {
		int[] A = {1,1,1,2,2,3,4};
		removeDuplicates(A);
	}

	public static int removeDuplicates(int[] A) {
		if(A.length ==0){
			return 0;
		}
		int numOfDuplicates = 0;
		int temp ;
		int duplicatesCount = 1;
		int numNotInTheArray = A[A.length-1] +10;
		int duplicate = numNotInTheArray;
		for(int i = A.length-1;i>=0;i--){
			if((i != 0) && A[i] ==A[i-1]){
				 if(A[i] == duplicate){
					 duplicatesCount++;
					 if(duplicatesCount > 2){
						 temp = A[A.length-1-numOfDuplicates];
							A[A.length-1-numOfDuplicates] = A[i];
							A[i] = temp;
							numOfDuplicates++;
					 }
				 }else{
					 duplicatesCount = 2;
					 duplicate = A[i];
				 }
				
			}
		}
		Arrays.sort(A, 0, A.length - numOfDuplicates);
		return A.length - numOfDuplicates;
	}
}
