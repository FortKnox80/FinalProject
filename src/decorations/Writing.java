package decorations;

import cakes.*;
import decorators.CakeDecorator;

public class Writing extends CakeDecorator {

	Cake cake;

	Writing(Cake cake) {
		this.cake = cake;
	}

	public String getCakeFlavor() {
		return cake.getCakeFlavor() + "we will add a personalized message for you no problem,";
	}

	public double cost() {
		
		return cake.cost() + 19.99;
	}

}
