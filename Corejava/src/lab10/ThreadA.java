package lab10;

public class ThreadA extends Thread {
	
	
	Common common;
	String s;
	
	public ThreadA(Common common,String s) {
		this.common = common;
		this.s = s;
		
	} 
	//this method  is calling fun1 of common class and passing parameter string s in fun1
	
	@Override
	public void run() {
		Common.fun1(s);
	}
}
