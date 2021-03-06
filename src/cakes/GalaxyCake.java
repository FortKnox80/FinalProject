package cakes;

//A class for galaxy cakes
public class GalaxyCake extends Cake {

	public GalaxyCake() {
		ordered = false;
		name = "Infinite Galaxy Cake";
		filling = "Chocolate Ganache";
		spongeCakeType = "Dark Chocolate Sponge With Planets Baked In";
		icingFlavor = "Mirror Glaze";
		fondant = "";
	}


	//Set the cake cost
	public double cost() {
		
		return 250.00;
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
