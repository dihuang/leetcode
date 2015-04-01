package com.dihuang.algorithm;

public class ReverserBits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	 public int reverseBits(int n) {
		 int y = 0;
		    int digit = 0;
		    int x = n;

		    for(int i = 0 ; i < 32; i++){
		         y = y << 1;
		         digit = x & 1;
		         y = y | digit;
		         x = x >> 1;
		    }

		    return y;
	    }
}
