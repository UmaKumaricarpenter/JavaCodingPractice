package lab_20;

public class ShapeFactory {
	
	public static Shapes createShape(String str) {
		if(str.trim().equalsIgnoreCase("Circle")) {
			return new Circle();
		}
		else if(str.trim().equalsIgnoreCase("Triangle")) {
			return new Triangle();
		}
		else if(str.trim().equalsIgnoreCase("Square")) {
			return new Square();
		}
		else {
			return null;
		}
		
	}

}
