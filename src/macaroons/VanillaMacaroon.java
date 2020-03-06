package macaroons;

import dessertShop.*;

//A class for lemon macaroons
public class VanillaMacaroon extends Macaroon {

	public VanillaMacaroon() {
		ordered = false;
		name = "Madagascar Vanilla Macaroon";
		filling = "Vanilla Bean Flecked Buttercream";
		macaroonFlavor = "Lightly Vanilla Macaroon";
	}

	//A method to bake the macaroon
	public Macaroon bakeAMacaroon(String type) {
		Macaroon macaroon = bakeAMacaroon(type);
		
		return macaroon;
	}

	//Set the macaroon cost
	public double cost() {
		
		return 100.00;
	}
	
	//Place the macaroon order
	public boolean macaroonOrdered() {
		ordered = true;
		System.out.println("Order placed for a " + name + ".");
		return ordered;
	}
	
	//Cancel the macaroon order
	public boolean orderCanceled() {
		ordered = false;
		System.out.println("Ok your " + name + " order has been canceled.");
		return ordered;
	}
	
}