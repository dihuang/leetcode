package com.dihuang.algorithm;

public class LinkedListCycleII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public ListNode detectCycle(ListNode head) {
		if (head == null || head.next == null) {
			return null;
		}
		boolean isCycle = false;
		ListNode slow = head;
		ListNode fast = head;
		while (slow != null && fast != null) {
			slow = slow.next;
			if (fast.next == null) {
				return null;
			}
			fast = fast.next.next;
			if (slow == fast) {
				isCycle = true;
				break;
			}
		}

		if (!isCycle) {
			return null;
		}
		slow = head;
		while (slow != fast) {
			slow = slow.next;
			fast = fast.next;
		}
		return slow;
	}
}
