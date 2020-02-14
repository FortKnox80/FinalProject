package dessertShop;

public abstract class Shop extends Cake {
	
	public Cake orderCake(String type) {
		Cake cake;
		
		cake = bakeACake(type);
		
		return cake;
	}
	
	public abstract Cake bakeACake(String type);
}
