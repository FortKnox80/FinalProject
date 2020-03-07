package cheesecakes;

import dessertShop.*;

//A class for lemon cheesecakes
public class BlackberryCheesecake extends Cheesecake {

	public BlackberryCheesecake() {
		ordered = false;
		name = "Fresh Picked Blackberry Cheesecake";
		crust = "Buttery Graham Cracker Crust";
		filling = "Sweet and Silky Vanilla Filling";
		toppings = "Fresh Blackberries Dusted with Sugar";
	}

	//A method to bake the cheesecake
	public Cheesecake bakeACheesecake(String type) {
		Cheesecake cheesecake = bakeACheesecake(type);
		
		return cheesecake;
	}

	//Set the cheesecake cost
	public double cost() {
		
		return 70.00;
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
