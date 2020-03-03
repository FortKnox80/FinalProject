package decorations;

import cakes.*;
import decorators.CakeDecorator;

public class GoldLeaf extends CakeDecorator {

	Cake cake;

	GoldLeaf(Cake cake) {
		this.cake = cake;
	}

	public String getCakeFlavor() {
		return cake.getCakeFlavor() + "let's top it with some beautiful gold leaf,";
	}

	public double cost() {
		
		return cake.cost() + 19.99;
	}

}
