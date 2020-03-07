package brownies;

import dessertShop.Desserts;

//An abstract class for all of the brownies
public abstract class Brownie extends Desserts{
	
	//Has the brownie been ordered
	public boolean ordered;
	
	public String name;
	
	public String brownieBase;
	public String fillings;
	
	//Get the brownie name
	public String getName() {
		return name;
	}

	//Get the flavor
	public String getFlavor() {
		return name + ": A Rich Brownie With A "+ brownieBase + " and Filled With " + fillings;
	}
	
	//Method for ordering a brownie
	public boolean dessertOrdered() {
		System.out.println("Your " +name+ " order has been placed");
		ordered = true;
		return ordered;
	}
	
	//Method for canceling a brownie order
	public void cancelOrder() {
		System.out.println("Your order has been canceled");
		ordered = false;
	}
	
	//Method to prepare a brownie
	public void prepareBrownie() {
		System.out.println("We are preparing your brownie now.");
	}
	
	//How much does the brownie cost
	public abstract double cost();
}
	
