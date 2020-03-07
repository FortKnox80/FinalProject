package decorations;

import dessertShop.Desserts;

public class Writing extends Decorator {

	Desserts dessertType;

	public Writing(Desserts dessert) {
		dessertType = dessert;
	}

	public String getFlavor() {
		return dessertType.getFlavor() + "add a personalized message,";
	}

	public double cost() {
		
		return dessertType.cost() + 19.99;
	}

}
