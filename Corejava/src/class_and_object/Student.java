package class_and_object;

public class Student {
	
	    int rollNumber ;
		String name ;
		String address ;
		String subject ;
		
		// source -genrate const. using field  -select all  - genrated
		public Student(int ro, String n, String address, String subject) {
		
			this.rollNumber = ro;
			this.name = n;
			this.address = address;
			this.subject = subject;
		}
		
		// Jab hum parameter constructor banate h to default constructor
		// automatically call nahi hota h hume use banann padega.
		
		public Student(){ } ; //ye automaticallly is class ka object retun kra rhai hai default contructor
		
		public void display() {  // Display method class ke object ko print karega.
			
			
			System.out.println("===============================================================");
			
			System.out.println("roll number ---> " + this.rollNumber );
			System.out.println(" name  ---> " + this.name );
			System.out.println(" subject  ---> " + this.subject );
			System.out.println("roll address ---> " + this.address );
			
		}	

	}


