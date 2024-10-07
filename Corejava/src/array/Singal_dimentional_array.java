package array;

public class Singal_dimentional_array {
	
	public static void main(String[] args) {
			
    int[] arr = new int [10];
		
		for(int i = 0; i<10; i++) {
			arr[i]= 23*(i+1);
		}
		
		System.out.println("Table of 23:");
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println(" ");
		
		System.out.println("Table of 23 reverse");
		for(int i = arr.length-1; i>=0; i--) {
			System.out.print(arr[i]+" ");
		}
	}

}
