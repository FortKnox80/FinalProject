package decorations;

import cakes.*;
import decorators.CakeDecorator;

public class EdiblePearls extends CakeDecorator {

	Cake cake;

	EdiblePearls(Cake cake) {
		this.cake = cake;
	}

	public String getCakeFlavor() {
		return cake.getCakeFlavor() + "add a classic look with some edible pearls,";
	}

	public double cost() {
		
		return cake.cost() + 19.99;
	}

}
