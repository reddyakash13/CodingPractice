package com.sample.practice;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Preorder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node();
		root.data = 3;
		Node one = new Node();
		one.data = 5;
		Node two = new Node();
		two.data = 2;
		Node three = new Node();
		three.data = 1;
		Node four = new Node();
		four.data = 4;
		Node five = new Node();
		five.data = 6;
		
		root.left = one;
		root.right = two;
		
		one.left = three;
		one.right = four;
		
		two.left = five;
		
		//Preorder(root);
		
		//System.out.println(height(root));
		
		//top_view(root);
		
		Insert(root, 0);
		
		LevelOrder(root);
	}

	static void Preorder(Node root) {
		if(root == null)
			return;
	    System.out.print(root.data+" ");
	    Preorder(root.left);
	    Preorder(root.right);
	}
	
	static int height(Node root)
    {
		if(root == null)
			return 0;
		
		return Integer.max(height(root.left), height(root.right))+1;
       
        // return 0;
    }
	
	static void top_view(Node root)
	{
	  /*if(root == null)
		  return;
	  top_view(root.left);
	  System.out.print(root.data + " ");*/
	  
	  Node curr = root;
	  
	  Stack<Integer> left = new Stack<>();
	  while(curr != null){
		  if(curr.left != null){
			  left.push(curr.left.data);
		  }
		  curr = curr.left;
	  }
	  while(!left.isEmpty()){
		  System.out.print(left.pop() + " ");		  
	  }
	  System.out.print(root.data+" ");
	  
	  curr = root;
	  Stack<Integer> right = new Stack<>();
	  while(curr != null){
		  if(curr.right != null){
			  right.push(curr.right.data);
		  }
		  curr = curr.right;
	  }
	  for(int a : right){
		  System.out.print(a + " ");		  
	  }
	}
	
	static void LevelOrder(Node root)
    {
		if(root == null)
			return;
		
		Queue<Node> line = new LinkedList<>();
		
		line.add(root);
		
		while(!line.isEmpty()){
			
			Node temp = line.poll();
			System.out.print(temp.data+" ");
			if(temp.left != null)
				line.add(temp.left);
			
			if(temp.right != null)
				line.add(temp.right);
			
		} 
    }
	
	static Node Insert(Node root,int value)
    {
		if(root == null)
			return root;
		
		Node temp = root;
		boolean left = false;
		Node prev = null;
		while(temp != null){
			if(value < temp.data){
				prev = temp;
				temp = temp.left;
				left = true;
			}
			else{
				prev = temp;
				temp = temp.right;
				left = false;
			}
		}

		Node key = new Node();
		key.data = value;
		
		if(left){
			prev.left = key;
		}else{
			prev.right = key;
		}
       return root;
    }
	
	static void decode(String S ,Node root)
    {	
		Node temp = root;
		StringBuffer answer = new StringBuffer();
		for(int i=0; i< S.length(); i++){
			
			
			if(S.charAt(i) == '1'){
				temp = temp.right;
			}else{
				temp = temp.left;
			}
			
			if(temp.left == null && temp.right == null){
				temp = root;
				answer.append(temp.data);
			}
        }

       System.out.println(answer);
    }
}
class Node {
    int data;
    Node left;
    Node right;
}