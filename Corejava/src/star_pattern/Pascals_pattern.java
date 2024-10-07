package star_pattern;

public class Pascals_pattern {
	public static void main(String[] args) {
		
		System.out.println("Right pascal triangle");
		
		for(int i=1; i<=3; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
		
		for(int i=3-1; i>=1; i--) {
			for(int j=1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
       
	System.out.println("Left pascal triangle");
		
		for(int i=3; i>0; i--) {
			for(int j=0; j<3; j++) {
				if(j<i-1) {
				System.out.print(" ");
	        	}
				else {
					System.out.print("*");
				}
			}
			System.out.println("");
		}
		
		for(int i=2; i<=3; i++) {
			for(int j=0; j<=3-1; j++) {
				if(j<i-1) {
					System.out.print(" ");
		        	}
					else {
						System.out.print("*");
					}
			}
			System.out.println("");
		}
		
		
		
	}

}
