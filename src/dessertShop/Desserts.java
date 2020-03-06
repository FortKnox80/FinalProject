package dessertShop;

public abstract class Desserts {
   
	public boolean ordered;
	
	public String name;

	
	//Get the cake name
	public String getName() {
		return name;
	}
	
	public abstract double cost();
	
}
