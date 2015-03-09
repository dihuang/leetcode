package com.dihuang.algorithm;

public class FlattenBinaryTreeToLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void flatten(TreeNode root) {
		while(root !=null){
			if(root.left !=null){
				TreeNode temp = root.left;
				while(temp.right !=null){
					temp = temp.right;
				}
				temp.right = root.right;
				root.right = root.left;
				root.left = null;
			}
			root= root.right;
		}
	}
}
