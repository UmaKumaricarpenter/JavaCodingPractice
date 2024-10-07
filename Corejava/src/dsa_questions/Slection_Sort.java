package dsa_questions;

import java.util.Arrays;

public class Slection_Sort {
	
	public static void main(String[] args) {
		
		int [] arr = {12,7,6,4,5,33};
		
        int n = arr.length;
		
		for(int i =0; i<n; i++) {
			
			int index = i;
			
			for(int j=i+1; j<n; j++) {
				
				if(arr[j] < arr[index]) {
					index = j;
				}
				
			}
			int temp = arr[index];
			arr[index] = arr[i];
			arr[i] = temp;
			
			System.out.println(Arrays.toString(arr));
		}
		
		
	}

}
