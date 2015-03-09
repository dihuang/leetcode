package com.dihuang.algorithm;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class BinaryTreeZigzagLevelOrderTraversal {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		List<List<Integer>> result = zigzagLevelOrder(root);

	}

	public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		if (root == null) {
			return res;
		}
		Queue<TreeNode> myQueue = new ArrayDeque<TreeNode>();
		myQueue.add(root);
		TreeNode dummy = new TreeNode(-1);
		myQueue.add(dummy);
		int direction = 0; // left to right
		Stack<Integer> myStack = new Stack<Integer>();
		List<Integer> level = new ArrayList<Integer>();
		while (!myQueue.isEmpty()) {
			TreeNode current = myQueue.poll();
			if (current == dummy) {
				if (!myQueue.isEmpty()) {
					myQueue.add(current);
				}

				if (!myStack.isEmpty()) {
					while (!myStack.isEmpty()) {
						level.add(myStack.pop());
					}
				}
				List<Integer> levelCopy = new ArrayList<Integer>(level);
				res.add(levelCopy);
				level.clear();
				direction = 1 - direction;
			} else {
				if (direction == 1) {
					myStack.add(current.val);
				} else {
					level.add(current.val);
				}

				if (current.left != null) {
					myQueue.add(current.left);
				}
				if (current.right != null) {
					myQueue.add(current.right);
				}
			}
		}
		return res;
	}
}
