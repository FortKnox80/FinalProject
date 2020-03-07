package cakes;
//A class for lemon cakes
public class PinkChampagneCake extends Cake {

	public PinkChampagneCake() {
		ordered = false;
		name = "Pop the Champagne Cake";
		filling = "Bright White, Vanilla Swiss Buttercream";
		spongeCakeType = "Fluffy Pink Champange";
		icingFlavor = "Pink Champagne Vanilla Swiss Buttercream";
		fondant = "and a Soft, White, Quilted Vanilla Fondant";
	}

	//A method to bake the cake
	public Cake bakeACake(String type) {
		Cake cake = bakeACake(type);
		
		return cake;
	}

	//Set the cake cost
	public double cost() {
		
		return 300.00;
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
