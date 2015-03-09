package com.dihuang.algorithm;

public class RemoveDuplicatesFromSortedList {

	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		head.next = new ListNode(1);
		head.next.next = new ListNode(1);
        deleteDuplicates(head);
	}

	public static ListNode deleteDuplicates(ListNode head) {
		 if (head == null) {
				return head;
			}

			ListNode result = head;
			while (result != null) {
	               while(result != null &&result.next != null && (result.val == result.next.val)){
	                   result.next = result.next.next;
	               }
	                result = result.next;
			}
			return head;
	}
}
