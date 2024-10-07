package exceptionHandlling;

import java.util.Scanner;

public class Multiple_CatchBlock {
	
	 public static void main(String[] args) {
		
	        Scanner sc  = new Scanner(System.in);
	 
            try {
            	
//            	String s = null;
//              System.out.println(s.length());  
                
            	System.out.print("Enter an integer: ");
    			int number = sc.nextInt();
    			System.out.println("Entered number is: " + number);
    			
            }
            catch(ArithmeticException e) {
            	
            	System.out.println(e);
            }
            catch(StringIndexOutOfBoundsException e) {
            	
            	System.out.println(e);
            }
            catch(NullPointerException e) {
            
            	System.out.println(e);
            }
            catch(Exception e) {
            	
            	System.out.println("Parent Exception occurs: ");
            	System.out.println(e);
            }
            
            finally {
            	
            	System.out.println("I am finally block alwayes executed");
            }
            
            System.out.println("Terminated");      
            
    }
}