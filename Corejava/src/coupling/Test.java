package coupling;

public class Test {
	
	public static void main(String[] args) {
		
        Car punch = new Car("body on chice" , new Electric() );
		
		Car volvoxc90 = new Car("body on chice" , new Hybrid() );
		
		Car hondacity = new Car("full body", new Petrol() ) ; 
		
		
		volvoxc90.start();
		
		hondacity.start();
		
		punch.start();
		
	}

}
