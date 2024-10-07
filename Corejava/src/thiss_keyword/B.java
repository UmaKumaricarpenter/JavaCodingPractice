package thiss_keyword;

public class B {

//      this() can be used to invoke current class constructor.

		B(){
//			this(10);  this() also called parametorized constructor of its own class.   
			
			System.out.println("I am default contructor");
		}
		B(int n){
			
			this();
			
			System.out.println(n);
			
		}
		
	   public static void main(String[] args) {
		
		B b = new B(100);
		
//		B r = new B();
		
	  }

}
