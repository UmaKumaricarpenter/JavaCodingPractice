package multiThreading;

public class ThreadA extends Thread{
	
//	Creating a thread using Thread class.

	
	public void run () {
		
    for (int i = 30 ;i>1  ;i--) {
			
			System.out.println(i+ "second thread");
		}
	}
	
	public static void main(String[] args) {
		
		ThreadA T =  new ThreadA();
		
		T.start();
		
		 for (int i = 90 ;i>30  ;i--) {
				
				System.out.println(i+ "First thread");
			}
		 
	
	}

}
