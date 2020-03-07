package cookies;

import dessertShop.*;

//A class for lemon cookies
public class LavenderBlueberryCookie extends Cookie {

	public LavenderBlueberryCookie() {
		ordered = false;
		name = "Lucious Lavender Blueberry Cookie";
		tastyBits = "Fresh Blueberries";
		cookieBase = "Buttery Lavender Cookie";
		toppings = " ";
	}

	//A method to bake the cookie
	public Cookie bakeACookie(String type) {
		Cookie cookie = bakeACookie(type);
		
		return cookie;
	}

	//Set the cookie cost
	public double cost() {
		
		return 100.00;
	}
	
	//Place the cookie order
	public boolean cookieOrdered() {
		ordered = true;
		System.out.println("Order placed for a " + name + ".");
		return ordered;
	}
	
	//Cancel the cookie order
	public boolean orderCanceled() {
		ordered = false;
		System.out.println("Ok your " + name + " order has been canceled.");
		return ordered;
	}
	
}
