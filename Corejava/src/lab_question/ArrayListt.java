package lab_question;

import java.util.*;
public class ArrayListt {
	
	public static void main(String[] args) {
		
	 ArrayList<Integer> ArrayList = new ArrayList<>();
			
	  ArrayList.add(10);
	  ArrayList.add(30);
	  ArrayList.add(20);
	  ArrayList.add(40);
	  ArrayList.add(50);
			
	  System.out.println("original Array List : " + ArrayList);
			
		//Sort the ArrayList ascending order.
			
	  Collections.sort(ArrayList);
			
	  System.out.println("After Sort Array List : " + ArrayList);
	  
	    //Sort the ArrayList
			
	  Collections.reverse(ArrayList);
			
   	  System.out.println("Reverse ArrayList : " + ArrayList);
			
		
	}
		
}
	
	


