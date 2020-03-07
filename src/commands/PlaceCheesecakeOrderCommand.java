package commands;

import cheesecakes.*;

public class PlaceCheesecakeOrderCommand implements Command {


	Cheesecake cheesecake;
	
	//Set the type of order we are placing
	public PlaceCheesecakeOrderCommand(Cheesecake cheesecake) {
		this.cheesecake = cheesecake;
	}
	
	//Execute the order placement
	public void execute() {
		cheesecake.dessertOrdered();
	}

	//Undo the order placement
	public void undo() {
		cheesecake.cancelOrder();
		
	}

	
}
