package Iterator_Pattern;

public class Main {

	public static void main(String[] args) {
		
		Names names = new Names();
		
		IteratorP it = names.getIterator();
		
		
		while(it.hasNext()) {
	
			System.out.println("Name is: "+ it.Next());
		
		}
	}
}
