package Singleton_Pattern;

public class SingletonClass {

	private static SingletonClass instance = new SingletonClass();
	
	private SingletonClass() {}
	
	static  SingletonClass getInstance () {
		if(instance == null)
			instance = new SingletonClass();
	
		return instance;
	}
	
}
