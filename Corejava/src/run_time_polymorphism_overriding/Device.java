package run_time_polymorphism_overriding;

public class Device {
	
	//If subclass (child class) has the same method as declared in the 
	//parent class, it is known as method overriding in Java.
	
    String brand  ;
	
	String model ;
		
    public String getBrand() {
    	
			return brand;
	}

	public void setBrand(String brand) {
		
			this.brand = brand;
	}


	public String getModel() {
		
			return model;
	}

	public void setModel(String model) {
		
			this.model = model;
	}

	public void display() {
		
		System.out.println("brand is  " + this.brand);
			
		System.out.println("model is "+ this.model);
			
	}
		
	public void powerOn() {
		
			System.out.println("device is getting on");
	}
		
		
	public void powerOff() {
		
			System.out.println("device is getting off");
	}
	
	public void takingPower() {
		
			System.out.println("device is taking 2 kw electricity");
	}
		
		


}
