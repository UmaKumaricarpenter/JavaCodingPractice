package multiThreading;

public class Thread_Operation extends Thread {
	
	public void run() {
		
		System.out.println("User thread");
	}
	
	
	public static void main(String[] args) {
		
		Thread T =  Thread.currentThread();
		
		System.out.println(T.getName());
		
		System.out.println(T.getId());
	    
		
        Thread ss = new Thread() ;
	
		Thread x    = new Thread(ss) ;
	
		Thread y  = new Thread(ss) ;

		
		x.setName("Raaju");
	    x.setPriority(10);

		System.out.println(x.getName());
		System.out.println(x.getPriority());
		System.out.println(x.getId());


		Thread_Operation u = new Thread_Operation();
		u.start();
        
		u.setName("User");
	    u.setPriority(2);
	    System.out.println(u.getName());
		System.out.println(u.getPriority());
	}

}
