package Command_Pattern;

public class Buy implements Order{

	String item;
	
	public Buy(String i) {
	
		item = i;
	}
	
	@Override
	public void execute() {
		System.out.println("Buy the item." + item);
		
	}

	@Override
	public void unExecute() {
		System.out.println("undo buying the item." + item);

	}

}
