package com.dihuang.algorithm;

public class BestTimeToBuyAndSellStockIII {

	public static void main(String[] args) {
		int[][] test = { { 2, 1, 2, 0, 1 }, { 1 }, { 1, 2, 3, 1, 2, 3 } };
	    for (int[] t : test) {
	        System.out.println(maxProfit(t));
	    }

	}

	public static int maxProfit(int[] prices) {
		  int n = prices.length;
		    if (n == 0)
		        return 0;
		    int[] ltoR = new int[n];
		    ltoR[0] = 0;
		    int[] rtoL = new int[n];
		    int[] lmin = new int[n];
		    lmin[0] = prices[0];
		    int[] rmax = new int[n];
		    rmax[n - 1] = prices[n - 1];
		    int maxP = 0;

		    for (int i = 1; i < n; i++) {
		        // min price from left to right
		        lmin[i] = Math.min(lmin[i - 1], prices[i]);
		        // max price from right to left
		        rmax[n - i - 1] = Math.max(rmax[n - i], prices[n - i - 1]);
		        // max profit from left to right
		        ltoR[i] = Math.max(ltoR[i - 1], prices[i] - lmin[i]);
		        // max profit from right to left
		        rtoL[n - i - 1] = Math.max(rtoL[n - i], rmax[n - i - 1]
		                - prices[n - i - 1]);
		    }
		    for (int i = 0; i < n; i++) {
		        // combine two transaction by getting the profit from two side
		        maxP = Math.max(maxP, ltoR[i] + rtoL[i]);
		    }
		    return maxP;
	}
}
