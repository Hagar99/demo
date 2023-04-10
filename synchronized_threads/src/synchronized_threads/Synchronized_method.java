package synchronized_threads;

public class Synchronized_method {
	
    synchronized void multiples (int n) {
    
    //	synchronized(this) { // to lock block of the method
    		for (int i = 1 ; i <= 5; i++)
        		System.out.println(i * n);
    	//}
    }

}
