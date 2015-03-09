package com.dihuang.algorithm;

public class MaximumSubarray {

	public static void main(String[] args) {
		int[] A = {-2,1,-3,4,-1,2,1,-5,4};
		maxSubArray(A);
	}

	public static int maxSubArray(int[] A) {
		int ans=A[0],i,sum=0;
        for(i=0;i<A.length;i++){
            sum+=A[i];
            ans=Math.max(sum,ans);
            if(sum<0)sum=0;
        }
        return ans;
	}
}
