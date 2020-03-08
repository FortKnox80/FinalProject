package menus;

import java.util.ArrayList;

import menus.Iterator;

//A class used to iterate over the different types of menus
public class MenuIterator implements Iterator {

	//Create a list of the menu items
	ArrayList<MenuItem> items = new ArrayList<MenuItem>();
	//Start at the beginning
	int position = 0;
	
	//Pass in the menu items
	public MenuIterator(ArrayList<MenuItem> items) {
		this.items = items;
	}
	
	//Check to see if there is a next item
	public boolean hasNext() {
		
		if(position>= items.size() || items.get(position) == null) {
			return false;
		}
		return true;
	}


	//Get the next item
	public MenuItem next() {
		MenuItem menuItem = items.get(position);
		position += 1;
		return menuItem;
	}

}
