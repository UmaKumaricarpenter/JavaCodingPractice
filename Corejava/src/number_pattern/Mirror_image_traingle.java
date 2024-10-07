package number_pattern;

public class Mirror_image_traingle { 
	public static void main(String[] args) {
		
		System.out.println("Reverse number triangle pattern");
		
		for(int i=1; i<=4; i++) {
			
			for(int j=1; j<=i; j++) {
				System.out.print(" ");
			}
			for(int j=i; j<=4; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		System.out.println("Mirror image triangle");
		
        for(int i=1; i<=4; i++) {
			
			for(int j=1; j<=i; j++) {
				System.out.print(" ");
			}
			for(int j=i; j<=4; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
        for(int i=4-1; i>=1; i--) {
			
			for(int j=1; j<i; j++) {
				System.out.print(" ");
			}
			for(int j=i; j<=4; j++) {
				System.out.print(j+"  ");
			}
			System.out.println();
		}
		


	}

}
