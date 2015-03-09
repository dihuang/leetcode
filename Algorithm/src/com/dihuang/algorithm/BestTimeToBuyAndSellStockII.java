package com.dihuang.algorithm;


public class BestTimeToBuyAndSellStockII {

	public static void main(String[] args) {
		int[] input = {1,2,4};
		maxProfit(input);

	}

	public static int maxProfit(int[] prices) {
		
		int profit = 0;
		for(int i = 0;i<prices.length;i++){
			if(i != prices.length-1){
				if(prices[i+1]-prices[i] >0){
					profit = profit + (prices[i+1]-prices[i]);
				}
			}
			
		}
		return profit;
	}

}
