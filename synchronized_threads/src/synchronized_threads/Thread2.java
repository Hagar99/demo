package synchronized_threads;


public class Thread2 implements Runnable{

	Synchronized_method syncMeth = new Synchronized_method();
	
	@Override
	public void run() {
		syncMeth.multiples(3);
	}
	
	

}
