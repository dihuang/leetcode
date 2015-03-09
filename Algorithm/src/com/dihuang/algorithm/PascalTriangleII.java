package com.dihuang.algorithm;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangleII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public List<Integer> getRow(int rowIndex) {
		List<Integer> result = new ArrayList<Integer>();
		int numRows = rowIndex +1;
		if (numRows == 0) {
			return result;
		}
		List<Integer> previousLevel = new ArrayList<Integer>();
		if(numRows == 1){
			result.add(1);
		}else if(numRows == 2){
			result.add(1);
			result.add(1);
		}else{
			previousLevel.add(1);
			previousLevel.add(1);
			if (numRows >= 3) {
				for (int i = 3; i <= numRows; i++) {
					List<Integer> temp1 = new ArrayList<Integer>();
					for (int j = 0; j < i; j++) {
						if (j == 0 || j == (i - 1)) {
							temp1.add(1);
						} else {
							int a = previousLevel.get(j - 1);
							int b = previousLevel.get(j);
							temp1.add(a+b);
						}
					}
					previousLevel = new ArrayList<Integer>(temp1);
					if(i == numRows){
						result = new ArrayList<Integer>(temp1);
					}
				}
			}
		}
		

		return result;
	}
}
