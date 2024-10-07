package very_basic;

public class Data_types {
	public static void main(String[] args) {
		
/* Data type specify the different sizes and values that can be  
   stored in the variable. there are two types of data type.
   Primitive and non-primitive data types.			
 */
    
	System.out.println("Primitive data type");
		
	boolean a = false;  // one bit  
	
	byte b = 10;   // size = 8-bit, range = -128 to 127
	
	short c = 1000;  // size = 16-bit, range = -32768 to 32767
	
	int d = 2000000; // size = 32-bit, range = -2147483648 to 2147483647
	
	long e =2000000L; //size = 64-bit, range = -2^63 to 2^63-1
	
	float f = 234.5f; //size = 32-bit, range = unlimited
	
	double g = 12.3; //size = 64-bit, range = unlimited
	
	char h = 'A'; //size = 16-bit, range = u0000 or(0) to 'uffff' or (65535)
	

	System.out.println("Boolean="+a);

	System.out.println("Byte="+b);
	
	System.out.println("Short"+c);
	
	System.out.println("int="+d);

	System.out.println("Long="+e);

	System.out.println("Float="+f);

	System.out.println("Double="+g);
	
	System.out.println("Char="+h);


	}

}
