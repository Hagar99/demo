package Decorator_Pattern;

public class Lux_Car extends Decorator_Car{

	public Lux_Car(Car car) {
		super(car);
	}
	
	@Override
	public void print() {
		super.print();
	   System.out.print("lux Car.");
	}

	
}
