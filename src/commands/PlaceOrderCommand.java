package commands;

import cakes.*;

public class PlaceOrderCommand implements Command {

	Cake cake;
	
	public PlaceOrderCommand(Cake cake) {
		this.cake = cake;
	}
	
	public void execute() {
		cake.cakeOrdered();
		
	}

	
	public void undo() {
		cake.cancelOrder();
	}

	
}
