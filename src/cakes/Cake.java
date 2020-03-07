package cakes;

import dessertShop.Desserts;

//An abstract class for all of the cakes
public abstract class Cake extends Desserts {
	
	//Has the cake been ordered
	public boolean ordered;
	
	public String name;
	
	public String filling;
	public String spongeCakeType;
	public String icingFlavor;
	public String fondant;
	
	//Get the cake name
	public String getName() {
		return name;
	}

	//Get the cake flavor
	public String getFlavor() {
		return "A " + name + " " + spongeCakeType+ " "+ filling+ " " + icingFlavor+ " Cake: ";
	}
	
	//Method for ordering a cake
	public boolean dessertOrdered() {
		System.out.println("Your "+name+ " has been placed");
		ordered = true;
		return ordered;
	}
	
	//Method for canceling a cake order
	public void cancelOrder() {
		System.out.println("Your order has been canceled");
		ordered = false;
	}
	
	//Method to prepare a cake
	public void prepareCake() {
		System.out.println("We are preparing your cake now.");
	}
	
	//How much does the cake cost
	public abstract double cost();
}
	
