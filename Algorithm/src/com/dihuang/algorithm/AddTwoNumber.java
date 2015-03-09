package com.dihuang.algorithm;

public class AddTwoNumber {

	public static void main(String[] args) {
		ListNode l1  = new ListNode(2);
		l1.next = new ListNode(4);
		l1.next.next = new ListNode(3);
		
		ListNode l2 = new ListNode(5);
		l2.next = new ListNode(6);
		l2.next.next = new ListNode(4);
		
		addTwoNumbers(l1, l2);

	}

	static public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		return addTwoNumbersHelper(l1, l2, 0);
	}

	static public ListNode addTwoNumbersHelper(ListNode l1, ListNode l2,int carry) {
		if(l1 == null && l2 == null){
			if(carry > 0){
				return new ListNode(carry);
			}else {
				return null;
			}
		}
		
		int sum = carry;
		if(l1 != null){
			sum+= l1.val;
		}
		
		if(l2 != null){
			sum+=l2.val;
		}
		ListNode node = new ListNode(sum%10);
		carry  =  sum/10;
		
		node.next = addTwoNumbersHelper(l1==null?null :l1.next, l2==null?null:l2.next,carry);
		return node;
	}
}

