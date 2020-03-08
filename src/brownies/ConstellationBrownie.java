package brownies;

//A class for constellation brownies
public class ConstellationBrownie extends Brownie {

	public ConstellationBrownie() {
		ordered = false;
		name = "Constellation Brownie";
		brownieBase = "Dark Chocolate Brownie Base";
		fillings = "White Chocolate Chunks as a Constellation Against a Dark Backdrop";
		
	}

	//Set the brownie cost
	public double cost() {
		
		return 95.00;
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
