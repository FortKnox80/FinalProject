package commands;

import brownies.*;

public class PlaceBrownieOrderCommand implements Command {

	Brownie brownie;
	
	//Set the type of order we are placing
	public PlaceBrownieOrderCommand(Brownie brownie) {
		this.brownie = brownie;
	}
	
	//Execute the order placement
	public void execute() {
		brownie.dessertOrdered();
	}

	//Undo the order placement
	public void undo() {
		brownie.cancelOrder();
		
	}

	
}
