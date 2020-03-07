package cakes;
//A class for lemon cakes
public class GalaxyCake extends Cake {

	public GalaxyCake() {
		ordered = false;
		name = "Infinite Galaxy Cake";
		filling = "Chocolate Ganache";
		spongeCakeType = "Dark Chocolate Sponge With Planets Baked In";
		icingFlavor = "Mirror Glaze";
		fondant = "";
	}

	//A method to bake the cake
	public Cake bakeACake(String type) {
		Cake cake = bakeACake(type);
		
		return cake;
	}

	//Set the cake cost
	public double cost() {
		
		return 250.00;
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
