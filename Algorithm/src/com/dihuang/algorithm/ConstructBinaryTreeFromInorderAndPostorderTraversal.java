package com.dihuang.algorithm;

public class ConstructBinaryTreeFromInorderAndPostorderTraversal {

	public static void main(String[] args) {
		int[] inorder = { 2,1,3};
		int[] postorder = { 2,3,1 };
		buildTree(inorder, postorder);
	}

	public static TreeNode buildTree(int[] inorder, int[] postorder) {
		if (inorder.length == 0 || inorder.length != postorder.length) {
			return null;
		}
		return treeNodeBuildTreeHelper(inorder, postorder, 0,
				inorder.length - 1, 0, postorder.length - 1);
	}

	public static TreeNode treeNodeBuildTreeHelper(int[] inorder,
			int[] postorder, int inStart, int inEnd, int postStart, int postEnd) {
		if (inStart > inEnd || postStart > postEnd
				|| (inEnd - inStart) != (postEnd - postStart)) {
			return null;
		} else {
			if (inStart == inEnd) {
				return new TreeNode(inorder[inStart]);
			}
		}

		TreeNode root = new TreeNode(postorder[postEnd]);
		// look for root in inorder array
		int index = inStart;
		for (int i = inStart; i <= inEnd; i++) {
			if (inorder[i] == postorder[postEnd]) {
				index = i;
				break;
			}
		}
		root.left = treeNodeBuildTreeHelper(inorder, postorder, inStart,
				index - 1, postStart, postStart + index - inStart - 1);
		root.right = treeNodeBuildTreeHelper(inorder, postorder, index + 1,
				inEnd, postStart + index - inStart, postEnd - 1);

		return root;

	}
}
