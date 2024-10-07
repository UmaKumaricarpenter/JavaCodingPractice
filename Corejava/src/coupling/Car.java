package coupling;

public class Car {
	
	public String body;
	
     //	that was tight coupled  dependent on some other class. 
    //	public ElectricEngine  engine  ;
	
	
	public Engine engine;            // that was loos coupled not dependent on some other class. 

	public Car(String body ,Engine engine) {
		
		this.body = body;
		this.engine = engine;
	}
	
	public void start() {
		
		engine.show();
		
		System.out.println("now you have idea so you can start car");
	}
	
}
