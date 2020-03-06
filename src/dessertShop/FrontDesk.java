package dessertShop;

public class FrontDesk {

	public static void main(String[] args) {
		
		WeddingShop weddingShop = new WeddingShop();
		
		weddingShop.cakeMenu();
		weddingShop.cookieMenu();
		weddingShop.macaroonMenu();
		weddingShop.cheesecakeMenu();
		weddingShop.brownieMenu();
		weddingShop.pieMenu();
		
		weddingShop.glutenFreeMenu();
		
		
		POSConsole pos = new POSConsole();
		
		
		
		
		
		
		
		pos.orderButtonPushed(0);
		
		
	}

}
