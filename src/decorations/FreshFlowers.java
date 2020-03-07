package decorations;

import dessertShop.Desserts;

public class FreshFlowers extends Decorator {

	Desserts dessertType;

	
	public FreshFlowers(Desserts dessert) {
		dessertType = dessert;
	}
	public String getFlavor() {
		return dessertType.getFlavor() + "add beautiful fresh flowers to create a finished look,";
	}

	public double cost() {
		
		return dessertType.cost() + 19.99;
	}
}
