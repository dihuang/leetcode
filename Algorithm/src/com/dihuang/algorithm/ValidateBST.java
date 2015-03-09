package com.dihuang.algorithm;

public class ValidateBST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public boolean isValidBST(TreeNode root) {
		return isValidBSTHelper(root, Integer.MAX_VALUE, Integer.MIN_VALUE);
	}
	
	public boolean isValidBSTHelper(TreeNode root,int max,int min) {
		if(root == null){
			return true;
		}
		
		if(root.val >=max || root.val <=min){
			return false;
		}
		if(root.left != null){
			if(root.val<=root.left.val  || !isValidBSTHelper(root.left,root.val,min)){
				return false;
			}
		}
		if(root.right != null){
			if(root.val >= root.right.val || !isValidBSTHelper(root.right, max, root.val)){
				return false;
			}
		}
		return true;
	}
}
