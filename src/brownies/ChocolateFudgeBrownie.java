package brownies;

import dessertShop.*;

//A class for lemon brownies
public class ChocolateFudgeBrownie extends Brownie {

	public ChocolateFudgeBrownie() {
		ordered = false;
		name = "Chocolate Fudge Brownie";
		brownieBase = "Rich Chocolate Brownie Base";
		fillings = "Creamy Dark Chocolate Fudge Swirl";
		
	}

	//A method to bake the brownie
	public Brownie bakeAbrownie(String type) {
		Brownie brownie = bakeAbrownie(type);
		
		return brownie;
	}

	//Set the brownie cost
	public double cost() {
		
		return 95.00;
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
