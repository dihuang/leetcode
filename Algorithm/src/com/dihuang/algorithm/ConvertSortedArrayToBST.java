package com.dihuang.algorithm;

public class ConvertSortedArrayToBST {

	public static void main(String[] args) {
		int[] num = {0,1,2,3,4,5};
		sortedArrayToBST(num);

	}

	public static TreeNode sortedArrayToBST(int[] num) {
		return sortedArrayToBSTHelper(num, 0, num.length-1);
	}
	
	public static TreeNode sortedArrayToBSTHelper(int[] num,int start,int end){
		if(start > end){
			return null;
		}else if(start == end){
			return new TreeNode(num[start]);
		}
		TreeNode root;
		if(start +1 == end){
			root = new TreeNode(num[start]);
			root.right = new TreeNode(num[end]);
		}else{
			int mid = start+ (end-start)/2;
			root = new TreeNode(num[mid]);
			root.left = sortedArrayToBSTHelper(num, start, mid-1);
			root.right = sortedArrayToBSTHelper(num, mid+1, end);
		}
		
		return root;
	}
}
