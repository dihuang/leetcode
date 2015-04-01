package com.dihuang.algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class RepeatedDNASequences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
public List<String> findRepeatedDnaSequences(String s) {
	List<String> result=new ArrayList<String>();  
    HashMap<Integer,Integer> computed=new HashMap<Integer,Integer>();  
    for(int i=0;i<=s.length()-10;i++)  
    {  
      String sub=s.substring(i,i+10);  
      int key=getKey(sub);  
      if(computed.containsKey(key))  
      {  
        computed.put(key,computed.get(key)+1);  
        if(computed.get(key)==2)  
          result.add(sub);  
      }  
      else  
        computed.put(key,1);  
    }  
    return result;  
    }

public int getKey(String s)  
{  
  int result=0;  
  for(int i=s.length()-1;i>=0;i--)  
  {  
    int b=0;  
    switch(s.charAt(i))  
    {  
      case 'A':  
        b|=0;  
        break;  
      case 'T':  
        b|=1;  
        break;  
      case 'G':  
        b|=2;  
        break;  
      case 'C':  
        b|=3;  
        break;  
    }  
    result=b|result;  
    result=result<<2;  
  }  
  return result;  
}  
}
