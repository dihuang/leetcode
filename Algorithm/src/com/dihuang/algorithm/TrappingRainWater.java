package com.dihuang.algorithm;

public class TrappingRainWater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public int trap(int[] A) {
		 int n = A.length;
		 if(n==0) return 0;
	        int l = 0, r = n-1,block = 0,all = 0,curlevel = 0;
	        while(l<=r)
	        {
	            if(Math.min(A[l],A[r])>curlevel) 
	            {
	                all += (Math.min(A[l],A[r])-curlevel)*(r-l+1);
	                curlevel = Math.min(A[l],A[r]);
	            }
	            if(A[l]<A[r]) 
	                block += A[l++];
	            else 
	                block += A[r--];
	        }
	        return all-block;
	    }
}
