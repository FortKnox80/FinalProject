package decorations;

import dessertShop.Desserts;

//A class for edible pearl decorations
public class EdiblePearls extends Decorator {
	
	Desserts dessertType;

	//Get the dessert to be decorated
	public EdiblePearls(Desserts dessert) {
		dessertType = dessert;
	}
	
	//Add the decorations to the dessert
	public String getFlavor() {
		return dessertType.getFlavor() + ", Made to Look Classic With Some Edible Pearls";
	}

	//Add the cost to the dessert cost 
	public double cost() {
		
		return dessertType.cost() + 39.99;
	}
}
