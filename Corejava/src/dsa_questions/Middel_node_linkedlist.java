package dsa_questions;

import dsa_questions.LinkedList2.Node;

public class Middel_node_linkedlist {
	
	public static void main(String[] args) {
		
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next  = new Node(40);
		head.next.next.next.next = new Node(50);
		head.next.next.next.next.next  = new Node(60);
		
		 System.out.print("Given Linkedlist :- ");
		
		 printLinkedList(head);
		 
		 System.out.println("Middel element of Given Linkedlist :- "+ findmiddel(head));
			
		 System.out.println("After delet Middel element the Given Linkedlist is :- ");
			
		 printLinkedList(deletmiddel(head));
	}

	public static void printLinkedList(Node head) {
		
		Node curr = head;
		
		while( curr != null) {
			
			System.out.println(curr.data + " ");
			curr = curr.next ;
		}
	}	
		
	public static int findmiddel(Node head) {
		
		Node slow = head;
		Node fast = head;
		
		while(fast != null && slow.next != null) {
			fast = fast.next.next;
			slow = slow.next;
		}
		return slow.data;
	}
		
	public static Node deletmiddel(Node head) {
		
		Node slow = head;
		Node fast = head;
		Node prev = null;
		
		while(fast != null && slow.next != null) {
			fast = fast.next.next;
			prev = slow;
			slow = slow.next;
		}
		prev.next = slow.next;
		return head;
	
	} 
	
}
