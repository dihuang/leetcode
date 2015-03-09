package com.dihuang.algorithm;

public class PlusOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int[] plusOne(int[] digits) {
		int carry  = 1;
		for(int i = digits.length-1;i>=0 && carry !=0;i--){
			int sum = carry + digits[i];
			carry = sum/10;
			digits[i] = sum%10;
		}
		
		if(carry != 0){
			digits[0] = 1;
			int[] result = new int[digits.length +1];
			for(int i = 0;i<digits.length;i++){
				result[i] = digits[i];
			}
			
			result[digits.length] = 0;
			return result;
		} 
		return digits;
	}
}
