package com.dihuang.algorithm;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {

	public static void main(String[] args) {
            generate(5);
		
	}

	public static List<List<Integer>> generate(int numRows) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		if (numRows == 0) {
			return result;
		}
		if (numRows >= 1) {
			List<Integer> level = new ArrayList<Integer>();
			level.add(1);
			result.add(level);
			if (numRows >= 2) {
				List<Integer> temp = new ArrayList<Integer>();
				temp.add(1);
				temp.add(1);
				result.add(temp);
				if (numRows >= 3) {
					for (int i = 3; i <= numRows; i++) {
						List<Integer> temp1 = new ArrayList<Integer>();
						for (int j = 0; j < i; j++) {
							if (j == 0 || j == (i - 1)) {
								temp1.add(1);
							} else {
								int a = result.get(i - 2).get(j - 1);
								int b = result.get(i - 2).get(j);
								temp1.add(a+b);
							}
						}
						result.add(temp1);
					}
				}
			}

		}

		return result;
	}
}
