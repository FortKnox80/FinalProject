package cakes;
//A class for rainbow cakes
public class RainbowCake extends Cake {

	public RainbowCake() {
		ordered = false;
		name = "All the Beatiful Colors of the Rainbow Cake";
		filling = "Bright Raspberry Coulis, and Fresh Whipped Cream";
		spongeCakeType = "Layered Orange, Lime, Lemon, and Strawberry Sponges";
		icingFlavor = "Swirled Orange, Lime, Lemon, and Strawberry Buttercream Icings";
		fondant = "";
	}

	//A method to bake the cake
	public Cake bakeACake(String type) {
		Cake cake = bakeACake(type);
		
		return cake;
	}

	//Set the cake cost
	public double cost() {
		
		return 200.00;
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
