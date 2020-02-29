package dessertShop;

public abstract class Cake {
	

	public boolean ordered;
	
	String name;
	
	String filling;
	String spongeCakeType;
	String icingFlavor;
	String fondant;
	
	public String getName(String type) {
		return name;
	}

	public String getCakeFlavor() {
		return "A " + name + " " + spongeCakeType+ " "+ filling+ " " + icingFlavor+ " Cake: ";
	}
	
	public boolean cakeOrdered() {
		System.out.println("Your order has been placed");
		ordered = true;
		return ordered;
	}
	
	public void cancelOrder() {
		System.out.println("Your order has been canceled");
		ordered = false;
	}
	
	public abstract double cost();
}
	
