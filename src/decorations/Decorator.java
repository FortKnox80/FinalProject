package decorations;

import dessertShop.Desserts;

//A parent class for the decorators
public abstract class Decorator extends Desserts {
	
	public abstract String getFlavor();

}
