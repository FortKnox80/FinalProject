package macaroons;

//A class for strawberry macaroons
public class StrawberryMacaroon extends Macaroon {

	public StrawberryMacaroon() {
		ordered = false;
		name = "Stunning Strawberry Macaroon";
		filling = "Vanilla Buttercream With Strawberry Coulis";
		macaroonFlavor = "Red Sweet Strawberry Macaroon";
	}

	//Set the macaroon cost
	public double cost() {
		
		return 50.00;
	}
	
	//Place the macaroon order
	public boolean macaroonOrdered() {
		ordered = true;
		System.out.println("Your " +name+ " order has been placed");
		return ordered;
	}
	
	//Cancel the macaroon order
	public boolean orderCanceled() {
		ordered = false;
		System.out.println("Ok your " + name + " order has been canceled.");
		return ordered;
	}
	
}
