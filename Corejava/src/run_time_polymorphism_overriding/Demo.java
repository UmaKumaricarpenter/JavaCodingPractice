package run_time_polymorphism_overriding;

public class Demo {
	
	public static void main(String[] args) {
		
		
		Bank b  = new Bank() ;
		System.out.println("bank ka genral rate "+b.rate());

	     SBI sb = new SBI() ;
	     
	     System.out.println("sbi ka rate of intrest "+ sb.rate());
	     
	     
	     AXIS  axis  = new AXIS() ;
	     System.out.println("axis ka rate of intrest "+axis.rate() );
		
		
			
		}


}
