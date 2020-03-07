package decorations;

import dessertShop.Desserts;

public class FreshFlowers extends Decorator {

	Desserts dessertType;

	
	public FreshFlowers(Desserts dessert) {
		dessertType = dessert;
	}
	public String getFlavor() {
		return dessertType.getFlavor() + ", Topped With Some Fresh Flowers to Create a Finished Look";
	}

	public double cost() {
		
		return dessertType.cost() + 59.99;
	}
}
