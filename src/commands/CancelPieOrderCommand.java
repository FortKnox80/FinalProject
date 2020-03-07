package commands;

import pies.*;

public class CancelPieOrderCommand implements Command {


	Pie pie;
	
	//Set the type of order we are placing
	public CancelPieOrderCommand(Pie pie) {
		this.pie = pie;
	}
	
	//Execute the order placement
	public void execute() {
		pie.dessertOrdered();
	}

	//Undo the order placement
	public void undo() {
		pie.cancelOrder();
		
	}

	
}
