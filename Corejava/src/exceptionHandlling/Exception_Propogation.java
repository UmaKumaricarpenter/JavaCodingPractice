package exceptionHandlling;

public class Exception_Propogation {
	

    static void calculate() {

           System.out.println("before exception");
           int a = 12/0  ;
           System.out.println("it is working normal ");
    }

    public static void main(String[] args) {
    	
         	N  nnn  = new N( ) ;
        	nnn.n();
        	
    }

}
class M {

      static	void m() {
    	  
         System.out.println("this is before p in  m");
         
      try {
    	  
	     Exception_Propogation.calculate() ;
      }
      catch(Exception e) {

           System.out.println(e);
      }

     System.out.println("this is after p in  m   ");
     }

}
class N {
           void n() {
        	   
               System.out.println("this is before M in  n");
               
                  M.m();
                  
               System.out.println("this is after M in  n");
            }


}
