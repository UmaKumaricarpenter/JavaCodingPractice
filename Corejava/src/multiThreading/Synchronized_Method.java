package multiThreading;

public class Synchronized_Method {
	
   public static void main(String[] args) {
		
		 
		Common c  = new Common() ; // object level lock 
		Common c2 = new Common() ; 
		
		TheadA t1  = new TheadA(c  , "Ram") ;
		
		TheadB t2  = new TheadB(c2 , "Shyam") ; 
		
		t1.start(); 
		
		t2.start();
		
		
    }

}
class Common {
	
	public static synchronized void fun1(String name) { // because they need class level lock 
		
		// 1000 lines
		
		System.out.print("welcome "); 
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(name);  // 5 
		
		
		// 1000 lines 
		
		
	}
	
	void fun2(){
		
		System.out.println("do something...");
		//1 thousand lines of codes are there
		synchronized(Common.class){//here if a thread gets the lock of current obj then
		                             //  it is allowed to execute this block
		System.out.println("do some more thing1");
		}
		//1 thousand lines of codes r there
		}
	
}
class TheadA extends Thread{
	
	Common c  ;
	String name  ;
	
	public TheadA(Common c, String name) {

		this.c = c;
		this.name = name;
	}
	
	 public void run() {
		 
		 c.fun1(name);
		
	 }
	

}
class TheadB extends Thread{
	
	Common c  ;
	String name  ;
	
	public TheadB(Common c, String name) {

		this.c = c;
		this.name = name;
	}
	
	
	 public void run() {
		 
		 c.fun1(name);
	
	 }
	

}