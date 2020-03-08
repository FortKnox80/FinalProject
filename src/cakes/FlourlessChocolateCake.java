package cakes;

//A class for chocolate cakes

public class FlourlessChocolateCake extends Cake {

	public FlourlessChocolateCake() {
		ordered = false;
		name = "Flourless Chocolate Cake";
		spongeCakeType = "Rich, Fudgey, Chocolate Base";
		filling = "White Chocolate Mousse";
		icingFlavor = "Dark Chocolate Ganache";
		fondant = "";
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
