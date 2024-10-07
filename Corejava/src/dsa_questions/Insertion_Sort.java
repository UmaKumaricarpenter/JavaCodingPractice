package dsa_questions;

import java.util.Arrays;

public class Insertion_Sort {
	
	public static void main(String[] args) {
		
		int[] arr = {12,7,6,4,5,33};
		
		for(int i =1; i<arr.length; i++) {
			
			int curr = arr[i];
			int j = i-1;
			
			while(j >= 0 && curr < arr[j]) {
				
				arr[j+1] = arr[j];
				j--;
			}
			
			arr[j+1] = curr;
			
		}

		System.out.println(Arrays.toString(arr));
	}

}
