package com.dihuang.algorithm;

public class DungeonGame {

	public static void main(String[] args) {
		int[][] dungeon = {{-2,-3,3},{-5,-10,1},{10,30,-5}};
		new DungeonGame().calculateMinimumHP(dungeon);

	}

public int calculateMinimumHP(int[][] dungeon) {
	int w = dungeon[0].length;
    int[] dp = new int[w + 1];
    for(int x = 0; x<dp.length; x++)
        if(x != w-1)
            dp[x] = Integer.MAX_VALUE;

    for(int y=dungeon.length-1; y>=0; y--)
        for(int x=w-1; x>=0; x--)
            dp[x] = Math.max(0, Math.min(dp[x+1], dp[x]) - dungeon[y][x]);

    return dp[0] + 1;
    }
}
