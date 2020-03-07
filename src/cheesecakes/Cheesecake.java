package cheesecakes;

import dessertShop.Desserts;

//An abstract class for all of the cookies
public abstract class Cheesecake extends Desserts{
	
	//Has the cake been ordered
	public boolean ordered;
	
	public String name;
	
	public String crust;
	public String filling;
	public String toppings;
	
	//Get the cookie name
	public String getName() {
		return name;
	}

	//Get the flavor
	public String getCheesecakeFlavor() {
		return "A " + name + " "+crust+ " " + filling + " " + toppings + " Cheesecake ";
	}
	
	//Method for ordering a cookie
	public boolean cheesecakeOrdered() {
		System.out.println("Your order has been placed");
		ordered = true;
		return ordered;
	}
	
	//Method for canceling a cookie order
	public void cancelOrder() {
		System.out.println("Your order has been canceled");
		ordered = false;
	}
	
	//Method to prepare a cookie
	public void prepareCake() {
		System.out.println("We are preparing your cake now.");
	}
	
	//How much does the cookie cost
	public abstract double cost();
}
	
