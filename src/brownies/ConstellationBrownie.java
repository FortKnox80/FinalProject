package brownies;

import dessertShop.*;

//A class for lemon brownies
public class ConstellationBrownie extends Brownie {

	public ConstellationBrownie() {
		ordered = false;
		name = "Constellation Brownie";
		brownieBase = "Dark Chocolate Brownie";
		fillings = "White Chocolate Chunks as a Constellation Against a Dark Backdrop";
		
	}

	//A method to bake the brownie
	public Brownie bakeAbrownie(String type) {
		Brownie brownie = bakeAbrownie(type);
		
		return brownie;
	}

	//Set the brownie cost
	public double cost() {
		
		return 100.00;
	}
	
	//Place the brownie order
	public boolean brownieOrdered() {
		ordered = true;
		System.out.println("Order placed for a " + name + ".");
		return ordered;
	}
	
	//Cancel the brownie order
	public boolean orderCanceled() {
		ordered = false;
		System.out.println("Ok your " + name + " order has been canceled.");
		return ordered;
	}
	
}
