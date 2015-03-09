package com.dihuang.algorithm;

import java.util.Deque;
import java.util.LinkedList;

public class ValidParentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public boolean isValid(String s) {
		if (s == null || s.length() == 0)
			return true;

		Deque<Character> stack = new LinkedList<Character>();

		char array[] = s.toCharArray();

		for (int i = 0; i < array.length; i++) {
			if (array[i] == '(' || array[i] == '{' || array[i] == '[') {
				stack.push(array[i]);
			} else if (array[i] == ')' || array[i] == '}' || array[i] == ']') {
				if (stack.isEmpty()) {
					return false;
				}
				char temp = stack.pop();
				switch (array[i]) {
				case ')':
					if (temp != '(')
						return false;
					break;
				case ']':
					if (temp != '[')
						return false;
					break;
				case '}':
					if (temp != '{')
						return false;
					break;
				}
			} else {
				return false;
			}
		}
		if (!stack.isEmpty()) {
			return false;
		}

		return true;
	}
}
