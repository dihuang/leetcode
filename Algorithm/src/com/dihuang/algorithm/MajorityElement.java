package com.dihuang.algorithm;

import java.util.Arrays;

public class MajorityElement {

	public static void main(String[] args) {
		int[] num = {1,2,3,4,5,2,3,2,2,2,2};
           majorityElement(num);
	}

	public static int majorityElement(int[] num) {
		 Arrays.sort(num);
		    return num[num.length / 2];
	}
}
