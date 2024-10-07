package lab_14;

import java.util.*;

public class Sorting {
	
    public static void sort(int array[]) {
		
		for(int i=0;i<array.length;i++) {
			for(int j= i+1 ;j<array.length;j++) {
				int temp = 0;
				if(array[i]>array[j]) {
				temp = array[i];
				array[i] =array[j];
					array[j] = temp;
				}
			}
			System.out.print(array[i]+" ");
		}
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int size = sc.nextInt();
		
		int [] array = new int[size];
		System.out.println("Enter the element of array: ");
		
		for(int i=0; i<size; i++) {
			
			array[i] = sc.nextInt();
		}
		
		System.out.println("Array elements of before sorting: ");
		
		for(int i=0; i<size; i++) {
			
			System.out.print(array[i]+" ");
		}
		
		System.out.println();
		System.out.println("Array element of after sorting: ");
		sort(array);
		
	}
	
}		
