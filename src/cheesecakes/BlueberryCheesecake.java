package cheesecakes;

import dessertShop.*;

//A class for lemon cheesecakes
public class BlueberryCheesecake extends Cheesecake {

	public BlueberryCheesecake() {
		ordered = false;
		name = "Blazing Bueberry Cheesecake";
		crust = "Buttery Graham Cracker Crust";
		filling = "Tangy Vanilla Filling";
		toppings = "Blueberries with Sauce";
	}

	//A method to bake the cheesecake
	public Cheesecake bakeACheesecake(String type) {
		Cheesecake cheesecake = bakeACheesecake(type);
		
		return cheesecake;
	}

	//Set the cheesecake cost
	public double cost() {
		
		return 80.00;
	}
	
	//Place the cheesecake order
	public boolean dessertOrdered() {
		ordered = true;
		System.out.println("Your " +name+ " order has been placed");
		return ordered;
	}
	
	//Cancel the cheesecake order
	public boolean orderCanceled() {
		ordered = false;
		System.out.println("Ok your " + name + " order has been canceled.");
		return ordered;
	}
	
}
