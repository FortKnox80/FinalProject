package dessertShop;

public class POSCenter {

	int buttonNumber;
	Command[] placeOrder;
	Command[] cancelOrder;
	Command undoCommand;

	public POSCenter() {
		buttonNumber = 10;
		placeOrder = new Command[buttonNumber];
		cancelOrder = new Command[buttonNumber];

		Command noCommand = new NoCommand();

		for (int i = 0; i < buttonNumber; i++) {
			placeOrder[i] = noCommand;
			cancelOrder[i] = noCommand;
		}

		undoCommand = noCommand;

	}

	public void setCommand(int button, Command placeOrderCommand, Command cancelOrderCommand) {

		placeOrder[button] = placeOrderCommand;
		cancelOrder[button] = cancelOrderCommand;
	}

	public void orderButtonPushed(int slot) {
		placeOrder[slot].execute();
		undoCommand = placeOrder[slot];
	}

	public void cancelOrderButtonPushed(int slot) {
		cancelOrder[slot].execute();
		undoCommand = cancelOrder[slot];

	}

}
