package dessertShop;

import java.util.ArrayList;

public class CakeMenu {
	ArrayList<MenuItem> menuItems;

	public CakeMenu() {
		menuItems = new ArrayList<MenuItem>();
		addItems("Dark Chocolate Fudge Cake",
				"A rich, flourless chocolate cake that is remeniscent of fudge. Comes with a white chocolate gonache.",
				true, 5.25);
	}

	public void addItems(String name, String description, boolean glutenFree, double cost) {
		MenuItem newItem = new MenuItem(name, description, glutenFree, cost);
		menuItems.add(newItem);
	}
	
	public Iterator createIterator() {
		return new CakeMenuIterator(menuItems);
	}

}
