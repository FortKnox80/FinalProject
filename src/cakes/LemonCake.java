package cakes;

import dessertShop.*;

//A class for lemon cakes
public class LemonCake extends Cake {

	public LemonCake() {
		ordered = false;
		name = "Delicate Lemon Cake";
		filling = "Lemon Curd and Vanilla Buttercream";
		spongeCakeType = "Lemon Zest Sponge";
		icingFlavor = "Bright White Vanilla Buttercream";
		fondant = "Soft Yellow Fondant";
	}

	//A method to bake the cake
	public Cake bakeACake(String type) {
		Cake cake = bakeACake(type);
		
		return cake;
	}

	//Set the cake cost
	public double cost() {
		
		return 150.00;
	}
	
	//Place the cake order
	public boolean cakeOrdered() {
		ordered = true;
		System.out.println("Order placed for a " + name + ".");
		return ordered;
	}
	
	//Cancel the cake order
	public boolean orderCanceled() {
		ordered = false;
		System.out.println("Ok your " + name + " order has been canceled.");
		return ordered;
	}
	
}
