package exceptionHandlling;

public class Nested_tryCatch {
	
         public static void main(String[] args) {
		
     		System.out.println("Started");
     		
     		try {
     			
     			int a  = 12 / 12 ;
     			System.out.println("i am first try");
     			
     			try {
     				
     				int c  = 143/0 ;
     				System.out.println(c);
     				
     			}
     			catch(ArithmeticException e) {
     				
     				System.out.println("iam ArithmeticException: ");
     				System.out.println(e);
     				
     			}
     			
     		}catch(Exception e) {
     			
     			System.out.println(" i am exception second ");
     			System.out.println(e);
     			
     		}
     		finally{
     			
     			System.out.println("i am finally");
     		}
        		 
        	 
		}		

}
