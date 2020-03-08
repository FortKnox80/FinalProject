package cakes;

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

	
	//Set the cake cost
	public double cost() {
		
		return 150.00;
	}
	
	//Place the cake order
	public boolean cakeOrdered() {
		ordered = true;
		System.out.println("Your " +name+ " order has been placed");
		return ordered;
	}
	
	//Cancel the cake order
	public boolean orderCanceled() {
		ordered = false;
		System.out.println("Ok your " + name + " order has been canceled.");
		return ordered;
	}
	
}
