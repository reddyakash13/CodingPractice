package com.sample.practice;

public class Huffman {

	public static void main(String[] args) {
		
		HNode root = new HNode();
		//root.data = 3;
		HNode one = new HNode();
		//one.data = 5;
		HNode two = new HNode();
		two.data = 'A';
		HNode three = new HNode();
		three.data = 'B';
		HNode four = new HNode();
		four.data = 'C';
		/*Node five = new Node();
		five.data = 6;*/
		
		root.left = one;
		root.right = two;
		
		one.left = three;
		one.right = four;
		
		//two.left = five;
		
		decode("1001011", root);

	}
	
	static void decode(String S ,HNode root)
    {	
		HNode temp = root;
		StringBuffer answer = new StringBuffer();
		for(int i=0; i< S.length(); i++){
			
			
			if(S.charAt(i) == '1'){
				temp = temp.right;
			}else{
				temp = temp.left;
			}
			
			if(temp.left == null && temp.right == null){				
				answer.append(temp.data);
				temp = root;
			}
        }

       System.out.println(answer);
    }

}
class HNode{
	public  int frequency; // the frequency of this tree
	public  char data;
	public  HNode left, right;
}