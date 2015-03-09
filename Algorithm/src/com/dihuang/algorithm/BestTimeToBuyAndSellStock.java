package com.dihuang.algorithm;

public class BestTimeToBuyAndSellStock {

	public static void main(String[] args) {
		int[] input = {2,1,2,1,0,1,2};
		maxProfit(input);

	}

	
    public static int maxProfit(int[] prices) {
    	if(prices.length == 0){
    		return 0;
    	}
    	int min  = prices[0];
    	int maxGap = 0;
    	for(int i=0;i< prices.length;i++){
    		int current = prices[i];
    			int localMax = current - min;
    			maxGap = localMax > maxGap ? localMax : maxGap;
    			min = current < min ? current : min;
    	}
        return maxGap;
    }
}
