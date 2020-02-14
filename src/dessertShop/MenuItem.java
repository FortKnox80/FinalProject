package dessertShop;

public class MenuItem {
	String name;
	String description;
	boolean glutenFree;
	double cost;
	
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
}