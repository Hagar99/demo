package strategy_Pattern;

public class noFlying  implements fly_behavior{

	
	// strategy of flying separated as a class implements the interface of fly_behavior 
	  public void fly() {
		  System.out.println("No fly!");
	  }
}
