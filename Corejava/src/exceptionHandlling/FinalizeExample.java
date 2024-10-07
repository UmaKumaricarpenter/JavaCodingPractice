package exceptionHandlling;

public class FinalizeExample {
	
	public static void main(String[] args) {
		
		 // The finalize method is used to perform cleanup operation on unmanaged resource 
	    //  held by the current object before the object is destroyed.
		
	   // The method is protected and therefore is accecibel only through this class
	   // or through a derived class.	
		
		
		FinalizeExample obj = new FinalizeExample();        
	        // printing the hashcode   
		
		    System.out.println(obj);
	        System.out.println("Hashcode is: " + obj.hashCode()); 
	        
	        obj = null ;    
	        // calling the garbage collector using gc()   
	        System.gc(); 
	        
	        System.out.println("End of the garbage collection"); 
	        
    	}
	
	   protected void finalize(){     
		
          System.out.println("Called the finalize() method");     
       }
	      
	
	
}
