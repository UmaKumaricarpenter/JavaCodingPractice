package lab_13;

public class Main {
	
	public static void main(String[] args) {
		
		Student std1 = new Student();
		Student std2 = new Student("Rohit",20);
		Student std3 = new Student("Rishi",22,"sales");
		
		System.out.println("Value of Default Constructor :");
		System.out.println("Student name: "+std1.name+ " , "+"student age: "+std1.age+" , "+"student department: "+std1.department);
		System.out.println(" ");
		
		System.out.println("Value of constructor with 2 parameter :");
		System.out.println("Student name: "+std2.name+" , "+ "student age: "+std2.age+" , "+"student department: "+std2.department);
		System.out.println(" ");
		
		System.out.println("Value of constructor with 3 parameter :");
		System.out.println("Student name: "+std3.name+" , "+ "student age: "+std3.age+" , "+"student department: "+std3.department);
		
		
	}

}
