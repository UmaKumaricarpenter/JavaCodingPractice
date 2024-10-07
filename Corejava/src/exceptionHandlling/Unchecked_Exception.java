package exceptionHandlling;

import java.util.Scanner;

public class Unchecked_Exception {
	
	public static void main(String[] args) {
		
		   Scanner sc  = new Scanner(System.in) ;
		   
		   System.out.println("-----------ArithmeticException-------------");
		   
		   System.out.println("enter value of a");
		   int a  = sc.nextInt() ;
		   
		   System.out.println("enter value of b");
           int b  = sc.nextInt() ;
		   
           try {
        	   
           int c  = a/b ;  
		   System.out.println("Output of a/b = " + c);
		   
           }
           catch(ArithmeticException e){
        	   
        	        System.out.println(e);
        	   
           }
           
           System.out.println("normal flow");
           
           System.out.println("------ArrayIndexOutOfBoundsException-------");
           
           int [] arr  = new int[5]; 
           
    	   arr[0] = 2;
    	   arr[1] = 3;
    	   arr[2] = 21;
    	   arr[3] = 33;
    	   arr[4] = 26;
    	   
    	   for(int i = 0 ; i<=arr.length-1;i++) {
    	   System.out.println(i);
    	   
    	   }
    	   
    	   try {
    		   System.out.println(arr[7]);
    		   
    	   }
    	   catch(ArrayIndexOutOfBoundsException e) {
    		   
    		            System.out.println(e);
    	
    	 System.out.println("---------StringIndexOutOfBoundsException-----------");	  
    	  
    	  String s = "Example";
    		            
    	  try {
    		        
       	         String Substring = s.substring(2,8);      	
          }
    	  catch(StringIndexOutOfBoundsException e1) {
    		  
    		  System.out.println(e1);
    	  }
    	 
    	   }
    
    	   System.out.println("normal flow");
    	   
    	   System.out.println("--------NumberFormatException---------");
    	   
    	   String s  = "23qqq23" ;
    	   
    	   try {
    		   
    		   int ii = Integer.parseInt(s); 
    		   System.out.println(ii);
    		   
    	   }
    	   catch(NumberFormatException e) {
    		   
    	         	 System.out.println(e);;
    		     
    	   }
    	   System.out.println("normal flow ");
    	   
    	   System.out.println("--------NullPointerException-----------");
     	  
    	   String sss  = null  ;
    	   
    	   try {
    	   
    	   System.out.println(sss.length());
    	   
    	   }
    	   catch(NullPointerException  e) {
    		   
    		   System.out.println(e);
    	   }
    	   
    	   System.out.println("normal flow ");
    	  
    	   
    	  	
	}

}
