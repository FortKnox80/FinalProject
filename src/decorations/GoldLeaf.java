package decorations;

import dessertShop.Desserts;

public class GoldLeaf extends Decorator {

	Desserts dessertType;


	public GoldLeaf(Desserts dessert) {
		dessertType = dessert;
	}

	public String getFlavor() {
		return dessertType.getFlavor() + ", Topped With Some Beautiful Gold Leaf";
	}

	public double cost() {
		
		return dessertType.cost() + 49.99;
	}
}
