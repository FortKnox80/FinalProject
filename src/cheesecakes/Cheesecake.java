package cheesecakes;

import dessertShop.Desserts;

//An abstract class for all of the cheesecakes
public abstract class Cheesecake extends Desserts{
	
	//Has the cake been ordered
	public boolean ordered;
	
	public String name;
	
	public String crust;
	public String filling;
	public String toppings;
	
	//Get the cheesecake name
	public String getName() {
		return name;
	}

	//Get the flavor
	public String getFlavor() {
		return name + ": Made With a "+crust+ " and Filled With " + filling + ". Topped With " + toppings;
	}
	
	//Method for ordering a cheesecake
	public boolean dessertOrdered() {
		System.out.println("Your " +name+ " order has been placed");
		ordered = true;
		return ordered;
	}
	
	//Method for canceling a cheesecake order
	public void cancelOrder() {
		System.out.println("Your order has been canceled");
		ordered = false;
	}
	
	
	//How much does the cheesecake cost
	public abstract double cost();
}
	
