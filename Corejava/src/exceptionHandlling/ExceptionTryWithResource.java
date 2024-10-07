package exceptionHandlling;

import java.io.FileOutputStream;

public class ExceptionTryWithResource {
	
	    public static void main(String[] args) {
			
	    	   try (
	    			   
	    	    // Creating an object of FileOutputStream to write stream or raw data Adding resource
	   
	    	     FileOutputStream fos = new FileOutputStream("Writetextfile.txt")) {
	    	        	
	    	                // Custom string input
	    	                String text  = "Hello World. This is my java program";
	    	 
	    	                // Converting string to bytes
	    	                byte arr[] = text.getBytes();
	    	 
	    	               // Text written in the file
	    	               fos.write(arr);
	    	    }
	    	 
	    	    // Catch block to handle exceptions
	    	    catch (Exception e) {
	    	 
	    	            // Display message for the occurred exception
	    	            System.out.println(e);
	    	     }
	    	 
	    	     // Display message for successful execution of program
	    	  
	    	     System.out.println("Resource are closed and message has been written into the gfgtextfile.txt");
	    }
}
