package com.dihuang.algorithm;

public class DecodeWays {

	public static void main(String[] args) {
		String input = "12349999912";
		numDecodings(input);
	}

	 public static int numDecodings(String s) {
	        if(s == null || s.isEmpty()){
	            return 0;
	        }

	        if(s.length() == 1){
	            if(isZero(s, 0)){
	                return 0;
	            }else{
	                return 1;
	            }
	        }

	        int[] a = new int[s.length()];

	        if(isZero(s, 0)){
	            return 0;
	        }else{
	            a[0] = 1;
	        }


	        if(isZero(s, 1)){
	            if(isLetter(s, 1)){
	                a[1] = 1;
	            }else{
	                return 0;
	            }

	        }else if(isLetter(s, 1)){
	            a[1] = 2;
	        }else{
	            a[1] = 1;
	        }

	        for (int i = 2; i < s.length(); i++){

	            if(isZero(s, i)){
	                if(isLetter(s, i)){
	                    a[i] = a[i-2];
	                }else{
	                    return 0;
	                }

	            }else if(isLetter(s, i)){
	                a[i] = a[i-1] + a[i-2];
	            }else{
	                a[i] = a[i-1];
	            }
	        }
	        return a[s.length()-1];
	    }

	    public static  boolean isZero(String s, int index){
	        return s.charAt(index) == '0';
	    }

	    /**
	     * return true if it is a 2 digital number < 26
	     */
	    public static boolean isLetter(String s, int index){
	        char c1 = s.charAt(index);
	        char c2 = s.charAt(index - 1);

	        if(c2 == '1'){
	            return (c1>='0' && c1 <= '9');
	        }else if(c2 =='2'){
	            return (c1>='0' && c1 <= '6');
	        }

	        return false;
	    }
}
