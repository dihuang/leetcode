package com.dihuang.algorithm;

public class Pow {

	public static void main(String[] args) {
		double x = 2;
		int n = -3;
		pow(x, n);

	}

	public static double pow(double x, int n) {
		double temp;
		if (n == 0)
			return 1;
		temp = pow(x, n / 2);
		if (n % 2 == 0) {
			return temp * temp;
		} else {
			if (n > 0) {
				return x * temp * temp;
			} else {
				return (temp * temp) / x;
			}
		}
	}
}
