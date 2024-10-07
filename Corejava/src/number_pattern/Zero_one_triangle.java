package number_pattern;

public class Zero_one_triangle { 
	public static void main(String[] args) {
		System.out.println("Zero one number traingle start with zero");
		
		for(int i = 0; i<5; i++) {
			for(int j=0; j<i; j++) {
				if((i+j)%2==0) {
					System.out.print("1 ");
				}
				else {
					System.out.print("0 ");
				}		
			}
			
			System.out.println("");
		}
		
        System.out.println("Zero one number traingle start with one");
		
		for(int i = 0; i<5; i++) {
			for(int j=0; j<=i; j++) {
				if((i+j)%2==0) {
					System.out.print("1 ");
				}
				else {
					System.out.print("0 ");
				}		
			}
			System.out.println("");
		}

	}
}