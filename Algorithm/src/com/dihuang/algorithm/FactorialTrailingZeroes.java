package com.dihuang.algorithm;

public class FactorialTrailingZeroes {

	public static void main(String[] args) {

	}

public static int trailingZeroes(int n) {
       return n == 0 ? 0 : n / 5 + trailingZeroes(n / 5);
    }
}
