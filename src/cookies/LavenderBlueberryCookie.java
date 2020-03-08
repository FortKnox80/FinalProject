package cookies;

//A class for lavender cookies
public class LavenderBlueberryCookie extends Cookie {

	public LavenderBlueberryCookie() {
		ordered = false;
		name = "Lucious Lavender Blueberry Cookie";
		tastyBits = "Fresh Blueberries";
		cookieBase = "Buttery Lavender Cookie";
		toppings = " ";
	}


	//Set the cookie cost
	public double cost() {
		
		return 100.00;
	}
	
	//Place the cookie order
	public boolean cookieOrdered() {
		ordered = true;
		System.out.println("Your " +name+ " order has been placed");
		return ordered;
	}
	
	//Cancel the cookie order
	public boolean orderCanceled() {
		ordered = false;
		System.out.println("Ok your " + name + " order has been canceled.");
		return ordered;
	}
	
}
