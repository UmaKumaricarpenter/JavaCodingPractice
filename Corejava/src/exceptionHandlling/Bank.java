package exceptionHandlling;

import java.util.Scanner;

public class Bank {

		   
	     int amount = 5000;
  	
	     public void withdrow(int payment) throws LowBalanceException {
	  		   
	    	 if(amount<=500) {
	    		 
	    		throw new LowBalanceException("Your amount is too low");
	    	 }
	    	 else {
	    		 
	    		 amount = amount-payment;
	    		 System.out.println("This is your payment kinldy recive");
	    		 
	    	 }
	    	 	 
	     }
	 
	     public int deposite(int paisa) throws TooMuchAmountException {
	    	 
	    	 if(paisa>100000) {
	    		 
	    		 throw new TooMuchAmountException("you have to go bank manually");
	    	 }
	    	
	         amount = amount +paisa;
	         
	         return amount;
	
	     }

}
