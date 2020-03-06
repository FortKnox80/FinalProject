package dessertShop;

import commands.Command;
import commands.NoCommand;

//Set up the POS center
public class POSCenter {
	//Number of buttons available 
	int buttonNumber;
	//An array to store all of the order placing commands
	Command[] placeOrder;
	//An array to store all of the order canceling commands
	Command[] cancelOrder;
	//A command to undo commands
	Command undoCommand;

	//Instantiate all the components of the POS center
	public POSCenter() {
		buttonNumber = 50;
		placeOrder = new Command[buttonNumber];
		cancelOrder = new Command[buttonNumber];

		Command noCommand = new NoCommand();
		
		//For each button available in the POS center set the button to no command
		for (int i = 0; i < buttonNumber; i++) {
			placeOrder[i] = noCommand;
			cancelOrder[i] = noCommand;
		}

		//Set the undo command to no command
		undoCommand = noCommand;

	}

	//A method for setting a button as a button for a particular command
	public void setCommand(int button, Command placeOrderCommand, Command cancelOrderCommand) {

		placeOrder[button] = placeOrderCommand;
		//If the button is pressed again, cancel the order
		cancelOrder[button] = cancelOrderCommand;
	}

	//A method for executing the order of the specified item
	public void orderButtonPushed(int slot) {
		placeOrder[slot].execute();
		undoCommand = placeOrder[slot];
	}

	//A method for canceling an order that was placed for a specified item
	public void cancelOrderButtonPushed(int slot) {
		cancelOrder[slot].execute();
		undoCommand = cancelOrder[slot];

	}
	
	public void undoButonPushed() {
		undoCommand.undo();
	}

}
