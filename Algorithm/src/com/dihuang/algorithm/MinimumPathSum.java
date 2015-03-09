package com.dihuang.algorithm;

public class MinimumPathSum {

	public static void main(String[] args) {
		int[][] grid = new int[2][3];
		grid[0][0] = 1;
		grid[0][1] = 2;
		grid[0][2] = 3;
		grid[1][0] = 4;
		grid[1][1] = 5;
		grid[1][2] = 6;
		minPathSum(grid);

	}

	public static int minPathSum(int[][] grid) {
		int m = grid.length;
		int n = grid[0].length;
		int[][] result = new int[m][n];
		//initialize first row and column
		result[0][0] = grid[0][0];
		for(int i = 1 ;i<m;i++){
			result[i][0] = grid[i][0]+result[i-1][0];
		}
		for(int i = 1 ;i<n;i++){
			result[0][i] = grid[0][i]+result[0][i-1];
		}
		
		for(int i = 1 ;i<m;i++){
			for(int j= 1;j<n;j++){
				result[i][j] = Math.min(result[i-1][j], result[i][j-1]) + grid[i][j];
			}
		}
		return result[m-1][n-1];
	}
}
