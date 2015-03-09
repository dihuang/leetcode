package com.dihuang.algorithm;

import java.util.ArrayDeque;
import java.util.Queue;

public class PopulatingNextRightPointersInEachNode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void connect(TreeLinkNode root) {
		if(root == null){
			return;
		}
       Queue<TreeLinkNode> myQueue = new ArrayDeque<TreeLinkNode>();
       myQueue.add(root);
       TreeLinkNode dummy = new TreeLinkNode(0);
       myQueue.add(dummy);
       while(!myQueue.isEmpty()){
    	   TreeLinkNode current = myQueue.poll();
    	   if(myQueue.peek() == dummy){
    		   current.next = null;
    		   if(current.left != null){
    			   myQueue.add(current.left);
        		   myQueue.add(current.right);
        		   myQueue.add(dummy);
    		   }
    	   }else{
    		   current.next = myQueue.peek();
    		   if(current.left != null){
    			   myQueue.add(current.left);
        		   myQueue.add(current.right);
    		   }
    	   }
       }
	}
}
