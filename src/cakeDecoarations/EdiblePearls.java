package cakeDecoarations;

import cakes.*;
import decorators.*;

public class EdiblePearls extends CakeDecorator {

	Cake cake;
	
	public EdiblePearls(Cake cake ) {
		this.cake = cake;
	}

	public String getFlavor() {
		return cake.getFlavor() + "add a classic look with some edible pearls,";
	}

	public double cost() {
		
		return cake.cost() + 19.99;
	}

}
