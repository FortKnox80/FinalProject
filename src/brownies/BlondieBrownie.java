package brownies;

import dessertShop.*;

//A class for lemon brownies
public class BlondieBrownie extends Brownie {

	public BlondieBrownie() {
		ordered = false;
		
		name = "Blondes Have More Fun";
		brownieBase = "Blondie Brownie";
		fillings = "Milk Chocolate Chunks";
		
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
