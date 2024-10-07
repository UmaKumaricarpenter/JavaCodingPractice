package java_bean;

public class Vehicle_demo {
	
     public static void main(String[] args) {
		
		Vehicle v1  = new Vehicle() ;
		
		v1.setVehNumber("MP09oo3232");
		
		v1.setVehPrice(150000); 
		
		v1.setVehModel("pulsar");
		
		System.out.println("VehNumber: "+v1.getVehNumber());
		
		System.out.println("VehPrice: "+v1.getVehPrice());
		
		System.out.println("VehModel: "+v1.getVehModel());
	}

}


