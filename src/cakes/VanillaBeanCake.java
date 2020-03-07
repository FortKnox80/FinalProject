package cakes;
//A class for lemon cakes
public class VanillaBeanCake extends Cake {

	public VanillaBeanCake() {
		ordered = false;
		name = "Madagascar Vanilla Bean Cake";
		spongeCakeType = "Vanilla Bean Angel Food Cake";
		filling = "Vanilla Whipped Cream";
		icingFlavor = "Vanilla Buttercream";
		fondant = "";
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
