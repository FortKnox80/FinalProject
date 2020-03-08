package cookies;

import dessertShop.Desserts;

//An abstract class for all of the cookies
public abstract class Cookie extends Desserts{
	
	//Has the cake been ordered
	public boolean ordered;
	
	public String name;
	
	public String tastyBits;
	public String cookieBase;
	public String toppings;
	
	//Get the cookie name
	public String getName() {
		return name;
	}

	//Get the flavor
	public String getFlavor() {
		return name + ": Made With "+cookieBase+ " Base and Lots of " + tastyBits + " " + toppings;
	}
	
	//Method for ordering a cookie
	public boolean dessertOrdered() {
		System.out.println("Your "+name+ " order has been placed");
		ordered = true;
		return ordered;
	}
	
	//Method for canceling a cookie order
	public void cancelOrder() {
		System.out.println("Your order has been canceled");
		ordered = false;
	}
	

	//How much does the cookie cost
	public abstract double cost();
}
	
