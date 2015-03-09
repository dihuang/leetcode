package com.dihuang.algorithm;

import java.util.List;

public class Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int minimumTotal(List<List<Integer>> triangle) {
		int rowNum = triangle.get(triangle.size() - 1).size();
	    int colNum = triangle.size();
	    int[][] dp = new int[rowNum][colNum];
	    int i = 0;
	    for (Integer n : triangle.get(colNum - 1)) {
	        dp[rowNum - 1][i++] = n;
	    }
	    for (int row = rowNum - 2, m = 0; row >= 0; row--, m++) {
	        for (int col = 0; col <= colNum - 2 - m; col++) {
	            dp[row][col] = Math.min(dp[row + 1][col], dp[row + 1][col + 1])
	                    + triangle.get(row).get(col);
	        }
	    }
	    return dp[0][0];
	}
}
