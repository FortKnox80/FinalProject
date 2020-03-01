package menu;

import java.util.ArrayList;

import cakes.*;
import dessertShop.Iterator;

public class CakeMenu implements Menu {
	ArrayList<MenuItem> menuItems;
	LemonCake lemonCake = new LemonCake();
	
	static final int MENU_ITEM_MAX = 6;
	int numberOfItems = 0;

	public CakeMenu() {
		menuItems = new ArrayList<MenuItem>();
		addItems("Dark Chocolate Fudge Cake",
				"A rich, flourless chocolate cake that is remeniscent of fudge. Comes with a white chocolate gonache.",
				true, 5.25);
		addItems(lemonCake.name, lemonCake.getCakeFlavor(), false, lemonCake.cost());
	}

	public void addItems(String name, String description, boolean glutenFree, double cost) {
		MenuItem newItem = new MenuItem(name, description, glutenFree, cost);
		if(numberOfItems >= MENU_ITEM_MAX) {
			System.err.println("Sorry, if we add anything more to our menu he quality will suffer.");
		} else {
			menuItems.add(newItem);
			numberOfItems = numberOfItems += 1;
		}
		
	}
	
	public ArrayList<MenuItem> getMenuItems(){
		return menuItems;
	}
	
	public Iterator createIterator() {
		return new CakeMenuIterator(menuItems);
	}
	
	public String toString() {
		return "Our Dellicious Cake Menu";
	}

}
