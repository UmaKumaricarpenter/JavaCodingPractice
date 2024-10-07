package lab_20;

public class CreatingShapes {
	
		public static void main(String[] args) {
			Shapes sp;
			int side;
			
		    sp = ShapeFactory.createShape("Circle");
		    side = sp .draw();
			System.out.println("Circl " + side+" sides");
			
				
			sp = ShapeFactory.createShape("Triangle");
			side = sp .draw();
			System.out.println("Triangle " + side+" sides");
				
				
			sp = ShapeFactory.createShape("Square");
			side = sp .draw();
			System.out.println("Square " + side+" sides");
				
		}

}
