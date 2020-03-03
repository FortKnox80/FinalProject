package cheesecakes;

import dessertShop.*;

//A class for lemon cheesecakes
public class DecadentChocolateCheesecake extends Cheesecake {

	public DecadentChocolateCheesecake() {
		ordered = false;
		name = "Decadent Chocolate Cheesecake";
		crust = "Flourless Fudge";
		filling = "Dark Chocolate Mousse";
		toppings = "White Chocolate Sauce";
	}

	//A method to bake the cheesecake
	public Cheesecake bakeACheesecake(String type) {
		Cheesecake cheesecake = bakeACheesecake(type);
		
		return cheesecake;
	}

	//Set the cheesecake cost
	public double cost() {
		
		return 100.00;
	}
	
	//Place the cheesecake order
	public boolean cheesecakeOrdered() {
		ordered = true;
		System.out.println("Order placed for a " + name + ".");
		return ordered;
	}
	
	//Cancel the cheesecake order
	public boolean orderCanceled() {
		ordered = false;
		System.out.println("Ok your " + name + " order has been canceled.");
		return ordered;
	}
	
}
