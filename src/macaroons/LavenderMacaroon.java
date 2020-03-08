package macaroons;

//A class for lavender macaroons
public class LavenderMacaroon extends Macaroon {

	public LavenderMacaroon() {
		ordered = false;
		name = "Lovely Lavender Macaroon";
		filling = "Delicate Vanilla Buttercream";
		macaroonFlavor = "Lighlty Lavender Macaroon";
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
