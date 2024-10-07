package abstract_class;

public class Child_bankaccount extends Bank_account {
	
	public Child_bankaccount() {
		
		System.out.println("child class construstor ");
	}

	@Override
	public void Calculate_interest(double p, double r, int t) {
		// TODO Auto-generated method stub
		
		double rate = p*r*t;
		System.out.println("rate of interest:"+ rate );
	}

}
