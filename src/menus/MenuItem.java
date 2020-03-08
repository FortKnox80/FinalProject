package menus;

//A class for the menu items
public class MenuItem {
	public String name;
	public String description;
	public boolean glutenFree;
	double cost;
	
	//Set the dessert item name, description, is it gluten free, and the cost
	public MenuItem(String name, String description, boolean glutenFree, double cost) {
		this.name = name;
		this.description = description;
		this.glutenFree = glutenFree;
		this.cost = cost;
	}
	
	
	public String getName() {
		return name; 
	}
	
	public String getDescription() {
		return description;
	}

	public boolean isGlutenFree() {
		return glutenFree;
	}
	
	public double getCost() {
		return cost;
	}
	
	//Print out the menu item
	public String toString() {
		return (name + " ,$" + cost + ", " + description);
	}
}
