package com.datastructures.practice.tree;

import com.datastructures.practice.DatastructureUtils;

public class TreeTraversal {

	public static void main(String[] args) throws Exception{

		Tree root = new Tree(10);
		Tree l1 = new Tree(8);
		Tree r1 = new Tree(20);
		
		Tree ll1 = new Tree(5);
		Tree rl1 = new Tree(9);
		
		root.left = l1;
		root.right = r1;
		l1.left = ll1;
		l1.right = rl1;
		
		DatastructureUtils.printTheDatastructure(root, "Data", "Right", "-");
	}

}
