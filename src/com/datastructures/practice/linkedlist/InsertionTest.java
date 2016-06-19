package com.datastructures.practice.linkedlist;


import com.datastructures.practice.DatastructureUtils;

public class InsertionTest {

	public static void main(String[] args) throws Exception {
		LinkedList l1 = new LinkedList(10);
		LinkedList l2 = new LinkedList(20);
		LinkedList l3 = new LinkedList(30);
		LinkedList l4 = new LinkedList(40);
		LinkedList l5 = new LinkedList(50);
		
		l1.next = l2;
		l2.next = l3;
		l3.next = l4;
		l4.next = l5;

		DatastructureUtils.printTheDatastructure(l1, "Data", "Next", "->");
		
		insertNode(l1, 3, new LinkedList(25));
		
		DatastructureUtils.printTheDatastructure(l1, "Data", "Next", "->");

	}
	
	public static void insertNode(LinkedList l, int pos, LinkedList nodeToBeInserted) {
		LinkedList lTemp = l;
		LinkedList lNext = null;
		for (int i=1; i<pos-1; i++) {
			if (lTemp.next != null) {
				lTemp = lTemp.next;
				lNext = lTemp.next;
			} else {
				break;
			}
		}
		lTemp.next = nodeToBeInserted;
		nodeToBeInserted.next = lNext;
	}
}
