package com.dihuang.algorithm;

public class SingleNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int singleNumber(int[] A) {
		int result = A[0];
		for (int i = 1; i < A.length; i++) {
			result = result ^ A[i]; /* Get the xor of all elements */
		}
		return result;
	}
}
