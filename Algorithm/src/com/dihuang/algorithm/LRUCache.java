package com.dihuang.algorithm;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {

	static class Node{
        Node next;
        Node prev;
        int key;
        int val;
        Node(){}
        Node(int key, int val){this.key = key; this.val = val;}

        public void delete(){
            prev.next = next;
            if(next != null)
                next.prev = prev;
        }

        public void addAfter(Node preNode){
            next = preNode.next;
            if(next != null)
                next.prev = this;
            preNode.next = this;
            prev = preNode;
        }
    }
	
	Node head = new Node();
    Node tail = head;
    Map<Integer, Node> cache = new HashMap<Integer, Node>();
    int capacity;
	 public LRUCache(int capacity) {
	        this.capacity = capacity;
	    }
	    
	    public int get(int key) {
	    	Node n = cache.get(key);
	    	if(n == null){
	    		return -1;
	    	}
	    	moveToTail(n);
	        return n.val;
	    }
	    
	    private void moveToTail(Node n) {
			if(n == tail){
				return;
			}
			n.delete();
			addToTail(n);
			
		}

		private void addToTail(Node n) {
			n.addAfter(tail);
			tail = n;
		}

		public void set(int key, int value) {
	        Node n = cache.get(key);
	        if(n !=null){
	        	n.val = value;
	        	moveToTail(n);
	        	return;
	        }
	        
	        n = new Node(key,value);
	        cache.put(key, n);
	        addToTail(n);
	        
	        if(cache.size() > capacity){
	        	n = head.next;
	        	cache.remove(n.key);
	        	n.delete();
	        }
	    }
}
