package run_time_polymorphism_overriding;

public class Smartphone extends Device {
	
	String operatingSystem   ;
	
	String cameraResolution ;
	
	
	public void takePhoto() {
		
		System.out.println("photo leliya ");
		
	}
	
	// display smartphone-specific information
	
	@Override
	public void display() {
		
     // jab bhi current ki chije use kar rhe ho toh aayega this keyword aayega 
    // agar parent ki chije use kar rhe toh super
		
	   System.out.println("brand is  " +super.brand); 
		  
	   System.out.println("model is "+ super.model);
		
	   System.out.println("operatingSystem  is "+ this.operatingSystem);
		
	   System.out.println("cameraResolution is "+ this.cameraResolution);	
	
	}
	
	@Override
	public void takingPower( ) { 
		
		System.out.println("smartphone is taking o.5 kw electricity");
	}

}



