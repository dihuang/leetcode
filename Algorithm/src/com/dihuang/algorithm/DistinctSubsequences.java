package com.dihuang.algorithm;

public class DistinctSubsequences {

	public static void main(String[] args) {
		String s = "rabbbit";
		String t = "rabbit";
    numDistinct1(s, t);
	}

	public static int numDistinct(String S, String T) {
		if (S.length() == 0 || T.length() == 0) {
			return 0;
		}
		int[] res = new int[S.length()];
		for (int i = 0; i < S.length(); i++) {
			if (S.charAt(i) == T.charAt(0)) {
				res[i] = 1;
			}
		}

		for (int i = 1; i < T.length(); i++) {
			int total = res[i - 1];
			res[i - 1] = 0;
			for (int j = i; j < S.length(); j++) {

				if (S.charAt(j) == T.charAt(i)) {
					total += res[j];
					res[j] = total - res[j];
				} else {
					total += res[j];
					res[j] = 0;
				}
			}
		}

		int ret = 0;

		for (int i = T.length() - 1; i < res.length; i++){
			ret += res[i];
		}
		return ret;
	}
	
	public static int numDistinct1(String S, String T) {
		if(S==null || T==null)return 0;
		  int occu[]=new int[T.length()];
		  for(int i=S.length()-1;i>=0;i--){
		      for(int j=0;j<T.length();j++){
		          if(S.charAt(i)==T.charAt(j)){
		              if(j==(T.length()-1))occu[j]++;
		              else occu[j]+=occu[j+1];
		          }
		      }
		  }
		  return occu[0];
	}
}
