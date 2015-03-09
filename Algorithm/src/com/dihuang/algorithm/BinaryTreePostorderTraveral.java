package com.dihuang.algorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreePostorderTraveral {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(1);
		root.right = new TreeNode(2);
		root.right.left = new TreeNode(3);
		postorderTraversal(root);
	}

	 public static List<Integer> postorderTraversal(TreeNode root) {
		 List<Integer> res = new ArrayList<Integer>();
	        if(root == null){
	        	return res;
	        }
	        Stack<TreeNode> myStack = new Stack<TreeNode>();
	        Stack<TreeNode> outPutStack = new Stack<TreeNode>();
	        myStack.add(root);
	        while(!myStack.isEmpty()){
	        	TreeNode current = myStack.pop();
	        	outPutStack.add(current);
	        	if(current.left!= null){
	        		myStack.add(current.left);
	        	}
	        	
	        	if(current.right !=null){
	        		myStack.add(current.right);
	        	}
	        	
	        }

        	while(!outPutStack.isEmpty()){
        		res.add(outPutStack.pop().val);
        	}
	        return res;
	    }
}
