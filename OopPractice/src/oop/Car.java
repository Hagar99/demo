package oop;

public class Car extends Vehicle implements Cloneable{


	int arr[] = {11, 2, 1};
	private String model;
	
	
	Car(){
		this("Kia");
	}
	
	Car(String model){
	   	this.model = model; 
	}
	
	Car(String type , String model){
		super(type);
		this.model = model;
	}

	
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}


	@Override
	public String toString() {
		return this.model;
	}
	
	public Object clone() throws CloneNotSupportedException {
		return  super.clone();
	}
	
}
