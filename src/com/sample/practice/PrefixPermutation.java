package com.sample.practice;

import java.util.HashSet;
import java.util.Set;

public class PrefixPermutation {

	public static void main(String[] args) {
		
		int[] A = {3,5,-3,2,-1,3,4};
		
		System.out.println(solutionTask2(A));

	}

	public static int solutionTask1(int[] A){
		
		int N = A.length;
		
		int count = 0;
		
		for(int p = 0; p < N; p++){
			Set<Integer> required = new HashSet<>();
			for(int j=1; j<=p+1;j++){
				required.add(j);
			}
			Set<Integer> found = new HashSet<>();
			for(int j=0; j<=p;j++){
				found.add(A[j]);
			}
			if((required.size() == found.size()) && required.containsAll(found)){
				count += 1;
			}
		}
		
		
		return count;
	}
	
	public static int solutionTask2(int[] S) {
	      int max_sum = 0;
	      int current_sum = 0;
	      boolean positive = false;
	      int n = S.length;
	      for (int i = 0; i < n; ++i) {
	          int item = S[i];
	          if (item < 0) {
	                if (max_sum < current_sum) {
	                    max_sum = current_sum;
	                    current_sum = 0;
	                }
	          } else {
	                positive = true;
	                current_sum += item;
	          }
	      }
	      if (current_sum > max_sum) {
	          max_sum = current_sum;
	      }
	      if (positive) {
	          return max_sum;
	      }
	      return -1;
	    }
}
