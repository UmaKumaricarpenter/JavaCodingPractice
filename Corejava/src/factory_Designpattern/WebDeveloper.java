package factory_Designpattern;

public class WebDeveloper implements Employee{

	@Override
	public int getSalary() {
		// TODO Auto-generated method stub
		
		System.out.println("Salary of Web Developer");
		return 40000;
	}

}
