package commands;

import cakes.*;

public class PlaceCakeOrderCommand implements Command {

	Cake cake;
	
	public PlaceCakeOrderCommand(Cake cake) {
		this.cake = cake;
	}
	
	public void execute() {
		cake.cakeOrdered();
		
	}

	
	public void undo() {
		cake.cancelOrder();
	}

	
}
