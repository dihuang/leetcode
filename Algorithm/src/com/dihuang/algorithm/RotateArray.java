package com.dihuang.algorithm;

import java.util.Arrays;

public class RotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 1, 2, 3 };
		new RotateArray().rotate(nums, 1);
	}

	public void rotate(int[] nums, int k) {
		int n = nums.length;
        k %= n;
        int toSwap = k;
        int swapped = 0;
        int j = -1;
        for (int i = n - 1; i >= 0; i -= swapped) {
            j = i;
            while (j - toSwap >= 0 && i - j < toSwap) {
                swap(nums, j - toSwap, j);
                j--;
            }
            swapped = i - j;
            if (swapped == 0) {
                return;
            }
            if (swapped != toSwap) {
                toSwap -= swapped;
            }
        }
	}

	public void swap(int[] nums, int a, int b) {
		int temp = nums[a];
		nums[a] = nums[b];
		nums[b] = temp;
	}

}
