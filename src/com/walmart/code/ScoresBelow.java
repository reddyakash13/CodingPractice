package com.walmart.code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ScoresBelow {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(
	            new InputStreamReader(System.in));
	        String str = in.readLine();
	        
	        int line = Integer.parseInt(str);
	        List<Integer> students = new ArrayList<>();
	        
	        //for(int i=0; i < line; i++){
	        	String focus1 = in.readLine();
	        	String[] params1 = focus1.split(",");
	        	
	        	String focus2 = in.readLine();
	        	String[] params2 = focus2.split(",");
	        	int sum = 0;
	        	for(int j=0; j < params2.length; j++){
	        		int a = Integer.parseInt(params1[j]);
	        		int b = Integer.parseInt(params2[j]);
	        		sum += a + b;
	        		students.add(a+b);
	        	}
	        	
	        	int avg = sum / students.size();
	        	
	        	List<Integer> count = students.stream().filter(a -> a <= avg).collect(Collectors.toList());
	        	
	        	System.out.println(count.size());
	        	
	        	//int count = 0;
	        	/*for(int a : students){
	        		if(a <= avg){
	        			count += 1;
	        		}
	        	}*/
	        	
	        	//System.out.println(count);
	       // }

	}

}
