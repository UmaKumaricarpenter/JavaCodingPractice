package exceptionHandlling;

public class Bank_Demo {
	
	public static void main(String[] args) {
		
		
		Bank bb  = new Bank() ;
		// unchecked, 
		
		System.out.println(bb instanceof Bank);
		
		try {
			bb.withdrow(500);
			System.exit(0);
		    
		    return;
			
		}
		catch(LowBalanceException e) {
			System.out.println(e);
		
		}
		
		finally{
			
			System.out.println("you are most welcome ");
		}
		
		System.out.println("Normal flow");
		

	}
}
			
		// Unchecked Exception
//		try {
//			bb.deposite(666666);
//		} catch (TooMuchAmountException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		try {
//			bb.deposite(666);
//		} catch (TooMuchAmountException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		System.out.println("sachin");
//		
//	}
//	
	


