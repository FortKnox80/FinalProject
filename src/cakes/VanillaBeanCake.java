package cakes;

//A class for vanilla cakes
public class VanillaBeanCake extends Cake {

	public VanillaBeanCake() {
		ordered = false;
		name = "Madagascar Vanilla Bean Cake";
		spongeCakeType = "Vanilla Bean Angel Food Cake";
		filling = "Vanilla Whipped Cream";
		icingFlavor = "Vanilla Buttercream";
		fondant = "";
	}

	//Set the cake cost
	public double cost() {
		
		return 100.00;
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
