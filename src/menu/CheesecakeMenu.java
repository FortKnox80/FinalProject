package menu;

import java.util.ArrayList;

import dessertShop.Iterator;
import cheesecakes.*;

//Create a menu for the cheesecakes 
public class CheesecakeMenu implements Menu {
	ArrayList<MenuItem> menuItems;
	
	BlackberryCheesecake blackberryCheesecake = new BlackberryCheesecake();
	BlueberryCheesecake blueberryCheesecake = new BlueberryCheesecake();
	DecadentChocolateCheesecake decadentChocolateCheesecake = new DecadentChocolateCheesecake();
	RaspberryDelightCheesecake raspberryDelightCheesecake = new RaspberryDelightCheesecake();
	StrawberryCheesecake strawberryCheesecake = new StrawberryCheesecake();
	
	//Set a maximum number of items for the menu
	static final int MENU_ITEM_MAX = 7;
	//Keep a running count of items added to the menu
	int numberOfItems = 0;

	//Create a new menu item based off of the deserts available
	public CheesecakeMenu() {
		menuItems = new ArrayList<MenuItem>();
		
		addItems(blackberryCheesecake.name, blackberryCheesecake.getCheesecakeFlavor(), false, blackberryCheesecake.cost());
		addItems(blueberryCheesecake.name, blueberryCheesecake.getCheesecakeFlavor(), false, blueberryCheesecake.cost());
		addItems(decadentChocolateCheesecake.name, decadentChocolateCheesecake.getCheesecakeFlavor(), true, decadentChocolateCheesecake.cost());
		addItems(raspberryDelightCheesecake.name, raspberryDelightCheesecake.getCheesecakeFlavor(), false, raspberryDelightCheesecake.cost());
		addItems(strawberryCheesecake.name, strawberryCheesecake.getCheesecakeFlavor(), false, strawberryCheesecake.cost());
		
		
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
	
	//A method to get menu items
	public ArrayList<MenuItem> getMenuItems(){
		return menuItems;
	}
	
	//Create an iterator for the menu
	public Iterator createIterator() {
		return new CakeMenuIterator(menuItems);
	}
	
	//Create a new toString method to print out the name of the menu
	public String toString() {
		return "Our Dellicious Cheesecake Menu";
	}

}
