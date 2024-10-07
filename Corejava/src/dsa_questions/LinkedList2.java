package dsa_questions;

public class LinkedList2 {
	 
	static class Node{
		
		int data;
		Node next;
		
		Node(int d){
			
			data = d;
			next = null;
			
		}
		
		public static void printlinkelist(Node head) {
			
			Node curr = head;
			
			System.out.print("Given linkedlist --> ");
			
			while(curr != null) {
		    	
				System.out.println(curr.data + " ");
				curr = curr.next;
			}
		}
		
		public static void main(String[] args) {
			
		   Node head = new Node(10);
		   Node n2 = new Node(20);
		   Node n3 = new Node(30);
		   Node n4 = new Node(40);
		   
		   head.next = n2;
		   head.next.next = n3;
		   head.next.next.next = n4;
		   
		   n4.next = new Node(657);
		   
		   printlinkelist(head);
		    
		}
	}

}
