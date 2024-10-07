package dsa_questions;

import dsa_questions.LinkedList2.Node;

public class Detect_loop_in_linkedlist {
	
	
	  static boolean detectLoop(Node head) {
	      
	        // Fast and slow pointers initially points to the head
	        Node slow = head, fast = head;

	        // Loop that runs while fast and slow pointer are
	        // not null and not equal
	        while (slow != null && fast != null
	               && fast.next != null) {
	            slow = slow.next;
	            fast = fast.next.next;

	            // If fast and slow pointer points to the same
	            // node, then the cycle is detected
	            if (slow == fast) {
	                return true;
	            }
	        }
	        return false;
	    }
	
	public static void main(String[] args) {
		
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next  = new Node(40);
		head.next.next.next.next = new Node(45);
		head.next.next.next.next.next  = new Node(50);
		head.next.next.next= head;

		 if (detectLoop(head))
	          System.out.println("true");
	      else
	          System.out.println("false");
		 
		 printLinkedList(head);
		
	}
	
	 public static void printLinkedList(Node head) {
			
			Node curr = head;
			
			while( curr != null) {
				
				System.out.println(curr.data + " ");
				curr = curr.next ;
			}
	}	

}
