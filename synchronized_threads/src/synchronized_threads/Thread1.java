package synchronized_threads;


public class Thread1 extends Thread{
	
	Synchronized_method meth = new Synchronized_method();
   
    @Override
    public void run() {
	super.run();
	meth.multiples(2);
   }


}
