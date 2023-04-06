package Decorator_Pattern;

public class Sports_Car extends Decorator_Car{

	public Sports_Car(Car car) {
		super(car);
	}
	

	@Override
	public void print() {
		super.print();
		System.out.print("Sports Car.");
	}

	
}
