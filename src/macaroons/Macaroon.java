package macaroons;

import dessertShop.Desserts;

//An abstract class for all of the macaroons
public abstract class Macaroon extends Desserts{
	
	//Has the macaroon been ordered
	public boolean ordered;
	
	public String name;
	
	public String filling;
	public String macaroonFlavor;
	
	//Get the macaroon name
	public String getName() {
		return name;
	}

	//Get the flavor
	public String getMacaroonFlavor() {
		return "A " + name + " "+ macaroonFlavor + " " + filling + " Macaroon: ";
	}
	
	//Method for ordering a macaroon
	public boolean macaroonOrdered() {
		System.out.println("Your order has been placed");
		ordered = true;
		return ordered;
	}
	
	//Method for canceling a macaroon order
	public void cancelOrder() {
		System.out.println("Your order has been canceled");
		ordered = false;
	}
	
	//Method to prepare a macaroon
	public void prepareMacaroon() {
		System.out.println("We are preparing your macaroon now.");
	}
	
	//How much does the macaroon cost
	public abstract double cost();
}
	
