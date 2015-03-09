package com.dihuang.algorithm;

public class ConstructBinaryTreeFromPreorderAndInorderTraversal {

	public static void main(String[] args) {
		int[] preorder = { 1,2,3};
		int[] inorder = { 3,2,1 };
		buildTree(preorder, inorder);
	}

	public static TreeNode buildTree(int[] preorder, int[] inorder) {
		if (preorder.length == 0 || preorder.length != inorder.length) {
			return null;
		}
		return treeNodeBuildTreeHelper(preorder, inorder, 0,
				preorder.length - 1, 0, inorder.length - 1);
	}

	public static TreeNode treeNodeBuildTreeHelper(int[] preorder,
			int[] inorder, int preStart, int preEnd, int inStart, int inEnd) {
		if (preStart > preEnd || inStart > inEnd
				|| (preEnd - preStart) != (inEnd - inStart)) {
			return null;
		} else {
			if (preStart == preEnd) {
				return new TreeNode(preorder[preStart]);
			}
		}

		TreeNode root = new TreeNode(preorder[preStart]);
		// look for root in preorder array
		int index = preStart;
		for (int i = inStart; i <= inEnd; i++) {
			if (inorder[i] == preorder[preStart]) {
				index = i;
				break;
			}
		}
		root.left = treeNodeBuildTreeHelper(preorder, inorder, preStart+1,
				preStart+index-inStart, inStart, index  - 1);
		root.right = treeNodeBuildTreeHelper(preorder, inorder, preStart+index-inStart+1,
				preEnd, index+1, inEnd );

		return root;

	}

}
