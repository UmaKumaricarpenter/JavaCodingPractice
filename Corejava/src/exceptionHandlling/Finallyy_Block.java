package exceptionHandlling;

public class Finallyy_Block {
	
	 public static void main(String[] args) {
		
          // finally block is always executed but there are two condition 
          // finally block not executed first is system.exit(0); and 
         //	 second is non terminating switchvation the finally block not executed.
	 
	      int [] arr1 = new int [100];
	 
	      try {
		
	        	System.out.println(arr1[arr1.length]);
	      }
	      catch(ArrayIndexOutOfBoundsException e) {
		
		       System.out.println(e);
		       
		       System.exit(0);     //After these condition the finally block not executed
		     
	      }
	     
	     finally {
		
		       System.out.println("finally block is always executed");
	     }
	
	      

  }
}
