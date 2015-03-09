package com.dihuang.algorithm;

public class SymmetricTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public boolean isSymmetric(TreeNode root) {
		if (root == null) {
			return true;
		} else {
			return isSymmetricHelper(root.left, root.right);
		}
	}

	public boolean isSymmetricHelper(TreeNode left, TreeNode right) {
		if (left == null && right == null) {
			return true;
		}
		if (left == null || right == null) {
			return false;
		}
		if (left.val == right.val && isSymmetricHelper(left.right, right.left)
				&& isSymmetricHelper(left.left, right.right)) {
			return true;
		}
		return false;
	}
}
