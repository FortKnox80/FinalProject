package macaroons;

//A class for raspberry macaroons
public class RaspberryMacaroon extends Macaroon {

	public RaspberryMacaroon() {
		ordered = false;
		name = "Rocking Raspberry Macaroon";
		filling = "Vanilla Bean Buttercream Swirled With Raspberry Coulis";
		macaroonFlavor = "Pink Raspberry Macaroon";
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
