package com.dihuang.algorithm;

public class ExcelSheetColumnTitle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public String convertToTitle(int n) {
		return n != 0 ? new StringBuffer().append((char) ('A' + (n - 1) % 26))
				.insert(0, convertToTitle((n - 1) / 26)).toString() : "";
	}
}
