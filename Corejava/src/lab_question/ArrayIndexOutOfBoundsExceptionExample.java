package lab_question;

public class ArrayIndexOutOfBoundsExceptionExample {
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5};
		int index = 6; // Invalid index error out of bound
		
		try {
			System.out.println("Element at index "+ index + " : " +arr[index]);
			
		}
		catch(ArrayIndexOutOfBoundsException e) {
		     System.out.println("Error: Index " + index + " is out of bounds");
		}
		
		index = 2;      //Valid index within bound 
		
		try {
			System.out.println("Element at index "+ index + ": " +arr[index]);
			
		}
		catch(ArrayIndexOutOfBoundsException e) {
		     System.out.println("Error Index " + index + "is out of bounds");
		}
		

		
	}

}
