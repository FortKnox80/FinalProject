package cakes;

//A class for rose cakes
public class RoseCake extends Cake {

	public RoseCake() {
		ordered = false;
		name = "Stop and Smell the Roses Cake";
		filling = "A Delicate Rose Flavored Buttercream";
		spongeCakeType = "A Light, Pink, Vanilla Flavored Sponge";
		icingFlavor = "Vanilla Buttercream";
		fondant = " and Soft Pink Fondant";
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
