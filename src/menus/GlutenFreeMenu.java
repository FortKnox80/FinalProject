package menus;

import java.util.ArrayList;

import cookies.*;
import menus.Iterator;

//Create a menu for for gluten free items
public class GlutenFreeMenu implements Menu {
	
	ArrayList<MenuItem> menuItems;
	public GlutenFreeMenu() {
		menuItems = new ArrayList<MenuItem>();
	}

	
	//Create a new toString method to print out the name of the menu
	public String toString() {
		return "Gluten Free Menu";
	}


	public Iterator createIterator() {
		
		return new MenuIterator(menuItems);
		
	}

}
