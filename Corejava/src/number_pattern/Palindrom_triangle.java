package number_pattern;

public class Palindrom_triangle {
	public static void main(String[] args) {
		System.out.println("palindrom number pattern");
		
		for(int i=1; i<=4; i++ ) {
			for(int j=1; j<=2*(4-i); j++) {
				System.out.print(" ");
			}
			for(int j=i; j>=1; j--) {
				System.out.print(j+" ");
			
			}
			for(int j=2; j<=i; j++) {
				System.out.print(j+" ");
				
			}
			System.out.println("");
		}
	}

}
