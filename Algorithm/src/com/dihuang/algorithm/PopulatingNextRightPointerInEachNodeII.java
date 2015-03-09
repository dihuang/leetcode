package com.dihuang.algorithm;

public class PopulatingNextRightPointerInEachNodeII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void connect(TreeLinkNode root) {
		TreeLinkNode head = null;
		TreeLinkNode prev = null;
		TreeLinkNode cur = root;

		while (cur != null) {
			while (cur != null) {
				if (cur.left != null) {
					if (prev != null) {
						prev.next = cur.left;
					} else {
						head = cur.left;
					}
					prev = cur.left;
				}
				
				if(cur.right != null){
					if(prev != null){
						prev.next = cur.right;
					}else{
						head = cur.right;
					}
					
					prev = cur.right;
				}
				
				cur = cur.next;
			}
			cur = head;
			head = null;
			prev = null;
		}
	}
}
