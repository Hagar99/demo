package Decorator_Pattern;

public class Main {

	public static void main(String[] args) {
		
		Car car = new Sports_Car(new Lux_Car(new Basic_Car()));
		
		car.print();
		System.out.println();
		
		car = new Sports_Car(new Basic_Car());
		
		car.print();
		
	}
}
