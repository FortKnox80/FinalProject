package dessertShop;

public class FrontDesk {

	public static void main(String[] args) {
		
		WeddingShop weddingShop = new WeddingShop();
		
		weddingShop.menu();
		
		
		POSConsole pos = new POSConsole();
		
		
		
		
		pos.orderButtonPushed(0);
		
		
	}

}
