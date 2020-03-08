package decorations;

import dessertShop.Desserts;

//A class for fresh flower decorations
public class FreshFlowers extends Decorator {

	Desserts dessertType;

	//Get the dessert to be decorated
	public FreshFlowers(Desserts dessert) {
		dessertType = dessert;
	}
	
	//Add the decorations to the dessert
	public String getFlavor() {
		return dessertType.getFlavor() + ", Topped With Some Fresh Flowers to Create a Finished Look";
	}

	//Add the cost to the dessert cost 
	public double cost() {
		
		return dessertType.cost() + 59.99;
	}
}
