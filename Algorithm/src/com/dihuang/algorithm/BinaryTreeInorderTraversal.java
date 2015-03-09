package com.dihuang.algorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;


public class BinaryTreeInorderTraversal {

	public static void main(String[] args) {
		BSTNode root = new BSTNode(1);
		root.left = new BSTNode(2);
		inorderTraversal(root);

	}

	public static List<Integer> inorderTraversal(BSTNode root) {
		Stack<BSTNode> todo = new Stack<BSTNode>();
		List<Integer> res = new ArrayList<Integer>();
		while(!todo.isEmpty() || root!= null){
			if(root != null){
				todo.add(root);
				root =  root.left;
			}else{
				root = todo.pop();
				res.add(new Integer(root.val));
				root  = root.right;
			}
		}
		return res;
	}
}


class BSTNode {
	int val;
	BSTNode left;
	BSTNode right;

	BSTNode(int x) {
		val = x;
	}
}
