package com.dihuang.algorithm;

public class FindMinimumInRotatedSortedArray {

	public static void main(String[] args) {
	     int[] A = {4, 5, 6 ,7 ,0, 1, 2};
           findMin(A);
	}

	public static int findMin(int[] num) {
		int low = 0;
		int high = num.length-1;
		while(low < high){
			if(num[low] < num[high]){
				return num[low];
			}
			if((high - low) == 1){
				if(num[low] <num[high]){
					return num[low];
				}else{
					return num[high];
				}
			}
			int mid = (low+high)/2;
			if(num[mid] >num[low]){
				low = mid;
			}else{
				high = mid;
			}
		}
		return num[low];
	}
}
