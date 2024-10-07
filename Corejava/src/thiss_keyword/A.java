package thiss_keyword;

public class A {
	
//       this can be used to refer current class instance variable.
	
	      void show () {
	    	  
	    	  System.out.println(this);
	      }
	       
//	      this can be used to return the current class instance from the method
          
          void show1() {
	    	  
	    	  System.out.println(a);
	      }
          
	      int a =0;
	      
	      A(int a){
	    	  
	    	  this.a = a;
	      }
	      
	
	      public static void main(String[] args) {
			
	    	  A a = new A(10);
	    	  System.out.println(a);
	    	  a.show();
	    	  
	    	  A a1 = new A(100);
	    	  a1.show1();
		}
	
}
