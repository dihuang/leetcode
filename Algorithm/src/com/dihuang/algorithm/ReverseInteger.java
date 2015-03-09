package com.dihuang.algorithm;

import java.util.Stack;

public class ReverseInteger {

	public static void main(String[] args) {
		int x = -123;
		reverse(x);
	}

	public static int reverse(int x) {
		String s = String.valueOf(x);
		StringBuilder temp = new StringBuilder();
		Stack<String> myStack = new Stack<String>();

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '-') {
				temp.append(s.charAt(0));
			} else {
				myStack.add(String.valueOf(s.charAt(i)));
			}
		}
		while (!myStack.isEmpty()) {
			temp.append(myStack.pop());
		}
		return Integer.valueOf(temp.toString());
	}
}
