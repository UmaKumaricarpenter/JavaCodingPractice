package Statements;

public class Iterative_Statement {
	public static void main(String[] args) {
		System.out.println("Iterative statement");
		System.out.println("================================================");
		
		System.out.println("For loop");
		
		for(int i=0; i<5; i++) {
			System.out.println(i);
		}
		
	    System.out.println("================================================");
		
		System.out.println("Nested for loop");
		
		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
					
			System.out.print("*");
		    }
			System.out.println();
	   }
	   
        System.out.println("================================================");
		
		System.out.println("While loop");
		
		int i = 0;
		while (i<5) {
			System.out.println(i);
			i = i+1;
		}
		
		 System.out.println("================================================");
			
		 System.out.println("Do-while loop");
		 
		 int p = 0;
		 do {
			 
			 System.out.println(p);
			 p = p+1;

		 }
		 while(p<5);
		 
		 System.out.println("================================================");
			
		 int q = 5;
		 do {
			 
			 System.out.println("Execute one time");
			 
		 }
		 while(p>5);
			

}
}
