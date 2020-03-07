package cakeDecoarations;

import cakes.*;
import decorators.Decorator;

public class PipedFlowers extends Decorator {

	Cake cake;

	public PipedFlowers(Cake cake) {
		
		this.cake = cake;
	}

	public String getFlavor() {
		return cake.getFlavor() + "adding some gorgeous buttercream flowers";
	}

	public double cost() {
		
		return cake.cost() + 19.99;
	}

}
