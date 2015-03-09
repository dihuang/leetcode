package com.dihuang.algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinaryTreeLevelOrderTraversalII {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		 List<List<Integer>> result = 	levelOrderBottom(root);

	}
	public static List<List<Integer>> levelOrderBottom(TreeNode root) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		if (root == null) {
			return res;
		}

		DFS(root, 0, res);
		Collections.reverse(res);
		return res;
	}
	
	public static void DFS(TreeNode root, int level ,List<List<Integer>> res){
		if(root == null ){
			return;
		}
		
		if(level == res.size()){
			res.add(new ArrayList<Integer>());
		}
		
		res.get(level).add(root.val);
		DFS(root.left, level+1, res);
		DFS(root.right, level+1, res);
	}
}
