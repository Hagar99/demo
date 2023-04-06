package Decorator_Pattern;

public class Decorator_Car implements Car{

	protected Car car;

	public Decorator_Car(Car car) {
		this.car = car;
	}
	
	
	@Override
	public void print() {
		this.car.print();
		
	}

	
}
