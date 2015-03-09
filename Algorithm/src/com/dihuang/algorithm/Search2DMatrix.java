package com.dihuang.algorithm;

public class Search2DMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public boolean searchMatrix(int[][] matrix, int target) {
		
		int m = matrix.length;
		int n = matrix[0].length;
		
		// search for rows
		int low = 0, mid =0,row=-1;
		int high = m -1;
		while(low <= high){
			mid  = (high+low)/2;
			if(matrix[mid][0] <=target){
				if(matrix[mid][n-1] >=target){
					row = mid;
					break;
				}else{
					low = mid+1;
				}
			}else{
				high = mid -1;
			}
		}
		
		if(row == -1){
			return false;
		}
		
		//search for column
		low = 0;
		high = n-1;
		while(low<=high){
			mid = (high+low)/2;
			if(matrix[row][mid] == target){
				return true;
			}else if(matrix[row][mid] < target){
				low = mid+1;
			}else{
				high = mid-1;
			}
		}
		return false;
	}

}
