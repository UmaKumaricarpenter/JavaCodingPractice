package star_pattern;

public class Diamond_pattern {
	public static void main(String[] args) {
		
		System.out.println("Diamond fill pattern");
		 for(int i=1; i<=5; i++) {
			 for(int j=1; j<=5-i; j++) {
				 System.out.print(" ");
			 }
			 for(int j=1; j<=2*i-1; j++) {
				 System.out.print("*");
			 }
			 System.out.println("");
		 }
		 
		 for(int i=5-1; i>=1; i--) {
			 for(int j=1; j<=5-i; j++) {
				 System.out.print(" ");
			 }
			 for(int j=1; j<=2*i-1; j++) {
				 System.out.print("*");
			 }
			 System.out.println(""); 
		 }
		
		 System.out.println("Hollow diamond pattern");
		 
		 for(int i=1; i<=5; i++) {
			 for(int j=1; j<=5-i; j++) {
				 System.out.print(" ");
			 }
			 for(int j=1; j<=2*i-1; j++) {
				 if(j==1||j==2*i-1) {
					 System.out.print("*");
				 }
				 else {
					 System.out.print(" ");
				 }
			 }
			 System.out.println("");
		 }
		 
		 for(int i=5-1; i>=1; i--) {
			 for(int j=1; j<=5-i; j++) {
				 System.out.print(" ");
			 }
			 for(int j=1; j<=2*i-1; j++) {
				 if(j==1||j==2*i-1) {
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
