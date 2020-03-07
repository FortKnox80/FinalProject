package decorations;

import dessertShop.Desserts;

public class EdiblePearls extends Decorator {
	
	Desserts dessertType;

	public EdiblePearls(Desserts dessert) {
		dessertType = dessert;
	}
	
	public String getFlavor() {
		return dessertType.getFlavor() + ", Made to Look Classic With Some Edible Pearls";
	}

	public double cost() {
		
		return dessertType.cost() + 39.99;
	}
}
