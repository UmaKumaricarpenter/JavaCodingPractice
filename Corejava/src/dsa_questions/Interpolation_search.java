package dsa_questions;

public class Interpolation_search {
	
	public static int InterpolationSearch( int []arr, int lo, int hi, int k) {
		
		int pos ;
		
		while(lo <= hi && k>= arr[lo] && k<= arr[hi]) {
			
			pos = lo + (((hi - lo) * (k - arr[lo])) / (arr[hi] - arr[lo]));
			
			System.out.println(pos);
			
            if(arr[pos] == k) {
				
				return pos;
			}
			
			if(arr[pos] < k) {
				
				lo = pos+1;
			}
			else {
				hi = pos-1;
			}

		}
		return -1;
	
	}
	
	public static void main(String[] args) {
		
		int arr[] = {2,4,6,8,10,16,19,20,22,33,35,45,49};
		
		int n = arr.length;
		
		int k = 33;
		
		int ans = InterpolationSearch(arr ,0,n-1,k);
		
		System.out.println(ans);
	}

}
