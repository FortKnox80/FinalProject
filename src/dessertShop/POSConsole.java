package dessertShop;

import cakes.*;
import commands.CancelCakeOrderCommand;
import commands.PlaceCakeOrderCommand;

public class POSConsole extends POSCenter {
	
	POSCenter pos = new POSCenter();
	LemonCake lemonCake = new LemonCake();
	
	PlaceCakeOrderCommand placeLemonCakeOrder = new PlaceCakeOrderCommand(lemonCake);
	CancelCakeOrderCommand cancelLemonCakeOrder = new CancelCakeOrderCommand(lemonCake);
	
	public POSConsole() {

		pos.setCommand(0, placeLemonCakeOrder, cancelLemonCakeOrder);
		
	}
	
	public void orderButtonPushed(int slot) {
		pos.orderButtonPushed(slot);
	}

	public void cancelOrderButtonPushed(int slot) {
		pos.cancelOrderButtonPushed(slot);

	}
}
