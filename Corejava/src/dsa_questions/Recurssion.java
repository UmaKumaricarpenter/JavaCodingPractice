package dsa_questions;

public class Recurssion {
	
	public static int factorialFind(int g) {  
		if (g == 0 ) {
			return 1  ;
		}else {
		return g * factorialFind(g-1 ) ; 
		                                                    
		}                                                          
		                                                              
	}
	
	public static void main(String[] args) {
		
		// 5*4*3*2*1 =12
		int ans  = factorialFind (5) ;
		System.out.println("Factoril of givan number is:" +ans);
		
	}

}
