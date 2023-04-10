package oop;

public class Singleton {

	private static Singleton instance;

	private Singleton() {
		
	}
	
	
	static Singleton getInstansce() {

		if (instance == null)
			instance = new Singleton();

		
		return instance;
	}
}
