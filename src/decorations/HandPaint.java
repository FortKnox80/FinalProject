package decorations;

import cakes.*;
import decorators.CakeDecorator;

public class HandPaint extends CakeDecorator {

	Cake cake;

	HandPaint(Cake cake) {
		this.cake = cake;
	}

	public String getCakeFlavor() {
		return cake.getCakeFlavor() + "we'll create a unique look with some edible watercolor paintings,";
	}

	public double cost() {
		
		return cake.cost() + 19.99;
	}

}
