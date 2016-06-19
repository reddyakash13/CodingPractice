package com.datastructures.practice.linkedlist;

public class LinkedList {

	int data;
	LinkedList next;
	
	public LinkedList(int data) {
		this.data = data;
		next = null;
	}
	
	public LinkedList getNext() {
		return next;
	}
	
	public int getData() {
		return data;
	}
}
