package com.dihuang.algorithm;

import java.util.HashMap;
import java.util.Map;

public class IntersectionOfTwoLinkedLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	Map<ListNode,Integer> map = new HashMap<ListNode, Integer>();
   public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
	   if(headA == null || headB == null){
		   return null;
	   }
	   map.put(headA, 0);
	   //traverse A
	   ListNode temp = headA;
	  while(temp.next !=null){
		   map.put(temp.next, 0);
		   
		   temp=temp.next;
	   }
	   if(map.get(headB)!=null){
		   return headB;
	   }
	   temp = headB;
	   while(temp.next != null){
		  if(map.get(temp.next) !=null){
			  return temp.next;
		  }
		  temp = temp.next;
	   }
        return null;
    }
}
