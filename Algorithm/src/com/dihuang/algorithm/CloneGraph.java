package com.dihuang.algorithm;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;

public class CloneGraph {

	public static void main(String[] args) {
		UndirectedGraphNode node0 = new UndirectedGraphNode(0);
		UndirectedGraphNode node1 = new UndirectedGraphNode(1);
		UndirectedGraphNode node2 = new UndirectedGraphNode(2);
		node0.neighbors.add(node1);
		node0.neighbors.add(node2);
		node1.neighbors.add(node2);
		node2.neighbors.add(node2);
		cloneGraph(node0);
	}

	public static UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
		if (node == null) {
			return node;
		}
		Queue<UndirectedGraphNode> myQueue = new ArrayDeque<UndirectedGraphNode>();
		Map<UndirectedGraphNode, UndirectedGraphNode> myMap = new HashMap<UndirectedGraphNode, UndirectedGraphNode>();
		UndirectedGraphNode newGraph = new UndirectedGraphNode(node.label);
		myQueue.add(node);
		myMap.put(node, newGraph);
		while (!myQueue.isEmpty()) {
			UndirectedGraphNode current = myQueue.poll();
			for (int i = 0; i < current.neighbors.size(); i++) {
				UndirectedGraphNode currentNeighbor = current.neighbors.get(i);
				if (myMap.get(currentNeighbor) == null) {
					UndirectedGraphNode newNode = new UndirectedGraphNode(
							currentNeighbor.label);
					myMap.put(currentNeighbor, newNode);
					myMap.get(current).neighbors.add(newNode);
					myQueue.add(currentNeighbor);
				} else {
					myMap.get(current).neighbors
							.add(myMap.get(currentNeighbor));
				}
			}
		}
		return newGraph;
	}
}
