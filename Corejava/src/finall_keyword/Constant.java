package finall_keyword;

public class Constant {
	
	public static final double PI = 3.14519;        //Final variable
	
	public final double calculateArea(double radius) {        //Final method
		
	return PI * radius * radius ;
	
	}
	
	public static void main(String[] args) {
		
		Constant c = new Constant();
		
		double ans = c.calculateArea(3.5);
		
		System.out.println(ans);
		
	}

}
