package singelton_Designpattern;

public class HeavyResource {
	
	// I want to creat a singel object of these class only and i want to use that object
	// through out the session and to creat such resource we need a class and that is 
	// called singelton object.
	
	// Step first to creat private constrructor.
	// Step second to creat early or eager. 
	//it is variable creat a private static variable.
	//Step third to creat a method public static this methodwill give object.
	
	// Ther are two kind of singelton class.
	
	//egar --- they will be automatic created without caling them.
	
	//lazy --- those object which will be creat when we are calling them. 
	  
    private HeavyResource() {
    	
    };
    
    private static HeavyResource instance = new HeavyResource();           //egar
    
    
    public static HeavyResource getInstance() {
    	
//    	if(instance == null) {               lazy
//    		
//    		instance = new HeavyResource();
//    	}
    	
    	return instance;
    }
	

}
