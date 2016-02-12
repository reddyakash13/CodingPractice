package com.basics;

import java.util.List;

public class TestMainMethod {

	static String str;
	  
	  public static boolean test1(){
	    return new Boolean("1");
	  }
	  
	  public static boolean test2(){
	    return new Boolean(str);
	  }

	  public static void main(String[] args) {

		  int[] a = new int[]{1,2,3,4,5};
		  
		for (int x = 0, y = a.length - 1; x < y; x++, y--) {
			a[x] = a[x] ^ a[y];
			a[y] = a[x] ^ a[y];
			a[x] = a[x] ^ a[y];
		}
		
		for(int z : a)
			System.out.println(z);
		
		//AbstractA td = new AbstractA();
		
		//testCollections(args);
	}
	  
	 public static void testCollections(List<Object> coll){
		 
		 
	 }
}
