package com.dihuang.algorithm;

public class InsertionSortList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	 public static ListNode insertionSortList(ListNode head) {
		 if(head == null){
			 return head;
		 }
		 
		 ListNode sorted_head = head;
		 head = head.next;
		 sorted_head.next = null;
		 
		 while(head != null){
			 ListNode next  = head.next;
			 if(head.val <sorted_head.val){
				 head.next = sorted_head;
				 sorted_head = head;
			 }else{
				  ListNode temp = sorted_head;
				  while(temp.next != null && temp.next.val < head.val){
					  temp = temp.next;
				  }
				  ListNode tail = temp.next;
				  temp.next = head;
				  head.next = tail;
			 }
			 
			 head = next;
		 }
	        return sorted_head;
	    }
}
