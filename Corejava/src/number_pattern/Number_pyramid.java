package number_pattern;

public class Number_pyramid {
	public static void main(String[] args) {
		
        System.out.println("Number increasing pyramid");
		
		for( int i =1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(j +" ");
			}
			System.out.println("");
		}
		
        System.out.println("Number increasing reverse pyramid");
		
		for( int i =5; i>=1; i--) {
			for(int j=1; j<=i; j++) {
				System.out.print(j +" ");
			}
			System.out.println("");
		}
		
		System.out.println("Number changing pyramid");
		int num = 1;
		for( int i =1; i<=4; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(num +" ");
				num++;
			}
			System.out.println("");
		}


		  System.out.println("Number changing reverse pyramid");
			int num2 = 1;
			for( int i =4; i>=1; i--) {
				for(int j=1; j<=i; j++) {
					System.out.print(num2 +" ");
					num2++;
				}
				System.out.println("");
			}

	}

}
