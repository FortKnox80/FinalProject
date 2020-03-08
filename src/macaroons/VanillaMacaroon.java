package macaroons;

//A class for vanilla macaroons
public class VanillaMacaroon extends Macaroon {

	public VanillaMacaroon() {
		ordered = false;
		name = "Madagascar Vanilla Macaroon";
		filling = "Vanilla Bean Flecked Buttercream";
		macaroonFlavor = "Lightly Vanilla Macaroon";
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
