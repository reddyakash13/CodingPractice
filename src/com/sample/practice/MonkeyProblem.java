package com.sample.practice;

public class MonkeyProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = {1,2,3,4,5};
		
		System.out.println(travelTime(a, 5));
	}

	public static int travelTime(int[] input1, int input2){
		
		int maxTime = 0;
		for(int i=0;i<input2;i++){
			
			for(int j=i+1;j != i && j < input2;){
								
				int fwdTime = input1[i] + (j-i) + input1[j];
				
				if(maxTime < fwdTime)
					maxTime = fwdTime;
				
				j = j+1;
				if(j == input2)
					j=0;
			}
		}
		
		return maxTime;
	}
}
