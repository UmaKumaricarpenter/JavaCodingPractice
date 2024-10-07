package lab_15;

import java.util.*;

public class Additional_of_Matrix {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Size for matrix
		System.out.println("Enter the number of row: ");
		Integer row = sc.nextInt();  
		
		System.out.println("Enter the number of coloumn: ");
		Integer col = sc.nextInt();
		
		//for first Matrix
		
		int arry1[][] = new int[row][col];
		System.out.println("Enter element of first Matrix: ");
		
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				arry1[i][j] = sc.nextInt();
			}
		}
		//for second matrix 
		
		int arry2[][] = new int[row][col];
		System.out.println("Enter element of second Matrix: ");
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				arry2[i][j] = sc.nextInt();
			}
		}
		//print first matrix 
		
		System.out.println("element of first Matrix: ");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(arry1[i][j]+" ");
			}
			System.out.println();
		}
		//print second matrix
		
		System.out.println("element of second Matrix: ");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(arry2[i][j]+" ");
			}
			System.out.println();
		} 
		//for calculating the sum of first and second matrix
		
		int sum[][] = new int [row][col];
		for(int i=0; i<row ; i++) {
			for(int j=0; j<col;j++) {
				sum[i][j] = arry1[i][j] + arry2[i][j];
			}
		}
		//print the sum of both matrix
		
		System.out.println("The sum of two matrix: ");
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(sum[i][j]+" ");
			}
			System.out.println();
		}

		
	}


}
