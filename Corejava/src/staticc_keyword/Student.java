package staticc_keyword;

public class Student {
	
    String name  ;
	
	String subject  ;
	
	static String  collegeName = "IES" ;         //Static variable
	
	
	public  static void learn() {              //Static method
	//	subject  = "hindi" ; // non static variable can not be written in static method
	//	collegeName = "sistec"; // we  can write only static variable in static method
		
		collegeName  = "sistect" ;
		
		System.out.println("all students are learning ");
		
	}
	
	public void pdadaikaro() {
		System.out.println("pad rahe hai  ");
	}
	

        //	method area  , heap area  , stack area
	public static void main(String[] args) {
		
		Student.learn();   //Static method is directly call by class name. we don't need to creat object.
		
	  //student.pdadaikaro() ; Non static method not directly call by class name.
		
		
		Student s  = new Student() ;
		s.name  = "Rajaji" ;
		s.subject = "CS" ;
		s.pdadaikaro();
		
		System.out.println(s.name ) ;
		System.out.println(s.subject);
		System.out.println(s.collegeName);
		
		
		Student s2  = new Student() ;
		s2.name  = "pawan" ;
		s2.subject = "math" ;
	
		System.out.println(s2.name ) ;
		System.out.println(s2.subject);
		System.out.println(s2.collegeName);
			
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", subject=" + subject + "]";
	}	

}
