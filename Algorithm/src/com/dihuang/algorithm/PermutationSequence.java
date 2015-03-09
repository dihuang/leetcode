package com.dihuang.algorithm;

import java.util.ArrayList;
import java.util.List;

public class PermutationSequence {

	public static void main(String[] args) {
		getPermutation(3, 5);
	}

	public static String getPermutation(int n, int k) {
        int t = 1;
        List<Integer> numbers = new ArrayList<>(n);
        for (int i = 1; i <= n; i++) {
            t = t * i;
            numbers.add(i);
        }
        t /= n;
        k--;
        StringBuilder sb = new StringBuilder();
        for (int i = n - 1; i >= 1; i--) {
            int p = k / t;
            int np = numbers.get(p);
            sb.append(String.valueOf(np));
            numbers.remove(p);
            k %= t;
            t /= i;
        }
        sb.append(String.valueOf(numbers.get(0)));
        return sb.toString();
    }
}
