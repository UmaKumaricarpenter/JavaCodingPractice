package lab_question;

public class ArithmeticException {
	public static void main(String[] args) {
		
		int numerator = 10;
		int denominator = 0;  //Example of zero denominator throw exception
		
		try {
			int result = numerator/denominator;
			System.out.println("Result: "+result);
		}
		catch(java.lang.ArithmeticException e){
			System.out.println("Error: Division by zero is not allowed");
			
		}
		
		denominator = 2;  //Example of non-zero valid denominator
		
		try {
			int result = numerator/denominator;
			System.out.println("Result: "+result);	
		}
		catch(java.lang.ArithmeticException e){
			System.out.println("Error: Division by zero is not allowed");
			
		}
		
		
	}

}
