package com.dihuang.algorithm;

public class RotateList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	 public ListNode rotateRight(ListNode head, int n) {
		 if(head == null) return head;
	        if(n<=0) return head;

	        ListNode current = head;

	        //count the number of element, and find the tail
	        int count = 0;
	        ListNode oldTail = current;

	        while(current!= null)
	        {
	            count++;
	            oldTail = current;
	            current = current.next;
	        }

	        // find the modulo of number of steps of rotation with the number of element
	        // if the result is zero, return head
	        n = n%count;
	        if(n==0) return head;           

	        //else, break the list as far as (count - number of rotation) steps from the head
	        //for example, if the list is 1-2-3-4-5 and k=2,
	        //then the new tail will be 5-2=3 steps from the head, which is 3.

	        //but first, let's make a cycle
	        oldTail.next = head;

	        //start finding the node to break
	        ListNode newTail = null;
	        ListNode newHead = head;
	        for(int i = 0 ; i<count - n; i++)
	        {
	            newTail = newHead;
	            newHead = newHead.next;
	        }

	        //break the cycle on the new head
	        newTail.next = null;
	        return newHead;
	    }
}
