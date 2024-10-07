package Statements;

public class Conditional_statement {
	public static void main(String[] args) {
		System.out.println("Conditional statement");
		System.out.println("================================================");
		
		int i = 30;
		int j;
		
		System.out.println("If statement");
		
		if(i==30) {
			
			 j = 20;
			 System.out.println(j);
		}
		System.out.println("================================================");
		
		System.out.println("If-else statement");
		if(i==20) {
			
			 j = 20;
		}
		else {
			j = 30;
		}
		System.out.println(j);
		
	    System.out.println("================================================");
		
		System.out.println("Else-if statement");
		if(i==10) {
		
			System.out.println("Sunday");
			
		}
		else if(i==20){
			
			System.out.println("Monday");
			
		}
        else if(i==30){
			
			System.out.println("Tuesday");
			
		}
		else {
			
			System.out.println("Wednesday");
			
		}
		

	    System.out.println("================================================");
		
		System.out.println("Switch statement");
		
		int month = 6;
		
		switch(month)
		{
		case 1:
			System.out.println("jan");
			break;
			
		case 2:
			System.out.println("feb");
			break;
			
		case 3:
			System.out.println("mar");
			break;
				
		case 4:
			System.out.println("apr");
			break;
		
		case 5:
			System.out.println("may");
			break;
			
		case 6:
			System.out.println("june");
			break;

		case 7:
			System.out.println("july");
			break;
			
		case 8:
			System.out.println("aug");
			break;
			
		case 9:
			System.out.println("sep");
			break;
			
		case 10:
			System.out.println("oct");
			break;
			
		case 11:
			System.out.println("nov");
			break;
			
		case 12:
			System.out.println("dec");
			break;
			
		}
		

	}

}
