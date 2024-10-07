package collection_Framework;

import java.util.*;

enum days {  
	  SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY  
	}  

public class Set {
	
	    public static void main(String[] args) {
		
		System.out.println("----------------EnumSet----------------");
	    	
	    EnumSet<days> eset = EnumSet.of(days.TUESDAY, days.WEDNESDAY);  
	    
			    // Traversing elements  
			    Iterator<days> iter = eset.iterator();  
			    while (iter.hasNext())  
			      System.out.println(iter.next());  
			    
			    EnumSet<days> eset1 = EnumSet.allOf(days.class);  
			    System.out.println("Week Days:"+eset1); 
			    
		        EnumSet<days> eset2 = EnumSet.noneOf(days.class);  
			    System.out.println("Week Days:"+eset2);  
			
		System.out.println("----------------HashSet----------------");

		   // allow single null value  
		   // it doesnot allow any duplicat value 
		   // it does not maintain any insertion order 
		
		 HashSet<String> set=new HashSet<String>();  
         set.add("Ravi");  
         set.add("Vijay");  
         set.add("Arun");  
         set.add("Sumit"); 
         set.add(null) ;
         set.add(null) ;
         

  	     for(String hh:set) {
  	    	 
  		     System.out.println("An initial list of elements: "+hh);
  	     }
                  
         set.remove("Ravi");  
         System.out.println("After invoking remove(object) method: "+set);  
         
         HashSet<String> set1=new HashSet<String>();  
         set1.add("Ajay");  
         set1.add("Gaurav");
         
         set.addAll(set1);  
         System.out.println("Updated List: "+set);  
         
         set.removeAll(set1);  
         System.out.println("After invoking removeAll() method: "+set);   
         
         set.clear();  
         System.out.println("After invoking clear() method: "+set);  
         
 		System.out.println("----------------LinkedHashSet----------------");

         LinkedHashSet<String> hset =new LinkedHashSet<>();  
         hset.add("One");    
         hset.add("Two");    
         hset.add("Three");   
         hset.add("Four");  
         hset.add("Five");  
         
         Iterator<String> i=hset.iterator();  
         
         while(i.hasNext())  
         {  
         System.out.println(i.next());  
         }  
  
  		System.out.println("----------------TreeSet----------------");

  		 TreeSet<Integer> tset=new TreeSet<Integer>();    
         tset.add(24);    
         tset.add(66);    
         tset.add(12);    
         tset.add(15); 
         System.out.println(tset);
         System.out.println("Lowest Value: "+tset.pollFirst());    
         System.out.println("Highest Value: "+tset.pollLast());
         
         
         
	}

}
