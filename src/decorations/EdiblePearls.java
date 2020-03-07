package decorations;

import dessertShop.Desserts;

public class EdiblePearls extends Decorator {
	
	Desserts dessertType;

	public EdiblePearls(Desserts dessert) {
		dessertType = dessert;
	}
	
	public String getFlavor() {
		return dessertType.getFlavor() + "add a classic look with some edible pearls,";
	}

	public double cost() {
		
		return dessertType.cost() + 19.99;
	}
}
