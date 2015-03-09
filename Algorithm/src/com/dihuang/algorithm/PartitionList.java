package com.dihuang.algorithm;

public class PartitionList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	 public ListNode partition(ListNode head, int x) {
		 ListNode cur=head;

	        ListNode smaller_sentinel=new ListNode(0);
	        ListNode smaller_cur=smaller_sentinel;
	        ListNode larger_sentinel=new ListNode(0);
	        ListNode larger_cur=larger_sentinel;
	//Now, go along the list, partitioning into two halves.        
	        while(cur!=null){
	            if(cur.val<x){
	                    smaller_cur.next=cur;
	                    smaller_cur=smaller_cur.next;

	            }else{
	                    larger_cur.next=cur;
	                    larger_cur=larger_cur.next;
	            }
	            cur=cur.next;
	        }
	//Now, do the concatenation of two havles. Make sure the last node points to null 
	        larger_cur.next=null;
	        smaller_cur.next=larger_sentinel.next;
	        return smaller_sentinel.next;
	    }
}
