package com.dihuang.algorithm;

import java.util.Deque;
import java.util.LinkedList;

public class MinStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	Deque<Integer> stack = new LinkedList<>();
	Deque<Integer> minStack = new LinkedList<>();
	
public void push(int x) {
	stack.push(x);
    if(minStack.isEmpty() || minStack.peek() >= x) {
        minStack.push(x);
    }
    }

    public void pop() {
    	int x = stack.pop();
        if(x == minStack.peek()) {
            minStack.pop();
        }
    }

    public int top() {
    	return stack.peek();
    }

    public int getMin() {
    	 return minStack.peek();
    }
}
