package com.dihuang.algorithm;

public class FindPeakElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int findPeakElement(int[] num) {
		if(num.length ==0){
			return 0;
		}else if(num.length == 1){
			return num[0];
		}
		for (int i = 0; i < num.length; i++) {
             if(i ==0 ){
            	 if((num[0] > num[1])){
            		 return num[0];
            	 }
             }else if(i == num[num.length-1]){
            	 if(  num[num.length-1] > num[num.length-1-1]){
            		 return num[num.length-1];
            	 }
             }else{
            	 if((num[i] >num[i-1] && (num[i] > num[i+1]))){
            		 return num[i];
            	 }
             }
		}
		return 0;
	}
}
