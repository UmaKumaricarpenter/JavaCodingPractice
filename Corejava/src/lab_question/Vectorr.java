package lab_question;

import java.util.*;


public class Vectorr {
	public static void main(String[] args) {
		
     Vector<Integer> vec = new Vector<>();
		
		vec.add(10);
	    vec.add(20);
		vec.add(30);
		vec.add(40);
		vec.add(50);
		
		System.out.println("Original Vector:"+vec);
		
		//boolean flag = vec.removeElement(30);
		vec.remove(2);
		
		System.out.println("Element 30 has been removed");
		
		vec.insertElementAt(35,2);
		
		System.out.println("After Insertion Vector:"+vec);
		
		if(vec.contains(40)) {
			System.out.println("40 is present at index"+vec.indexOf(40));
		}
		
		else {
			
			System.out.println("40 is not present in the vector");
		}
		
		System.out.println("Remove all elements from Vector:"+vec);
		
		vec.removeAll(vec);
		
		System.out.println("Final Vector:"+vec);
			
	}

}























