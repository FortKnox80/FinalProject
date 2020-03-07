package cakeDecoarations;

import cakes.*;
import decorators.Decorator;

public class GoldLeaf extends Decorator {

	Cake cake;

	public GoldLeaf(Cake cake) {
		this.cake = cake;
	}

	public String getFlavor() {
		return cake.getFlavor() + "let's top it with some beautiful gold leaf,";
	}

	public double cost() {
		
		return cake.cost() + 19.99;
	}

}
