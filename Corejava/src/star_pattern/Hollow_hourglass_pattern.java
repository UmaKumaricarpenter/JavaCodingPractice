package star_pattern;

public class Hollow_hourglass_pattern {
	public static void main(String[] args) {
		
       System.out.println("Hollow hourglass pattern");
		
		for(int i=5; i>=1; i--) {
			for(int j=i; j<5; j++) {
				System.out.print(" ");
			}
			for(int k=1; k<=(2*i-1); k++ ) {
				if(k==1||i==5||k==(2*i-1)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}

		for(int i=2; i<=5; i++) {
			for(int j=i; j<5; j++) {
				System.out.print(" ");
			}
			for(int k=1; k<=(2*i-1); k++ ) {
				if(k==1||i==5||k==(2*i-1)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
		
        
       

	}

}
