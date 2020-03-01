package dessertShop;

import cakes.*;

public abstract class Shop {
	
	public Cake orderCake(String type) {
		Cake cake;
		
		cake = bakeACake(type);
		
		if(!cake.name.toLowerCase().contains("unknown")) {
			cake.prepareCake();
		}
		
		return cake;
	}
	
	public void menu() {
		String menu = "";
		System.out.println(menu);
	}
	
	abstract Cake bakeACake(String type);
}
