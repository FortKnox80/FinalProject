package dessertShop;

import cakes.*;
import menu.*;
import menu.MenuHelper;

public class WeddingShop extends Shop {
	 CakeMenu cakeMenu = new CakeMenu();
	 MenuHelper cakeHelper = new MenuHelper(cakeMenu);
	 
	 CookieMenu cookieMenu = new CookieMenu();
	 MenuHelper cookieHelper = new MenuHelper(cookieMenu);
	 
	 MacaroonMenu macaroonMenu = new MacaroonMenu();
	 MenuHelper macaroonHelper = new MenuHelper(macaroonMenu);
	 
	 CheesecakeMenu cheesecakeMenu = new  CheesecakeMenu();
	 MenuHelper cheesecakeHelper = new MenuHelper(cheesecakeMenu);
	 
	 BrownieMenu brownieMenu = new BrownieMenu();
	 MenuHelper brownieHelper = new MenuHelper(brownieMenu);
	 
	 PieMenu pieMenu = new PieMenu();
	 MenuHelper pieHelper = new MenuHelper(pieMenu);
	 
	 Cake bakeACake(String type) {
		 Cake cake = new UnknownCake();
		 
		 if(type.toLowerCase().contains("lemon")) {
			  cake = new LemonCake();
		 }
		 return cake;
	}
	 
	public void cakeMenu() {
		 cakeHelper.printMenu();
	}
	
	public void cookieMenu() {
		cookieHelper.printMenu();
	}
	
	public void macaroonMenu() {
		macaroonHelper.printMenu();
	}
	
	public void cheesecakeMenu() {
		cheesecakeHelper.printMenu();
	}
	
	public void pieMenu() {
		pieHelper.printMenu();
	}
	
	public void brownieMenu() {
		brownieHelper.printMenu();
	}
	
	
	public void glutenFreeMenu() {
		System.out.println("Here is our gluten free menu.\n");
		System.out.println("----Gluten Free Menu-----");
		 cakeHelper.printGlutenFreeMenu();
		 cookieHelper.printGlutenFreeMenu();
		 macaroonHelper.printGlutenFreeMenu();
		 cheesecakeHelper.printGlutenFreeMenu();
		 pieHelper.printGlutenFreeMenu();
		 brownieHelper.printGlutenFreeMenu();
	}
	
}
