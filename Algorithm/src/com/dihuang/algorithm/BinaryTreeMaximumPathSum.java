package com.dihuang.algorithm;

public class BinaryTreeMaximumPathSum {

	public static int max;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static int maxPathSum(TreeNode root) {
		if (root == null) {
			return 0;
		}
		max = Integer.MIN_VALUE;
		traverse(root);
		return max;
	}
	
	public static int traverse(TreeNode root){
		if(root == null){
			return 0;
		}
		
		int left = traverse(root.left);
		int right = traverse(root.right);
		
		int val = root.val;
		int res = val+left>val+right ?(val+left >val ?val+left : val) :(val+right >val ?val+right :val);
		int temp = res> left+val+right ? res: left+val+right;
		
		if(max < temp){
			max = temp;
		}
		
		return res;
	}
}
