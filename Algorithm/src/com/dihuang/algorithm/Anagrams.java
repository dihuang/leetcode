package com.dihuang.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Anagrams {
	public static void main(String[] args) {
		String[] input = {"tea","and","ate","eat","den"	};
		anagrams(input);
	}
	
    static public List<String> anagrams(String[] strs) {
    	Map<String,ArrayList<Integer>> resultMap = new HashMap<String, ArrayList<Integer>>();
    	List<String> output = new ArrayList<String>();
    	for(int i = 0; i< strs.length;i++){
    		String sortedString = getSortedString(strs[i]);
    		if(resultMap.containsKey(sortedString)){
    			ArrayList<Integer> indexList = resultMap.get(sortedString);
    			indexList.add(i);
    			resultMap.put(sortedString, indexList);
    		}else{
    			ArrayList<Integer> indexList = new ArrayList<Integer>();
    			indexList.add(i);
    			resultMap.put(sortedString, indexList);
    		}
    	}
    	Iterator it = resultMap.entrySet().iterator();
    	while(it.hasNext()){
    		Map.Entry<String,ArrayList<Integer>> pair =  (Entry<String, ArrayList<Integer>>) it.next();
    		ArrayList<Integer> temp =  (ArrayList<Integer>) pair.getValue();
    		if(!temp.isEmpty() & temp.size() > 1){
    			for(Integer index : temp){
    				output.add(strs[index]);
    			}
    		}
    	}
        return output;
    }
    
    static public String getSortedString(String input){
        if(input != null && !input.isEmpty() ){
        	char[] chars = input.toCharArray();
        	Arrays.sort(chars);
        	return new String(chars);
        }
        
        return null;
    }
}
