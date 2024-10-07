package singelton_Designpattern;

public class Clone_Method {
	
	public static void main(String[] args) {
		
		
        SingletonExample Obj1  = SingletonExample.getInstance() ;
        
        System.out.println(Obj1.hashCode());
		
		// i want to clone that Obj1 object 
		
		try {
			
			SingletonExample Obj2   = (SingletonExample)Obj1.clone();
			
			System.out.println(Obj2.hashCode());
		} 
		catch (CloneNotSupportedException e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
