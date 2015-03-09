package com.dihuang.algorithm;

public class MaximumDepthOfBinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	 public int maxDepth(TreeNode root) {
	        return maxDepthHelper(root);
	    }
	 
	 public int maxDepthHelper(TreeNode root){
		 if(root == null){
			 return 0;
		 }
		 
		 return Math.max(maxDepth(root.left), maxDepth(root.right))+1;
	 }
}
