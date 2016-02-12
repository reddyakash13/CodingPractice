package com.sample.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class PartitionList {

	public static void main(String[] args) {
		
		int[] A = {5,5,1,7,2,3,5};
		
		int X = 5;
		
		System.out.println(solution(X, A));

	}

	public static int solution(int X, int[] A){
	
		List<Integer> a = new ArrayList<>();
		Collections.addAll(a, Arrays.stream(A).boxed().toArray(Integer[]::new));
		
		for(int j=1;j<a.size();j++){
			int equal = (int) a.parallelStream().limit(j-1).filter(i -> i==X).count();
			System.out.println(j + " " +a.stream().limit(j).collect(Collectors.toList()));
			int notEqual = (int) a.parallelStream().skip(j).filter(i -> i!=X).count();
			System.out.println(j+ " "+ a.stream().skip(j).collect(Collectors.toList()));
			
			if(equal == notEqual)
				return j;
		}
		
		return 0;
	}
	
}
