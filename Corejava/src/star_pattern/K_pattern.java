package star_pattern;

public class K_pattern {
	public static void main(String[] args) {
		
		System.out.println("K pattern");
		for(int i=5;i>0; i--) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		for(int i=2;i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		

	}

}
