package Facade_Pattern;

public class ShopKeeper {
	
	Iphone iphone;
	Samsung samsung;
	
	ShopKeeper(){
		iphone = new Iphone();
		samsung = new Samsung();
	}
	

	public void iphoneSale() {
		iphone.modelNum();
		iphone.price();
	}
	
	public void samsungSale() {
		samsung.modelNum();
		samsung.price();
	}
	
}
