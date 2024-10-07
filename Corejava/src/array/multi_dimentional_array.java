package array;

public class multi_dimentional_array {
	
	public static void main(String[] args) {
		System.out.println("multidimentional array");
		
		int [][] mat = new int[3][3];
		int count =1;
		for(int i=0; i<3; i++) {
			
			for(int j=0; j<3; j++) {
				mat[i][j]=count++;
			}
			
		}
        for(int i=0; i<3; i++) {
			
			for(int j=0; j<3; j++) {
				System.out.print(mat[i][j]+" ");
				
				
			}
			System.out.println("");
		}

	}


}
