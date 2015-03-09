package com.dihuang.algorithm;

public class MinimumDepthOfBinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	 public int minDepth(TreeNode root) {
		 if(root == null){
			 return 0;
		 }
	        return minDepthHelper(root);
	    }
	 
	 public int minDepthHelper(TreeNode root){
		 if(root.left ==null && root.right ==null){
			 return 1;
		 }
		 if(root.left == null){
			return minDepthHelper(root.right)+1;
		 }
		 
		 if(root.right == null){
			 return minDepthHelper(root.left) +1;
		 }
		 return Math.min(minDepthHelper(root.left) +1, minDepthHelper(root.right)+1);
	 }
}
