package com.dihuang.algorithm;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartitioning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

public List<List<String>> partition(String s) {
	List<List<String>> result = new ArrayList<List<String>>();  
    List<String> list = new ArrayList<String>();  
      
    if (s == null || s.length() == 0)  
        return result;  
      
    calResult(result,list,s);  
    return result;  
    }

private void calResult(List<List<String>> result, List<String> list, String str) {
	
    if (str.length() == 0)  
        result.add(new ArrayList<String>(list));  
    int len = str.length();  
    
    for (int i=1; i<=len; ++i){  
        String subStr = str.substring(0, i);  
        if (isPalindrome(subStr)){  
            list.add(subStr);  
            String restSubStr = str.substring(i);  
            calResult(result,list,restSubStr);  
            list.remove(list.size()-1);  
        }  
    }  
}

private boolean isPalindrome(String str){  
    
    int i = 0;  
    int j = str.length() - 1;  
    while (i < j){  
        if (str.charAt(i) != str.charAt(j)){  
            return false;  
        }  
        i++;  
        j--;  
    }  
    return true;  
}  
}
