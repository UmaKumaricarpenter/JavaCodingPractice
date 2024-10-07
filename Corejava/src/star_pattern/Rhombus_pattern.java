package star_pattern;

public class Rhombus_pattern {
	public static void main(String[] args) {
		
		System.out.println("Rhombus fill pattern");
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5-i; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	    System.out.println(" Hollow rhombus pattern");
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5-i; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=5; j++) {
				if(i==1||i==5||j==1||j==5) {
				System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}

		
	}

}
