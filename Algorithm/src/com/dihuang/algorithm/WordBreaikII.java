package com.dihuang.algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class WordBreaikII {

	public static void main(String[] args) {
		String s = "catsanddog";
		Set<String> dict = new HashSet<String>();
		dict.add("cat");
		dict.add("cats");
		dict.add("and");
		dict.add("sand");
		dict.add("dog");
		wordBreak(s, dict);

	}
	 public static List<String> wordBreak(String s, Set<String> dict) {
	        Map<Integer, List<String>> validMap = new HashMap<Integer, List<String>>();

	        // initialize the valid values
	        List<String> l = new ArrayList<String>();
	        l.add("");
	        validMap.put(s.length(), l);

	        // generate solutions from the end
	        for(int i = s.length() - 1; i >= 0; i--) {
	            List<String> values = new ArrayList<String>();
	            for(int j = i + 1; j <= s.length(); j++) {
	                if (dict.contains(s.substring(i, j))) {
	                    for(String word : validMap.get(j)) {
	                        values.add(s.substring(i, j) + (word.isEmpty() ? "" : " ") + word);
	                    }
	                }
	            }
	            validMap.put(i, values);
	        }
	        return validMap.get(0);
	    }
}
