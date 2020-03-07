package macaroons;

//A class for strawberry macaroons
public class StrawberryMacaroon extends Macaroon {

	public StrawberryMacaroon() {
		ordered = false;
		name = "Stunning Strawberry Macaroon";
		filling = "Vanilla Buttercream With Strawberry Coulis";
		macaroonFlavor = "Red Sweet Strawberry Macaroon";
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
