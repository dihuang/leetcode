package com.dihuang.algorithm;

import java.util.HashMap;
import java.util.Map;

public class LongestConsecutiveSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	 public int longestConsecutive(int[] num) {
		 Map<Integer, Integer> seq = new HashMap<Integer, Integer>();
         int longest = 0;
         for (int i = 0; i < num.length; i++) {
             if (seq.containsKey(num[i])) continue;

             int low= num[i],upp=num[i];

             if (seq.containsKey(num[i] - 1)) // Get the lowerbound if existed
                 low = seq.get(num[i] - 1);
             if (seq.containsKey(num[i] + 1)) // Get the upperbound if existed
                 upp = seq.get(num[i] + 1);

             longest = Math.max(longest, (upp - low)+ 1);

             seq.put(num[i],num[i]);          //Handle   3 & 4. See Beginning
             seq.put(low, upp);               //Handle 1 2 & 4 
             seq.put(upp, low);               //Handle 1 2 & 4 
         }
         return longest;
	    }
}
