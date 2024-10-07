package dsa_questions;

import dsa_questions.LinkedList2.Node;

public class Reverse_of_linkedlist {
	
	public static void main(String[] args) {
		
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next  = new Node(40);
		head.next.next.next.next = new Node(50);
		head.next.next.next.next.next  = new Node(60);
		

		 System.out.print("Given Linkedlist :- ");
		
		 printLinkedList(head);
		 
		 System.out.print("after reverse the given Linkedlist is :- ");
		 
		 printLinkedList(reverseList(head));
		
	}
	
    public static void printLinkedList(Node head) {
		
		Node curr = head;
		
		while( curr != null) {
			
			System.out.println(curr.data + " ");
			curr = curr.next ;
		}
	}	
    
    public static Node reverseList(Node head) {
    	
    	Node curr = head;
    	Node prev = null;
    	Node next;
    	
    	while(curr != null) {
    		
    		next = curr.next;
    		curr.next = prev;
    		prev = curr;
    		curr = next;
    	}
    	
    	return prev;
    }
		

}
