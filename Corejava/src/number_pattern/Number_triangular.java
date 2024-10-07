package number_pattern;

public class Number_triangular {
	public static void main(String[] args) {
		
		System.out.println("Number pyramid");
		
		for(int i=1; i<=4;i++) {
			for(int j=1; j<=4-i; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print(i+"  ");
			}
			System.out.println();
		}
       
 	}
}
		