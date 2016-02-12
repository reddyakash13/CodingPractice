package com.sample.practice;

public class Sorting {

	public static void main(String[] args) {
		
		/*int[] a = {25,89,124,32,45,1566,5,6,123,8465,32,75};

		int[] sort = insertionSort(a);
		
		for(int z : sort){
			System.out.print(z+" ");
		}*/
		int c = 1999999998;
		int b = 999999999 * 999999999;
		System.out.println(b);
	}

	
	public static int[] insertionSort(int[] a){
		
		for(int i=1; i<a.length; i++){
			
			for(int j=i; j>0; j--){
				if(a[j] < a[j-1]){
					int temp = a[j];
					a[j] = a[j-1];
					a[j-1] = temp;
				}else{
					break;
				}
			}
		}				
		return a;
	}
	
	public static int[] merge(int[] a,int[] b){
		int[] sort = new int[a.length+b.length];
		
		int i=0;
		int j=0;
		
		for(int z=0; z < sort.length; z++){
			if(a[i] < b[j]){
				sort[z] = a[i];
				i = i+1;
			}else{
				sort[z] = b[j];
				j = j+1;
			}
				
		}			
		return sort;
	}
	
	public static int[] mergeSort(int[] a){
		int size = a.length;
		
		int lr = size/2;
		int rr = lr+1;
		
		
		return a;
	}
}
