package com.dihuang.algorithm;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrixII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int[][] generateMatrix(int n) {
		int[][] result = new int[n][n];
		if(n == 0){
			return result;
		}
		
		int rowBegin = 0;
		int rowEnd = n-1;
		int colBegin = 0;
		int colEnd = n -1;
	    int count = 1;
		while(rowBegin<=rowEnd && colBegin <=colEnd){
			//Traverse Right
			for(int i = colBegin;i<=colEnd ;i++){
				result[rowBegin][i] = count++;
			}
			rowBegin++;
			
			//traverse down
			for(int i = rowBegin;i<=rowEnd;i++){
				result[i][colEnd] = count++;
			}
			colEnd--;
			
			//traverse left
			if(rowBegin <= rowEnd){
				for(int i = colEnd;i>=colBegin;i--){
					result[rowEnd][i] =count++;
				}
			}
			rowEnd --;
			
			//traverse up 
			if(colBegin <= colEnd){
				for(int i = rowEnd;i>= rowBegin;i--){
					result[i][colBegin] = count++;
				}
			}
			colBegin ++;
		}
		return result;
	}
}
