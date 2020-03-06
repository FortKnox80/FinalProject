package menu;

import java.util.ArrayList;

import cakes.*;
import dessertShop.Iterator;
import macaroons.*;

//Create a menu for cakes 
public class MacaroonMenu implements Menu {
	ArrayList<MenuItem> menuItems;
	
	LavenderMacaroon lavenderMacaroon = new LavenderMacaroon();
	OrangeCreamMacaroon orangCreamMacaroon = new OrangeCreamMacaroon();
	LemonMacaroon lemonMacaroon = new LemonMacaroon();
	RaspberryMacaroon raspberryMacaroon = new RaspberryMacaroon();
	StrawberryMacaroon strawberryMacaroon = new StrawberryMacaroon();
	VanillaMacaroon vanillaMacaroon = new VanillaMacaroon();
	
	
	//Set a maximum number of items for the menu
	static final int MENU_ITEM_MAX = 7;
	//Keep a running count of items added to the menu
	int numberOfItems = 0;

	//Create a new menu item based off of the deserts available
	public MacaroonMenu() {
		menuItems = new ArrayList<MenuItem>();
		addItems(lavenderMacaroon.name, lavenderMacaroon.getMacaroonFlavor(), false, lavenderMacaroon.cost());
		addItems(orangCreamMacaroon.name, orangCreamMacaroon.getMacaroonFlavor(), false, orangCreamMacaroon.cost());
		addItems(lemonMacaroon.name, lemonMacaroon.getMacaroonFlavor(), false, lemonMacaroon.cost());
		addItems(raspberryMacaroon.name, raspberryMacaroon.getMacaroonFlavor(), false, raspberryMacaroon.cost());
		addItems(strawberryMacaroon.name, strawberryMacaroon.getMacaroonFlavor(), false, strawberryMacaroon.cost());
		addItems(vanillaMacaroon.name, vanillaMacaroon.getMacaroonFlavor(), false, vanillaMacaroon.cost());
		
		
	}

	//A method for adding in a new item to the menu
	public void addItems(String name, String description, boolean glutenFree, double cost) {
		MenuItem newItem = new MenuItem(name, description, glutenFree, cost);
		if(numberOfItems >= MENU_ITEM_MAX) {
			System.err.println("Sorry, if we add anything more to our menu he quality will suffer.");
		} else {
			menuItems.add(newItem);
			numberOfItems = numberOfItems += 1;
		}
		
	}
	
	//A method to get the menu items
	public ArrayList<MenuItem> getMenuItems(){
		return menuItems;
	}
	
	//Create an iterator for the menu
	public Iterator createIterator() {
		return new CakeMenuIterator(menuItems);
	}
	
	//Create a new toString method to print out the name of the menu
	public String toString() {
		return "Our Dellicious Cake Menu";
	}

}
