package star_pattern;

public class Triangle_pattern {
	public static void main(String[] args) {
		System.out.println("Triangle fill pattern");
		
		for(int i=0; i<5; i++) {
			for(int j=5-i; j>1; j--) {
				System.out.print(" ");
			}
       	 
       	    for(int j=0; j<=i; j++) {
       		 System.out.print("* ");
       		 
       		 
        	 }
       	 System.out.println(" ");
        }

		System.out.println("Hollow triangle pattern");
		
		for(int i=1; i<=5; i++) {
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
		
       System.out.println("Reverse triangle fill pattern");
		
		for(int i=5; i>0; i--) {
			for(int j=5-i; j>1; j--) {
				System.out.print(" ");
			}
       	 
       	    for(int j=0; j<i; j++) {
       		 System.out.print("* ");
       		 
       		 
        	 }
       	 System.out.println(" ");
        }
  
		
       System.out.println("Reverse hollow triangle pattern");
		
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



	
	}

}
