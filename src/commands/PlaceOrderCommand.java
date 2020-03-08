package commands;

import dessertShop.Desserts;

//A class for dessert order command
public class PlaceOrderCommand implements Command {

	Desserts dessert;

	// Set the type of order we are placing
	public PlaceOrderCommand(Desserts dessert) {
		this.dessert = dessert;
	}

	// Execute the order placement
	public void execute() {
		dessert.dessertOrdered();
	}

	// Undo the order placement
	public void undo() {
		dessert.cancelOrder();

	}

}
