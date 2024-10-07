package abstract_class;

public class Demo_bank {
	
	public static void main(String[] args) {
		
	    // Bank_account  a  = new Bank_account() ;// can't instantiated abstract class.
		
		Child_bankaccount cc = new Child_bankaccount();
	
		cc.Calculate_interest(5.0, 3.6, 6);
		
		cc.Checking_account();
	}
	

}
