package com.dihuang.algorithm;

import java.util.ArrayList;
import java.util.List;

public class RemoveElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	 public int removeElement(int[] A, int elem) {
		 if(A.length == 0){
			 return 0;
		 }
		 int count = 0;
		 List<Integer> index = new ArrayList<Integer>();
		 for(int i=0;i<A.length;i++){
			 if(A[i] == elem){
				 count++;
				 index.add(i);
			 }
		 }
		 for(int i=A.length-1;i>=0;i--){
			 if(!index.isEmpty() && A[i] != elem){
                A[index.remove(0)] = A[i];				 
			 }
		 }
		 
	        return A.length-count;
	    }
}
