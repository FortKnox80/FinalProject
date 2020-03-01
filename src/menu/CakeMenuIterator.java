package menu;

import java.util.ArrayList;

import dessertShop.Iterator;

public class CakeMenuIterator implements Iterator {

	ArrayList<MenuItem> items = new ArrayList<MenuItem>();
	int position = 0;
	
	public CakeMenuIterator(ArrayList<MenuItem> items) {
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
