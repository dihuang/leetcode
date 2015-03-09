package com.dihuang.algorithm;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GenerateParentheses {

	public static void main(String[] args) {
		generateParenthesis(3);

	}

	public static List<String> generateParenthesis(int n) {
		List<String> result = new ArrayList<String>();
		result.add("()");
		for(int i = 1;i<n;i++){
			Set<String> buffer = new HashSet<String>();
			for(int j = 0; j<result.size();j++){
				String str = result.get(j);
				for(int k =0;k<str.length();k++){
					buffer.add(str.substring(0, k) +"()" + str.substring(k, str.length()));
				}
			}
			result.clear();
			result.addAll(buffer);
		}
		return result;
	}
}
