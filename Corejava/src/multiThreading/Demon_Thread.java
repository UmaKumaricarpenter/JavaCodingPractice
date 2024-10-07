package multiThreading;

public class Demon_Thread extends Thread {

	    public void run() {
	    	
	    	if(Thread.currentThread().isDaemon()) {
	    		
	    	      System.out.println("I Am Demon Thread ");
	    	
	    	}
	    	else {
	    		
	    		System.out.println("I Am User Thread ");
	    	}
	    }

	    public static void main(String[] args) {
			
	    	Demon_Thread T = new Demon_Thread();
	    	
	    	Demon_Thread T1 = new Demon_Thread();

	    	Demon_Thread T2 = new Demon_Thread();

	        T.setDaemon(true);
	    	
	    	T.start();
	    	T1.start();
            T2.start();

	    	
		}
	    
}
