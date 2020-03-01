package menu;

public class MenuItem {
	public String name;
	public String description;
	public boolean glutenFree;
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
	
	public String toString() {
		return (name + " ,$" + cost + ", " + description);
	}
}
