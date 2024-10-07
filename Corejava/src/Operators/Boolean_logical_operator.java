package Operators;

public class Boolean_logical_operator {
        public static void main(String[] args) {
		
		System.out.println("Bitwise operator");
		System.out.println("================================================");
		
		boolean b1 = true;
		boolean b2 = false;
		
		System.out.println("Boolean (AND)& operator = "+(b1&b1));
		System.out.println("Boolean (AND)& operator = "+(b1&b2));
		System.out.println("Boolean (AND)& operator = "+(b2&b1));
		System.out.println("Boolean (AND)& operator = "+(b2&b2));
		
		System.out.println("================================================");
		
		System.out.println("Boolean (OR)| operator = "+(b1|b1));
		System.out.println("Boolean (OR)| operator = "+(b1|b2));
		System.out.println("Boolean (OR)| operator = "+(b2|b1));
		System.out.println("Boolean (OR)| operator = "+(b2|b2));
		
		System.out.println("================================================");
		
		
		System.out.println("Boolean X-OR)^ operator = "+(b1^b1));
		System.out.println("Boolean X-OR)^ operator = "+(b1^b2));
		System.out.println("Boolean X-OR)^ operator = "+(b2^b1));
		System.out.println("Boolean X-OR)^ operator = "+(b2^b2));
		
		System.out.println("================================================");
		
		
		System.out.println("Boolean (Boolean compliment)! operator = "+(!b1));
		System.out.println("Boolean (Boolean compliment)! operator = "+(!b2));
		
	}


}
