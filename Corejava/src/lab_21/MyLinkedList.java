package lab_21;

public class MyLinkedList {
	
   private ListNode head;
	
	//Method to add a new node at the end of the list
	
	public void append(int data) {
		ListNode newNode = new ListNode(data);
		
		if(head == null) {
			head = newNode;
			return;
					
		}
		ListNode temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
		temp.next = newNode;
	}
	
	//Method to append the second list to the end of the first list
	
	public void appendList(MyLinkedList listToAppend) {
		
		if(listToAppend == null || listToAppend == null) {
			return; //Nothing to Append
		}
		
		if(this.head == null) {
			this.head = listToAppend.head;
			return;
		}
		
		ListNode temp = this.head;
		while(temp.next != null) {
			temp = temp.next;
		}
		
		temp.next = listToAppend.head;
	}
	//method to print the linked list
	
	public void printList() {
		
		ListNode temp = head;
		
		while(temp != null) {
			
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
		
		System.out.println();
	}

}
