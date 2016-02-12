package com.basics;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class ImplAbsA extends AbstractA implements InterfaceA{

	//volatile int a;
	public ImplAbsA() throws Exception{
		
	}
	@Override
	public void methodA(int a) {		
		a = a + 1;
		System.out.println(b);
		//AbstractA.methodB(3);
	}
	
	@Override
	public void methodB(int a){
	
		MessageUtil temp = MessageUtil.INSTANCE;
		
		temp.leaveTheBuilding();
		
		super.methodB(a);
		
		System.out.println("fhdk");
		
		
	}
	public static void main(String[] args) {
		
		Map<String, Object> collection = new TreeMap<>();
		
		System.out.println(collection.compute("foo", (k,v) -> (v == null)? new ArrayList<Object>():((List)v).add("bar")));
		System.out.println(collection.compute("foo", (k,v) -> (v == null)? new ArrayList<Object>():((List)v).add("ber")));
	}
	
}
