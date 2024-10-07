package superr_Keyword;

public class Main {
	
	 public static void main(String[] args) {
			
		   B r = new B();
		   r.show();
		   
	}	
	
}

class A {
	
	int a = 10;
	
	public void show() {
		
		System.out.println("Parent class method");
	}
	
	A(){
		
		System.out.println("Parent class constructor");
	}
	
}

class B extends A {
	
	int a = 20;

    public void show() {
		
    	System.out.println(a);
       	System.out.println(super.a);
       	
       	super.show();
		System.out.println("Child class method");
    }	
    
    B(){
    	
		System.out.println("Child class constructor");

    }
}


