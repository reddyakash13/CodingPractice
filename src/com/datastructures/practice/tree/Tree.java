package com.datastructures.practice.tree;

public class Tree {

	int data;
	Tree left;
	Tree right;
	
	public Tree(int data) {
		this.data = data;
	}
	
	public int getData() {
		return data;
	}
	
	public Tree getLeft() {
		return left;
	}
	
	public Tree getRight() {
		return right;
	}
	
}
