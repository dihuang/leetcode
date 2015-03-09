package com.dihuang.algorithm;

import java.util.HashMap;
import java.util.Map;

public class CopyListWithRandomPointer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

public static  RandomListNode copyRandomList(RandomListNode head) {
	Map<RandomListNode,RandomListNode> nodemap = new HashMap<RandomListNode,RandomListNode>();
        return copyListHelper(head, nodemap);
    }

public static RandomListNode copyListHelper(RandomListNode head, Map<RandomListNode,RandomListNode> nodemap)  {
    if(head==null)  return null;
    if(nodemap.containsKey(head))  return nodemap.get(head);
    RandomListNode ret = new RandomListNode(head.label);
    nodemap.put(head,ret);
    ret.next = copyListHelper(head.next, nodemap);
    ret.random = copyListHelper(head.random,nodemap);
    return ret;
}
}


class RandomListNode {
	    int label;
	      RandomListNode next, random;
	     RandomListNode(int x) { this.label = x; }
	  };