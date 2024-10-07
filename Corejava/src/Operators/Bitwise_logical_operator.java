package Operators;

public class Bitwise_logical_operator {
	public static void main(String[] args) {
		
		System.out.println("Bitwise logical operator");
		System.out.println("================================================");
		
		int a = 10;
		int b = 2;
		
		System.out.println("Bitwise (AND)& operator = "+(a&b));
		
		System.out.println("Bitwise (OR)| operator = "+(a|b));
		
		System.out.println("Bitwise (X-OR)^ operator = "+(a^b));

		System.out.println("Bitwise (Left shift)<< operator = "+(a<<b));

		System.out.println("Bitwise (Right shift)>> operator = "+(a>>b));

		System.out.println("Bitwise (Right zero fill)>>> operator = "+(a>>>b));

		System.out.println("Bitwise (Compliment)~ operator = "+(~b));

		System.out.println("Bitwise (Compliment)~ operator = "+(~a));

		
    }

}
