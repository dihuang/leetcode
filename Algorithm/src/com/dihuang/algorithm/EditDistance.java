package com.dihuang.algorithm;

public class EditDistance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	 public static int minDistance(String word1, String word2) {
		 int row = word1.length();
		 int col = word2.length();
		 
		 int[][] table = new int[row+1][col+1];
		 if(row == 0 || col == 0){
			 return Math.max(row, col);
		 }
		 for(int i = 1;i<=row;i++){
			 table[i][0] = i;
		 }
		 
		 for(int i = 1;i<=col;i++){
			 table[0][i] = i;
		 }
		 for(int i = 1;i<=row;i++){
			 for(int j = 1;j<=col;j++){
				 if(word1.charAt(i-1) == word2.charAt(j-1)){
					 table[i][j] = table[i-1][j-1];
				 }else{
					 table[i][j]=Math.min(Math.min(table[i-1][j], table[i][j-1]),table[i-1][j-1])+1;
				 }
			 }
		 }
	        return table[row][col];
	    }
}
