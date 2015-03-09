package com.dihuang.algorithm;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public List<Integer> spiralOrder(int[][] matrix) {
		List<Integer> result = new ArrayList<Integer>();
		if(matrix.length == 0){
			return result;
		}
		
		int rowBegin = 0;
		int rowEnd = matrix.length-1;
		int colBegin = 0;
		int colEnd = matrix[0].length -1;
		while(rowBegin<=rowEnd && colBegin <=colEnd){
			//Traverse Right
			for(int i = colBegin;i<=colEnd ;i++){
				result.add(matrix[rowBegin][i]);
			}
			rowBegin++;
			
			//traverse down
			for(int i = rowBegin;i<=rowEnd;i++){
				result.add(matrix[i][colEnd]);
			}
			colEnd--;
			
			//traverse left
			if(rowBegin <= rowEnd){
				for(int i = colEnd;i>=colBegin;i--){
					result.add(matrix[rowEnd][i]);
				}
			}
			rowEnd --;
			
			//traverse up 
			if(colBegin <= colEnd){
				for(int i = rowEnd;i>= rowBegin;i--){
					result.add(matrix[i][colBegin]);
				}
			}
			colBegin ++;
		}
		return result;
	}
}
