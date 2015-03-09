package com.dihuang.algorithm;

public class RemoveNthNodeFromEndOfList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	 public ListNode removeNthFromEnd(ListNode head, int n) {
		 ListNode slow = head;
		    ListNode fast = head;
		    for (int i = 0; i < n; i++) {
		        fast = fast.next;
		    }
		    if (fast == null) {
		        return slow.next;
		    }
		    while (fast.next != null) {
		        slow = slow.next;
		        fast = fast.next;
		    }
		    slow.next = slow.next.next;
		    return head;
	    }
}
