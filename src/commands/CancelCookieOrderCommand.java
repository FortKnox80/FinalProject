package commands;

import cookies.*;

public class CancelCookieOrderCommand implements Command {


	Cookie cookie;
	
	//Set the type of order we are placing
	public CancelCookieOrderCommand(Cookie cookie) {
		this.cookie = cookie;
	}
	
	//Execute the order placement
	public void execute() {
		cookie.dessertOrdered();
	}

	//Undo the order placement
	public void undo() {
		cookie.cancelOrder();
		
	}

	
}
