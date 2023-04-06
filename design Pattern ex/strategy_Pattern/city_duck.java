package strategy_Pattern;

public class city_duck extends Duck{

	
	
	noFlying sf = new noFlying();
	@Override
	public void fly() {
		sf.fly();
	}

}
