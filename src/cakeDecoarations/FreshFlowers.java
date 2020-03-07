package cakeDecoarations;

import cakes.*;
import decorators.Decorator;

public class FreshFlowers extends Decorator {

	Cake cake;
	
	public FreshFlowers(Cake cake) {
		this.cake = cake;
	}
	public String getFlavor() {
		return cake.getFlavor() + "add beautiful fresh flowers to create a finished look,";
	}

	public double cost() {
		
		return cake.cost() + 19.99;
	}

}
