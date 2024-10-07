package lab_21;

public class Reverse_singlylinkedlist {
	
    static class Node{
		
	    	int data;
		    Node next;
		
		Node(int d){
			
			data = d;
			next = null;
			
		}
		
		 public static void printLinkedList(Node head) {   
				
				Node curr = head;
				
				while( curr != null) {
					
					System.out.print(curr.data + " ");
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
		
    	
    
       public static void main(String[] args) {
				
				Node head = new Node(18);
				head.next = new Node(45);
				head.next.next = new Node(38);
				head.next.next.next  = new Node(64);
				head.next.next.next.next = new Node(7);
				head.next.next.next.next.next  = new Node(25);
				

				 System.out.print("Given Linkedlist :- ");
				
				 printLinkedList(head);
				 
				 System.out.println(" ");
				 
				 System.out.print("after reverse the given Linkedlist is :- ");
				 
				 printLinkedList(reverseList(head));
				
			}
    }
}
