package Factory_Pattern;

public class ShapeFactoryMethod {

	Shape shapeFactory(String shape) {
		
		if(shape == null)
			return null;
		else if(shape.equalsIgnoreCase("Circle"))
			return new Circle();
		else if(shape.equalsIgnoreCase("Rectangle"))
			return new Rectangle();
		
		else return null;
	}
	
}
