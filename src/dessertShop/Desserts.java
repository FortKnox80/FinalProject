package dessertShop;

public abstract class Desserts {
   
	public boolean ordered;
	
	public String name;

	
	//Get the dessert name
	public String getName() {
		return name;
	}
	
	public boolean dessertOrdered() {
		System.out.println("Your "+name+ " has been placed");
		ordered = true;
		return ordered;
	}
	
	public abstract double cost();
	
}
