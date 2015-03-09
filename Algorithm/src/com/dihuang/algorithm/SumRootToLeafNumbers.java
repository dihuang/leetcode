package com.dihuang.algorithm;

public class SumRootToLeafNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int sumNumbers(TreeNode root) {
		if(root ==null){
			return 0;
		}
		return sumNumbersHelper(root,0);
	}
	
	public int sumNumbersHelper(TreeNode root,int sum) {
		if(root.left == null && root.right==null){
			return sum*10+root.val;
		}
		
		if(root.left == null){
			return sumNumbersHelper(root.right, sum*10+root.val);
		}
		
		if(root.right == null){
			return sumNumbersHelper(root.left, sum*10+root.val);
		}
		
		return sumNumbersHelper(root.right, sum*10+root.val) + sumNumbersHelper(root.left, sum*10+root.val);
	}
}
