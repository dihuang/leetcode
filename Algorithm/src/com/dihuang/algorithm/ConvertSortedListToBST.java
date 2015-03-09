package com.dihuang.algorithm;

public class ConvertSortedListToBST {

	public static void main(String[] args) {
		ListNode head = new ListNode(0);
		sortedListToBST(head);
	}

	public static TreeNode sortedListToBST(ListNode head) {
		return sortedListToBSTHelper(head, getTreeLength(head));
	}
	public static TreeNode sortedListToBSTHelper(ListNode head,int length) {
		
		ListNode midNode = getMidNode(head, length);
		TreeNode root = null;
		if(midNode != null){
			root = new TreeNode(midNode.val);
			root.left = sortedListToBSTHelper(head, (length-1)/2);
			root.right= sortedListToBSTHelper(midNode.next, length/2);
		}
		return root;
	}
	
	public static ListNode getMidNode(ListNode head,int length){
		if(length <=0){
			return null;
		}
		int mid = (length-1)/2;
		for(int i = 0; i< mid ;i++){
				head = head.next;
			}
		return head;
	}
	public static int getTreeLength(ListNode head){
		int size = 0;
		while(head != null){
			size+=1;
			head = head.next;
		}
		return size;
	}
}
