package macaroons;

//A class for orange macaroons
public class OrangeCreamMacaroon extends Macaroon {

	public OrangeCreamMacaroon() {
		ordered = false;
		name = "Orange Cream Macaroon";
		filling = "Delicate Vanilla Buttercream With Orange Reduction Folded In";
		macaroonFlavor = "Clementine Colored Vanilla Macaroon";
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
