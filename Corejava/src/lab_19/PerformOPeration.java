package lab_19;

public class PerformOPeration {
	
public static void main(String[] args) {
		
		int a = 14;
		int b = 12;
		int result;
		
		ArithmeticOperation sum = (x,y) -> x+y; //using abstract method
		result = sum.calculate(a, b);
		System.out.println("Addition of two number: "+result);
		
		ArithmeticOperation sub = (x,y) -> x-y; //using abstract method
		result = sub.calculate(a, b);
		System.out.println("Substraction of two number: "+result);
		
		ArithmeticOperation multiply = (x,y) -> x*y; //using abstract method
		result = multiply.calculate(a, b);
		System.out.println("Multiplication of two number: "+result);
		
		ArithmeticOperation division = (x,y) -> x/y; //using abstract method
		result = division.calculate(a, b);
		System.out.println("division of two number: "+result);
		
	}



}
