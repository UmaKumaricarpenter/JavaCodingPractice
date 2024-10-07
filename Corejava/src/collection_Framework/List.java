package collection_Framework;

import java.util.*;
import java.util.Vector;
import java.util.Stack;


public class List {
	
	public static void main(String[] args) {
		
		System.out.println("----------------ArrayList----------------");
		
		ArrayList<Integer>  arrayList = new ArrayList<Integer> () ;
		                               
		arrayList.add(11) ;
		arrayList.add(12) ;
		arrayList.add(13) ;
		arrayList.add(18) ;
		arrayList.add(13) ;
		arrayList.add(19) ;
		arrayList.add(16) ;
		arrayList.add(65) ;
		arrayList.add(98) ;
		arrayList.add(20) ;
		
        int len  =  arrayList.size() ;
		
		System.out.println(len);
		
		
		for ( int i =0  ;i<len  ;  i++ ) {
			
			System.out.println(arrayList.get(i));
			
		}
		
		System.out.println("----------------StringArrayList----------------");
		
		
		ArrayList<String> array = new ArrayList<>() ;
		
		array.add("Roshn") ;
		array.add("RAkhi") ; 
		array.add("Poonam") ;
		array.add("Pooja") ;
		array.add("Jaspreet") ;
		array.add("Suraj") ;
		array.add("Mayank") ;
		
		
		array.remove(0) ;
		array.remove("Jaspreet") ;
		
		
		for ( int i =0  ;i<array.size();i++ ) 
		{
					
				System.out.println(array.get(i));
					
		}
		
		System.out.println("----------------Linkedlist----------------");
		

		   LinkedList<String> list  = new LinkedList<>() ;
		   
		   list.add("sanjay") ;
		   list.add("reena");
		   list.add("suraj") ;
		   
		   Iterator itrr=list.iterator(); 
		   
		   while(itrr.hasNext()) {
			   System.out.println(itrr.next());
			   
			  
		   }
		   
		   for ( int  i =0  ;i<list.size()  ; i++) {
			   System.out.println(list.get(i));
		   }
		  

		System.out.println("----------------Vector----------------");
		
	//    Vector<Integer> vec = new Vector<>();

		Vector<String> pp  = new  Vector<String> ();
		
		pp.add("Banana");
		
		pp.add("papaya");

		pp.add("Guvava");

		pp.add("Lichi");
		
		pp.addAll(array);
		
		for(String V : pp) {
			
			System.out.println(V);
			
		}

		System.out.println("----------------Stack----------------");

		Stack<String> st  = new Stack<String> ();
		
		st.add("math");
		st.add("hindi");
		st.add("so. study");
		st.add("physics") ;
		
		st.pop();
		System.out.println(st.peek());
		st.pop();
		st.push(null);
		st.push(null);
		st.push(null);

		System.out.println(st);
		
	}
	
}
