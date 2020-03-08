package dessertShop;

import menus.*;

public class WeddingShop extends Shop {
	
	//Initialize a menu and a menu helper for each dessert type
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
	 
	
	//Set up a cake menu
	public void cakeMenu() {
		System.out.println("All of desserts for our weddings are fun, yet elegant and tasteful:");
		 cakeHelper.printMenu();
	}
	
	//Set up a cookie menu
	public void cookieMenu() {
		System.out.println("All of desserts for our weddings are fun, yet elegant and tasteful:");
		cookieHelper.printMenu();
	}
	
	//Set up a macaroon menu
	public void macaroonMenu() {
		System.out.println("All of desserts for our weddings are fun, yet elegant and tasteful:");
		macaroonHelper.printMenu();
	}
	
	//Set up a cheesecake menu
	public void cheesecakeMenu() {
		System.out.println("All of desserts for our weddings are fun, yet elegant and tasteful:");
		cheesecakeHelper.printMenu();
	}
	
	//Setup a pie menu
	public void pieMenu() {
		System.out.println("All of desserts for our weddings are fun, yet elegant and tasteful:");
		pieHelper.printMenu();
	}
	
	//Set up a brownie menu
	public void brownieMenu() {
		System.out.println("All of desserts for our weddings are fun, yet elegant and tasteful:");
		brownieHelper.printMenu();
	}
	
	//Set up a decorations menu
	public void decorationsMenu() {
		decorationsHelper.printMenu();
	}
	
	//Set up a gluten free menu
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
