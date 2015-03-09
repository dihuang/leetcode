package com.dihuang.algorithm;

public class CountAndSay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

public String countAndSay(int n) {
	if(n<=0) {
        return "";
    }

    String nowStr="1";
    for(int current=1; current<n; current++) {
        nowStr = getSay(nowStr);
    }
    return nowStr;
    }


String getSay(String pre) {
    int count =0;
    StringBuilder reStr = new StringBuilder("");
    for(int i = 0; i<pre.length(); i++){
        count ++;
        if ((i+1 < pre.length()) && (pre.charAt(i) != pre.charAt(i + 1))) {
            reStr = reStr.append(count).append(pre.charAt(i));
            count = 0;
        }
        else if ((i+1 == pre.length())) {
            reStr = reStr.append(count).append(pre.charAt(i));
        }   
    }
    return reStr.toString();
}

}