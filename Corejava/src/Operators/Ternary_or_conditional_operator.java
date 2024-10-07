package Operators;

public class Ternary_or_conditional_operator {
	public static void main(String[] args) {
		
		int a = 10;
		int b,max;
		int c = 20;
		int d = 30;
		 
		System.out.println("Ternary operator");
		System.out.println("================================================");
		
		int x = (10<20) ? 30:40;
		System.out.println(x);
		
	    b = (a==1) ? 20:30;
		System.out.println(b);
		
	    b = (a==10) ? 20:30;
		System.out.println(b);
		
		System.out.println("================================================");
		System.out.println("Nested ternary operator");
		
		max = (a>c) ? (a>d ? a:d) : (c>d ? c:d);
		System.out.println(max);
		
		

	}

}
