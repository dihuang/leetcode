package com.dihuang.algorithm;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinationsOfAPhoneNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	private static final String[] LETTERS = {
        "",       // 0
        "",       // 1
        "abc",    // 2
        "def",    // 3
        "ghi",    // 4
        "jkl",    // 5
        "mno",    // 6
        "pqrs",   // 7
        "tuv",    // 8
        "wxyz"   // 9
    };
	 public List<String> letterCombinations(String digits) {
		 List<String> result = new ArrayList<String>();
	        result.add("");
	        for(char c : digits.toCharArray()) {
	            String letter = LETTERS[c - '0'];
	            if(letter.length() == 0)
	                continue;
	            List<String> newResult = new ArrayList<String>();
	            for(char l : letter.toCharArray())
	                for(String s : result)
	                    newResult.add(s + l);
	            result = newResult;
	        }
	        return result;
	    }
}
