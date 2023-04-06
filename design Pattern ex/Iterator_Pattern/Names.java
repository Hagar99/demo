package Iterator_Pattern;


public class Names implements Container{

	int index = 0;
	String [] lstOfNames = {"gog", "frida", "soad"};
 

	private class IteratorImple implements IteratorP{

		@Override
		public boolean hasNext() {
			if(index < lstOfNames.length)
				return true;
			
			return false;
		}


		@Override
		public Object Next() {
			if(index < lstOfNames.length)
				return lstOfNames[index++];
			
			return null;
		}
		
	}
	
	@Override
	public IteratorP getIterator() {
		return new IteratorImple();
	}

}
