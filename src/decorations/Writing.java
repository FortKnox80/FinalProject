package decorations;

import dessertShop.Desserts;

//A class for writing decorations
public class Writing extends Decorator {

	Desserts dessertType;

	//Get the dessert to be decorated
	public Writing(Desserts dessert) {
		dessertType = dessert;
	}

	//Add the decorations to the dessert
	public String getFlavor() {
		return dessertType.getFlavor() + ", With a Personalized Message";
	}

	//Add the cost to the dessert cost
	public double cost() {
		
		return dessertType.cost() + 9.99;
	}

}
