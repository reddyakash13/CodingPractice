package com.basics;

import java.util.*;

public class ReverseList{

   public static void main(String[] args){
        //List<Integer> input = new LinkedList<Integer>();
    
        Node head = new Node();
        head.data = 1;
        Node curr = head;
        for(int i=2; i<7; i++){        
            Node n1 = new Node();
            n1.data = i;            
            curr.next = n1;            
            curr = n1;
        }
            
        
        int bucket = 3;
        
        Node h1 = reverseList(head, bucket);
   
        while(h1!= null){
            System.out.print(h1.data+"->");
            h1 = h1.next;
        }
   }
   
   public static Node reverseList(Node head, int bucket){
       Node current = head;
       Node next;
       Node temp = null;
       
       int count =0;
   
       while(current != null && count < bucket){
           next = current.next;
           current.next = temp;
           temp = current;
           current = next;
           // 1->2->3 --- 3->2->1
           count = count + 1;
       }
                     
       if(current != null)
             head.next = reverseList(current,bucket);
   
       return temp;
   }

}

class Node{
         int data;
         Node next;
     
         public void setData(int d){
             data = d;
         }
         
         public void setNext(Node n){         
             next = n;
         }
         
         public int getData(){
             return data;
         }
         
         public Node getNext(){
             return next;
         }
     }