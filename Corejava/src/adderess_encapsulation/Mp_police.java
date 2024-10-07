package adderess_encapsulation;

public class Mp_police {
	
	  String  name    ;
	   
	   double salary   ;
	   
	     
	   public Mp_police(String name , double salary  ) {
		   
		   this.name  = name  ;
		   this.salary = salary ;
		   
		   
	   }
	   
	   public Mp_police (Mp_police p) {
		   
		   this.name = p.name ;
		   this.salary = p.salary ;
		   
		   
	   }
	    
	    
	   public static void main(String[] args) {
		   
		   
		   Mp_police p  = new Mp_police("rahul" , 55000) ; 
		   
		   
		   
		   Mp_police pp = new Mp_police(p) ;
		   
		   
		   System.out.println(pp.name);
		   
	}
	

}
