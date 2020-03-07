package menus;

import java.util.ArrayList;

import menus.Iterator;

public class MenuIterator implements Iterator {

	ArrayList<MenuItem> items = new ArrayList<MenuItem>();
	int position = 0;
	
	public MenuIterator(ArrayList<MenuItem> items) {
		this.items = items;
	}
	public boolean hasNext() {
		
		if(position>= items.size() || items.get(position) == null) {
			return false;
		}
		return true;
	}


	public MenuItem next() {
		MenuItem menuItem = items.get(position);
		position += 1;
		return menuItem;
	}

}
