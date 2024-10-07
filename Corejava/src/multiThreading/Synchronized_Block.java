package multiThreading;

public class Synchronized_Block {
	
	
       public static void main(String[] args){
		
		
    	   MyThread mt = new MyThread();
		
		   mt.start();

		
		   synchronized (mt) { //getting the lock of mt object
			   
		     	  System.out.println("main thread calls the wait method");
		     	  
			      try {
				
				      mt.wait();
			      } 
			      catch (InterruptedException e) {
				
			          	// TODO Auto-generated catch block
				       e.printStackTrace();
			      }/// it will release lock of mt object 
			
		         System.out.println("main thread got the notification");
		
		         System.out.println(mt.total); // 
		
          }
		   
 }


}

class MyThread extends Thread {
	
	
	int total=0;
	
	public void run(){
		
		synchronized (this) {
			
			System.out.println("child thread performing calculation");
			
			for(int i=0;i<=100;i++){
				total=total+i;
			}
			
			System.out.println("child thread giving the notification");
			this.notify();
			
		}	

	
	}

}
