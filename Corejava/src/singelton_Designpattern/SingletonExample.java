package singelton_Designpattern;

import java.io.Serializable;

public class SingletonExample implements Cloneable , Serializable {
	
	// There are three ways to creat a multiple object in sibngelton calss.
    // 1. Clone Method, 2. Reflection API Method, 3. Serialization Method. 
	
		static SingletonExample  instance  = null ;
		
		private SingletonExample() throws Exception {
			if(instance != null) {
				throw new Exception("can't access");
			}
			}
		
		public static SingletonExample getInstance() {
			
			if (instance  == null) {
				try {
					instance = new SingletonExample();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return instance ;
			}
			
			return instance  ;
		 }
		
		@Override 
		protected Object clone()throws CloneNotSupportedException{
				
			return super.clone();	
		}
		
		public  Object readResolve() {
			
			return  instance ;
			
		}	

}
