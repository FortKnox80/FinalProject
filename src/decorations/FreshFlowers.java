package decorations;

import cakes.*;
import decorators.CakeDecorator;

public class FreshFlowers extends CakeDecorator {

	Cake cake;

	FreshFlowers(Cake cake) {
		this.cake = cake;
	}

	public String getCakeFlavor() {
		return cake.getCakeFlavor() + "add beautiful fresh flowers to create a finished look,";
	}

	public double cost() {
		
		return cake.cost() + 19.99;
	}

}
