package com.dihuang.algorithm;

public class Candy {

	public static void main(String[] args) {
	int[] ratings = {1,5,3,1};
	candy(ratings);

	}

	public static int candy(int[] ratings) {
	    int[] candys = new int[ratings.length];
	    for(int index = 0;index<candys.length;index ++){
	    	candys[index] = 1;
	    }
	    for(int i = 1;i< ratings.length;i++){
	    	//from left to right
	    	if(ratings[i] > ratings[i-1]){
	    		candys[i] = candys[i-1]+1;
	    	}
	    }
	    
	    for(int i = ratings.length-1;i>0;i--){
	    	//from right to left
	    	if((ratings[i] < ratings[i-1])&& (candys[i] >= candys[i-1])){
	    		candys[i-1] = candys[i]+1;
	    	}
	    }
	    int mins = 0;
	    for(int i = 0;i<candys.length;i++){
	    	mins+=candys[i];
	    }
		return mins;
	}
}
