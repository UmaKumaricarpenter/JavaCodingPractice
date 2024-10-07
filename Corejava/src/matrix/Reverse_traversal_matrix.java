package matrix;

public class Reverse_traversal_matrix {
	public static void main(String[] args) {
		
		int [][] mat = {{1,8,9},{2,7,10},{3,6,11},{4,5,12}};
		
		int col = mat[0].length;
		int row = mat.length;
		
		for( int i=col-1; i>=0; i--) {
			for( int j=0; j<row;j++) {
				System.out.print(mat[j][i]+" ");
				
			}
		}
	}

}
