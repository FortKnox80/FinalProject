package commands;

import macaroons.*;

public class PlaceMacaroonOrderCommand implements Command {


	Macaroon macaroon;
	
	//Set the type of order we are placing
	public PlaceMacaroonOrderCommand(Macaroon macaroon) {
		this.macaroon = macaroon;
	}
	
	//Execute the order placement
	public void execute() {
		macaroon.dessertOrdered();
	}

	//Undo the order placement
	public void undo() {
		macaroon.cancelOrder();
		
	}

	
}
