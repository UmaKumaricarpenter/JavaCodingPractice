package dsa_questions;

public class Merge_Sort {
	
	public static void divide( int arr [] , int Si , int li) {
		
		if(Si>=li) {
			
			return;
		}
		
		int mid = Si +( li - Si)/2;
		
		divide(arr,Si,mid);
		
		divide(arr,mid+1,li);
		
		Merge(arr, Si, mid, li);	
	}

	public static void Merge( int arr [] , int Si ,int mid, int li) {
		
		int [] merged = new int [li - Si +1];
		
		int idx1 = Si;
		int idx2 = mid+1;
		int x = 0;
		
		while(idx1 <= mid && idx2 <=li) {
			
			if(arr[idx1]<= arr[idx2]) {
				
				merged[x++] = arr[idx1++];	
			}
			
			else {
				
				merged[x++] = arr[idx2++];	
			}
		}
		
		while(idx1 <= mid) {
			merged [x++] = arr[idx1++];
		}
		
		while(idx2 <= li) {
			merged [x++] = arr[idx2++];
		}
		
		for(int i =0, j = Si; i<merged.length; i++, j++) {
			
			arr[j] = merged[i];
		}
		
	}
	
	public static void main(String[] args) {
		
		int arr [] = {6,3,9,5,2,8,4};
		
		divide(arr,0,6);
		
		for(int jj: arr) {
			
			System.out.print(jj+" ");
		}
		
	}
	

}
