package lab_21;

public class Main {
	
	public static void main(String[] args) {
		MyLinkedList list = new MyLinkedList();
		list.append(51);
		list.append(12);
		list.append(37);
		list.append(43);
		list.append(98);
		
		
		MyLinkedList list2 = new MyLinkedList();
		list2.append(11);
		list2.append(20);
		list2.append(87);
		list2.append(13);
		list2.append(87);
		
		System.out.println("List 1 elements before appending:");
		list.printList();
		
		System.out.println("List2 elements:");
		list2.printList();
		
		list.appendList(list2);
		
		System.out.println("List1 elements after appending List2");
		
		list.printList();

	
   } 

}
