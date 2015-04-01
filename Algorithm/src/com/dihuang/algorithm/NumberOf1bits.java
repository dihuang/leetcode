package com.dihuang.algorithm;

public class NumberOf1bits {

	public static void main(String[] args) {
     double a  = Math.pow(2, 32);
     new NumberOf1bits().hammingWeight((int) a);
	}

	 public int hammingWeight(int n) {
	        int count = 0;
	        while(n != 0){
	            n = n & (n-1);
	            count++;
	        }
	        return count;
	    }
}
