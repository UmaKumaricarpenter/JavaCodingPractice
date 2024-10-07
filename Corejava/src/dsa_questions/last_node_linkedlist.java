package dsa_questions;

import dsa_questions.LinkedList2.Node;

public class last_node_linkedlist {
	
	public static void main(String[] args) {
		
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next  = new Node(40);
		head.next.next.next.next = new Node(50);
		head.next.next.next.next.next  = new Node(60);
		

		 System.out.print("Given Linkedlist :- ");
		
		 printLinkedList(head);
		 
		 System.out.println("Last element of Given Linkedlist is :- " + findlast(head));
			
		 System.out.println("After delet Last element the Given Linkedlist is :- ");
		
		 printLinkedList(deletlastNode(head));
	}
	
	 public static void printLinkedList(Node head) {
			
			Node curr = head;
			
			while( curr != null) {
				
				System.out.println(curr.data + " ");
				curr = curr.next ;
			}
	}	
	
	public static int findlast(Node head) {
		
		Node curr = head;
		
		if(curr.next == null) {
			System.out.println(curr.data);
		}
		
		while(curr.next !=null) {
			
			curr = curr.next;
		}
		
		return curr.data;
		
	}
    
	public static Node deletlastNode(Node head) {
		
		Node prev = head;
		
		while(prev.next.next != null) {
			
			prev = prev.next;
		}
		
	    prev.next = null;
		return head;
		
	}

}
