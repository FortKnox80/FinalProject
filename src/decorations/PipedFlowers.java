package decorations;

import dessertShop.Desserts;

//A class for piped flower decorations
public class PipedFlowers extends Decorator {

	Desserts dessertType;

	//Get the dessert to be decorated
	public PipedFlowers(Desserts dessert) {
		dessertType = dessert;
	}

	//Add the decorations to the dessert
	public String getFlavor() {
		return dessertType.getFlavor() + ", Topped With Some Gorgeous Buttercream Flowers";
	}

	//Add the cost to the dessert cost 
	public double cost() {
		
		return dessertType.cost() + 39.99;
	}

}
