package Command_Pattern;

// type of command
public class Sell implements Order{
 
   String item;
	
	public Sell(String i) {
	
		item = i;
	}
	
	@Override
	public void execute() {
	
		System.out.println("Sell the item."+item);
	}

	@Override
	public void unExecute() {
		
		System.out.println("undo selling the item." + item);
	}

}
