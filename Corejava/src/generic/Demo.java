package generic;

import java.util.*;

public class Demo {
	
	  public static void main(String[] args) {
		
		  Box<String> box = new Box<>("String type object");
		  System.out.println(box.getValue());
		  System.out.println(box.container.getClass().getName());
		  
		  Box<Integer> box1 = new Box<>(455656666);
		  System.out.println(box1.getValue());
		  System.out.println(box1.container.getClass().getName());
		  
		  System.out.println(box.container = "I am object of string");
		  
		  System.out.println(box1.container = 4553545);

	}

}
