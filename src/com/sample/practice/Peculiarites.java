package com.sample.practice;

import java.util.Random;

public class Peculiarites {

	static int luckyNumber = 21;
    public static Peculiarites getInstance() {
        return null;
    }
    public static void main(String[] args) {
        /*System.out.println(Peculiarites.getInstance().luckyNumber);      
        System.out.println(Peculiarites.getInstance().getInstance());*/
    	
    	//http://dzone.com
    	
    	int x = 5;
    	int y = 6;    	    	
    		    		
    	Integer a = 256;
    	Integer b = 256;
    	if (a == b) {
    	    System.out.println("So do these have the same reference?");
    	}
    	
    	Random random = new Random(-6732303926L);
    	for(int i=0;i<10;i++){
    	    System.out.println(random.nextInt(10)+" ");
    	}
    }
}
