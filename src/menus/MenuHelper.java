package menus;

import menus.Iterator;

public class MenuHelper {

	Menu menu;

	public MenuHelper(Menu menu) {
		this.menu = menu;
	}

	public void printMenu() {
		Iterator cakeIterator = menu.createIterator();

		System.out.println("Menu\n-------");
		printMenu(cakeIterator);
	}

	public void printMenu(Iterator iterator) {
		while (iterator.hasNext()) {
			MenuItem menuItem = iterator.next();

			System.out.print(menuItem.getName() + ", ");
			System.out.print(menuItem.getCost() + " -- ");
			System.out.println(menuItem.getDescription());
		}
	}
	
	public void printGlutenFreeMenu() {
		printGlutenFreeMenu(menu.createIterator());
	}

	public boolean isItemGlutenFree(String name) {
		Iterator cakeMenuIterator = menu.createIterator();
		
		if(isGlutenFree(name, cakeMenuIterator)) {
			return true;
		}
		return false;
	}
	
	public void printGlutenFreeMenu(Iterator iterator) {
		while(iterator.hasNext()) {
			MenuItem menuItem = iterator.next();
			if (menuItem.isGlutenFree()) {
				System.out.print(menuItem.getName());
				System.out.println("\t\t" + menuItem.getCost());
				System.out.println("\t" + menuItem.getDescription());
			}
		}
	}
	
	private boolean isGlutenFree(String name, Iterator iterator) {
		while (iterator.hasNext()) {
			MenuItem menuItem = iterator.next();
			if(menuItem.getName().equalsIgnoreCase(name)) {
				if(menuItem.isGlutenFree()) {
					return true;
				}
			}
		}
		return false;
	}
}
