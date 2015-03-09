package com.dihuang.algorithm;

public class FirstMissingPositive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] A = {2};
        firstMissingPositive(A);
	}

	 public static int firstMissingPositive(int[] A) {
		 int len = A.length;
		if(len ==0){
			return 1;
		}
		
		for (int i = 0; i != len; ) {
	        if (A[i] != i + 1 && A[i] > 0 && A[i] <= len && A[A[i]-1] != A[i])
	            swap(A,i, A[i] - 1);
	        else ++i;
	    }
		
		for (int i = 0; i != len; ++i)
	        if (A[i] != i + 1) return i + 1;
	    return len+1;
	 }
	 
	 public static void swap(int[] A,int i,int j){
		 int temp = A[i];
		 A[i] = A[j];
		 A[j] = temp;
	 }
}
