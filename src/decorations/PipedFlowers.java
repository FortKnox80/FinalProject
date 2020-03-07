package decorations;

import dessertShop.Desserts;

public class PipedFlowers extends Decorator {

	Desserts dessertType;

	public PipedFlowers(Desserts dessert) {
		dessertType = dessert;
	}

	public String getFlavor() {
		return dessertType.getFlavor() + ", Topped With Some Gorgeous Buttercream Flowers";
	}

	public double cost() {
		
		return dessertType.cost() + 39.99;
	}

}
