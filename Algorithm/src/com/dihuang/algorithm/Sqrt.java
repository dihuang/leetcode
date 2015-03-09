package com.dihuang.algorithm;

public class Sqrt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = (int) Math.sqrt(2);
      sqrt(2);
	}

public static int sqrt(int x) {
	long i = 0;
    long j = x / 2 + 1;
    while (i <= j) {
        long mid = (i + j) / 2;
        if (mid * mid == x)
            return (int)mid;
        if (mid * mid < x)
            i = mid + 1;
        else
            j = mid - 1;
    }
    return (int)j;
    }
}
