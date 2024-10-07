package finall_keyword;

public class Student {
	
//	Once we declare a variable as a final we can't perform re-assignment.
//	Whenever we declare a method as a final it can't be overridden to our extended class.
//	Whenever we declare a class as a final it can't be inherited or extend to sub class.

	int rollnumber;
	String name;
	final String collage;
	
	public Student (String name) {
		
		this.collage = name;
	}

	@Override
	public String toString() {
		return "Student [rollnumber=" + rollnumber + ", name=" + name + ", collage=" + collage + "]";
	}
	
	public static void main(String[] args) {
		
		Student s= new Student("NRI");
		s.name = "Tushar";
		s.rollnumber = 112453;
		//s.collage = "TIT";
		
		System.out.println(s);
		
		Student ss= new Student("TIT");
		ss.name = "Mayank";
		ss.rollnumber = 112467;
		//s.collage = "NRI";
		
		System.out.println(ss);
		
		
	}
	

}
