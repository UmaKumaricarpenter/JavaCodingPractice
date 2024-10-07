package lab_20;

public class TestLogger {
	
public static void main(String[] args) {
		
		Logger log1 = Logger.getLogIn(); //call method first time
	
		System.out.println("Logging for first time: ");
	
		System.out.println("Logging id: "+ log1.hashCode()); //return some hashcode
		
		System.out.println();
	
		Logger log2 = Logger.getLogIn(); // calling method second time
		
		System.out.println("Logging for second time: ");
		
		System.out.println("Logging id: "+ log2.hashCode()); 
		// return the same hashcode again it will show only once you will logged in.
		
	}


}
