package dessertShop;

//A parent class for all of the different dessert types
public abstract class Desserts {
   
	public boolean ordered;
	
	public String name;

	
	//Get the dessert name
	public String getName() {
		return name;
	}
	
	//Get the dessert flavor
	public String getFlavor() {
	 return name;
	}
	
	//Has the dessert been ordered
	public boolean dessertOrdered() {
		System.out.println("Your "+name+ " has been placed");
		ordered = true;
		return ordered;
	}
	
	//Cancel the dessert order
	public void cancelOrder() {
		System.out.println("Your order has been canceled");
		ordered = false;
	}
	
	//Hold the cost for the decorators to use
	public abstract double cost();
	
}
