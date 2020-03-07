package cakeDecoarations;

import cakes.*;
import decorators.Decorator;

public class HandPaint extends Decorator {

	Cake cake;

	public HandPaint(Cake cake) {
		this.cake = cake;
	}

	public String getFlavor() {
		return cake.getFlavor() + "we'll create a unique look with some edible watercolor paintings,";
	}

	public double cost() {
		
		return cake.cost() + 19.99;
	}

}
