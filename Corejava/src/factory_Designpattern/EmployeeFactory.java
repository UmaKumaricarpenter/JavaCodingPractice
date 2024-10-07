package factory_Designpattern;

public class EmployeeFactory {
	
            // Virtual Constructor	
	
         public static Employee getEmp(String empType) {
		
		         if(empType.trim().equalsIgnoreCase("Android Developer")) {
		        	 
			        return new AndroidDeveloper() ;
			
		         }
		         else if(empType.trim().equalsIgnoreCase("web Developer")) {
		        	 
			        return new WebDeveloper() ;
			        
		         }
		         else {
		        	 
			        return null ;
			
	           	}
	     }


}
