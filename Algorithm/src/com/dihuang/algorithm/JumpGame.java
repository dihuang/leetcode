package com.dihuang.algorithm;

public class JumpGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public boolean canJump(int[] A) {
		if(A.length ==1){
			return true;
		}else if(A[0] == 0){
			return false;
		}
		
		for(int i =1;i< A.length;i++){
			A[i] = Math.max(A[i-1] -1, A[i]);
			if(A[i] == 0 && i!= (A.length-1)){
				return false;
			}
		}
		return true;
	}
}
