package brownies;

//A class for blondie brownies
public class BlondieBrownie extends Brownie {

	public BlondieBrownie() {
		ordered = false;
		name = "Blondes Have More Fun";
		brownieBase = "Blondie Brownie Base";
		fillings = "Milk Chocolate Chunks";
		
	}
	
	//Set the brownie cost
	public double cost() {
		
		return 90.00;
	}
	
	//Place the brownie order
	public boolean brownieOrdered() {
		ordered = true;
		System.out.println("Your " +name+ " order has been placed");
		return ordered;
	}
	
	//Cancel the brownie order
	public boolean orderCanceled() {
		ordered = false;
		System.out.println("Ok your " + name + " order has been canceled.");
		return ordered;
	}
	
}
