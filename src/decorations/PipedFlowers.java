package decorations;

import dessertShop.Desserts;

public class PipedFlowers extends Decorator {

	Desserts dessertType;

	public PipedFlowers(Desserts dessert) {
		dessertType = dessert;
	}

	public String getFlavor() {
		return dessertType.getFlavor() + "adding some gorgeous buttercream flowers";
	}

	public double cost() {
		
		return dessertType.cost() + 19.99;
	}

}
