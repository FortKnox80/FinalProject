package cakes;

import dessertShop.*;

//A class for lemon cakes
public class LemonCake extends Cake {

	public LemonCake() {
		ordered = false;
		name = "Lemon Cake";
		filling = "Lemon Curd";
		icingFlavor = "Vanilla Buttercream";
		fondant = "Soft Yellow Fondant";
	}

	//A method to bake the cake
	public Cake bakeACake(String type) {
		Cake cake = bakeACake(type);
		
		return cake;
	}

	//Set the cake cost
	public double cost() {
		
		return 100.00;
	}
	
	//Place the cake order
	public boolean cakeOrdered() {
		ordered = true;
		System.out.println("Order placed for a delicious lemon cake.");
		return ordered;
	}
	
	//Cancel the cake order
	public boolean orderCanceled() {
		ordered = false;
		System.out.println("Ok your lemon cake order has been canceled.");
		return ordered;
	}
	
}
