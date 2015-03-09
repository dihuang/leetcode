package com.dihuang.algorithm;

import java.util.ArrayList;
import java.util.List;

public class PathSumII {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(0);
		root.left = new TreeNode(1);
		root.right = new TreeNode(1);
		pathSum(root, 1);

	}

	public static List<List<Integer>> pathSum(TreeNode root, int sum) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		List<Integer> path = new ArrayList<Integer>();
		 pathSumHelper(root, sum, path, res);
		 return res;
	}
	
	public static void pathSumHelper(TreeNode root, int sum,List<Integer> path,List<List<Integer>> res) {
		if(root == null){
			return;
		}
		path.add(root.val);
		if(root.left == null && root.right ==null && root.val == sum){
			List<Integer> pathTemp = new ArrayList<Integer>(path);
			res.add(pathTemp);
		}
		if(root.left !=null){
			pathSumHelper(root.left, sum- root.val, path, res);
		}
		if(root.right !=null){
			pathSumHelper(root.right, sum-root.val, path, res);
		}
		if(path.size() !=0){
			path.remove(path.size()-1);
		}
	}
}
