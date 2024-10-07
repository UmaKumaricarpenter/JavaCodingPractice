package exceptionHandlling;

public class Animal {
	
	
    void doCalculation() throws WrongCalcultion{
		
		int a  = 2  ;
		int b  = 3  ;
		int c  = 4 ;
		
		if(c != 5 ) {
			
			throw new WrongCalcultion("Your ans is wrong ") ;
			
		}else {
			System.out.println("yes it is correct ");
		}
			
	}

}
