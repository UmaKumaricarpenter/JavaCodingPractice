package Operators;

public class Arithmatic_operator { 
	public static void main(String[] args) {
		int a = 27;
		int b = 3;
		
		System.out.println("Arithmatic operator");
		
		System.out.println("================================================");
		
		 System.out.println("Addition = "+(a+b));
		 
		 System.out.println("Subtraction = "+(a-b));
		 
		 System.out.println("Multiplication = "+(a*b));
		 
		 System.out.println("Division = "+(a/b));
		 
		 System.out.println("modulo or remainder = "+(a%b));
		 
		 System.out.println("================================================");
		 
		 System.out.println("Pre increment and decrement");
		 
		 System.out.println("Pre increment = "+(++a));
		 
		 System.out.println("Pre decrement = "+(--a));
		 
		 System.out.println("================================================");
		 
		 System.out.println("Post increment and decrement");
		 
		 System.out.println("Post increment = "+(a++));
		 
		 System.out.println("Post decrement = "+(a--));
		 
		 System.out.println("================================================");
		 
		 System.out.println("Pre and post expression");
		 
		 System.out.println("Expression = "+(++a - ++a));
		 
		 System.out.println("Expression = "+((--a+--a)*(++a-a--)+(--a+a--)*(++a+a++)));
		 
	}

}
