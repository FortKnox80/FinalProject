package commands;

import cheesecakes.*;

public class CancelCheesecakeOrderCommand implements Command {


	Cheesecake cheesecake;
	
	//Set the type of order we are placing
	public CancelCheesecakeOrderCommand(Cheesecake cheesecake) {
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
