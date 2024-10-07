package collection_Framework;

import java.util.*;
import java.util.Map.Entry;

public class Map {
	
	public static void main(String[] args) {
		
		System.out.println("----------------HashMap----------------");

		HashMap<String , Integer> mp  = new HashMap<>() ;
		
		mp.put("Virat" , 120  ) ;
		mp.put("Dhoni" , 130  ) ;
		mp.put("Suresh" , 180  ) ;
		mp.put("Rohit" , 150  ) ;
		mp.put(null , 1200  ) ;
		
           //	for(String  s:mp){
		  //			System.out.println(s);
	     //	    }
				
		//	Set<Map.Entry<String , Integer> > st  =  ;
		
		for( Entry<String, Integer> ee : mp.entrySet()) {
			System.out.println(ee.getKey() +"------------> " + ee.getValue());
				
		}
		
		System.out.println("-----------------------------------------------------------------------");	

		HashMap<String , Boolean> aa  = new HashMap<>() ;
		
		aa.put("question1" , false ) ;
		aa.put("question2" , true ) ;
		aa.put("question3" , false) ;
		aa.put("question4" , true ) ;
		aa.put("question5" , null ) ;
			
		for( Entry<String, Boolean> a :aa.entrySet()) {
			System.out.println(a.getKey() +"------------> " + a.getValue());
				
		}
		
		System.out.println("----------------LinkedHashMap----------------");

		 LinkedHashMap<String , Integer> m  = new LinkedHashMap<>() ;
			
			m.put("Virat" , 1200 ) ;
			m.put("Dhoni" , 170  ) ;
			m.put("Suresh" , 10  ) ;
			m.put("Rohit" , 130  ) ;
			m.put("Rohit" , 1300 ) ;
			m.put(null , 120 ) ;
				
			for( Entry<String, Integer> e :m.entrySet()) {
				System.out.println(e.getKey() +"------------> " + e.getValue());
					
			}
		
		System.out.println("----------------TreeMap----------------");

		 TreeMap<Integer,String> tmap =new TreeMap<Integer,String>();   
		 
		    tmap.put(101 , "Virat" ) ;
		    tmap.put(104 , "Dhoni"  ) ;
		    tmap.put(103 , "Suresh"  ) ;
		    tmap.put(102 , "Rohit"  ) ;
		    tmap.put(108 , "Rohit" ) ;
		    tmap.put(105,null ) ;
			        
			 for(Entry<Integer, String> t:tmap.entrySet()){    
				 
			       System.out.println(t.getKey()+" "+t.getValue());    
			 }  
			 
			 tmap.remove(102);      
		     System.out.println("After invoking remove() method");  
		      
		     for(Entry<Integer, String> t:tmap.entrySet()){
		    	 
		          System.out.println(t.getKey()+" "+t.getValue());      
		      }  
			
	}

}
