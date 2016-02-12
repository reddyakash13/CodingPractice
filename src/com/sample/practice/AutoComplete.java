package com.sample.practice;

import java.util.TreeSet;

public class AutoComplete<E,X,A,B> {

	private E temp;
	
	public AutoComplete(E temp){
		this.temp = temp;
	}
	
	public static void main(String[] args) {
		 TreeSet<String> lines = new TreeSet<String>();
		 Object obj = new Object();

		 AutoComplete<? super Integer, String, Double, Float> how = new AutoComplete<Object, String, Double, Float>(obj);
		 
		AutoComplete<? super Number, String, Double, Float> what = new AutoComplete<Number, String, Double, Float>(10);
		
		how = what;
		
		// what = how;
	}

}
