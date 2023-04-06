package Factory_Pattern;

public class Main {

	public static void main(String[] args) {
		ShapeFactoryMethod sp = new ShapeFactoryMethod();
		Shape s = sp.shapeFactory("CiRcle");
		s.draw();
		s = sp.shapeFactory("recTangle");
		s.draw();
		
	}
}
