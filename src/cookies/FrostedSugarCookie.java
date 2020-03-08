package cookies;

//A class for sugar cookies
public class FrostedSugarCookie extends Cookie {

	public FrostedSugarCookie() {
		ordered = false;
		name = "Fun and Fabulous Sugar Cookies";
		tastyBits = "Buttery Goodness";
		cookieBase = "Soft Vanilla Sugar Cookie";
		toppings = "Topped With Yummy Vanilla Buttercream Frosting";
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
