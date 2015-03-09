package com.dihuang.algorithm;

public class SameTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public boolean isSameTree(TreeNode p, TreeNode q) {
		return isSameTreeHelper(p, q);
	}
	
	
	public boolean isSameTreeHelper(TreeNode p, TreeNode q) {
		if((p == null && q !=null) || (p != null && q ==null) ){
			return false;
		}else if(p==null && q == null){
			return true;
		}
		return (p.val == q.val) && (isSameTreeHelper(p.left, q.left)) && (isSameTreeHelper(p.right, q.right)) ;
	}
}
