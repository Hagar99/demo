package strategy_Pattern;

public class Duck implements fly_behavior{


	/**
	 * it's a parent class for all types of clients. 
	 * it has number of behaviors, To get them independent of the client and for accessing some and some not we need to-
	 * make an interface for each behavior. And to make different types of the same behavior we make a separated class-
	 * for each type and implements the interface;    
	 */
	
	public void fly () {

	}
}
