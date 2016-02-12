package com.walmart.code;

import java.io.FileOutputStream;
import java.util.LinkedList;
import java.util.List;

public class ManageActivities {

	public static void main(String[] args) {

		int[] temp = new int[]{5, 5, 10, 100, 10, 5};
		System.out.println(FindMaxSum(temp, 6));
		Integer.parseInt("",2);
	}

	static int FindMaxSum(int []arr,int n)
	{
		int prev1=arr[0];
		int prev2=Math.max(arr[0],arr[1]);
		for(int i=2; i<n; i++)
		{
			int temp=Math.max(prev1+arr[i],prev2);
			prev1=prev2;
			prev2=temp;
		}
		return prev2;
	}
}
