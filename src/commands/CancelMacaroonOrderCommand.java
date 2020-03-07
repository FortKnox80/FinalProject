package commands;

import macaroons.*;

public class CancelMacaroonOrderCommand implements Command {


	Macaroon macaroon;
	
	//Set the type of order we are placing
	public CancelMacaroonOrderCommand(Macaroon macaroon) {
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
