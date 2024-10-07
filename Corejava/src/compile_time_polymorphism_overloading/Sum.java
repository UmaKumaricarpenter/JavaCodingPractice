package compile_time_polymorphism_overloading;

public class Sum {
	
  // If a class has multiple methods having same name but
 //  different in parameters, it is known as Method Overloading.
//   Compile time polymorphism.
	
	public static  int haiComputerSumKaro(int a  , int b) {
			return a+b ;
	}
	
	public static  int haiComputerSumKaro(int a  , int b , int c) {
		return a+b+c;
    }
	
	public static  void haiComputerSumKaro() {
	System.out.println("kuch nahi hai ");
    }
	
	
	public static void main(String[] args) {
		
		int a  = 12  ;
		int b  = 89  ;
		int c  = 70 ;
		
		haiComputerSumKaro() ;
		
		int p   = haiComputerSumKaro(a , b) ;
		
		int q = haiComputerSumKaro(a ,b ,c) ;
		
		System.out.println(p);
		
		System.out.println(q);
		
	}

}


