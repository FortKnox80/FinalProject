package decorations;

import dessertShop.Desserts;

public class HandPaint extends Decorator {

	Desserts dessertType;


	public HandPaint(Desserts dessert) {
		dessertType = dessert;
	}

	public String getFlavor() {
		return dessertType.getFlavor() + "we'll create a unique look with some edible watercolor paintings,";
	}

	public double cost() {
		
		return dessertType.cost() + 19.99;
	}
}
