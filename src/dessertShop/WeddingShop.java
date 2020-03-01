package dessertShop;

import cakes.*;
import menu.CakeMenu;
import menu.MenuHelper;

public class WeddingShop extends Shop {
	 CakeMenu cakeMenu = new CakeMenu();
	 MenuHelper helper = new MenuHelper(cakeMenu);
	 
	 Cake bakeACake(String type) {
		 Cake cake = new UnknownCake();
		 
		 if(type.toLowerCase().contains("lemon")) {
			  cake = new LemonCake();
		 }
		 return cake;
	}
	 
	public void menu() {
		 helper.printMenu();
	}
}
