package com.dihuang.algorithm;

public class NextPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public void nextPermutation(int[] num) {
        if(num.length <= 0){
        	return ;
        }
        int vioIndex = num.length - 1;
        while(vioIndex >0){
        	if(num[vioIndex-1] < num[vioIndex]){
        		break;
        	}
        	vioIndex--;
        }
        if(vioIndex >0){
        	vioIndex--;
        	int rightIndex = num.length-1;
        	while(rightIndex >=0 && num[rightIndex] <= num[vioIndex]){
        		rightIndex--;
        	}
        	int swap = num[vioIndex];
        	num[vioIndex] = num[rightIndex];
        	num[rightIndex] = swap;
        	vioIndex++;
        }
        int end = num.length -1;
        while(end > vioIndex){
        	int swap = num[vioIndex];
        	num[vioIndex] = num[end];
        	num[end] = swap;
        	end--;
        	vioIndex++;
        }
    }

}
