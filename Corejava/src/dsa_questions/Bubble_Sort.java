package dsa_questions;

import java.util.Arrays;

public class Bubble_Sort {
			
		public static void main(String[] args) {
			
			int[] arr = {12,7,6,4,5,33};
			
			int n = arr.length;
			
			for(int i =0; i<n; i++) {
				
				for(int j=1; j<n-1; j++) {
				
					if(arr[j-1] > arr[j]) {
						
						int temp = arr[j-1];
						arr[j-1] = arr[j];
						arr[j] = temp;
					}	
				}
				
				System.out.println(Arrays.toString(arr));
				
			}
			
		}

}
