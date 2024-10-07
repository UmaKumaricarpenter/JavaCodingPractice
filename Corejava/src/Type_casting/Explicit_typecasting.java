package Type_casting;

public class Explicit_typecasting {
	public static void main(String[] args) {
		
		System.out.println("Explicit type casting");
		System.out.println("================================================");
		
		
     /* 1-The big data type is convert small data type it is  
         called Explicit type casting.
       
       2-In explicit type casting chance to data lose.
       
       3- By default the compiler doesn't allow the explicit type 
       casting
     */
		
		int a = 180;
		double x = 10.5;
		
		byte b = (byte) a;
		System.out.println(b);
		
		int y = (int) x;
		System.out.println(y);
	}

}
