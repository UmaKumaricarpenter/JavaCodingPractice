package dsa_questions;

public class Two_Sum {
	
	public static void main(String[] args) {
		
		int a [] = {4,6,5,1,9,7};
		
		int sum = 12;
		
		for(int i=0; i<a.length; i++) {
			for(int j=i+1; j<a.length; j++) {
				
				if(a[i]+a[j] == sum) {
					System.out.println(a[i]+" , "+a[j]);
				}
			}
		}
	}

}
