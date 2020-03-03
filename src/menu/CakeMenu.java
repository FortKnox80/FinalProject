package menu;

import java.util.ArrayList;

import cakes.*;
import dessertShop.Iterator;

//Create a menu for cakes 
public class CakeMenu implements Menu {
	ArrayList<MenuItem> menuItems;
	LemonCake lemonCake = new LemonCake();
	PinkChampagneCake pinkChampagneCake = new PinkChampagneCake();
	GalaxyCake galaxyCake = new GalaxyCake();
	RainbowCake rainbowCake = new RainbowCake();
	RoseCake roseCake = new RoseCake();
	UnknownCake unknownCake = new UnknownCake();
	VanillaBeanCake vanillaBeanCake = new VanillaBeanCake();
	FlourlessChocolateCake flourlessChocolateCake = new FlourlessChocolateCake();
	
	//Set a maximum number of items for the menu
	static final int MENU_ITEM_MAX = 7;
	//Keep a running count of items added to the menu
	int numberOfItems = 0;

	//Create a new menu item based off of the deserts available
	public CakeMenu() {
		menuItems = new ArrayList<MenuItem>();
		addItems(lemonCake.name, lemonCake.getCakeFlavor(), false, lemonCake.cost());
		addItems(pinkChampagneCake.name, pinkChampagneCake.getCakeFlavor(), false, pinkChampagneCake.cost());
		addItems(galaxyCake.name,galaxyCake.getCakeFlavor(), false, galaxyCake.cost());
		addItems(rainbowCake.name, rainbowCake.getCakeFlavor(), false, rainbowCake.cost());
		addItems(roseCake.name, roseCake.getCakeFlavor(), false, roseCake.cost());
		addItems(vanillaBeanCake.name, vanillaBeanCake.getCakeFlavor(), false, vanillaBeanCake.cost());
		addItems(flourlessChocolateCake.name, flourlessChocolateCake.getCakeFlavor(), true, flourlessChocolateCake.cost());
		
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
