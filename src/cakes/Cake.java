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
		return name + ": A Cake With a " + spongeCakeType+ " Base and "+ filling+ " Layers. All Topped With " + icingFlavor + " " + fondant;
	}
	
	//Method for ordering a cake
	public boolean dessertOrdered() {
		System.out.println("Your "+name+ " order has been placed");
		ordered = true;
		return ordered;
	}
	
	//Method for canceling a cake order
	public void cancelOrder() {
		System.out.println("Your order has been canceled");
		ordered = false;
	}
	
	
	//How much does the cake cost
	public abstract double cost();
}
	
