package commands;

import pies.*;

public class PlacePieOrderCommand implements Command {


	Pie pie;
	
	//Set the type of order we are placing
	public PlacePieOrderCommand(Pie pie) {
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
