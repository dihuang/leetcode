package com.dihuang.algorithm;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;


public class BinaryTreeLevelOrderTraversal {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		 List<List<Integer>> result = 	levelOrder(root);
	}

   public static List<List<Integer>> levelOrder(TreeNode root) {
	   List<List<Integer>> res = new ArrayList<List<Integer>>();
	   if(root == null){
		   return res;
	   }
	   
	   Queue<TreeNode> myQueue = new ArrayDeque<TreeNode>();
	   myQueue.add(root);
	   TreeNode dummy = new TreeNode(-1);
	   myQueue.add(dummy);
	   List<Integer> level = new ArrayList<Integer>();
	   while(!myQueue.isEmpty()){
		   TreeNode current = myQueue.poll();
		   if(current == dummy){
			   if(level.size() != 0){
				   List<Integer> temp = new ArrayList<Integer>(level);
				   res.add(temp);
			   }
			   
			   if(!myQueue.isEmpty()){
				   level.clear();
				   myQueue.add(dummy);
			   }
		   }else{
			   level.add(current.val);
			   if(current.left != null){
				   myQueue.add(current.left);
			   }
			   
			   if(current.right != null){
				   myQueue.add(current.right);
			   }
		   }
		   
	   }
        return res;
    }
}


