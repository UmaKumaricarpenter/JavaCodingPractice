package singelton_Designpattern;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serialization_Method {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException{
		
		
	    SingletonExample Obj1  = SingletonExample.getInstance() ;
		
		System.out.println(Obj1.hashCode());
		
		// Serialization
	    
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("serial.txt")) ;
			
			out.writeObject(Obj1) ;
			
			out.close(); 
			
		// Deserialization
			
			
		ObjectInputStream in  =  new ObjectInputStream(new FileInputStream("serial.txt")) ;
			
		    SingletonExample nayaBySerialization = (SingletonExample)in.readObject() ; 
			
			System.out.println(nayaBySerialization.hashCode());
			
			in.close();
			
	}

}
