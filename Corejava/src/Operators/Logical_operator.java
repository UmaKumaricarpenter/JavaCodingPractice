package Operators;

public class Logical_operator {
	public static void main(String[] args) {
		
		int a = 27;
		int b = 3;
		System.out.println("Logical operator");
		System.out.println("================================================");
		
		System.out.println("Logical (AND)&& operator");
		
				if(a>b && a==b) {
			System.out.println(" Both condition are true");
		}
		else {
			System.out.println("Both condition are false");
		}
		
		System.out.println("================================================");
		
		System.out.println("Logical (OR)|| operator");
		
		if(a>b || a==b) {
			System.out.println("Atleast one condition true");
		}
		else {
			System.out.println("Both condition are false");
		}

		
	}

}
