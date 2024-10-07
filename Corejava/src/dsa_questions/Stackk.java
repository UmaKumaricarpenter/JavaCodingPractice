package dsa_questions;

public class Stackk {
	
	//Stack implementation using array.
	//Stack follow First In Last Out(LIFO).
	
	static final int MAX = 1000;
	
	int top;
	
	int arr[] = new int [MAX];
	
	boolean isEmpty() {
		
		if(top<0) {
			return true;
		}
		else {
			return false;
		}
	   //return top<0;	(singal line logic)
		
	}
	Stackk(){
		top = -1;
	}
	boolean push (int x) {
		if(top>MAX) {
			
			System.out.println("Stack overflow");
			return false;
		}
		arr[++top] = x;
		System.out.println("value pushed into stack succesfully");
		return true;
	}
	int pop() {
		if(top<0) {
			System.out.println("stack underflow");
			return 0;
		}
		return arr[top--];
	}
	
	int peek() {
		return arr[top];
	}
	void print () {
		for(int i = top; i>=0; i--) {
			System.out.print(arr[i]+"");
		}
	}
	
	public static void main(String[] args) {
		
		Stackk s = new Stackk ();
		
		  s.push(12);
		  s.push(23);
		  s.push(34);
		  s.push(24);
		
		
		  System.out.println("Element remove: "+s.pop());
		
		  System.out.println("top element: " + s.peek());
		
		  System.out.print("Element of Stack: ");
		
		  s.print();
		 
	}	

}
