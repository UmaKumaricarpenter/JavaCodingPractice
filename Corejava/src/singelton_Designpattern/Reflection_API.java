package singelton_Designpattern;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Reflection_API {
	
	public static void main(String[] args) {
		
		  SingletonExample  s = SingletonExample.getInstance() ;
		    
		  Constructor<SingletonExample> cons = null;
		  
		   cons.setAccessible(true);
		   
		   SingletonExample Obj2 = SingletonExample.getInstance();
		
			System.out.println(s.hashCode());
			System.out.println(Obj2.hashCode());

			
			
		}
}
