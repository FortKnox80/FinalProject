package menus;

import java.util.ArrayList;

import brownies.*;
import menus.Iterator;

//Create a menu for cakes 
public class DecorationsMenu implements Menu {
	ArrayList<MenuItem> menuItems;
	//Set a maximum number of items for the menu
	static final int MENU_ITEM_MAX = 7;
	//Keep a running count of items added to the menu
	int numberOfItems = 0;

	//Create a new menu item based off of the deserts available
	public DecorationsMenu() {
		menuItems = new ArrayList<MenuItem>();
		addItems("Edible Pearls", "Gorgeous, Shinning Sugar Pearls", true, 19.99);
		addItems("Fresh Flowers", "Fresh, Local Grown Flowers", true, 49.99);
		addItems("Gold Leaf", "Edible Gold Leaf Flakes to Add a Pop", true, 39.99);
		addItems("Hand Painting","Edible Works of Art Hand Painted By Fine Craftsmen", true, 99.99);
		addItems("Piped Buttercream Flowers", "Pretty Flowers Delicately Piped Along Your Dessert", true, 29.99);
		addItems("Hand Piped Message", "Add a Personalized Message", true, 9.99);
		
		
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
		return "Peruse Our Decorations";
	}

}
