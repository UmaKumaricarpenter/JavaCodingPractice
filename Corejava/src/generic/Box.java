package generic;

public class Box <T> {
	
	T container;
	
	public Box (T container) {
		
		this.container = container;
		
	}
	
	public void performTask() {
		
		if(container instanceof String) {
			 
			System.out.println("length of"+ container+ "is" + (((String) this.container).length()));
		}
	}
	
	public Object getValue() {
		
		return this.container;
	}
	

}
