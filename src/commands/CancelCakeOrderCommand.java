package commands;

import cakes.*;

public class CancelCakeOrderCommand implements Command {

	Cake cake;
	
	//Set the type of order we are placing
	public CancelCakeOrderCommand(Cake cake) {
		this.cake = cake;
	}
	
	//Execute the order placement
	public void execute() {
		cake.dessertOrdered();
	}

	//Undo the order placement
	public void undo() {
		cake.cancelOrder();
		
	}

	
}
