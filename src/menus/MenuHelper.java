package menus;

import menus.Iterator;

//A helper for rattling off all the menu items
public class MenuHelper {

	Menu menu;

	//The helper will work with the passed in menu
	public MenuHelper(Menu menu) {
		this.menu = menu;
	}

	//A method for printing the menu out
	public void printMenu() {
		Iterator menuIterator = menu.createIterator();

		System.out.println("Menu\n-------");
		printMenu(menuIterator);
	}

	//Iterate over each item on the menu to print out
	public void printMenu(Iterator iterator) {
		while (iterator.hasNext()) {
			MenuItem menuItem = iterator.next();

			System.out.print(menuItem.getName() + ", ");
			System.out.print(menuItem.getCost() + " -- ");
			System.out.println(menuItem.getDescription());
		}
	}
	
	//Print out a gluten free menu
	public void printGlutenFreeMenu() {
		printGlutenFreeMenu(menu.createIterator());
	}

	//Get the gluten free items from the menu
	public boolean isItemGlutenFree(String name) {
		Iterator cakeMenuIterator = menu.createIterator();
		
		if(isGlutenFree(name, cakeMenuIterator)) {
			return true;
		}
		return false;
	}
	
	//Iterate over each gluten free item and print it out
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
	
	//Determine whether each item is gluten free 
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
