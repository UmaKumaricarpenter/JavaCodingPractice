package multiThreading;

public class ThreadB implements Runnable{
	
//	Creating a thread using runnable interface.

	@Override
	public void run() {
		
		 for (int i = 0 ;i<30  ;i++) {
				
				System.out.println(i+ "second thread");
				
				 try {
						Thread.sleep(1000);
				} 
				catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
				}
			}
		
		// TODO Auto-generated method stub
		
	
	}
	
	public static void main(String[] args) {
		
		ThreadB b = new ThreadB();
		
		Thread T = new Thread(b);
		
		T.start();
		
		for (int i = 30 ;i<50  ;i++) {
			
			System.out.println(i+ "first thread");
			
			try {
					Thread.sleep(1000);
			} 
		    catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
			}
		}
		
		 
	}
	

}
