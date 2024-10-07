package lab_13;

public class Student {
	
	String name ;
	int age ;
	String department;
	
	//default constructor
	
	Student( ){
		name ="Unknown";
		age = 20;
		department ="Uanssigned";
		
	}
	
	//constructor with 2 parameter
	
	public Student(String name , int age) {
		this.name = name;
		this.age = age;
		this.department ="It";
	}
	
	//constructor with 3 parameter
	Student(String name,int age,String department){
		this.name = name;
		this.age = age;
		this.department = department;
	}

}
