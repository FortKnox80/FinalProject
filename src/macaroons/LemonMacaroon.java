package macaroons;

import dessertShop.*;

//A class for lemon macaroons
public class LemonMacaroon extends Macaroon {

	public LemonMacaroon() {
		ordered = false;
		name = "Zesty Lemon Macaroon";
		filling = "Lemon Curd Buttercream";
		macaroonFlavor = "Delecate Lemon Zest Macaroon";
	}

	//A method to bake the macaroon
	public Macaroon bakeAMacaroon(String type) {
		Macaroon macaroon = bakeAMacaroon(type);
		
		return macaroon;
	}

	//Set the macaroon cost
	public double cost() {
		
		return 50.00;
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
