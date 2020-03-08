package macaroons;

//A class for lemon macaroons
public class LemonMacaroon extends Macaroon {

	public LemonMacaroon() {
		ordered = false;
		name = "Zesty Lemon Macaroon";
		filling = "Lemon Curd Buttercream";
		macaroonFlavor = "Delecate Lemon Zest Macaroon";
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
