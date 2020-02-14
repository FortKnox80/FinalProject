package dessertShop;

public abstract class Cake {

	String name;
	
	String filling;
	String spongeCakeType;
	String icingFlavor;
	
	public String getName(String type) {
		return name;
	}

	public String getCakeFlavor() {
		return "A " + name + " " + spongeCakeType+ " "+ filling+ " " + icingFlavor+ " Cake: ";
	}
	
	public abstract double cost();
}
	
