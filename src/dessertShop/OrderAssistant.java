package dessertShop;

import java.util.ArrayList;
import menu.*;

public class OrderAssistant {

	ArrayList<Menu> menus;
	ArrayList<MenuItem> items;

	public OrderAssistant(ArrayList<Menu> menus) {
			this.menus = menus;
		}

	// A method to print out items that are on the menu
	void printMenu(Iterator iterator) {
		// While there is still another item on the menu print it
		while (iterator.hasNext()) {
			MenuItem menuItem = (MenuItem) iterator.next();
			System.out.println(menuItem.getName());
			System.out.println(menuItem.getDescription());
			System.out.println(menuItem.glutenFree);
			System.out.println("$ " + menuItem.getCost());
		}
	}
	public void printMenu() {
		CakeMenuIterator readMenu = new CakeMenuIterator(items); 
		//While there is still an item on the menu, print it out using the above print menu method
		while (readMenu.hasNext()) {
			Menu menu = (Menu) readMenu.next();
			printMenu(menu.createIterator());
		}
	}

}
