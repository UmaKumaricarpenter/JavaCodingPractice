package singelton_Designpattern;

public class Test {
   
	  public static void main(String[] args) {
		
//		  HeavyResource obj2 = new HeavyResource(); 
//		  
//		  System.out.println(obj2.hashCode());
		  
		  HeavyResource obj1 = HeavyResource.getInstance();
		  
		  System.out.println(obj1.hashCode());
		  
          HeavyResource obj2 = HeavyResource.getInstance();
		  
		  System.out.println(obj2.hashCode());
	}
}
