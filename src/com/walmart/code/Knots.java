package com.walmart.code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Knots {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = new int[]{9,3,1,2,3,3};
		
		System.out.println(gen(2));
	}

	
	static int cal(int[] a){
		
		if(a.length == 1)
			return a[0];
		
		if(a.length == 2)
			return a[0] + a[1];
		
		List<Integer> given =new ArrayList<Integer>();
		
		for(int b: a)
			given.add(b);
		
		List<Integer> knots = new ArrayList<>();
		
		Collections.sort(given);
		
		knots.add(given.get(0)+given.get(1));
		
		for(int i=2,j=0; i < a.length; i++,j++){
			knots.add(knots.get(j)+given.get(i));
		}
		
		
		int sum = 0;
		for(int b: knots)
			sum += b;
		
		return sum;
	}
	
	static int minSum(int[] a){
		List<Integer> given =new ArrayList<Integer>();
		
		for(int b: a)
			given.add(b);	
		
		Collections.sort(given);
		
		//List<Integer> set1 = new ArrayList<>();
		List<Integer> set2 = new ArrayList<>();
		
		set2.add(given.get(given.size()-1));
		given.remove(given.get(given.size()-1));
		
		return 0;
		
	}
	
	static int sum(List<Integer> a){
		int sum = 0;
		for(int x : a)
			sum += x;
		
		return sum;
	}
	
	
	static int gen(int n){
		
		int[] p = new int[n+n];
		int k=0;
		p[k] = n;
		int count = 0;
		
		while(true){
			count += 1;
			int rem_value = 0;
			while(k >= 0 && p[k] == 1){
				rem_value += p[k];
				k--;
			}
			
			if(k < 0)
				return count;
			
			p[k]--;
			rem_value++;
			
			while(rem_value > p[k]){
				p[k+1] = p[k];
				rem_value -= p[k];
				k++;
			}
			p[k+1] = rem_value;
			k++;
		}
	}
}
