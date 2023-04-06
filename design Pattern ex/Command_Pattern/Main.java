package Command_Pattern;

public class Main {

	public static void main(String[] args) {

		Order ord = new Buy("Koko");
		Order ord2 = new Sell("nono");
		Broker b = new Broker();
		
		b.takeOrder(ord);
		b.takeOrder(ord2);
		
		b.placeOrder();
	}
}
