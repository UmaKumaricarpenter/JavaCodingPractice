package run_time_polymorphism_overriding;

public class Device_Demo {
	public static void main(String[] args) {
		
		
		Smartphone d  = new Smartphone();
		d.brand = "samsung" ;
		d.model = "s23" ;
		d.operatingSystem = "AOX" ;
		d.cameraResolution = "500px" ;
		
		
		d.display();
		d.powerOff();
		d.powerOn(); 
		d.takePhoto();
		d.takingPower();
		
		System.out.println("--------------------------------------------------");
		
		Device dd  = new Device() ;
		dd.takingPower();
			
		}

	

}
