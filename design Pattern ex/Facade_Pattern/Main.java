package Facade_Pattern;

import java.util.Scanner;

// facade class to access Mobile shop
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ShopKeeper  shop = new ShopKeeper();
		
		int choice = 0;
		
		while(choice != 4) {
		
			choice = sc.nextInt();
			switch (choice) {
			case 1: { // for iphone
		        shop.iphoneSale();		
				break;
			}
			case 2: { // for samsumg
				shop.samsungSale();
				break;
			}
			default:
				System.out.println("Koko");
				
			}
		
		}
	}
}
