package class_and_object;

public class Employee_demo {

      public static void main(String[] args) {
		
		Employee e1  = new Employee() ;
		
		e1.empDepatment = "IT" ;
		e1.empName = "Rahul" ;
		e1.emppId = 1232 ;
		e1.salary = 2323233.00 ;
		
		e1.display();
		
		Employee e2  = new Employee(2323 , "rakhi" , "qa" , 50000) ;
		
		e2.display();
		
		Employee e3 = new Employee(23 , "Pooja" , "qsdas" , 50009900) ;
		
		e3.display();
		
		
	}

}
	
	

