package commands;

import dessertShop.Desserts;

//A class to cancel a dessert order
public class CancelOrderCommand implements Command {

	Desserts dessert;
	
	//Set the type of order we are placing
	public CancelOrderCommand(Desserts dessert) {
		this.dessert = dessert;
	}
	
	//Execute the order placement
	public void execute() {
		dessert.dessertOrdered();
	}

	//Undo the order placement
	public void undo() {
		dessert.cancelOrder();
		
	}

	
}
