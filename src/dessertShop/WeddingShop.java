package dessertShop;

import cakes.*;
import menus.*;

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
	 
	 DecorationsMenu decorationsMenu = new DecorationsMenu();
	 MenuHelper decorationsHelper = new MenuHelper(decorationsMenu);
	 
	
	 
	public void cakeMenu() {
		System.out.println("All of desserts for our weddings are fun, yet elegant and tasteful:");
		 cakeHelper.printMenu();
	}
	
	public void cookieMenu() {
		System.out.println("All of desserts for our weddings are fun, yet elegant and tasteful:");
		cookieHelper.printMenu();
	}
	
	public void macaroonMenu() {
		System.out.println("All of desserts for our weddings are fun, yet elegant and tasteful:");
		macaroonHelper.printMenu();
	}
	
	public void cheesecakeMenu() {
		System.out.println("All of desserts for our weddings are fun, yet elegant and tasteful:");
		cheesecakeHelper.printMenu();
	}
	
	public void pieMenu() {
		System.out.println("All of desserts for our weddings are fun, yet elegant and tasteful:");
		pieHelper.printMenu();
	}
	
	public void brownieMenu() {
		System.out.println("All of desserts for our weddings are fun, yet elegant and tasteful:");
		brownieHelper.printMenu();
	}
	public void decorationsMenu() {
		System.out.println("All of desserts for our weddings are fun, yet elegant and tasteful:");
		decorationsHelper.printMenu();
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
