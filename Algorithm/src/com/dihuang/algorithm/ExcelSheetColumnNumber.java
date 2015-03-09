package com.dihuang.algorithm;

public class ExcelSheetColumnNumber {

	public static void main(String[] args) {
		String ab = "AB";
		System.out.print(titleToNumber(ab));
	}
    public static int titleToNumber(String s) {
    	int val = 0;
        for (int i=0; i<s.length(); i++){
            val = val * 26 + 1 + (int) s.charAt(i) - (int) 'A';
        }
        return val;
    }
}
