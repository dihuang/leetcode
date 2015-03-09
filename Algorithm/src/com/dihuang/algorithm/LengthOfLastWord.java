package com.dihuang.algorithm;

public class LengthOfLastWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	 public int lengthOfLastWord(String s) {
		 if(s == null || s.length() == 0)
	            return 0;

	        int begin = -1, end = -1;

	        for(int i = s.length()-1; i >= 0; --i) {
	            if(end == -1 && !Character.isSpaceChar(s.charAt(i)))
	                end = i;

	            if(end != -1 && Character.isSpaceChar(s.charAt(i))) {
	                begin = i;
	                break;
	            }
	        }

	        return end-begin;
	    }
}
