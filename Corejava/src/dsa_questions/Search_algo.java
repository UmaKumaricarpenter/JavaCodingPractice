package dsa_questions;

public class Search_algo {

	public static int linear_search (int []arr, int k) {
		
		if(arr == null) {
			
			return -1;                        
		}                             
		
		int len = arr.length;
		int i = 0;
		
		while (i<len) {
			
			if(arr[i] == k) {
				return i;
			}
			else {
				i= i+1;
			}
		}
		return -1;
	}
	
	public static int binary_search (int []arr2, int t) {
		
		int low = 0;
		int high = arr2.length;
		
		while(low <= high) {
			
			int mid = low +(high-low)/2;
			
			if(arr2[mid] == t) {
				
				return mid;
			}
			
			if(arr2[mid] < t) {
				
				low = mid+1;
			}
			else {
				high = mid-1;
			}
			
		}
		return -1;
		
	}
	
	
	public static void main(String[] args) {
		
		int arr[] = {2,4,6,8,0,46,3,5,86,9,43,55,24};
		
		int arr2[] = {2,4,6,8,10,46,89,90,92,93,95,555,924};
		
		System.out.println("Element search for linear search: ");
		int k = 86;
		int uttar = linear_search (arr,k);
		System.out.println(uttar);
		
		System.out.println("Element search for binary search: ");
		int t = 90;
		int ans = binary_search (arr2,t);
		System.out.println(ans);
		
		
	} 
}
