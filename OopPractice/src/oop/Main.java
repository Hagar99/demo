package oop;



public class Main {
	
	
	enum Week{
		SAT(), SUN, MON, TUE, WED, THU, FRI;
	
		void print() {
			System.out.println("Im an Enum!");
		}
	}

	public static void main(String[] args) throws CloneNotSupportedException{
	
		Week  week;
		week = Week.WED;
		
	    for(Week day : Week.values()) System.out.println(day);
		
//		Car a = new Car("Car", "Serato");
//		
//	    Car b  = (Car) a.clone();
//		
//		b.setModel("Mercides");
//		
//		System.out.println(a.getModel() + " " + b.getModel());
//		System.out.println(a.getModel() + " " + b.getModel());
//	
//		b.arr[0] = 5;
//		System.out.println(a.arr[0]);
	}
	
}
