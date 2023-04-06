package Command_Pattern;

import java.util.ArrayList;
import java.util.List;

// command invoker

public class Broker {
 
	List <Order> lst  = new ArrayList<Order>(); // reference of command
	
	void takeOrder(Order order) {
		
		lst.add(order);
		
	}
	
	void placeOrder() {
		
		for(Order order : lst)
			order.execute();
	
		lst.clear();
	}
	
     	 
}
