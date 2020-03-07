package decorations;

import dessertShop.Desserts;

public class GoldLeaf extends Decorator {

	Desserts dessertType;


	public GoldLeaf(Desserts dessert) {
		dessertType = dessert;
	}

	public String getFlavor() {
		return dessertType.getFlavor() + "let's top it with some beautiful gold leaf,";
	}

	public double cost() {
		
		return dessertType.cost() + 19.99;
	}
}
