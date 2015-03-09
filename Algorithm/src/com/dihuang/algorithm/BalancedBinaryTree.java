package com.dihuang.algorithm;

public class BalancedBinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	 public static boolean isBalanced(TreeNode root) {
		 if(root == null){
			 return true;
		 }
		return isBalanced(root.left) && isBalanced(root.right) & Math.abs(getHeight(root.left)-getHeight(root.right))<=1;
	}
	
	 public static int getHeight(TreeNode root){
		 if(root == null){
			 return 0;
		 }
		 return getHeight(root.left) > getHeight(root.right) ? getHeight(root.left)+1 :getHeight(root.right)+1;
	 }
}

