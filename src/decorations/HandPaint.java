package decorations;

import dessertShop.Desserts;

//A class for hand painting decorations
public class HandPaint extends Decorator {

	Desserts dessertType;

	//Get the dessert to be decorated
	public HandPaint(Desserts dessert) {
		dessertType = dessert;
	}

	//Add the decorations to the dessert
	public String getFlavor() {
		return dessertType.getFlavor() + ", With a Unique, Edible Watercolor Painting";
	}

	//Add the cost to the dessert cost 
	public double cost() {
		
		return dessertType.cost() + 79.99;
	}
}
