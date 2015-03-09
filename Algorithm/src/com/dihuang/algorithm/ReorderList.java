package com.dihuang.algorithm;

import java.util.Stack;

public class ReorderList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	 public void reorderList(ListNode head) {
		 if(head==null || head.next==null) return;
	        ListNode lnMiddle=getMiddle(head);
	        ListNode lnHalf=lnMiddle.next;
	        lnMiddle.next=null; // split into two list
	        lnHalf=reverse(lnHalf); // Reverse the 2nd list
	        head=Merge(head,lnHalf); // Merge them
	    }
	 
	 public ListNode Merge(ListNode first, ListNode second){
	        ListNode dummyHead=new ListNode(0);
	        ListNode curr=dummyHead;
	        Boolean flag=true;
	        while(first!=null && second!= null){
	            if (flag){
	                curr.next=first;
	                first=first.next;
	                flag=false;
	            }
	            else{
	                curr.next=second;
	                second=second.next;
	                flag=true;
	            }
	            curr=curr.next;
	        }
	        curr.next=(first==null)? second:first;
	        return dummyHead.next;
	    }//Merge

	    public ListNode reverse(ListNode n){
	       if(n==null || n.next==null) return n;
	       Stack<ListNode> lnStack=new Stack<ListNode>();
	        while(n!=null){
	            lnStack.push(n);
	            n=n.next;
	        }
	        n=lnStack.pop();
	        ListNode current=n;  // lnHalf is null right now.
	        while(!lnStack.isEmpty()){
	            current.next=lnStack.pop();
	            current=current.next;
	        }
	        current.next=null; // ** Very Important, or will return a infinite loop
	       return n;    
	    }// reverse
	    public ListNode getMiddle(ListNode n){
	        ListNode slow,fast;
	        slow=fast=n;
	        while(fast.next!=null && fast.next.next!=null){
	            slow=slow.next;
	            fast=fast.next.next;
	        }
	        return slow;
	    }// getMiddle
}
