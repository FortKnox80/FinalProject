package decorations;

import dessertShop.Desserts;

//A class for gold leaf decorations
public class GoldLeaf extends Decorator {

	Desserts dessertType;

	//Get the dessert to be decorated
	public GoldLeaf(Desserts dessert) {
		dessertType = dessert;
	}

	//Add the decorations to the dessert
	public String getFlavor() {
		return dessertType.getFlavor() + ", Topped With Some Beautiful Gold Leaf";
	}

	//Add the cost to the dessert cost 
	public double cost() {
		
		return dessertType.cost() + 49.99;
	}
}
