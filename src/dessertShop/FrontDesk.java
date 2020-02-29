package dessertShop;

public class FrontDesk {

	public static void main(String[] args) {
		
		
		
		
		POSCenter pos = new POSCenter();
		LemonCake lemonCake = new LemonCake();
		
		PlaceCakeOrderCommand placeLemonCakeOrder = new PlaceCakeOrderCommand(lemonCake);
		CancelCakeOrderCommand cancelLemonCakeOrder = new CancelCakeOrderCommand(lemonCake);
		
		
		pos.setCommand(0, placeLemonCakeOrder, cancelLemonCakeOrder);
		
		
		pos.orderButtonPushed(0);
	}

}
