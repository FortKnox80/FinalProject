package decorations;

import dessertShop.Desserts;

public class HandPaint extends Decorator {

	Desserts dessertType;


	public HandPaint(Desserts dessert) {
		dessertType = dessert;
	}

	public String getFlavor() {
		return dessertType.getFlavor() + ", With a Unique, Edible Watercolor Painting";
	}

	public double cost() {
		
		return dessertType.cost() + 79.99;
	}
}
