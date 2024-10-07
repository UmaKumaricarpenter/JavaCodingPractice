package inheritance_Is_A_relationship;

public class Demo_Animal {
	
   public static void main(String[] args) {
		
		Animal  a1  = new Animal()  ;
		System.out.println("Animal class");
		
		a1.eat();
		System.out.println("================================================");
		
		
		Dog d1  = new Dog() ;
		
		System.out.println("Dog class");
		d1.eye = 2  ;
		d1.legs = 4  ;
		d1.tail_length = 20 ; 

		System.out.println("Eyes: "+d1.eye);
		System.out.println("Legs: "+d1.legs);
		System.out.println("Tail lenght: "+d1.tail_length);
		
		d1.speak(); 
		
		d1.eat();
		System.out.println("================================================");
		
		Cat c1 = new Cat() ;
		
		System.out.println("cat class");
		
		System.out.print("cat eating: ");
		c1.eat();
		c1.speak();	
		
	}

}
