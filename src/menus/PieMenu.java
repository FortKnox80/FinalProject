package menus;

import java.util.ArrayList;

import pies.*;
import menus.Iterator;

//Create a menu for pies 
public class PieMenu implements Menu {
	ArrayList<MenuItem> menuItems;
	
	BlackberryPie blackberryPie = new BlackberryPie();
	PecanPie pecanPie = new PecanPie();
	PumpkinPie pumpkinPie = new PumpkinPie();
	StrawberryRhubarbPie strawberryRhubarbPie = new StrawberryRhubarbPie();
	
	
	//Set a maximum number of items for the menu
	static final int MENU_ITEM_MAX = 7;
	//Keep a running count of items added to the menu
	int numberOfItems = 0;

	//Create a new menu item based off of the deserts available
	public PieMenu() {
		menuItems = new ArrayList<MenuItem>();
		addItems(blackberryPie.name, blackberryPie.getFlavor(), false, blackberryPie.cost());
		addItems(pecanPie.name, pecanPie.getFlavor(), false, pecanPie.cost());
		addItems(pumpkinPie.name, pumpkinPie.getFlavor(), false, pumpkinPie.cost());
		addItems(strawberryRhubarbPie.name, strawberryRhubarbPie.getFlavor(), false, strawberryRhubarbPie.cost());
		
		
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
		return new MenuIterator(menuItems);
	}
	
	//Create a new toString method to print out the name of the menu
	public String toString() {
		return "Pie Menu";
	}

}
