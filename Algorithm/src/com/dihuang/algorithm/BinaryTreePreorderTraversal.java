package com.dihuang.algorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreePreorderTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public static List<Integer> preorderTraversal(TreeNode root) {
		 List<Integer> res = new ArrayList<Integer>();
	        if(root == null){
	        	return  res;
	        }
	        Stack<TreeNode> tempStack = new Stack<TreeNode>();
	        tempStack.add(root);
	        while(!tempStack.isEmpty()){
	        	TreeNode current = tempStack.pop();
	        	res.add(current.val);
	        	if(current.right != null){
	        		tempStack.add(current.right);
	        	}
	        	if(current.left != null){
	        		tempStack.add(current.left);
	        	}
	        }
	        return res;
	    }
}
